package tr.gov.adalet.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduleConfig {
	@Scheduled(fixedDelay = 1000, initialDelay = 5000)
	// fixedDelay metodun bitişinden itibaren araya süre koyuyor.
	// fixedRate ise metodun çalışma süresinden bağımsız olarak
	// belirli sürelerde çağırıyor.
	// initialDelay ilk çağırılması için gereken gecikme süresi
	public void test() {
		System.out.println("Test");
	}

	@Scheduled(cron = "0 0 0 * * /2")
	// her 2 günde bir saat 00:00 'da çalışacak.
	public void test2() {
		System.out.println("Test2");
	}

}
