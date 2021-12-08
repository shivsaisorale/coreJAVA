package com.xworkz.exam;

public class BubbleSort {
	

	public static void main(String[] args) {
		char ch[] = {'S','H','I','V','S','A','I'};
		BubbleSort b = new BubbleSort();
		b.sort(ch);

	}

	void sort(char ch[]) {
		for (int num = 0; num < ch.length; num++) {
			for (int index = 0; index < ch.length; index++) {
				if (ch[num] < ch[index]) {
					char temp = ch[num];
					ch[num] = ch[index];
					ch[index] = temp;
				}

			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);

		}

	}

}
