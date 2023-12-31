package classes;

import interfaces.Atributos;

public class Supervisor extends Funcionario implements Atributos {
    private double salarioSupervisor = 3000.00;
    private Atributos atributos;

    public Supervisor(String nome, int cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.atributos = atributos;
    }

    public double getSalarioSupervisor() {
        return salarioSupervisor;
    }

    public void setSalarioSupervisor(double salarioSupervisor) {
        this.salarioSupervisor = salarioSupervisor;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    @Override
    public void calculoFgts() {
        double resultado;

        resultado = salarioSupervisor * 0.08;
    }

    @Override
    public void calculoInss() {
        double resultado;

        resultado = salarioSupervisor * 0.09 - 15.57;
    }

    @Override
    public void calculo13() {
        double resultado;

        resultado = salarioSupervisor * 2;
    }

    @Override
    public void calculoFerias() {
        double resultado;

        resultado = salarioSupervisor * 1.33;
    }

}
