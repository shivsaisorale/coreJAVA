package com.xworkx.framework.collection;

public class PincodeScammer {

	public static void main(String[] args) {

		Pincodes dao = new Pincodes();
		dao.save("587101");
		dao.save("587102");
		dao.save("587103");
		dao.save("587116");
		dao.save("587121");

		boolean findMatchName = dao.findMatchName("587101");
		System.out.println(findMatchName);

		boolean findMatchStartswith = dao.findMatchStartswith("58");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("21");
		System.out.println(findMatchEndswith);

	}

}
