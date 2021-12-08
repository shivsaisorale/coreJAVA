package com.xworkz.diwali.pataki;

import com.xworkz.diwali.KaveriRiver;
import com.xworkz.diwali.KrishnaRiver;
import com.xworkz.diwali.River;

public class RiverStarter {

	public static void main(String[] args) {

		River river = new River();
		System.out.println(river.name);
		System.out.println(river.destination);
		System.out.println(river.origin);
		System.out.println(river.length);

		River kaveri = new KaveriRiver();
		System.out.println(kaveri.name);
		System.out.println(kaveri.destination);
		System.out.println(kaveri.origin);
		System.out.println(kaveri.length);

		if (kaveri instanceof KaveriRiver) {
			KaveriRiver kaveriRiver2 = (KaveriRiver) kaveri;
			System.out.println(kaveriRiver2.sweet);
		}

		River krishnaRiver = new KaveriRiver();
		System.out.println(krishnaRiver.name);
		System.out.println(krishnaRiver.destination);
		System.out.println(krishnaRiver.length);
		System.out.println(krishnaRiver.origin);

		if (krishnaRiver instanceof KrishnaRiver) {
			KrishnaRiver krishnaRiver2 = (KrishnaRiver) krishnaRiver;
			System.out.println(krishnaRiver2.size);
		}

	}

}
