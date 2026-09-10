import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();

        VacaMae v1 = new VacaMae("Holandesa", "Mimosa", 10);
        Bezerro bezerro1 = new Bezerro("Holandesa", "Mimosinha", 1);

        animais.add(v1);
        animais.add(bezerro1);

        System.out.println("-- MENU PRINCIPAL --");
        System.out.println("1 - Ver animais do curral");
        System.out.println("2 - Comércio (coletar/retirar produto)");
        System.out.println("3 - Sair");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1: {
                animais.forEach(Animal::exibirInfo);
                break;
            }

            case 2: {
                // comércio
                break;
            }

            case 3: {
                System.out.println("Saindo...");
                break;
            }

            default: {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
