package tr.gov.adalet.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.adalet.dto.PersonelDTO;
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
		return personeller.stream().map(p -> {
			PersonelDTO dto = mapper.map(p, PersonelDTO.class);
			dto.setBolumAdi(p.getBolum().getAdi());
			return dto;
		}).collect(Collectors.toList());
	}

	@GetMapping("/bolumadi")
	public List<PersonelDTO> getPersoneller(String bolumAdi) {
		var personeller = personelService.getPersonellerByBolumAdi(bolumAdi);
		return personeller.stream().map(p -> {
			PersonelDTO dto = mapper.map(p, PersonelDTO.class);
			dto.setBolumAdi(p.getBolum().getAdi());
			return dto;
		}).collect(Collectors.toList());
	}

}
