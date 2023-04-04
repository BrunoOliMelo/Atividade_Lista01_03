import java.util.Scanner;

public class Lista01_03 {
    public static void main(String[] args) {
        double num1, num2, soma;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o primeiro número:");
        num1 = input.nextDouble();

        System.out.println("Escreva o segundo número:");
        num2 = input.nextDouble();
        input.close();

        soma = num1 + num2;

        System.out.printf("A soma foi[ %.2f ] ", soma);
        } 

}
