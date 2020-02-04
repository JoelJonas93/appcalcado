package com.fatec.calcados.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.fatec.calcados.model.Calcado;
import com.fatec.calcados.repository.CalcadoRepository;

@Service
public class CalcadoService {
	@Autowired
	private CalcadoRepository calcadoRepository;
	
	public Calcado atualizar(Long id,Calcado calcado) {
		Calcado calcadoSalvo = calcadoRepository.findById(id).get();
		
		if (calcadoSalvo == null){
			throw new EmptyResultDataAccessException(1);
		}
		BeanUtils.copyProperties(calcado, calcadoSalvo,"id");
		return calcadoRepository.save(calcadoSalvo);
	}
}
