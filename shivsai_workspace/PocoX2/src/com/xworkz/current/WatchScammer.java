package com.xworkz.current;

import com.xworkz.current.button.Watch;

public class WatchScammer {

	public static void main(String[] args) {
		Watch watch = new Watch();
		String ref = watch.toString();
		System.out.println(ref);
		System.out.println(watch.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		watch.setBrand("Dell21");

		Watch watch2 = new Watch();
		System.out.println(watch2);
		System.out.println(watch2.hashCode());
		watch2.setBrand("HP122");
	}

}
