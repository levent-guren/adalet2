package tr.gov.adalet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tr.gov.adalet.bean.Kisi;

@Configuration
public class KisiConfig {
	@Bean
	public Kisi kisiOlustur() {
		Kisi kisi = Kisi.builder().adi("Abuzer").soyadi("KADAYIF").build();
		return kisi;
	}
}
