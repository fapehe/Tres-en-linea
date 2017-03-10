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
   String ficha(){
       if (turno==0){
           return "X";
           turno=1;
       }
       else
       {
           return "O";
           turno=0;
       }
       
       
   }
           
            

    
}
