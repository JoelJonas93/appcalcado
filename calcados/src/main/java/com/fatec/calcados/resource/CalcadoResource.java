package com.fatec.calcados.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fatec.calcados.event.RecursoCriadoEvent;
import com.fatec.calcados.model.Calcado;
import com.fatec.calcados.repository.CalcadoRepository;

@RestController
@RequestMapping("/calcados")
public class CalcadoResource {
	
	@Autowired
	private CalcadoRepository calcadoRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Calcado> listarCalcados(){
		return calcadoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Calcado> criarCalcado(@Valid @RequestBody Calcado calcado, HttpServletResponse response ) {
		Calcado calcadoSalvo = calcadoRepository.save(calcado);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, calcadoSalvo.getCld_id()));
		return ResponseEntity.status(HttpStatus.CREATED).body(calcadoSalvo);
	}
	
	
	@GetMapping("/{id}")
	public Optional<Calcado> getCalcadoId(@PathVariable Long id) {
		 
		Optional<Calcado> calcado =	calcadoRepository.findById(id);
		return calcado;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public  void removerCalcado(@PathVariable Long id) {
		calcadoRepository.deleteById(id);
	}
}
