package com.xworkx.framework.collection.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Satelliets {

	public static void main(String[] args) {

		String satellites = "Disater Managament";
		String satellites1 = "Earth Observation";
		String satellites2 = "Climate & Environment";
		String satellites3 = "OceanSat-";
		String satellites4 = "IRS-1A";
		String satellites5 = "ResourceSat-1";
		String satellites6 = "CartoSat-1";
		String satellites7 = "SROSS-";
		String satellites8 = "RISAT-2";
		String satellites9 = "TES";
		String satellites10 = "IRS-1C";
		String satellites11 = "INSAT-1";
		String satellites12 = "SROSS";
		String satellites13 = "IRS-1A";
		String satellites14 = "HamSa";
		String satellites15 = "Bhaskara Sega-I";
		String satellites16 = "NSAT-1A";
		String satellites17 = "Aryabhatta";
		String satellites18 = "APPLE";
		String satellites19 = "Rohini";

		Stream<String> stream2 = Stream.of(satellites, satellites1, satellites2, satellites3, satellites4, satellites5,
				satellites6, satellites7, satellites8, satellites9, satellites10, satellites11, satellites12,
				satellites13, satellites14, satellites15, satellites16, satellites17, satellites18, satellites19);
		List<String> list2 = stream2.sorted().collect(Collectors.toList());
		System.out.println("ascending order...");
		list2.forEach(s -> System.out.println(s));
		System.out.println("*************************************");

		Stream<String> stream3 = Stream.of(satellites, satellites1, satellites2, satellites3, satellites4, satellites5,
				satellites6, satellites7, satellites8, satellites9, satellites10, satellites11, satellites12,
				satellites13, satellites14, satellites15, satellites16, satellites17, satellites18, satellites19);
		List<String> list4 = stream3.sorted((d1, d2) -> d2.compareTo(d1)).collect(Collectors.toList());
		System.out.println("descending order...");
		list4.forEach(n -> System.out.println(n));
	}

}
