package org.example.service;

import org.example.entity.Aluno;
import org.example.entity.AvaliacaoFisica;
import org.example.entity.form.AlunoForm;
import org.example.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}
