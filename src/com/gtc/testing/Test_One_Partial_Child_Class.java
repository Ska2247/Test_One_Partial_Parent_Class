package com.gtc.testing;

public class Test_One_Partial_Child_Class extends Test_One_Partial_Parent_Class {

	public void car() {
		System.out.println("BMW");
	}

	public void van() {
		System.out.println("Eicher");
	}

	public static void main(String[] args) {
		Test_One_Partial_Child_Class j = new Test_One_Partial_Child_Class();
		j.car();
		j.van();
	}

}
