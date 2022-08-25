package tr.gov.adalet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.gov.adalet.dao.PersonelDAO;
import tr.gov.adalet.entity.Personel;

@Service
public class PersonelService {
	@Autowired
	private PersonelDAO personelDAO;

	public List<Personel> getPersoneller() {
		return personelDAO.getPersoneller();
	}

	public Optional<Personel> getPersonel(int id) {
		return personelDAO.getPersonel(id);
	}

	public List<Personel> getPersoneller(String adi) {
		return personelDAO.getPersoneller(adi);
	}

	public Personel kaydet(Personel personel) {
		return personelDAO.kaydet(personel);
	}

	public List<Personel> getPersonellerByBolumAdi(String bolumAdi) {
		return personelDAO.getPersonellerByBolumAdi(bolumAdi);
	}
}
