package tr.gov.adalet.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class Kisi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
}
