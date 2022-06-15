package ar.com.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestLectura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("archivo.csv"));
		String linea;
		while (scanner.hasNextLine() && (linea = scanner.nextLine()) != null) {
//			System.out.println(linea);
			//usando split
			String[] lineas = linea.split(",");
			System.out.println(lineas);
			System.out.println(String.format("%s", lineas));
//			System.out.println(lineas[1]);
			
			//usando scanner
//			Scanner lineaScanner = new Scanner(linea);
//			lineaScanner.useDelimiter(",");
//			String valor;
//			while (lineaScanner.hasNextLine() && (valor = scanner.nextLine()) != null) {
//				System.out.println(valor);
//			}
		}
	}
	
}
