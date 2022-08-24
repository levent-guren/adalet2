package tr.gov.adalet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.gov.adalet.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Integer> {

}
