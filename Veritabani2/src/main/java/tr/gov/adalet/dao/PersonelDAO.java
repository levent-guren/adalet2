package tr.gov.adalet.dao;

import java.util.List;
import java.util.Optional;

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

	public Optional<Personel> getPersonel(int id) {
		return personelRepository.findById(id);
	}

	public List<Personel> getPersoneller(String adi) {
		return personelRepository.findByAdi(adi);
	}

	public Personel kaydet(Personel personel) {
		return personelRepository.save(personel);
	}

	public List<Personel> getPersonellerByBolumAdi(String bolumAdi) {
		return personelRepository.getirPersoneller(bolumAdi);
	}
}
