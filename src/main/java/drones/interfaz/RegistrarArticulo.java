/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package drones.interfaz;

import drones.dominio.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Nicolas Russo
 * @author Francisco Suarez
 */
public class RegistrarArticulo extends javax.swing.JFrame {

  private Sistema sistema;

  /** Creates new form RegistrarArticulo */
  public RegistrarArticulo() {
    initComponents();
  }

  public RegistrarArticulo(Sistema s) {
    this.sistema = s;
    initComponents();
    hydrate();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the
   * Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlIngresoArticulos = new javax.swing.JPanel();
    lblNombre = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    lblDescripcion = new javax.swing.JLabel();
    txtDescripcion = new javax.swing.JTextField();
    btnAgregar = new javax.swing.JButton();
    pnlArticulos = new javax.swing.JPanel();
    scrollArticulos = new javax.swing.JScrollPane();
    tblArticulos = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Registrar Artículo");
    setPreferredSize(new java.awt.Dimension(1200, 400));
    setResizable(false);
    setSize(new java.awt.Dimension(1200, 400));
    getContentPane().setLayout(new java.awt.GridLayout(1, 2));

    java.awt.GridBagLayout pnlIngresoArticulosLayout = new java.awt.GridBagLayout();
    pnlIngresoArticulosLayout.columnWidths = new int[] { 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0 };
    pnlIngresoArticulosLayout.rowHeights = new int[] { 0, 41, 0, 41, 0, 41, 0 };
    pnlIngresoArticulos.setLayout(pnlIngresoArticulosLayout);

    lblNombre.setText("Nombre");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoArticulos.add(lblNombre, gridBagConstraints);

    txtNombre.setAlignmentX(1.0F);
    txtNombre.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNombreActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pnlIngresoArticulos.add(txtNombre, gridBagConstraints);

    lblDescripcion.setText("Descripción");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoArticulos.add(lblDescripcion, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    pnlIngresoArticulos.add(txtDescripcion, gridBagConstraints);

    btnAgregar.setText("Agregar");
    btnAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAgregarActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    pnlIngresoArticulos.add(btnAgregar, gridBagConstraints);

    getContentPane().add(pnlIngresoArticulos);

    pnlArticulos.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
    pnlArticulos.setLayout(new java.awt.BorderLayout());

    tblArticulos.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "Nombre", "Descripcion"
        }) {
      Class[] types = new Class[] {
          java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean[] {
          false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    scrollArticulos.setViewportView(tblArticulos);
    if (tblArticulos.getColumnModel().getColumnCount() > 0) {
      tblArticulos.getColumnModel().getColumn(0).setResizable(false);
      tblArticulos.getColumnModel().getColumn(1).setResizable(false);
    }

    pnlArticulos.add(scrollArticulos, java.awt.BorderLayout.CENTER);

    getContentPane().add(pnlArticulos);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtNombreActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txtNombreActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txtNombreActionPerformed

  private void btnAgregarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnAgregarActionPerformed
    if (txtNombre.getText().equals("") || txtDescripcion.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Campos incompletos", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (!(this.sistema.buscarArticulo(txtNombre.getText()) == null)){
        showError("El articulo ya existe.");
    } else {
      this.sistema.agregarArticulo(txtNombre.getText(), txtDescripcion.getText());
      hydrate();
      showSuccess("Articulo registrado exitosamente.");
    }
  } // GEN-LAST:event_btnAgregarActionPerformed
  
  public void showError (String message) {
      JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
  }
  
  public void showSuccess(String message){
      JOptionPane.showMessageDialog(null, message, "Éxito", JOptionPane.INFORMATION_MESSAGE);
  }

  public void hydrate() {
    ArrayList<Articulo> articulos = this.sistema.getArticulos();

    DefaultTableModel tblModel = (DefaultTableModel) tblArticulos.getModel();

    tblModel.setRowCount(0);

    for (int i = 0; i < articulos.size(); i++) {
      Articulo articulo = articulos.get(i);
      String[] row = { articulo.getNombre(), articulo.getDescripcion() };
      tblModel.addRow(row);
    }

    txtNombre.setText("");
    txtDescripcion.setText("");
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAgregar;
  private javax.swing.JLabel lblDescripcion;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JPanel pnlArticulos;
  private javax.swing.JPanel pnlIngresoArticulos;
  private javax.swing.JScrollPane scrollArticulos;
  private javax.swing.JTable tblArticulos;
  private javax.swing.JTextField txtDescripcion;
  private javax.swing.JTextField txtNombre;
  // End of variables declaration//GEN-END:variables

}