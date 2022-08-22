package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String name;
	private String surname;

	public static User userYarat() {
		User sonuc = new User();
		sonuc.setName("Kamile");
		sonuc.setSurname("Kabasakal");
		return sonuc;
	}
}
