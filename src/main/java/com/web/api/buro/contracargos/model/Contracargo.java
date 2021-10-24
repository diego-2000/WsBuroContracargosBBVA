package com.web.api.buro.contracargos.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contracargo")
public class Contracargo {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id") 
	private Long id;
	
	@Column(name="fecha_vta")
	private Date fechaVta;
	
	@Column(name="imp_outgoi")
	private float impOutgoi;
	
	@Column(name="autorizacion",length=50)
	private String autorizacion;

	@Column(name="folio",length=50)
	private String folio;

	@Column(name="afiliacion",length=15)
	private int afiliacion;

	@Column(name="comercio",length=50)
	private String comercio;
	
	@Column(name="tipo_operativa",length=50)
	private String tipoOperativa;
	
	@Column(name="codigo_contracargo",length=6)
	private int codigoContracargo;
	
	@Column(name="descripcion_contracargo",length=190)
	private String descripcionContracargo;

	
	@ManyToOne
    @JoinColumn(name = "fk_cuenta")	
	private Cuenta cuenta;
	
	@ManyToOne
    @JoinColumn(name = "fk_emisor")
	private Emisor emisor;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaVta() {
		return fechaVta;
	}

	public void setFechaVta(Date fechaVta) {
		this.fechaVta = fechaVta;
	}

	public float getImpOutgoi() {
		return impOutgoi;
	}

	public void setImpOutgoi(float impOutgoi) {
		this.impOutgoi = impOutgoi;
	}

	public String getAutorizacion() {
		return autorizacion;
	}

	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public int getAfiliacion() {
		return afiliacion;
	}

	public void setAfiliacion(int afiliacion) {
		this.afiliacion = afiliacion;
	}

	public String getComercio() {
		return comercio;
	}

	public void setComercio(String comercio) {
		this.comercio = comercio;
	}

	public String getTipoOperativa() {
		return tipoOperativa;
	}

	public void setTipoOperativa(String tipoOperativa) {
		this.tipoOperativa = tipoOperativa;
	}

	public int getCodigoContracargo() {
		return codigoContracargo;
	}

	public void setCodigoContracargo(int codigoContracargo) {
		this.codigoContracargo = codigoContracargo;
	}

	public String getDescripcionContracargo() {
		return descripcionContracargo;
	}

	public void setDescripcionContracargo(String descripcionContracargo) {
		this.descripcionContracargo = descripcionContracargo;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Emisor getEmisor() {
		return emisor;
	}

	public void setEmisor(Emisor emisor) {
		this.emisor = emisor;
	}

	
	
}
