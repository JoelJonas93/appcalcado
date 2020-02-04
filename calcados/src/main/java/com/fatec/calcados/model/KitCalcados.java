package com.fatec.calcados.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kitcalcado")
public class KitCalcados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kcd_id")
	private Long kitCalcadoId;
	
	@Column(name = "kcd_quantidade")
	private int quantidadeCalcado;
	
	@Column(name = "kcd_valor")
	private BigDecimal kitValor;
	
	@Column(name = "kcd_valorcomissao")
	private BigDecimal kitValorComissao;

	public Long getKitCalcadoId() {
		return kitCalcadoId;
	}

	public void setKitCalcadoId(Long kitCalcadoId) {
		this.kitCalcadoId = kitCalcadoId;
	}

	public int getQuantidadeCalcado() {
		return quantidadeCalcado;
	}

	public void setQuantidadeCalcado(int quantidadeCalcado) {
		this.quantidadeCalcado = quantidadeCalcado;
	}

	public BigDecimal getKitValor() {
		return kitValor;
	}

	public void setKitValor(BigDecimal kitValor) {
		this.kitValor = kitValor;
	}

	public BigDecimal getKitValorComissao() {
		return kitValorComissao;
	}

	public void setKitValorComissao(BigDecimal kitValorComissao) {
		this.kitValorComissao = kitValorComissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kitCalcadoId == null) ? 0 : kitCalcadoId.hashCode());
		result = prime * result + ((kitValor == null) ? 0 : kitValor.hashCode());
		result = prime * result + ((kitValorComissao == null) ? 0 : kitValorComissao.hashCode());
		result = prime * result + quantidadeCalcado;
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
		KitCalcados other = (KitCalcados) obj;
		if (kitCalcadoId == null) {
			if (other.kitCalcadoId != null)
				return false;
		} else if (!kitCalcadoId.equals(other.kitCalcadoId))
			return false;
		if (kitValor == null) {
			if (other.kitValor != null)
				return false;
		} else if (!kitValor.equals(other.kitValor))
			return false;
		if (kitValorComissao == null) {
			if (other.kitValorComissao != null)
				return false;
		} else if (!kitValorComissao.equals(other.kitValorComissao))
			return false;
		if (quantidadeCalcado != other.quantidadeCalcado)
			return false;
		return true;
	}
	
	
}
