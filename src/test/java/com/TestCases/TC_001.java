package com.TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import util.CBT;
import util.DataUtil;

public class TC_001 extends CBT{
	@Test(dataProvider="testdata",dataProviderClass=DataUtil.class)
	public void ValidateCustomer(Hashtable<String, String> inf) {
		System.out.println(inf.get("ID"));

	}
	@Test
	public void m1() {
		System.out.println("I am m1 method");
	}

}
