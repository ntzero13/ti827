package introjava;

import java.util.Scanner;

public class Introjava {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        do {
            System.out.println("Menu conversões");
            System.out.println("1- Comprimento");
            System.out.println(" 2 - Pesos");
            System.out.println("3 - Moedas");
            System.out.println("4 - Sair");
            System.out.println("Escolha a opçao pretendida");
            op = ler.nextInt();
            if (op == 1)
                converteComprimento();
            else if (op == 2) 
                convertePesos();
            else if (op == 3)
                converteMoedas();
            else if (op != 4)
                System.out.println("Escolha uma opçao valida");
            
        } while (op != 4);

    }

    private static void converteComprimento() {
        
    }

    private static void convertePesos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void converteMoedas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
