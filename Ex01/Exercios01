/*
EXERCICIO PROSPOSTO:
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

package exercicios1;

import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        
        CalcDias p1 = new CalcDias();
        
        // Chama a Classe Scanner para poder receber os dados digitados no teclado
        Scanner teclado = new Scanner(System.in); // System.in significa que será um valor de entrada
        
        System.out.println("        CONVERSOR DE IDADE EM DIAS       ");
        System.out.println("-----------------------------------------");
        System.out.println(" Digite sua idade em ANOS | MESES | DIAS ");
        System.out.println("-----------------------------------------");
        System.out.print("ANOS: ");
        p1.setAno(teclado.nextInt()); // nextInt significa que o valor passado trata-se de um valor inteiro
        System.out.print("MESES: ");
        p1.setMes(teclado.nextInt());
        System.out.print("DIAS: ");
        p1.setDia(teclado.nextInt());
        
        // Chama o método que realiza a conversão em dias
        p1.IdadeEmDias();
       
    }
    
}
