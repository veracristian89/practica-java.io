package ar.com.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLectura {

	public static void main(String[] args) throws IOException {
		//obtengo el archivo
		FileInputStream fileInputStream = new FileInputStream("test.txt");
		//proceso el archivo
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		//leo el archivo
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String linea;
//		System.out.println(linea);
		
		while ((linea = bufferedReader.readLine()) != null) {
			System.out.println(linea);
		}

	}

}
