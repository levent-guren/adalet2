package tr.gov.adalet.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.adalet.dto.PersonelDTO;
import tr.gov.adalet.entity.Personel;
import tr.gov.adalet.service.PersonelService;

@RestController
public class PersonelController {
	@Autowired
	private PersonelService personelService;
	@Autowired
	private ModelMapper mapper;

	@GetMapping
	public List<PersonelDTO> getPersoneller() {
		var personeller = personelService.getPersoneller();
//		List<PersonelDTO> liste = new ArrayList<PersonelDTO>();
//		for (int i = 0; i < personeller.size(); i++) {
//			Personel p = personeller.get(i);
//			PersonelDTO dto = this.cevir(p);
//			liste.add(dto);
//		}
//		return liste;
		return personeller.stream().map(p -> mapper.map(p, PersonelDTO.class))
				.collect(Collectors.toList());
	}

	private PersonelDTO cevir(Personel personel) {
//		PersonelDTO dto = new PersonelDTO();
//		dto.setAdi(personel.getAdi());
//		return dto;
		return mapper.map(personel, PersonelDTO.class);
	}

}
