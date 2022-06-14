package ar.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestEscritura2 {

	public static void main(String[] args) throws IOException {

//		OutputStream fileOutputStream = new FileOutputStream("test-generado.txt");
//		Writer outputStreamReader = new OutputStreamWriter(fileOutputStream);
//		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamReader);
//
//		bufferedWriter.write("Primera linea de mi archivo generado");
//		bufferedWriter.newLine();
//		bufferedWriter.write("Segunda linea de mi archivo generado");
//
//		bufferedWriter.close();
		
		FileWriter fileWriter = new FileWriter("texto-file-writer.txt");
		fileWriter.write("primera linea via file Writer");
		fileWriter.write("\n");
		fileWriter.write("segunda linea via file Writer");
		fileWriter.close();

	}

}
