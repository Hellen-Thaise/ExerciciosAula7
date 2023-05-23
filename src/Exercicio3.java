import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário separando a casa decimal por vírgula: ");
        double salario = entradaDoUsuario.nextDouble();

        Double calculoSalario = salario / 1.212;

        DecimalFormat formatador = new DecimalFormat(  "0.0");

        System.out.println("Esse usuário ganha o equivalente a :" + formatador.format(calculoSalario) + " salários minímos");
    }
}
