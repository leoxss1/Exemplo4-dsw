package br.aenac.tads.dsw.exemplo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.aenac.tads.dsw.exemplo4.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}