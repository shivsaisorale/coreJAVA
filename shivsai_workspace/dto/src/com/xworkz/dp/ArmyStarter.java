package com.xworkz.dp;

import com.xworkz.dp.dto.Army;

public class ArmyStarter {

	public static void main(String[] args) {

		Army army = new Army();
		army.setColour("Gold");
		army.setDay("Friday");
		army.setSize(200000);
		army.setNoOfhelicopters(4567);
		army.setNoOftanks(4000);

		Army army1 = new Army("green", "sunday", 1500, 2344, 543);
		Army army2 = new Army("red", "monday", 1587, 5677, 776);
		Army army3 = new Army("white", "tusday", 1509, 3455, 675);
		Army army4 = new Army("purple", "sunday", 1565, 6786, 345);

		Army[] army5 = new Army[5];

		army5[1] = army1;
		army5[2] = army2;
		army5[3] = army3;
		army5[4] = army4;

		for (int hide = 0; hide < army5.length; hide++) {

			Army ref = army5[hide];
			if (ref != null) {

				System.out.println("Colour:".concat(ref.getColour()));
				System.out.println("day:".concat(ref.getDay()));
				System.out.println("size:".concat(String.valueOf(ref.getSize())));
				System.out.println("noOfhelicopters:".concat(String.valueOf(ref.getNoOfhelicopters())));
				System.out.println("noOftanks :".concat(String.valueOf(ref.getNoOftanks())));
			} else {
				System.out.println(String.valueOf(hide).concat("nd index is pointing to null"));
			}

		}
	}
}
