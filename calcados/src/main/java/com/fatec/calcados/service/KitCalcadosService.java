package com.fatec.calcados.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.fatec.calcados.model.KitCalcados;
import com.fatec.calcados.repository.KitCalcadosRepository;

@Service
public class KitCalcadosService {
	@Autowired
	private KitCalcadosRepository kitCalcadoRepository;
	
	public KitCalcados atualizar(Long id,KitCalcados kitCalcado) {
		KitCalcados kitSalvo = kitCalcadoRepository.findById(id).get();
		
		if (kitSalvo == null){
			throw new EmptyResultDataAccessException(1);
		}
		BeanUtils.copyProperties(kitCalcado, kitSalvo,"id");
		return kitCalcadoRepository.save(kitSalvo);
	}
}
