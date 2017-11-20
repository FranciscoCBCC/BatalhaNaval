/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.socket;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class Main {
    
    

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Partida partida = new Partida();
        do{
            System.out.println("1 - Iniciar partida");
            int opcao;
            opcao = entrada.nextInt();
            switch(opcao){
                    case 1:
                        partida.iniciarPartida();
                        break;
                    default:
                        System.out.println("Opcao inválida");
            }
            
        }while(true);
    }
}
