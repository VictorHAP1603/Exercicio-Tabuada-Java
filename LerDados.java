import java.util.Scanner;

public class LerDados {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // String nome = "";
        int num = 0;

        // System.out.print("Digite seu nome: ");
        // nome = scan.nextLine();
        // System.out.print("Digite um número: ");
        // n1 = scan.nextInt();
        // System.out.print("Digite outro número: ");
        // n2 = scan.nextInt();

        // res = n1 + n2;

        // System.out.printf("A soma de %d + %d é igual a %d", n1, n2, res);

        System.out.print("Digite um número para mostrar a tabuada dele: ");
        num = scan.nextInt();

        multiplicacao(num);

    }


    public static void multiplicacao(int num) {
        int res = 0;
        
        for (int i = 0; i <= 10; i++) {
            res = num * i;

            System.out.printf("%d * %d = %d\n", num, i, res);
        }

    }
}