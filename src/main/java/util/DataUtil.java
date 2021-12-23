package util;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataUtil {

	private static final Object rowdata = null;
	static String path = System.getProperty("user.dir") + "\\src\\test\\resources\\PracticeExcelReadin.xls";

	@DataProvider(name = "testdata")
	public static Object[][] getData(Method m) throws IOException {
		int row = ExcelUtil.getRowCount(path, "Sheet1");
		System.out.println(row);
		int testCaseRowNum = 0;

		String testCaseName = m.getName();
		System.out.println(testCaseName);

		for (testCaseRowNum = 0; testCaseRowNum < row; testCaseRowNum++) {
			String testName = ExcelUtil.getCellData(path, "Sheet1", testCaseRowNum, 0);

			if (testName.equalsIgnoreCase(testCaseName))
				break;
		}
		System.out.println(testCaseRowNum);

		int dataStartRowNum = testCaseRowNum + 2;

		int testRows = 0;

		while (!ExcelUtil.getCellData(path, "Sheet1", (dataStartRowNum + testRows), 0).equals("MethodEnd")) {
			testRows++;
			System.out.println(testRows);
		}
		int colStartColNum = testCaseRowNum + 1;
		int testCols = 0;

		while (!ExcelUtil.getCellData(path, "Sheet1", colStartColNum, testCols).equals("MethodEnd")) {
			testCols++;
		}

		Object[][] inf = new Object[testRows][1];

		int i = 0;

		for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {
			Hashtable<String, String> table = new Hashtable<String, String>();
			for (int cNum = 0; cNum < testCols; cNum++) {
				String data = ExcelUtil.getCellData(path, "Sheet1", rNum, cNum);
				System.out.print(data);
				String colName = ExcelUtil.getCellData(path, "Sheet1", colStartColNum, cNum);
				System.out.print(colName);
				table.put(colName, data);
			}

			inf[i][0] = table;
			i++;
		}
		return inf;

	}
}
