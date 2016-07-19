package com.xavient.holder;
import java.util.Scanner;


public class ScannerHolder {

	private static Scanner scanner = new Scanner(System.in);
	public static Scanner getScanner() {
		if(scanner == null ){
			scanner = new Scanner(System.in);
		}
		return scanner ;
	}
}
