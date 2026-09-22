package br.aenac.tads.dsw.exemplo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.aenac.tads.dsw.exemplo4.repository.DepartamentoRepository;
import jakarta.validation.Valid;
import br.aenac.tads.dsw.exemplo4.model.Departamento;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController 
@RequestMapping ("/api/departamentos")
public class DepartamentoController {

    private final DepartamentoRepository repository;

    public DepartamentoController(DepartamentoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Departamento> listarTodos() {
        return repository.findAll(); // Retorna 200 OK por padrão
    }

    @PostMapping 
    @ResponseStatus(HttpStatus.CREATED)
    public Departamento criar (@RequestBody @Valid Departamento departamento){
        return repository.save(departamento);
    }
    
    
}

