package org.example.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @Column(name = "peso_atual")
    private double peso;
    @Column(name = "altura_atual")
    private double altura;

}
