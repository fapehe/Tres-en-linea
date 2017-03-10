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

    String tablero [][]=new String[3][3] ; 
    int turno=0;

   String calcular(){
       
       for (int i=0;i<3;i++)
       {
         if(tablero[i][0].equals(tablero[i][1])&& tablero[i][0].equals(tablero[i][2])&& tablero[i][1].equals(tablero[i][2]))
            {
                return "Ganador";
            }  
       }
       for (int i=0;i<3;i++)
       {
         if(tablero[0][i].equals(tablero[1][i])&& tablero[0][i].equals(tablero[2][i])&& tablero[1][i].equals(tablero[2][i]))
            {
                return "Ganador";
            }  
       }
       if(tablero[0][0].equals(tablero[1][1])&& tablero[0][0].equals(tablero[2][2]))
       {
           return "Ganador";
       }
       if(tablero[0][2].equals(tablero[1][1])&& tablero[0][2].equals(tablero[2][0]))
       {
           return "Ganador";
       }
        
       return " ";    
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
