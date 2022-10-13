import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // cria uma forma de prompt para entrada de dados
        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine(); // chama a variavel que abre espaço para entrada de dados
        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        System.out.println("Qual sua altura em metros?");
        double altura = entrada.nextDouble();

        System.out.println("Olá" + nome + ", sua idade é " + idade + " e sua altura é " + altura);
        System.out.println("Qual o seu peso em quilos?");
        double peso = entrada.nextDouble();

        //Calcula o IMC = peso / altura ^ 2

        double imc = peso / (altura * altura);


        System.out.println("Olá " + nome + ", sua idade é " + idade + ", sua altura é " + altura + " e seu peso é" + peso);
        System.out.println(" resultando no IMC de " + imc);
        System.out.printf("Este é o seu IMC = %.2f \n", imc); // mostra somente 2 casas decimais apos a virgula
        System.out.printf("Olá, meu nome é %s e tenho %d anos! \n", nome, idade);

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.46) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }

        //switch-case
        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Agua");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");
        int dieta = entrada.nextInt();

        //escolha
        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break; //impedir de testar as condições abaixo
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default: // "else"
                System.out.println("Esta dieta não existe");
        }
        //laço de repetição
        System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimento = entrada.nextInt();

        for(int i = 0; i < totalAlimento; i++){
            String alimento = entrada.nextLine();


        }

        int i = 0;
        while( i < totalAlimento){
            System.out.println(i);
            i++;
        }

    }
}