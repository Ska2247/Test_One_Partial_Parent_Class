package com.gtc.testing;

public class Test_One_Partial_Parent_Class {

	public void car() {
		System.out.println("audi");
	}

	public void van() {
		System.out.println("mahindra");
	}

	public static void main(String[] args) {//Partial Abstraction
		Test_One_Partial_Parent_Class m = new Test_One_Partial_Child_Class();
		m.car();
		m.van();
	}

}
