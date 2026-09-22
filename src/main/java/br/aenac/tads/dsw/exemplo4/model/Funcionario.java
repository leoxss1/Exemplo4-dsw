package br.aenac.tads.dsw.exemplo4.model;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

@Entity 
public class Funcionario {

    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @PastOrPresent 
    private LocalDate datacontratacao;

    @NotNull 
    private boolean trabalhoRemoto;
    
    @ManyToOne 
    @JoinColumn (name="departamento_id")
    private Departamento departamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatacontratacao() {
        return datacontratacao;
    }

    public void setDatacontratacao(LocalDate datacontratacao) {
        this.datacontratacao = datacontratacao;
    }

    public boolean isTrabalhoRemoto() {
        return trabalhoRemoto;
    }

    public void setTrabalhoRemoto(boolean trabalhoRemoto) {
        this.trabalhoRemoto = trabalhoRemoto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
}
