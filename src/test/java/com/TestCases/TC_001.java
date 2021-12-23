package com.TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import util.CBT;
import util.DataUtil;

public class TC_001 extends CBT {
	@Test(dataProvider = "testdata", dataProviderClass = DataUtil.class)
	public void ValidateCustomer(Hashtable<String, String> inf) {
		System.out.println(inf.get("ID"));

	}

	@Test
	private void m2() {
		System.out.println();
	}
}
