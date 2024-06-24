import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Criando um scanner
   Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome= scanner.next();

        System.out.println("Digite sua sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();

    }
}

