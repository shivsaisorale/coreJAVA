
import com.xworkz.entity.ComapanyEntity;
import com.xworkz.entity.dao.ComanyDAO;
import com.xworkz.entity.dao.ComapnyDAOimpl;

public class CompanyScanner {

	public static void main(String[] args) {

		ComapanyEntity comapanyEntity1 = new ComapanyEntity(1, "TCS", "software", "www.TCS.com");
		ComapanyEntity comapanyEntity2 = new ComapanyEntity(99, "HCL", "software", "www.hcl.com");
		ComapanyEntity comapanyEntity3 = new ComapanyEntity(88, "Capgemini", "software", "www.capgemini.com");
		ComapanyEntity comapanyEntity4 = new ComapanyEntity(55, "Infosys", "software", "www.infosys.com");
		ComapanyEntity comapanyEntity5 = new ComapanyEntity(44, "SBI", "bank", "www.bank.com");

		ComanyDAO comanyDAO = new ComapnyDAOimpl();
		// comanyDAO.create(comapanyEntity1);
		// comanyDAO.create(comapanyEntity2);
		// comanyDAO.create(comapanyEntity3);
		// comanyDAO.create(comapanyEntity4);
		// comanyDAO.create(comapanyEntity5);

		//ComapanyEntity centity = comanyDAO.getById(44);
		//System.out.println(centity);
		//comanyDAO.update("HCL", 88);
		 comanyDAO.delete(1);

	}

}
