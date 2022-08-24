package tr.gov.adalet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.gov.adalet.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Integer> {
	public List<Personel> findByAdi(String adi);

	@Query(value = "from Personel p where p.adi = :adi")
	public List<Personel> getPersoneller2(String adi);

	@Query(value = "select * from personel adi = :adi", nativeQuery = true)
	public List<Personel> getPersoneller3(String adi);
}
