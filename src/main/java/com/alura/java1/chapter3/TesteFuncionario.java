package com.alura.java1.chapter3;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Hugo");
        funcionario.setDepartamento("TI");
        funcionario.setSalario(100);
        //funcionario.dataEntrada = "10/05/2015";
        funcionario.setRg("16.595.946-0");
        funcionario.recebeAumento(50);

        Data data = new Data(7, 11, 1970);
        //data.preencheData(7, 11, 1970);
        funcionario.setDataDeEntrada(data);

        //System.out.println("Salario atual:" + funcionario.salario);
        //System.out.println("Ganho anual:" + funcionario.calculaGanhoAnual());
        funcionario.mostra();
    }
}
