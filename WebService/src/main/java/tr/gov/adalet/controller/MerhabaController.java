package tr.gov.adalet.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.adalet.bean.Kisi;

@RestController
@RequestMapping(value = "/v1")
public class MerhabaController {
	@Autowired
	private Kisi kisi;

	// @RequestMapping(value = "/merhaba", method = RequestMethod.GET)
	@GetMapping("/merhaba")
	public String merhaba(
			@RequestParam(name = "adi", defaultValue = "Mehmet") String isim) {
		return "Merhaba " + isim;
	}

	@GetMapping("/merhaba2")
	public String merhaba2(@Valid Kisi kisi) {
		StringBuilder sonuc = new StringBuilder();
		sonuc.append("Merhaba ");
		sonuc.append(kisi.getAdi());
		sonuc.append(", ");
		sonuc.append(kisi.getSoyadi());
		sonuc.append("<br/>");
		sonuc.append("Programmed by: ");
		sonuc.append(this.kisi.getAdi());
		sonuc.append(", ");
		sonuc.append(this.kisi.getSoyadi());

		return sonuc.toString();
		// return "Merhaba " + kisi.getAdi() + ", " + kisi.getSoyadi();
	}

}
