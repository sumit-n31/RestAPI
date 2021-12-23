package com.TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;
import util.DataUtil;

public class TC_002 {

	@Test(dataProvider = "testdata", dataProviderClass = DataUtil.class)
	public void CreateCustomer(Hashtable<String, String> inf) {
		System.out.println(inf.get("N"));
	}

}
