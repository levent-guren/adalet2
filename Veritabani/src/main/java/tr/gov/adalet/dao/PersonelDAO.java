package tr.gov.adalet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tr.gov.adalet.entity.Personel;
import tr.gov.adalet.repository.PersonelRepository;

@Component
public class PersonelDAO {
	@Autowired
	private PersonelRepository personelRepository;

	public List<Personel> getPersoneller() {
		return personelRepository.findAll();
	}
}
