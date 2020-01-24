package com.fatec.calcados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "calcado")
public class Calcado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cld_id;
	
	private int cld_tamanho;
	
	private String cld_cor;
	
	@NotNull
	@Size(min=3,max=30)
	private String cld_modelo;
	
	private String cld_tipo;
	
	private String cld_sola;
	
	private Double cld_altura;

	public Long getCld_id() {
		return cld_id;
	}

	public void setCld_id(Long cld_id) {
		this.cld_id = cld_id;
	}

	public int getCld_tamanho() {
		return cld_tamanho;
	}

	public void setCld_tamanho(int cld_tamanho) {
		this.cld_tamanho = cld_tamanho;
	}

	public String getCld_cor() {
		return cld_cor;
	}

	public void setCld_cor(String cld_cor) {
		this.cld_cor = cld_cor;
	}

	public String getCld_modelo() {
		return cld_modelo;
	}

	public void setCld_modelo(String cld_modelo) {
		this.cld_modelo = cld_modelo;
	}

	public String getCld_tipo() {
		return cld_tipo;
	}

	public void setCld_tipo(String cld_tipo) {
		this.cld_tipo = cld_tipo;
	}

	public String getCld_sola() {
		return cld_sola;
	}

	public void setCld_sola(String cld_sola) {
		this.cld_sola = cld_sola;
	}

	public Double getCld_altura() {
		return cld_altura;
	}

	public void setCld_altura(Double cld_altura) {
		this.cld_altura = cld_altura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cld_altura == null) ? 0 : cld_altura.hashCode());
		result = prime * result + ((cld_cor == null) ? 0 : cld_cor.hashCode());
		result = prime * result + ((cld_id == null) ? 0 : cld_id.hashCode());
		result = prime * result + ((cld_modelo == null) ? 0 : cld_modelo.hashCode());
		result = prime * result + ((cld_sola == null) ? 0 : cld_sola.hashCode());
		result = prime * result + cld_tamanho;
		result = prime * result + ((cld_tipo == null) ? 0 : cld_tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calcado other = (Calcado) obj;
		if (cld_altura == null) {
			if (other.cld_altura != null)
				return false;
		} else if (!cld_altura.equals(other.cld_altura))
			return false;
		if (cld_cor == null) {
			if (other.cld_cor != null)
				return false;
		} else if (!cld_cor.equals(other.cld_cor))
			return false;
		if (cld_id == null) {
			if (other.cld_id != null)
				return false;
		} else if (!cld_id.equals(other.cld_id))
			return false;
		if (cld_modelo == null) {
			if (other.cld_modelo != null)
				return false;
		} else if (!cld_modelo.equals(other.cld_modelo))
			return false;
		if (cld_sola == null) {
			if (other.cld_sola != null)
				return false;
		} else if (!cld_sola.equals(other.cld_sola))
			return false;
		if (cld_tamanho != other.cld_tamanho)
			return false;
		if (cld_tipo == null) {
			if (other.cld_tipo != null)
				return false;
		} else if (!cld_tipo.equals(other.cld_tipo))
			return false;
		return true;
	}
	
	
}
