package org.example.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AlunoForm {
    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencha o campo corretamente.")
    //@CPF(message = "'${validatedValue}' é inválido!")
    private String cpf;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBairro() {
        return bairro;
    }
}
