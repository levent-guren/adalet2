package tr.gov.adalet.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Kisi {
	@NotEmpty
	private String adi;
	private String soyadi;
	@Min(18)
	@Max(99)
	private int yas;
}
