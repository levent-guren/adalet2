package tr.gov.adalet.config;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.log4j.Log4j2;

@Configuration
@Log4j2
public class FlywayConfig {
	@Autowired
	private DataSource dataSource;

	@Bean
	Flyway flyway() {
		HikariDataSource ds = (HikariDataSource) dataSource;
		FluentConfiguration conf = Flyway.configure();
		conf.baselineOnMigrate(true);
		conf.table("fw_history");
		conf.locations("classpath:db/migration");
		Flyway fw = conf.dataSource(ds.getJdbcUrl(), ds.getUsername(), ds.getPassword())
				.load();
		try {
			fw.migrate();
		} catch (final Exception e) {
			log.error("Flyway migration failed, doing a repair and retrying ...");
			fw.repair();
			fw.migrate();
		}

		return fw;
	}
}
