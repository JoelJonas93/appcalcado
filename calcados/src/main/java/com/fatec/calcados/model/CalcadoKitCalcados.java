package com.fatec.calcados.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "calcadokitcalcados")
public class CalcadoKitCalcados {
	
	@ManyToMany
	@JoinColumn(name = "cld_id")
	private Long cld_id;
	
	@ManyToMany
	@JoinColumn(name = "kcd_id")
	private Long kitCalcadoId;
	
	public Long getCld_id() {
		return cld_id;
	}
	public void setCld_id(Long cld_id) {
		this.cld_id = cld_id;
	}
	public Long getKitCalcadoId() {
		return kitCalcadoId;
	}
	public void setKitCalcadoId(Long kitCalcadoId) {
		this.kitCalcadoId = kitCalcadoId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cld_id == null) ? 0 : cld_id.hashCode());
		result = prime * result + ((kitCalcadoId == null) ? 0 : kitCalcadoId.hashCode());
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
		CalcadoKitCalcados other = (CalcadoKitCalcados) obj;
		if (cld_id == null) {
			if (other.cld_id != null)
				return false;
		} else if (!cld_id.equals(other.cld_id))
			return false;
		if (kitCalcadoId == null) {
			if (other.kitCalcadoId != null)
				return false;
		} else if (!kitCalcadoId.equals(other.kitCalcadoId))
			return false;
		return true;
	}
	
	
}
