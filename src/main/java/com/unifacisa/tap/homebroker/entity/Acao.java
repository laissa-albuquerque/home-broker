package com.unifacisa.tap.homebroker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Acao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;
    public String nomeAcao;
    public Double valor;


}
