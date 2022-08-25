package tr.gov.adalet.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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

	@Transactional
	// metod exception fırlatırsa sonunda rollback yapılır.
	// fırlatmazsa sonunda commit yapılır.
	public Personel kaydet(Personel personel) {
		// dao.metod1
		// dao.metod2
		// dao2.metod1
		// service.metod1
		return personelDAO.kaydet(personel);
	}

	public List<Personel> getPersonellerByBolumAdi(String bolumAdi) {
		return personelDAO.getPersonellerByBolumAdi(bolumAdi);
	}
}
