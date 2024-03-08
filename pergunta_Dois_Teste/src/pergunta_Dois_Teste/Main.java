package pergunta_Dois_Teste;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número e descubra se ele pertence à sequência de Fibonacci ou não:");
        int numeroDesejado = sc.nextInt();

        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;
        boolean encontrado = false;

        while (proximo < numeroDesejado) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            if (proximo == numeroDesejado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(numeroDesejado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroDesejado + " não pertence à sequência de Fibonacci.");
        }
    }
}
