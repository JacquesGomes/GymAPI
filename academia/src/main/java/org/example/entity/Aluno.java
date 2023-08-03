package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String cpf;

    private String bairro;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.REMOVE , fetch = FetchType.LAZY)
    @JsonIgnore
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public List<AvaliacaoFisica> getAvaliacoes() {
        return avaliacoes;
    }
}
