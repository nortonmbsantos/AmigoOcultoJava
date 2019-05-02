package amigooculto;

import amigooculto.models.Amigo;
import amigooculto.models.Sorteio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author norto
 */
public class AmigoOculto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();
    }
    
    private static ArrayList<Amigo> amigos = new ArrayList<>();
    
    public static void menu(){
        System.out.println("Escolhe entre as opções: ");
        System.out.println("1 - Adicionar amigo");
        System.out.println("2 - Sortear");
        System.out.println("3 - Sair");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                System.out.print("Nome: ");
                scanner.nextLine();   
                String nome = scanner.nextLine();
                adicionarAmigo(nome);
                break;
            case 2: 
                sorteia();
                break;
            case 3:
                break;
        }
        
    }
    
    public static void adicionarAmigo(String nome){
        amigos.add(new Amigo(nome));
        menu();
    }

    private static void sorteia() {
        Sorteio sorteio = new Sorteio(amigos);
        sorteio.sorteia();
        sorteio.imprime();
        menu();
    }
}
