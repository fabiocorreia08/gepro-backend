package br.gov.cmb.gepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.gepro.model.Protocolo;

@Repository
public interface ProtocoloRepository extends JpaRepository<Protocolo, Long>{	
	
	

}
