package hora_de_codar3;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Java {
    static String flag;  // Declarando variável global

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Exercicio 1
        /*
        System.out.println("Informe o primeiro valor: ");
        double numero1 = scan.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double numero2 = scan.nextDouble();
        while (numero2 <= 0) {
            System.out.println("Valor inválido! Insira novamente o segundo valor: ");
        }
        System.out.println("O resultado da divisão do valor 1 pelo valor 2 é: " + (numero1 /numero2));
         */


       // Exercicio 2
        /*
        System.out.println("Contagem regressiva");
       for (int i = 30; i >= 0; i--) {
           System.out.println(i);
       }
        System.out.println("EXPLOSÃO");
         */


       // Exercicio 3
        /*
        System.out.println("Ordem decrescente");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
         */

        // Exercicio  4
        /*
        float soma = 0f;
        float quantidade = 0f;
        for (float i = 15f; i <= 100; i++) {
            soma += i;
            quantidade += 1;
        }
       float media = soma / quantidade;
        System.out.println("Quantidade de números entre 15 e 100: " + quantidade);
        System.out.println("Valor total:" + soma);
        System.out.println("Média aritmética: " + media);
         */

        // Exercicio 5
        /*
        float soma = 0f;
        float quantidade = 0f;
        System.out.println("Programa para calcular a média aritmética.");
        System.out.println("Insira o valor inicial: ");
        int numero1 = scan.nextInt();
        System.out.println("Insira o valor final: ");
        int numero2 = scan.nextInt();
        for (float i = numero1; i <= numero2; i++) {
            soma += i;
            quantidade += 1;
        }
        float media = soma / quantidade;
        System.out.println("Quantidade de números entre " + numero1 + " e " + numero2 + " é: " + quantidade);
        System.out.println("Valor total:" + soma);
        System.out.println("Média aritmética: " + media);
        */

        // Exercicio 6

        /*
        do {
            System.out.println("Informe a primeira nota: ");
            float nota1 = scan.nextFloat();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Informe um valor entre 0 e 10.");
                nota1 = scan.nextFloat();
            }
            System.out.println("Informe a segunda nota: ");
            float nota2 = scan.nextFloat();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Valor inválido! Informe um valor entre 0 e 10.");
                nota2 = scan.nextFloat();
            }
            float media = (nota1 + nota2) / 2;
            if (media >= 9.5){
                System.out.println("Aprovado! Sua média é: " + media);
            } else {
                System.out.println("Reprovado. Sua média é: " + media);
            }
            System.out.println("Calcular a média de outro aluno? Informe Sim ou Nao:");
            flag = scan.next();
            while (!flag.toUpperCase().equals("NAO") && !flag.toUpperCase().equals("SIM")){
                System.out.println("Valor inválido. Informe Sim ou Não: ");
                flag = scan.next();
            }
        } while (flag.toUpperCase().equals("SIM"));
         */
    }
}
