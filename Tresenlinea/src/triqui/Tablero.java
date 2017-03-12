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
    public Tablero() {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                tablero[i][j]=new String();
                tablero[i][j]=Integer.toString(i);
            }
        }
    }

   String calcular(){
       
       if((tablero[0][1].equals(tablero[0][0])) && (tablero[0][2].equals(tablero[0][0])))
       {
           return "GANADOR";
       }
       else
       {
           return "SIGUE JUGANDO";
       }
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
