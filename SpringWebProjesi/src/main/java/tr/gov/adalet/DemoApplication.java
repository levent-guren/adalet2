package tr.gov.adalet;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tr.gov.adalet.bean.Araba;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("benimhondam")
	private Araba araba;
	@Autowired
	private Araba[] arabalar;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Araba=" + araba);
		Arrays.stream(arabalar).forEach(System.out::println);
	}

}
