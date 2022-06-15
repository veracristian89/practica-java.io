package ar.com.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String letra = "A";
		System.out.println("Codepoint: "+letra.codePointAt(0));
		
//		Charset charset = Charset.defaultCharset();
		Charset charset = Charset.forName("UTF-8");
		System.out.println("Charset: "+charset.displayName());
		
		byte[] bytes = letra.getBytes(StandardCharsets.UTF_8);
		System.out.println("cantidad de bytes: "+bytes.length);
	}
	
}
