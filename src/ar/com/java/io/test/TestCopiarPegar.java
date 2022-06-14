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
import java.net.Socket;

public class TestCopiarPegar {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
		
		Reader inputStreamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		Socket socket2 = new Socket();
		
		Writer outputStreamReader = new OutputStreamWriter(socket2.getOutputStream());
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamReader);


		String linea;

		while ((linea = bufferedReader.readLine()) != null) {
			bufferedWriter.write(linea);
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
	}

}