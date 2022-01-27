package register.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "register")
public class RegisterEntity {
	@Id
	@Column(name="b_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="r_username")
	private	String username;
	@Column(name="r_email")
	private	String email;
	@Column(name="r_password")
	private	String password;
	@Column(name="r_city")
	private	String city;
	@Column(name="r_country")
	private	String country;
	@Column(name="r_mobileno")
	private	long mobileno;
	@Column(name="r_indianCitizen")
	private	String indianCitizen;
	public RegisterEntity(String username, String email, String password, String city, String country, long mobileno,
			String indianCitizen) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.city = city;
		this.country = country;
		this.mobileno = mobileno;
		this.indianCitizen = indianCitizen;
	}
	
	
	

	
}
