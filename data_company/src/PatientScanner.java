
import com.xworkz.entity.PatientEntity;
import com.xworkz.entity.dao.PatientEntityimpl;
import com.xworkz.entity.dao.PatitentEntityDAO;

public class PatientScanner {

	public static void main(String[] args) {

		PatientEntity patientEntity1 = new PatientEntity(108, "kiran", "bidar", 1, 22, 31);
		PatientEntity patientEntity2 = new PatientEntity(101, "nagappa", "bhalki", 2, 23, 34);
		PatientEntity patientEntity3 = new PatientEntity(103, "umesh", "kalaburgi", 3, 24, 33);
		PatientEntity patientEntity4 = new PatientEntity(106, "shivu", "gadag", 8, 4, 37);
		PatientEntity patientEntity5 = new PatientEntity(109, "sai", "mysore", 9, 5, 39);

		PatitentEntityDAO dao = new PatientEntityimpl();
		//dao.create(patientEntity1);
		//dao.create(patientEntity2);
		//dao.create(patientEntity3);
		//dao.create(patientEntity4);
		//dao.create(patientEntity5);

		PatientEntity centity = dao.getById(108);
		System.out.println(centity);
		dao.update("UK", 103);
		dao.delete(109);
	}

}
