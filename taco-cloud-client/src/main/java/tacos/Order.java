package tacos;

import java.sql.Date;

//import org.hibernate.validator.constraints.CreditCardNumber;
//import org.hibernate.validator.constraints.NotBlank;
import lombok.Data;

@Data
public class Order {
	private Long id;
	private Date placedAt;
	private String deliveryName;
	private String deliveryStreet;
	private String deliveryCity;
	private String deliveryState;
	private String deliveryZip;
	private String ccNumber;
	private String ccExpiration;
	private String ccCVV;
}