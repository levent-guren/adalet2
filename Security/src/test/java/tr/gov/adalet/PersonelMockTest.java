package tr.gov.adalet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import tr.gov.adalet.controller.PersonelController;
import tr.gov.adalet.entity.Personel;
import tr.gov.adalet.service.PersonelService;

@ExtendWith(MockitoExtension.class)
public class PersonelMockTest {
	@Mock
	private PersonelService personelService;
	@Mock
	private ModelMapper mapper;

	@InjectMocks
	private PersonelController personelController;

	@Test
	public void test1() {
		Personel p = new Personel();
		p.setAdi("ali");
		Personel p2 = new Personel();
		p2.setAdi("veli");

		when(personelService.kaydet(p)).thenReturn(p2);

		Personel p3 = personelController.kaydet(p);
		assertEquals("veli", p3.getAdi());

		verify(personelService, times(1)).kaydet(p);

	}
}
