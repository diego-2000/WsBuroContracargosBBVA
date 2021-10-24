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
@Table(name = "emisor")
public class Emisor {
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
	@Column(name="telefono",length=10)
	private int telefono;
	@Column(name="email",length=50)
	private String email;
	@Column(name="ip",length=50)
	private String ip;
	@Column(name="calle",length=50)
	private String calle;
	@Column(name="numero",length=5)
	private int numero;
	@Column(name="colonia",length=120)
	private String colonia;
	@Column(name="ciudad",length=50)
	private String ciudad;
	@Column(name="estado",length=50)
	private String estado;
	@Column(name="cp",length=5)
	private int cp;
	
	@OneToMany(mappedBy = "emisor")
    private List<Contracargo> contracargo;
	
	
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public List<Contracargo> getContracargo() {
		return contracargo;
	}
	public void setContracargo(List<Contracargo> contracargo) {
		this.contracargo = contracargo;
	}
	
}
