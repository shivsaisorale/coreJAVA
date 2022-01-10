import com.xworkz.entity.CityEntity;
import com.xworkz.entity.dao.CityDAO;
import com.xworkz.entity.dao.CityDAOimpl;

public class CityScanner {

	public static void main(String[] args) {

		CityEntity cityEntity1 = new CityEntity(1001, "Bidar", 870665.4d, "Bidarfort", "BrimsHospitel");
		CityEntity cityEntity2 = new CityEntity(1002, "Kalaburgi", 987676.4d, "toordal Pigeon", "Govt Hospitale");
		CityEntity cityEntity3 = new CityEntity(1003, "Bhalki", 67875.4d, "Temple", "ArunHosptite");
		CityEntity cityEntity4 = new CityEntity(1004, "Gadag", 34455.4d, "Gadag fort", "Gadaggovt");
		CityEntity cityEntity5 = new CityEntity(1006, "Bengaluru", 8765547.4d, "Lulu mart", "JayadevaH");

		CityDAO cityDAO = new CityDAOimpl();
		cityDAO.create(cityEntity1);
		cityDAO.create(cityEntity2);
		cityDAO.create(cityEntity3);
		cityDAO.create(cityEntity4);
		cityDAO.create(cityEntity5);

		CityEntity Ci_entity=cityDAO.getById(1006);
		System.out.println(Ci_entity);
		cityDAO.update("Shivamogga", 1004);
		cityDAO.delete(1002);

	}
	

}
