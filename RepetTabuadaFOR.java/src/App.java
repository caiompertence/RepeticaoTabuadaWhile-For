import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int resultado;
        int escolha = 1;
        int multiplicador = 1;
        Scanner entrada = new Scanner(System.in);

        while (escolha ==1){
            System.out.println("\nTabuada");
            System.out.println("\n Digite o número: \n");
            numero = entrada.nextInt();

            for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
                resultado = numero * multiplicador;
                System.out.println(numero + " x " + multiplicador + " = " + resultado);
                System.out.println();
            }

            System.out.print("\nDeseja continuar? (1 = SIM / 2 = NAO): ");
            escolha = entrada.nextInt();
        }

        entrada.close();

    }
}
