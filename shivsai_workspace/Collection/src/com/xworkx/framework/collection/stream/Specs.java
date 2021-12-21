package com.xworkx.framework.collection.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Specs {

	public static void main(String[] args) {

		String specs1 = "Vincent";
		String specs2 = "John";
		String specs3 = "Tommy Hilfiger";
		String specs4 = "Oxydo ";
		String specs5 = "Boss Orange";
		String specs6 = "Kors";
		String specs7 = "Armani Exchange";
		String specs8 = "IDEE";
		String specs9 = "Titan";
		String specs10 = "Ray Ban";
		String specs11 = "Prada";
		String specs12 = "nike";
		String specs13 = "sant raurent";
		String specs14 = "Hugo Boss";
		String specs15 = "kate spade";
		String specs16 = "fendi";
		String specs17 = "choch";
		String specs18 = "Farenheit";
		String specs19 = "Polaroid";
		String specs20 = "Fastrack";

		Stream<String> stream = Stream.of(specs1, specs2, specs3, specs4, specs5, specs6, specs7, specs8, specs9,
				specs10, specs11, specs12, specs13, specs14, specs15, specs16, specs17, specs18, specs19, specs20);
		List<String> list = stream.parallel().map(t -> t.toUpperCase()).collect(Collectors.toList());
		list.forEach(q -> System.out.println(q));
		System.err.println("-------------------");
	}

}
