package com.fatec.calcados.resource;

import java.util.List;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.calcados.event.RecursoCriadoEvent;
import com.fatec.calcados.model.Calcado;
import com.fatec.calcados.model.KitCalcados;
import com.fatec.calcados.repository.KitCalcadosRepository;
import com.fatec.calcados.service.KitCalcadosService;

@RestController
@RequestMapping("/kitcalcados")
public class KitCalcadosResource {
	@Autowired
	private KitCalcadosRepository kitRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private KitCalcadosService kitCalcadosService;
	
	@GetMapping
	public List<KitCalcados> listarKits(){
		return kitRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<KitCalcados> criarKitCalcados(@Valid @RequestBody KitCalcados kitCalcados,HttpServletResponse response){
		KitCalcados kitCalcadosSalvo = kitRepository.save(kitCalcados);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, kitCalcadosSalvo.getKitCalcadoId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(kitCalcados);
	}
	
	@GetMapping("/{id}")
	public KitCalcados getKitCalcadosId(@PathVariable Long id) {
		KitCalcados kitCalcados = kitRepository.findById(id).get();
		return kitCalcados;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removerKitCalcados(@PathVariable Long id) {
		kitRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<KitCalcados> atualizarKitCalcados(@PathVariable Long id, @Valid @RequestBody KitCalcados kitCalcados){
	KitCalcados kitSalvo = kitCalcadosService.atualizar(id,kitCalcados);
	return ResponseEntity.ok(kitSalvo);
	}

}
