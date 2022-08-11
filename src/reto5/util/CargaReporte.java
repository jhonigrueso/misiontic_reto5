/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.util;
import javax.swing.JProgressBar;
import reto5.view.CargaLoader;
/**
 *
 * @author Windows 10
 */
public class CargaReporte extends Thread{
    private JProgressBar progressBar;
    private CargaLoader window;

    public CargaReporte(JProgressBar progressBar, CargaLoader window) {
        super();
        this.progressBar = progressBar;
        this.window = window;
    }
    
    @Override
    public void run(){
        setProgress(0);
        pause(1000);
        setProgress(10);
        pause(2000);
        setProgress(30);
        pause(2000);
        setProgress(45);
        pause(2000);
        setProgress(60);
        pause(2000);
        setProgress(65);
        pause(2000);
        setProgress(70);
        pause(2000);
        setProgress(80);
        pause(2000);
        setProgress(85);
        pause(500);
        setProgress(90);
        pause(500);
        setProgress(92);
        setProgress(98);
        setProgress(100);
    }
    
    public void pause(int mls){
        try {
            Thread.sleep(mls);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
    
    public void setProgress(int valor){
        progressBar.setValue(valor);
        
        pause(1000);
        
        if (valor == 100) {
            pause(1000);
            window.dispose();
            new reto5.view.Informes().setVisible(true);
        }
    }
}
