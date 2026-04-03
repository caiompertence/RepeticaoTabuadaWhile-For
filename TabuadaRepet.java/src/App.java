import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int numero;
        int resultado;
        int multiplicador;
        int escolha = 1;
        Scanner entrada = new Scanner(System.in);

        while (escolha == 1) {
            multiplicador = 1;
            System.out.println("\nTabuada");
            System.out.print("Digite o número: ");
            numero = entrada.nextInt();
            System.out.println();
            while (multiplicador <= 10) {
                resultado = numero * multiplicador;
                System.out.println(numero + " x " + multiplicador + " = " + resultado);
                multiplicador++;
            }

            System.out.print("\nDeseja continuar? (1 = SIM / 2 = NAO): ");
            escolha = entrada.nextInt();
        }

        entrada.close();
    }
}
