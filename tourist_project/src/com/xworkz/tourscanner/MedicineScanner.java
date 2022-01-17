package com.xworkz.tourscanner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.MedicineDAO;
import com.xworkz.tour.dao.MedicineDAOImpl;
import com.xworkz.tour.entity.MedicineEntity;



public class MedicineScanner {

	public static void main(String[] args) {
		
		List<MedicineEntity> list = new ArrayList<MedicineEntity>();
		list.add(new MedicineEntity(1,"dolo","white",30.4f,12));
		list.add(new MedicineEntity(2,"methapred","white",30.4f,12));
		list.add(new MedicineEntity(3,"adaza","wihte",30.4f,12));
		list.add(new MedicineEntity(4,"abacavir","red",30.4f,12));
		list.add(new MedicineEntity(5,"zigen","white",30.4f,12));
		list.add(new MedicineEntity(6,"epzicom","cream",30.4f,12));
		list.add(new MedicineEntity(7,"trizivir","white",30.4f,12));
		list.add(new MedicineEntity(8,"abaloparatide","white",30.4f,12));
		list.add(new MedicineEntity(9,"abarelix","white",30.4f,12));
		list.add(new MedicineEntity(10,"abecma","red",30.4f,12));
		list.add(new MedicineEntity(11,"abelect","wihte",30.4f,12));
		list.add(new MedicineEntity(12,"ability","cream",30.4f,12));
		list.add(new MedicineEntity(13,"abrevaabstralacarlate","cream",30.4f,12));
		list.add(new MedicineEntity(14,"accolate","cream",30.4f,12));
		list.add(new MedicineEntity(15,"accuneaci-jel","wihte",30.4f,12));
		list.add(new MedicineEntity(16,"acidul","red",30.4f,12));
		list.add(new MedicineEntity(17,"acitretin","wihte",30.4f,12));
		list.add(new MedicineEntity(18,"sodium","green",30.4f,12));
		list.add(new MedicineEntity(19,"adeuma","cream",30.4f,12));
		list.add(new MedicineEntity(20,"hydrotablet","wihte",30.4f,12));
		list.add(new MedicineEntity(21,"aloxi","green",30.4f,12));
		list.add(new MedicineEntity(22,"alpha","red",30.4f,12));
		list.add(new MedicineEntity(23,"prolastin","wihte",30.4f,12));
		list.add(new MedicineEntity(24,"alphagan","wihte",30.4f,12));
		list.add(new MedicineEntity(25,"xanax","green",30.4f,12));
		list.add(new MedicineEntity(26,"Xanar xr","wihte",30.4f,12));
		list.add(new MedicineEntity(27,"aiprazolam","green",30.4f,12));
		list.add(new MedicineEntity(28,"alprostadil","wihte",30.4f,12));
		list.add(new MedicineEntity(30,"alsuma","cream",30.4f,12));
		list.add(new MedicineEntity(31,"altabax","red",30.4f,12));
		list.add(new MedicineEntity(32,"altace","wihte",30.4f,12));
		list.add(new MedicineEntity(33,"alteplase","wihte",30.4f,12));
		list.add(new MedicineEntity(34,"actives","cream",30.4f,12));
		list.add(new MedicineEntity(35,"Altocor","wihte",30.4f,12));
		list.add(new MedicineEntity(1,"alya","red",30.4f,12));
		
		MedicineDAO dao = new MedicineDAOImpl();
		dao.putAll(list);
	}

	

}
