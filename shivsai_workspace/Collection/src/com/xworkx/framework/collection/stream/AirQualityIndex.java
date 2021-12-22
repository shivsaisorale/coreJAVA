package com.xworkx.framework.collection.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirQualityIndex {

	public static void main(String[] args) {

		int good1 =01;
		int good2 =02;
		int good3 = 03;
		int good4 = 04;
		int good5 = 05;
		int satisfactory = 51;
		int satisfactory1 = 52;
		int satisfactory2 = 56;
		int satisfactory3 = 58;
		int satisfactory4 = 59;
		int poor = 202;
		int poor1 = 300;
		int poor2 = 203;
		int poor3 = 209;
		int poor4 = 234;
		int Verypoor = 335;
		int Verypoor1 = 365;
		int Verypoor2 = 335;
		int Verypoor3 = 375;
		int Verypoor4 = 336;
		int Verypoor5 = 346;

		Stream<Integer> stream = Stream.of(good1, good2, good3, good4, good4, good5, satisfactory,
				satisfactory1, satisfactory2, satisfactory3, satisfactory4, poor, poor1, poor2, poor3, poor4,
				Verypoor1, Verypoor2, Verypoor3, Verypoor4, Verypoor5);
		List<Integer> ref = stream.filter((e) -> e < 200).collect(Collectors.toList());
		ref.forEach(e -> System.out.println("air quality index:" + e));
		System.err.println("=============================");
		System.out.println("descending order");

		Stream<Integer> stream2= Stream.of(good1, good2, good3, good4, good4, good5, satisfactory,
				satisfactory1, satisfactory2, satisfactory3, satisfactory4, poor, poor1, poor2, poor3, poor4,
				Verypoor1, Verypoor2, Verypoor3, Verypoor4, Verypoor5);
		List<Integer> integers = stream2.sorted((f1, f2) -> f2.compareTo(f1)).collect(Collectors.toList());
		integers.forEach(e -> System.out.println(e));

		
	}

}
