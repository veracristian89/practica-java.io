package ar.com.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2046484764103694015L;
	private String nombre;
	private long documento;
	
	public Cliente(String nombre, long documento) {
		super();
		this.nombre = nombre;
		this.documento = documento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public long getDocumento() {
		return documento;
	}
	
}
