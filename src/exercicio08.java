import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variavel
        int numero, r1;

        //entrada de dados
        System.out.print(" digite o valor do numero de 3  digitos ( 100 - 999) --> ");
        numero = sc.nextInt();
        r1 = numero % 100/ 10;
        System.out.println( " r1 = " + r1);



    }
}
