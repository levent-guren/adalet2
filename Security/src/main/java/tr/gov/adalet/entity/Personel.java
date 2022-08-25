package tr.gov.adalet.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "bolum")
@EqualsAndHashCode(exclude = "bolum")
public class Personel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adi;
	private String email;
	@ManyToOne(fetch = FetchType.EAGER) // default'u EAGER
	private Bolum bolum;
}
