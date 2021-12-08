package com.xworkz.current;

import com.xworkz.current.button.Sock;

public class SockScammer {

	public static void main(String[] args) {
		Sock sock = new Sock();
		String ref = sock.toString();
		System.out.println(ref);
		System.out.println(sock.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		sock.setPrice(766.7f);

		Sock sock2 = new Sock();
		System.out.println(sock2);
		System.out.println(sock2.hashCode());
		sock2.setPrice(34.5f);
	}

	}


