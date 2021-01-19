package br.com.arsolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arsolutions.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
