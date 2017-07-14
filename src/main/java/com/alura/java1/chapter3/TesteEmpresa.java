package com.alura.java1.chapter3;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class TesteEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa(10);
        //Funcionario[] funcionarios = new Funcionario[10];
        //empresa.setEmpregados(funcionarios);

        for (int i = 0; i < 10; i++) {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome("Marcos" + i);
            funcionario.setDepartamento("TI" + i);
            funcionario.setSalario(1000 + i * 100);
            Data data = new Data(7,11,1970);
            //data.preencheData(7,11,1970);
            funcionario.setDataDeEntrada(data);
            funcionario.setRg("16.595.946-" + i);
            empresa.adiciona(funcionario);
        }

        /*for (Funcionario funcionario : empresa.empregados) {
            funcionario.mostra();
            System.out.println();
        }*/

        empresa.mostraEmpregados();
        empresa.mostraTodasAsInformacoes();
    }
}
