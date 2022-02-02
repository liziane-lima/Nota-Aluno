/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notaaluno;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NotaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota");
        String entrada = scanner.nextLine();
        
        Integer nota = null;
        Integer parecer = null;
        try{
            nota = Integer.parseInt(entrada);
            if(nota >= 7){
                System.out.println("Você foi aprovado");
            }else{
                System.out.println("Você foi reprovado");
            }
            
            if(nota >= 0 && nota <=2){
                parecer = 1;
            }else if(nota >= 3 && nota <= 4){
                parecer = 2;
            }else if(nota >= 5 && nota <= 6){
                parecer = 3;
            }else if(nota >= 7 && nota <= 8){
                parecer = 4;  
            }else{
                parecer = 5;
            }
            
            switch(parecer){
                case 1:
                    System.out.println("Nota Péssima");
                    break;
                case 2:
                    System.out.println("Nota Ruim");
                    break;
                case 3:
                    System.out.println("Nota Regular");
                    break;
                case 4:
                    System.out.println("Nota Boa");
                    break;
                case 5:
                    System.out.println("Parabéns nota maravilhosa");
                    break;
                default:
                    System.out.println("Número incorreto");
            }
            
        }catch (NumberFormatException e){
            System.out.println("Você digitou uma letra em vez de um número");
            System.out.println(e.getMessage());
            
        }
    }
    
}
