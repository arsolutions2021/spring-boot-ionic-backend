package br.com.arsolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arsolutions.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {


}
