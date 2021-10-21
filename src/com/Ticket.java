package com;

import java.util.ArrayList;

public class Ticket implements Zoo {
	
	private int noOfGuests;
	private ArrayList<Integer> age;
	private boolean used;
	
	public int getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

	public ArrayList<Integer> getAge() {
		return age;
	}

	public void setAge(ArrayList<Integer> age) {
		this.age = age;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}


	@Override
	public int generateTicket(int age) {
		// TODO Auto-generated method stub
		if(age <= 2)
			return 0;
		else if(age > 2 && age < 18)
			return 100;
		else if(age >= 18 && age < 60)
			return 500;
		return 300;
	}

	@Override
	public void validateTicket(Ticket tic) {
		// TODO Auto-generated method stub
		if(tic.isUsed())
			System.out.println("Warning : This ticket has already been used in the past");
		else {
			for(int i = 0; i < tic.getNoOfGuests(); i++) {
				System.out.println("Guest " + (i+1) + " (age: " + tic.getAge().get(i) + ")");
			}
			tic.setUsed(true);
		}
	}

}
