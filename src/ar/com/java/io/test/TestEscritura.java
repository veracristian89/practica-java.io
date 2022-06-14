package ar.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestEscritura {

	public static void main(String[] args) throws IOException {
		//genero el archivo
		OutputStream fileOutputStream = new FileOutputStream("test-generado.txt");
		//proceso el archivo
		Writer outputStreamReader = new OutputStreamWriter(fileOutputStream);
		//escribo el archivo
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamReader);
	
		bufferedWriter.write("Primera linea de mi archivo generado");
		bufferedWriter.newLine();
		bufferedWriter.write("Segunda linea de mi archivo generado");
		
		//imprime los caracteres cierra el archivo y lo envia a filesystem
		bufferedWriter.close();
		

	}
	
}
