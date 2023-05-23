import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite a altura do usuario: ");
        double altura = entradaDoUsuario.nextDouble();

        System.out.println("Digite o peso do usuario: ");
        double peso = entradaDoUsuario.nextDouble();
        Double calculoImc = peso /( altura * altura);

        DecimalFormat formatador = new DecimalFormat(  "0.00");

        System.out.println("O Calculo do IMC é:" + formatador.format(calculoImc));
    }
}