package tr.gov.adalet.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "bilgi")
public class CustomEndpoint {
	@ReadOperation
	@Bean
	Map<String, String> getDegerler() {
		Map<String, String> degerler = new HashMap<String, String>();
		degerler.put("kayitSayisi", "13");
		degerler.put("toplamCagirilma", "1652");
		return degerler;
	}

}
