package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ticket tic = new Ticket();
		System.out.print("Enter number of guests : ");
		int n = sc.nextInt();
		tic.setNoOfGuests(n);
		System.out.println();
		ArrayList<Integer> list = new ArrayList();
		while(n-- != 0) {
			System.out.print("Enter the age of guest : ");
			list.add(sc.nextInt());
		}
		tic.setAge(list);
		System.out.println();
		int total = 0;
		for(int age : tic.getAge()) {
			total += tic.generateTicket(age);
		}
		System.out.println("Total ticket charge : " + total + "$");
		tic.validateTicket(tic);
	}

}
