package com.web.api.buro.contracargos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id") 
	private Long id;
	@Column(name="num_cuenta",length=120)
	private String numCuenta;
	@Column(name="tipo",length=50)
	private String tipo;
	@Column(name="tarjeta_nac_ext",length=50)
	private String tarjetaNacExt;
	
	@ManyToOne
    @JoinColumn(name = "fk_tarjetahabiente")
	private Tarjetahabiente tarjetahabiente;

    @OneToMany(mappedBy = "cuenta")
    private List<Contracargo> contracargo;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTarjetaNacExt() {
		return tarjetaNacExt;
	}

	public void setTarjetaNacExt(String tarjetaNacExt) {
		this.tarjetaNacExt = tarjetaNacExt;
	}

	public Tarjetahabiente getTarjetahabiente() {
		return tarjetahabiente;
	}

	public void setTarjetahabiente(Tarjetahabiente tarjetahabiente) {
		this.tarjetahabiente = tarjetahabiente;
	}

	public List<Contracargo> getContracargo() {
		return contracargo;
	}

	public void setContracargo(List<Contracargo> contracargo) {
		this.contracargo = contracargo;
	}

	
	
}
