package Atividade4_Encapsulamento;

public class Colaborador{
private String nome;
private String sobrenome;
private double salario_mensal;


//Metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        if(salario_mensal > 0) {
            this.salario_mensal = salario_mensal;
        }
        else{
            this.salario_mensal = 0.0;
        }
    }

    public double getSalarioAnual() {
    return salario_mensal * 12;

    }
    public double getSalarioComAumento() {
        return ((salario_mensal * 10/100) + salario_mensal) * 12;

    }

    //Construtores
    public Colaborador(){

    }
    public Colaborador(String nome, String sobrenome, double salario_mensal){
        this.nome = nome;
        this.sobrenome = sobrenome;

        if(salario_mensal > 0) {
            this.salario_mensal = salario_mensal;
        }
            else{
                this.salario_mensal = 0.0;
            }
        }
    }


