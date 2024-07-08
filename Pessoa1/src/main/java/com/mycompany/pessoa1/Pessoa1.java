/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa1;

import java.util.Scanner;

/**
 *
 * @author thobias.gomes
 */
public class Pessoa1 {
  //caracteristicas
    String nome;
    String sobrenome;
    int idade;
    float altura;
    String genero;
    //construindo
public Pessoa1(String nome,String sobrenome, int idade, float altura, String genero){
    this.nome = nome; 
    this.sobrenome= sobrenome;
    this.idade = idade;
    this.altura = altura;
    this.genero = genero;
}
//modo de exibição
public void exibicao(){
    System.out.println("Nome:" + nome + "Sobrenome: " + sobrenome);
    System.out.println("Idade:" + idade + "Anos");
    System.out.println("Altura: " + altura + "metros");
    System.out.println("Genero: " + genero);
  
    

}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        
        System.out.println("Digite seu genero: ");
        String genero = scanner.nextLine();
        
       
        
        Pessoa1 pessoa = new Pessoa1(nome,sobrenome,idade,altura,genero);
        
        pessoa.exibicao();
        
        //temos fechar o scanner sempre
        scanner.close();
        
    }
}