/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.wsci;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class Main {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Partida partida = null;
        do {
            System.out.println("1 - Iniciar partida");
            System.out.println("2 - Sair do Jogo");
            int opcao;
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    partida = new Partida();
                    partida.iniciarPartida();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Opcao inválida");
            }

        } while (true);
    }
}
