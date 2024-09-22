package excelpackage;

import java.io.IOException;

public class Excel_Main {

	public static void main(String[] args) throws IOException {
		//excel read 
		System.out.println(Excel_Read.getStringData(0, 0));
System.out.println(Excel_Read.getIntegerData(0, 1));

	}

}
