package com.alura.java1.chapter3;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class Empresa {
    private String nome;
    private Funcionario[] empregados;
    private String cnpj;
    private int livre = 0;

    public Empresa(int tamanho) {
        this.empregados = new Funcionario[tamanho];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getEmpregados() {
        return empregados;
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void adiciona(Funcionario f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }

    public boolean contem(Funcionario f) {
        for (Funcionario funcionario : getEmpregados()) {
            if (funcionario == f) {
                return true;
            }
        }
        return false;
    }


    public void mostraEmpregados() {
        for (int i = 0; i < this.livre; i++) {
            System.out.println("Funcionário na posição: " + i);
            System.out.println("R$" + this.empregados[i].getSalario());
        }
    }

    public void mostraTodasAsInformacoes() {
        for (Funcionario funcionario : getEmpregados()) {
            funcionario.mostra();
            System.out.println();
        }
    }
}
