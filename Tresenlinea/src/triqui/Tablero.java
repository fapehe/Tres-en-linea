/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triqui;

/**
 *
 * @author Estudiantes
 */
public class Tablero {

    char fichas []=new char [9]; 
    int turno=0;

   void calcular(){
       
   }
   public String simbolo(){
       if (turno==0){
           turno=1;
           return "X";
       }
       else
       {
           turno=0;
           return "O";
       }
   }
           
            

    
}
