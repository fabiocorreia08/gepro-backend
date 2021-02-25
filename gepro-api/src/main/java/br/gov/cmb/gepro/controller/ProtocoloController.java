package br.gov.cmb.gepro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.gepro.model.Protocolo;
import br.gov.cmb.gepro.repository.ProtocoloRepository;

@CrossOrigin(origins = "http://cmbteste:8080")
@RestController
@RequestMapping("/protocolos")
public class ProtocoloController {

	@Autowired
	ProtocoloRepository protocoloRepo;
	
	@GetMapping
	public List<Protocolo> getAll() {
		return protocoloRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Protocolo> buscaPorId(@PathVariable Long id){
		return protocoloRepo.findById(id);
	}
	
	@PostMapping
	public void gerarProtolocos(@RequestBody Protocolo protocolo) {		
		protocoloRepo.save(protocolo);
	}	

}
