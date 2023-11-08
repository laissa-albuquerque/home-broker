package com.unifacisa.tap.homebroker.repository;

import com.unifacisa.tap.homebroker.entity.Acao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AcaoRepository extends JpaRepository<Acao, UUID> {
}
