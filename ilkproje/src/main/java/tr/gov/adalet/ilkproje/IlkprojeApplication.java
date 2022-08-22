package tr.gov.adalet.ilkproje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import bean.User;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class IlkprojeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(IlkprojeApplication.class, args);
		User user = (User) context.getBean("kullanici");
		System.out.println(user);
		System.out.println(context.getBean("kullanici2"));
		System.out.println(context.getBean("kullanici3"));
		System.out.println(context.getBean("kullanici4"));

	}

}
