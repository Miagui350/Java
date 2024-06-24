//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double N1, N2, N3, N4, RES;
        System.out.println("digite seu primeiro número: ");
        N1= Double.parseDouble(System.console().readLine());

       System.out.println("Digite seu segundo número: ");
        N2=Double.parseDouble(System.console().readLine());

        System.out.println("Digite seu terceiro número: ");
        N3=Double.parseDouble(System.console().readLine());

        System.out.println("Digite seu quarto número: ");
        N4=Double.parseDouble(System.console().readLine());

        RES= (N1+N2+N3+N4)/4;
       System.out.println("Sua média é: " + RES);

    }
}