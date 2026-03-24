import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bruto, horastrabalhadas, desconto, horaaula, salario;


        System.out.println(" Digite o valor da hora-aula -->");
        horastrabalhadas = sc.nextDouble();
        System.out.println(" Digite o valor sw horas trabalhadas ");
        horaaula = sc.nextDouble();

        bruto = horaaula * horastrabalhadas;
        System.out.println( "digite o salario bruto" + bruto);

        System.out.println(" Digite o valor do desconto do INSS");
        desconto = sc.nextDouble();
        desconto = bruto * desconto/100;

        salario= bruto - desconto;
        System.out.println("O valor do salario liquido é" +
                String.format("% .2f", salario));




    }
}
