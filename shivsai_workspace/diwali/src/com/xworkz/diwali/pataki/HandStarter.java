package com.xworkz.diwali.pataki;

import com.xworkz.diwali.HandwashSink;
import com.xworkz.diwali.Sink;

public class HandStarter {

	public static void main(String[] args) {

		Sink sink = new Sink();
		System.out.println(sink.name);
		System.out.println(sink.colour);
		System.out.println(sink.size);
		System.out.println(sink.types);

		Sink handwash = new HandwashSink();
		System.out.println(sink.name);
		System.out.println(sink.colour);
		System.out.println(sink.size);
		System.out.println(sink.types);

		if (handwash instanceof HandwashSink) {
			HandwashSink handSink = (HandwashSink) handwash;
			System.out.println(handSink.ceramicWashbasin);

		}

	}
}