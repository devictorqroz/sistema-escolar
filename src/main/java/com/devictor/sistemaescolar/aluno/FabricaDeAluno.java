package com.devictor.sistemaescolar.aluno;

// Parecido com padrão Builder
public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }


    // Melhorias
    // Chamada única do método construtor
    // comTelefone() não ser chamado antes do método construtor
    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaDeAluno();
        Aluno novoAluno = fabrica.comNomeCPFEEmail("", "", "")
                .comTelefone("", "")
                .comTelefone("", "")
                .criar();
    }


}
