package tr.gov.adalet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Veritabani2Application implements CommandLineRunner {
	@Value("#{environment.JAVA_HOME}")
	private String javaHome;

	public static void main(String[] args) {
		SpringApplication.run(Veritabani2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Java_HOME:" + javaHome);
	}

}
