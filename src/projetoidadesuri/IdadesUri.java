/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoidadesuri;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class IdadesUri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int idade = 0, soma = 0, cont = 0;
        float media;

        Scanner input = new Scanner(System.in);

         while (idade >= 0){
            System.out.println("Digite a idade do indivíduo: ");
            idade = input.nextInt();
            if (idade >= 0) {
                soma += idade;
                cont++;
            }

        } 

        media = (float) soma / cont;
        System.out.println(String.format("%.2f",media));

    }

}
