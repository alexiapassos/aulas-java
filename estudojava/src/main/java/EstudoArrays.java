import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++){
            System.out.println("A posição " + i + "com o valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50]; // cria um array com 50 posições

        numeros2[0] = 500;
        numeros2[1] = -200;
        //...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"José Almir", "Renato Pereira", "Victor Icoma"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int quantidade = quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];

        //Exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();
        entrada.nextLine();

        double[] notasProva = new double[totalNotas];

        for (int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor da nota " + (i+1) + "ºnota: ");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for (double nota : notasProva){
            soma += nota;
        }
        double media = soma / notasProva.length;

        String mensagem = (media < 7) ? "Você está reprovado" : "Você está aprovado";
        System.out.println((mensagem));

    }
}