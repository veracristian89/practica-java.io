package ar.com.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestLectura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("archivo.csv"));
		String linea = scanner.nextLine();
		System.out.println(linea);
		while (scanner.hasNextLine() && ((linea = scanner.nextLine()) != null)) {
			System.out.println(linea);
		}
	}
	
}
