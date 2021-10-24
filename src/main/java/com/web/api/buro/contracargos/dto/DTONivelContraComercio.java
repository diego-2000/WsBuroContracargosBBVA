package com.web.api.buro.contracargos.dto;

public class DTONivelContraComercio {
	private int cantidad;
	private int mes;
	
	
	public DTONivelContraComercio(int cantidad, int mes) {
		this.cantidad = cantidad;
		this.mes = mes;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "DTONivelContraComercio [cantidad=" + cantidad + ", mes=" + mes + "]";
	}
	
}
