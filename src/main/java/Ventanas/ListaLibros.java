/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import com.company.interfaces.DaoMovie;
import com.company.interfaces.DaouUsers;
import com.mycompany.cinepro.DaoUsersImpl;
import com.mycompany.cinepro.DaouPeliimpl;
import static com.mycompany.cinepro.VentanaCine.ActualizarPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isma2
 */
public class ListaLibros extends javax.swing.JPanel {

    /**
     * Creates new form ListaLibros
     */
    public ListaLibros() {
        initComponents();
        cargarDatos();
    }

    private void cargarDatos() { 
         try { 
              DaoMovie v = new DaouPeliimpl();
              DefaultTableModel model  = (DefaultTableModel) jTable2.getModel();
              
              
              v.listar("  ").forEach((u) -> model.addRow(new Object[] {u.getId_pelicula(), u.getTitulo(),u.getTipo(), u.getDuracion(), }));
        } catch(Exception e ) { 
             System.out.println(e.getMessage());
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Buscar3 = new javax.swing.JButton();
        Buscar4 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movies.png"))); // NOI18N
        jLabel1.setText("Lista Peliculas");

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Ingrese Pelicula a Buscar.");
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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        botonNuevo.setBackground(new java.awt.Color(0, 102, 204));
        botonNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        botonNuevo.setText("Nuevo");
        botonNuevo.setBorder(null);
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Pelicula", "Titulo", "Tipo", "Duracion"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        Buscar3.setBackground(new java.awt.Color(0, 102, 204));
        Buscar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Buscar3.setForeground(new java.awt.Color(255, 255, 255));
        Buscar3.setText("Eliminar ");
        Buscar3.setBorder(null);
        Buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar3ActionPerformed(evt);
            }
        });

        Buscar4.setBackground(new java.awt.Color(0, 102, 204));
        Buscar4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Buscar4.setForeground(new java.awt.Color(255, 255, 255));
        Buscar4.setText("Buscar");
        Buscar4.setBorder(null);
        Buscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jTextField4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                .addGap(309, 309, 309)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Buscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
        jTextField4.setText("    ");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseExited
        // TODO add your handling code here:
        jTextField4.setText(jTextField4.getText());
    }//GEN-LAST:event_jTextField4MouseExited

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
              ActualizarPanel(new NuevaPeli());      
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable2MousePressed

    private void Buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar3ActionPerformed
     // TODO add your handling code here:
DaoMovie v = new DaouPeliimpl();
DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

// Verificar si hay filas seleccionadas
if (jTable2.getSelectedRows().length < 1) {
    JOptionPane.showMessageDialog(null, "Debes seleccionar uno o más usuarios a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
} else {
    // Eliminar filas en orden inverso
    for (int i = jTable2.getSelectedRows().length - 1; i >= 0; i--) {
        int selectedRow = jTable2.getSelectedRows()[i];

        try {
            // Obtener el valor de la primera columna de la fila seleccionada y convertirlo a entero
            int id = Integer.parseInt(jTable2.getValueAt(selectedRow, 0).toString());

            // Llamar al método eliminar
            v.eliminar(id);

            // Remover la fila del modelo de tabla
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(null, " Pelicula eliminada exitosamente! ", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
}
    }//GEN-LAST:event_Buscar3ActionPerformed

    private void Buscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar4ActionPerformed
               
          String usuario = jTextField4.getText().trim();// Eliminar espacios en blanco al inicio y final
    
    // Verificar si el campo de texto está vacío
    if(usuario.isEmpty()) { 
        JOptionPane.showMessageDialog(null, "Debes ingresar un nombre de usuario para buscar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        jTextField4.requestFocus();
        return;
    }
    
    try { 
        // Instancia del DAO de usuarios
          DaoMovie pelicula = new DaouPeliimpl();
        
        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar los resultados de la búsqueda
        
        // Listar los usuarios según el criterio de búsqueda y agregar filas a la tabla
        pelicula.listar(usuario).forEach((u) -> 
            model.addRow(new Object[] {u.getId_pelicula(), u.getTitulo(), u.getTipo(), u.getDuracion()})
        );
        
    } catch(Exception e) { 
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_Buscar4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar3;
    private javax.swing.JButton Buscar4;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
