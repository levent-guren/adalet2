package tr.gov.adalet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.gov.adalet.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Integer> {
	public List<Personel> findByAdi(String adi);

	public List<Personel> findByBolumAdi(String bolumAdi);

	@Query("from Personel p where p.bolum.adi = :adi")
	public List<Personel> getirPersoneller(String adi);
}
