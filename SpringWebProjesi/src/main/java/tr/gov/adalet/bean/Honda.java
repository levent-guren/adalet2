package tr.gov.adalet.bean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Component("benimhondam")
@Data
@EqualsAndHashCode(callSuper = false)
@Order(1)
public class Honda extends Araba {

}
