package model;

public class Localizacion {
	private String pais;
	private boolean censurado;
	private boolean traducido;
	private Edicion edicion;
	public AgenciaLibreria agenciaLibreria;

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public boolean getCensurado() {
		return this.censurado;
	}

	public void setCensurado(boolean censurado) {
		this.censurado = censurado;
	}

	public boolean getTraducido() {
		return this.traducido;
	}

	public void setTraducido(boolean traducido) {
		this.traducido = traducido;
	}
}