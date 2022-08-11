/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

import java.awt.EventQueue;
import reto5.view.CargaLoader;

/**
 *
 * @author Windows 10
 */
public class App {
    public static void main( String[] args ){ 
       // Ejecutar Swing en otro hilo
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                try{
                    CargaLoader objeto = new CargaLoader();
                    objeto.setVisible(true);
                } catch(Exception e){
                    e.printStackTrace();
                }
                
            }
            
        }); 
    }
}
