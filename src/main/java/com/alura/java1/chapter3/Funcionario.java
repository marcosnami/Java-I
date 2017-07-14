package com.alura.java1.chapter3;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    //String dataEntrada;
    private Data dataDeEntrada;
    private String rg;
    private static int proximoFuncionario = 0;
    private int identificador;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.identificador = ++proximoFuncionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    public double calculaGanhoAnual() {
        return this.salario *= 12;
    }

    public void mostra() {
        System.out.println("Nome: " + getNome());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: R$" + getSalario());
        //System.out.println("Data de entrada: " + this.dataEntrada);
        System.out.println("Data de entrada: " + getDataDeEntrada().getFormatada());
        //System.out.println("Dia: " + this.dataDeEntrada.dia);
        //System.out.println("Mês: " + this.dataDeEntrada.mes);
        //System.out.println("Ano: " + this.dataDeEntrada.ano);
        System.out.println("RG: " + getRg());
        System.out.println("Ganho anual: R$" + this.calculaGanhoAnual());
    }


}
