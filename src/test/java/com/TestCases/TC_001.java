package com.TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

public class TC_001 {
	@Test
	public void ValidateCustomer(Hashtable<String, String> inf) {
		System.out.println(inf.get("ID"));

	}

	@Test
	public void m2() {
		System.out.println();
	}
}
