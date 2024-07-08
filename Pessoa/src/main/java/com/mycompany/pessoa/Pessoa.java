package com.mycompany.pessoa;

public class Pessoa {
    
    // Características da pessoa
    private String nome;
    private int idade;
    private double altura;
    private String genero;
    
    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade, double altura, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.genero = genero;
    }
    
    // Método para exibir as informações da pessoa
    public void exibirInformacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Gênero: " + genero);
    }
    
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 40, 1.43, "masc");
        
        // Chamando o método para exibir as informações da pessoa1
        pessoa1.exibirInformacao();
    }
}

