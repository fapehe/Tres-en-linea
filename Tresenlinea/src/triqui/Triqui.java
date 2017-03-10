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
public class Triqui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tablero miTab =new Tablero();
        Jugador jug1 =new Jugador();
        Jugador jug2 =new Jugador();
        
        Grafico miGraf=new Grafico();
        miGraf.setVisible(true);
        
        miGraf.tabGraf=miTab;
        
    }
    
}
