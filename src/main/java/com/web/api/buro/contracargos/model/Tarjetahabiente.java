package com.web.api.buro.contracargos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tarjetahabiente")
public class Tarjetahabiente {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id") 
	private Long id;
	@Column(name="nombre",length=50)
	private String nombre;
	@Column(name="apellido_paterno",length=50)
	private String apellidoPaterno;
	@Column(name="apellido_materno",length=50)
	private String apellidoMaterno;
	
    @OneToMany(mappedBy = "tarjetahabiente")
    private List<Cuenta> cuenta;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public List<Cuenta> getCuenta() {
		return cuenta;
	}
	public void setCuenta(List<Cuenta> cuenta) {
		this.cuenta = cuenta;
	}
	
	
}
