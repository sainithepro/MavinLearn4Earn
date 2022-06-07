package com.file.handling;

public class Manage_ExcelFile {

	public static void main(String[] args) {
		//System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\file\\handling\\Data.xlsx";
		Xls_Reader xls = new Xls_Reader(path);
		
		
		//Counting rows in excel
		int rows = xls.getRowCount("LoginTest");
		System.out.println(rows);
		
		// counting cols in excel
		int cols = xls.getColumnCount("LoginTest");
		System.out.println(cols);
		
		//reading data in excel file
		String data = xls.getCellData("LoginTest", 3, 2);
		System.out.println(data);
		
		String data1 = xls.getCellData("LoginTest", "Username", 4);
		System.out.println("Result: " + data1);
		

		// Writing data in excel file
		xls.setCellData("LoginTest", "Password", 4, "helllooo1231sssssssssssssssssssss2");
		String data2 = xls.getCellData("LoginTest", "Password", 4);
		System.out.println("Result: " + data2);
		
		
	}

}

