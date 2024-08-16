/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import Clases.Usuarios;
import com.company.interfaces.DaouUsers;
import com.mycompany.cinepro.DaoUsersImpl;
import com.mycompany.cinepro.VentanaCine;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author isma2
 */
public class PanelListar extends javax.swing.JPanel {

     
   
    public PanelListar() {
        initComponents();
        LoadUsers();
       
    } 
    
   
    // crecion del metodo 
    
    private void LoadUsers() { 
        try { 
              DaouUsers v = new DaoUsersImpl();
              DefaultTableModel model  = (DefaultTableModel) jTable1.getModel();
              
              v.listar("  ").forEach((u) -> model.addRow(new Object[] {u.getId_usuario(), u.getNombre(), u.getApellido(), u.getEdad(),
               u.getEmail()}));
        } catch(Exception e ) { 
             System.out.println(e.getMessage());
            
        }
    }
    
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        Buscar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        boton_Nuevo = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        Bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguir.png"))); // NOI18N
        jLabel1.setText("Lista Usuarios");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Ingrese el Nombre Usuario a Buscar.");
        jTextField4.setBorder(null);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField4MouseExited(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        Buscar1.setBackground(new java.awt.Color(0, 102, 204));
        Buscar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Buscar1.setForeground(new java.awt.Color(255, 255, 255));
        Buscar1.setText("Buscar");
        Buscar1.setBorder(null);
        Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "nombre", "Apellido", "edad", "Correo"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        Eliminar.setBackground(new java.awt.Color(0, 102, 204));
        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(null);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Editar.setBackground(new java.awt.Color(0, 102, 204));
        Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setText("Editar");
        Editar.setBorder(null);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        boton_Nuevo.setBackground(new java.awt.Color(0, 102, 204));
        boton_Nuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        boton_Nuevo.setText("Nuevo");
        boton_Nuevo.setBorder(null);
        boton_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(boton_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void boton_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_NuevoActionPerformed
        // TODO add your handling code here:
          VentanaCine.ActualizarPanel(new PanelNuevoUsuarios());
    }//GEN-LAST:event_boton_NuevoActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MousePressed

    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar1ActionPerformed
          String usuario = jTextField4.getText().trim(); // Eliminar espacios en blanco al inicio y final
    
    // Verificar si el campo de texto está vacío
    if(usuario.isEmpty()) { 
        JOptionPane.showMessageDialog(null, "Debes ingresar un nombre de usuario para buscar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        jTextField4.requestFocus();
        return;
    }
    
    try { 
        // Instancia del DAO de usuarios
        DaouUsers v = new DaoUsersImpl();
        
        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar los resultados de la búsqueda
        
        // Listar los usuarios según el criterio de búsqueda y agregar filas a la tabla
        v.listar(usuario).forEach((u) -> 
            model.addRow(new Object[] {u.getId_usuario(), u.getNombre(), u.getApellido(), u.getEdad(), u.getEmail()})
        );
        
    } catch(Exception e) { 
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_Buscar1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
          DaouUsers v = new DaoUsersImpl();
          DefaultTableModel model  = (DefaultTableModel) jTable1.getModel();
           if (jTable1.getSelectedRows().length < 1) { 
        JOptionPane.showMessageDialog(null, "Debes seleccionar uno o más usuarios a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
    } else { 
           
         for(int i: jTable1.getSelectedRows()) { 
               
     
                 try { 
                     
              
                v.Eliminar((int) jTable1.getValueAt(i, 0));
                model.removeRow(i);
                JOptionPane.showMessageDialog(null, " Usuario eliminado exitosamente! " + JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e ) { 
             System.out.println(e.getMessage());
           
            
              }
             }
           }
    }//GEN-LAST:event_EliminarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
      // Verificar si se ha seleccionado una fila en la tabla
    if(jTable1.getSelectedRow() > -1) {
        try {
            // Obtener el ID del usuario de la primera columna de la fila seleccionada
            int usuid = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            
            // Instanciar el DAO de usuarios
            DaouUsers v = new DaoUsersImpl();
            
            // Actualizar el panel con los datos del usuario seleccionado
            VentanaCine.ActualizarPanel(new PanelNuevoUsuarios(v.getUserById(usuid)));
        } catch(Exception e) { 
            // Capturar y mostrar cualquier error que ocurra
            System.out.println(e.getMessage());
        }
    } else { 
        // Mostrar un mensaje de error si no se seleccionó ningún usuario
        JOptionPane.showMessageDialog(null, "Debe seleccionar el usuario a Editar", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_EditarActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
        jTextField4.setText("    ");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseExited
        // TODO add your handling code here:
        jTextField4.setText(jTextField4.getText());
    }//GEN-LAST:event_jTextField4MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton Buscar1;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton boton_Nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
