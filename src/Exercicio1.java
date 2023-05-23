import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite o peso dos peixes: ");
        double pesoPeixes = entradaDoUsuario.nextDouble();

        double diferenca = pesoPeixes - 50;
        double multa = diferenca * 4;


        System.out.println(pesoPeixes > 50);

        System.out.println("O peso total é: " + pesoPeixes + "Kg");
        System.out.println("O Excesso é: " + diferenca + "Kg");
        System.out.println("A multa à ser paga é: R$ " + multa);


    }
}
