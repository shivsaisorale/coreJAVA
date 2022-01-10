

import com.xworkz.entity.CountryEntity;
import com.xworkz.entity.dao.CountryDAO;
import com.xworkz.entity.dao.CountryDAOimpl;

public class CountryScanner {

	public static void main(String[] args) {

		CountryEntity countryEntity1 = new CountryEntity(1, "USA", "WashitangaDC", 30l);
		CountryEntity countryEntity2 = new CountryEntity(6, "Canada", "Ottawa", 40l);
		CountryEntity countryEntity3 = new CountryEntity(3, "Brazil", "Brasila", 50l);
		CountryEntity countryEntity4 = new CountryEntity(4, "Jurmini", "Merlini", 70l);
		CountryEntity countryEntity5 = new CountryEntity(5, "India", "delhi", 60l);

		CountryDAO countryDAO = new CountryDAOimpl();
		countryDAO.create(countryEntity1);
		countryDAO.create(countryEntity2);
		countryDAO.create(countryEntity3);
		countryDAO.create(countryEntity4);
		countryDAO.create(countryEntity5);
	
		CountryEntity centity=countryDAO.getById(1);
		System.out.println(centity);
		countryDAO.update("UK", 3);
		countryDAO.delete(5);
	}
}
