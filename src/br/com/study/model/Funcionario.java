package br.com.study.model;

import br.com.study.annotation.GroupTODO;
import br.com.study.annotation.InProgress;
import br.com.study.annotation.TODO;

@InProgress
public class Funcionario {

    private String nome;

    private String sobrenome;

    @TODO(value = "O salário total do funcionario = salario + bonus")
    public double getTotalSalario(){
        return 0;
    }

    @GroupTODO(severity = GroupTODO.Severity.IMPORTANT, item = "Nome completo", assignedTo = "Bruno Brito")
    public String getFullName(){
        return nome + " " + sobrenome;
    }
}
