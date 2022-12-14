/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reto5.view;
import reto5.controller.ReportesController;

import reto5.model.vo.CompraPorProveedor;
import reto5.model.vo.ProyectosCasaCampestre;
import reto5.model.vo.LiderPorCiudad;


import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Windows 10
 */
public class Informes extends javax.swing.JFrame {
public static final ReportesController controller = new ReportesController();

    /**
     * Creates new form CargaLoader
     */
    public Informes() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estiloTablaHeader1 = new necesario.EstiloTablaHeader();
        requerimiento_3 = new rojeru_san.rsbutton.RSButtonForma();
        requerimiento_1 = new rojeru_san.rsbutton.RSButtonForma();
        requerimiento_2 = new rojeru_san.rsbutton.RSButtonForma();
        rSPanelShade1 = new RSComponentShade.RSPanelShade();
        title = new RSMaterialComponent.RSLabelTextIcon();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMetro1 = new rojeru_san.complementos.TableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        requerimiento_3.setText("Informe #3");
        requerimiento_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requerimiento_3ActionPerformed(evt);
            }
        });

        requerimiento_1.setText("Informe #1");
        requerimiento_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requerimiento_1ActionPerformed(evt);
            }
        });

        requerimiento_2.setText("Informe #2");
        requerimiento_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requerimiento_2ActionPerformed(evt);
            }
        });

        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Elije Uno De Los Tres Informe");
        title.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N

        javax.swing.GroupLayout rSPanelShade1Layout = new javax.swing.GroupLayout(rSPanelShade1);
        rSPanelShade1.setLayout(rSPanelShade1Layout);
        rSPanelShade1Layout.setHorizontalGroup(
            rSPanelShade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShade1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        rSPanelShade1Layout.setVerticalGroup(
            rSPanelShade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShade1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tableMetro1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tableMetro1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShade1, javax.swing.GroupLayout.DEFAULT_SIZE, 1255, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(requerimiento_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(requerimiento_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(requerimiento_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelShade1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requerimiento_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requerimiento_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requerimiento_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requerimiento_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requerimiento_3ActionPerformed
        informe3();
    }//GEN-LAST:event_requerimiento_3ActionPerformed

    private void requerimiento_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requerimiento_1ActionPerformed
        informe1();
    }//GEN-LAST:event_requerimiento_1ActionPerformed

    private void requerimiento_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requerimiento_2ActionPerformed
        informe2();
    }//GEN-LAST:event_requerimiento_2ActionPerformed

public void informe1(){
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            ArrayList<LiderPorCiudad> rankingLideresPorCiudad = controller.consultarAsesorPorCiudad();
            title.setText("Reportes De Lideres");
            modelo.addColumn("ID_Lider");            
            modelo.addColumn("Nombre");
            modelo.addColumn("Primer_Apellido");
            modelo.addColumn("Residencia");
            
            Object[] filas = new Object[4];
            for (LiderPorCiudad asesorPorCiudad : rankingLideresPorCiudad){
                filas[0] = asesorPorCiudad.getIdLider();                    
                filas[1] = asesorPorCiudad.getNombre();                    
                filas[2] = asesorPorCiudad.getPrimerApellido();
                filas[3] = asesorPorCiudad.getCiudadResidencia();
                modelo.addRow(filas);
            }
            
            tableMetro1.setModel(modelo);
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public void informe2(){
        try{
            DefaultTableModel modelo2 = new DefaultTableModel();           
            ArrayList<ProyectosCasaCampestre> rankingProyectosCasaCampestre = controller.consultarProyectosCasaCampestre();
            title.setText("Reportes De Proyectos");
            modelo2.addColumn("ID_Proyecto");            
            modelo2.addColumn("Constructora");
            modelo2.addColumn("Habitaciones");
            modelo2.addColumn("Ciudad");
            
            Object[] filas = new Object[4];
            for (ProyectosCasaCampestre proyectosCasaCampestre : rankingProyectosCasaCampestre){
                filas[0] = proyectosCasaCampestre.getID_Proyecto();                    
                filas[1] = proyectosCasaCampestre.getConstructora();                    
                filas[2] = proyectosCasaCampestre.getNumero_Habitaciones();
                filas[3] = proyectosCasaCampestre.getCiudad();
                modelo2.addRow(filas);
            }
            tableMetro1.setModel(modelo2);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public void informe3(){
        try{
            DefaultTableModel modelo3 = new DefaultTableModel();
            title.setText("Reportes De Proveedores");
            modelo3.addColumn("ID_Compra");            
            modelo3.addColumn("Constructora");
            modelo3.addColumn("Banco_Vinculado");            
            
            ArrayList<CompraPorProveedor> rankingCompraPorProveedor = controller.consultarCompraPorProveedor();

            Object[] filas = new Object[5];
            for (CompraPorProveedor compraPorProveedor : rankingCompraPorProveedor){
                filas[0] = compraPorProveedor.getID_Compra();                                       
                filas[1] = compraPorProveedor.getConstructora();
                filas[2] = compraPorProveedor.getBanco_Vinculado();                

                modelo3.addRow(filas);
            } 
            tableMetro1.setModel(modelo3);
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.EstiloTablaHeader estiloTablaHeader1;
    private javax.swing.JScrollPane jScrollPane2;
    private RSComponentShade.RSPanelShade rSPanelShade1;
    private rojeru_san.rsbutton.RSButtonForma requerimiento_1;
    private rojeru_san.rsbutton.RSButtonForma requerimiento_2;
    private rojeru_san.rsbutton.RSButtonForma requerimiento_3;
    private rojeru_san.complementos.TableMetro tableMetro1;
    private RSMaterialComponent.RSLabelTextIcon title;
    // End of variables declaration//GEN-END:variables
}
