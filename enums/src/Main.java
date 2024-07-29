//Sistema IBGE
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (estadoBrasileiro e: estadoBrasileiro.values()){
            System.out.println(e.getSiglas() + " -  " + e.getNome());
        }
        }
    }
