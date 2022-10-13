public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Printa o que estiver entre parenteses

        // Variaveis no JAVA
        // fortemente tipado e estaticamente tipado
        int idade = 20; // inteiro (até 2Bilhoes)
        double salario = 4500.99; // numero quebrado - dupla preocisao
        float nota = 7.5f; //sufixo para float - menos preciso que o double
        long populacaoTerra = 7_900_000_000L;
        boolean tarefaConcluida = false;
        int i = 1, j = 0, k = 1000; // criacao de multiplas variaveis na mesma linha
        String nomeCompleto = "Caio Cabral"; //sempre aspas duplas

        int teste = 10;
        teste = 9; // reatribuição de variaveis

        final int teste2 = 200; // utilizando o final, fica impossivel mudar o valor (const)

        //operadores
        int a = 10;
        int b = 5;

        int soma = a + b; // 15
        int subtracao = a - b;// 5
        int multiplicacao = a * b; // 50
        int divisao = a / b;

        System.out.println("O resultado da soma é:" + soma); // O resultado da soma é 15
        //  A divisão entre dois inteiros resulta em inteiro
        int sete = 7;
        int dois = 2;

        System.out.println(sete / dois);

        //math
        double x = Math.sqrt(144); //12
        double y = Math.pow(5,2); // 25
        System.out.println(Math.PI);
        //Casting != converter a variavel
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; //7 /2.0 = 3.5

        // Operadores 2
        int valor = 5;
        valor++;// incremento +1
        valor--;// decremento -1
        valor += 10; // valor = valor + 10;

        //Operadores relacionais
        boolean teste1 = 5 > 1; // true
        boolean teste3 = 5 < 1; // false
        boolean teste4 = 5 == 5; // true
        boolean teste5 = 5 != 1; // true
        boolean teste6 = 6 >= 6; // true
        boolean teste7 = 5 <= 9; // true

        //operadores logicos
        boolean teste8 = true && false; // false
        boolean teste9 = true || false; // true
        boolean teste10 = (5 < 10) && (10 < 5); // false
        boolean teste11 = (10 >= 0) || (1 < 5); // true
        boolean teste12 = (5 > 1); // true
        boolean teste13 = !teste12; // false

    }
}
