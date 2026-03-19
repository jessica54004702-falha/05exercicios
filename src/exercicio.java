import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        double salario, quilowatts, valorquilowatts, conta;
        Scanner sc = new Scanner(System.in);


        System.out.println(" Digite o valor do quilowatts");
        quilowatts = sc.nextDouble();
        System.out.println("Digite o valor do salario minimo");
        salario = sc.nextDouble();

        valorquilowatts = salario/7/ 100;
        conta = quilowatts * valorquilowatts;

        System.out.println(" Valor da conta" + conta);
        System.out.println(" Valor do quilowatts" + valorquilowatts);
        System.out.println(" Valor da conta com 10% de desconto" + conta * 0.90);




    }
}
