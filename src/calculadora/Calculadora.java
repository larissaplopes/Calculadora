/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.System.*;
import java.util.*;

/**
 *
 * @author laris_000
 */
public class Calculadora {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner in = new Scanner(System.in);
      String comando;
      String[] token;
      int operando1,
          operando2;
      final int OPERADOR = 0;
      
      System.out.print("\nDigite um comando: ");
      comando = in.nextLine();
      
      token = comando.split(" ");
      
      if(token.length != 3){
         System.out.println("Comando invalido.");
         exit(1);
      }
      
      switch(token[OPERADOR]){
         case "ADD":
         case "add":
            operando1 = Integer.parseInt(token[1]);
            operando2 = Integer.parseInt(token[2]);
            
            System.out.println("Resultado: " + (operando1 + operando2));
            break;
            
         case "SUB":
         case "sub":
            operando1 = Integer.parseInt(token[1]);
            operando2 = Integer.parseInt(token[2]);
            
            System.out.println("Resultado: " + (operando1 + operando2));
            break;
            
         case "MUL":
         case "mul":
            operando1 = Integer.parseInt(token[1]);
            operando2 = Integer.parseInt(token[2]);
            
            System.out.println("Resultado: " + (operando1 + operando2));
            break;
         
         case "DIV":
         case "div":
            operando1 = Integer.parseInt(token[1]);
            operando2 = Integer.parseInt(token[2]);
            
            System.out.println("Resultado: " + (operando1 + operando2));
            break;
            
         default:
            System.out.println("Comando invalido.");
            break;
            
      }
      
   }
   
}

/*

      int op,
          operando1,
          operando2;
      
      System.out.print("\nDigite um comando: ");
      comando = in.nextLine();
      
      token = comando.split(" ");
      
      if(token[0] == add || token[0] == ADD){
         op = 1;
      }else if(token[0] == sub || token[0] == SUB){
         op = 2;
      }else if(token[0] == mul || token[0] == MUL){
         op = 3;
      }else if(token[0] == div || token[0] == DIV){
         op = 4;
      }else{
         op = 5;
      }
      
      switch(op){
         case 1:
           operando1 = Integer.parseInt(token[1]);
           operando2 = Integer.parseInt(token[2]); 
           System.out.println("Resultado: " + (operando1 + operando2));
           break;
      }

*/