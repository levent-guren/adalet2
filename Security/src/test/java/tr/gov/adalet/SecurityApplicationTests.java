package tr.gov.adalet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tr.gov.adalet.controller.PersonelController;
import tr.gov.adalet.dto.PersonelDTO;

@SpringBootTest
class SecurityApplicationTests {
	@Autowired
	private PersonelController personelController;

	@Test
	void personelTest() {
		PersonelDTO dto = personelController.getPersonelById(1).getBody();
		assertNotNull(dto);
		assertEquals("Kamile", dto.getAdi());
	}

}
