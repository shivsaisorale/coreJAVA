package com.xworkz.diwali.pataki;

import com.xworkz.diwali.Cards;
import com.xworkz.diwali.KaveriRiver;
import com.xworkz.diwali.PlasticCards;

public class CardsStater {

	public static void main(String[] chakli) {

		Cards cards = new Cards();
		System.out.println(cards.name);
		System.out.println(cards.colour);
		System.out.println(cards.noOfblack);
		System.out.println(cards.noOfred);

		Cards cards2 = new PlasticCards();
		System.out.println(cards2.name);
		System.out.println(cards2.colour);
		System.out.println(cards2.noOfblack);
		System.out.println(cards2.noOfred);

		if (cards2 instanceof PlasticCards) {
			PlasticCards cards3 = (PlasticCards) cards2;
			System.out.println(cards3.RoyalsUnique);

		}
	}
}