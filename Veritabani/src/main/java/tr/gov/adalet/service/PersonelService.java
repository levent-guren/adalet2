package tr.gov.adalet.service;

import java.util.List;

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
}
