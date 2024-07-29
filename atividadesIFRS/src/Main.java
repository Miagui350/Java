//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// SISTEMA DE  MEDIA  DE  NÚMEROS

//public class Main {
   // public static void main(String[] args) {
       // double N1, N2, N3, N4, RES;
        //System.out.println("digite seu primeiro número: ");
        //N1= Double.parseDouble(System.console().readLine());

       //System.out.println("Digite seu segundo número: ");
       // N2=Double.parseDouble(System.console().readLine());

       // System.out.println("Digite seu terceiro número: ");
       // N3=Double.parseDouble(System.console().readLine());

       // System.out.println("Digite seu quarto número: ");
       // N4=Double.parseDouble(System.console().readLine());

       // RES= (N1+N2+N3+N4)/4;
      // System.out.println("Sua média é: " + RES);

   // }
//}


//Sistema de médida usando switch case
//public class Main{
  //  public static void main(String[] args) {

    //    String sigla ="G";
      //  switch(sigla){
        //    case "P":{
          //      System.out.println("PEQUENO");
            //    break;
            //}
            //case "M":{
              //  System.out.println("MEDIO");
                //break;
           // }
           // case "G":{
            //    System.out.println("GRANDE");
              //  break;
           // }
            //default:
              //  System.out.println("INDEFINIDO");
        //}
    //}
//}


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//Plano de Telefone
//public class Main{
    //public static void main(String[] args) {
        // String planos = "B";
    //switch (planos){
    //    case "A":{
         //   System.out.println("100 minutos de ligações ");
         //   break;
       // }
      //  case"B":{
          //  System.out.println("100 minutos de ligaçãoes ");
           // System.out.println( "Whats App e  Instagram GRÁTIS");
           // break;
     //   }
       // case "C":{
           // System.out.println("100 minutos de ligações ");
          // System.out.println( "Whats App e  Instagram GRÁTIS");
          //  System.out.println("5Gb YouTube ");
     //   }
       /// default:
          //  System.out.println("NUNHUM PLANO INDENTIFICADO");


 //   }





   // }
//}

//APRENDENDO FOR


//public class Main {
   // public static void main(String[] args) {
//
        //for (int carneirinhos=1; carneirinhos <=20;carneirinhos ++){
           // System.out.println("Contagem de  carneirinhos " + carneirinhos );

       // }
      //  System.out.println("Gabriel Dormiu!");
   // }
//}

//public class Main {
  //  public static void main(String[] args) {

        //for (float x = 0 ; x <=100; x ++){
         //   System.out.println("o valor de x é  " + x);
       // }
   // }
//}


//For em Arrays

//public class Main {
  //  public static void main(String[] args) {

    //    String Alunos []= {"Felipe,","Jonas", "Julia", "Karina","Andre"};

      //  for (int x=1; x<Alunos.length;x++){
        //    System.out.println("O aluno no indice x= " + x +" é " + Alunos[x]);
        //}
 //   }
//}

// WHILE - sistema de compra de  doce com a mesada

/*public class Main {
    public static void main(String[] args) {
        double mesada= 50;

        while(mesada >0){
            double valorDoDoce = valorAleatorio();
            if (valorDoDoce>mesada)
                valorDoDoce=mesada;

            System.out.println("Doce do valor : " + valorDoDoce + " Adicionado no carrinho");
            mesada= mesada - valorDoDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Você zeou sua mesada");

    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1,10);
    }
}*/


// utilizando o DO WHILE

/*public class Main {
    public static boolean main(String[] args) {
        System.out.println("Discando.......");
        do {
            System.out.println("Telefone tocando");
        }
        while (tocando());
        boolean tocando;
        boolean atendeu = new Random().nextInt(10)==1;
        return ! atendeu;
    }

    private static boolean tocando() {
        return false;
    }
}*/


//CRIAÇÃO DE  CADRATO DE   USUÁRIO
/*public class Main {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Qual e sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Prazer Sr." + nome +" " + sobreNome);
            System.out.println("A sua idade é " + idade + " anos");
            System.out.println("Sua  altura é de " +altura +"cm");

        }catch(InputMismatchException e ){
            System.out.println("Os campos idade e  altura são campos númericos");
            System.out.println("O campo altura  deve ser utilizado ponto ao invés de vírgula");
        }


    }

}*/
import java.util.Scanner;

/*public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        System.out.println("Bem-vindo à sua conta bancária!");

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Encerrar programa");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito de " + valorDeposito + " realizado com sucesso.");
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente para saque.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

*/


public class Main {
    public static class Escola{
        public static <Aluno> void main(String[] args) {
            Aluno felipe = new Aluno();
            felipe.nome = "Felipe";
            felipe.idade = 8;

            System.out.println("O aluno" + felipe.nome + "tem " + felipe.idade + " anos");


        }

    }
}

