/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package drones.interfaz;

import drones.dominio.Funcionario;
import drones.dominio.Sistema;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Nicolas Russo
 * @author Francisco Suarez
 */
public class RegistrarFuncionario extends javax.swing.JFrame {

    private Sistema sistema;

    /**
     * Creates new form RegistrarFuncionario
     */
    public RegistrarFuncionario() {
        initComponents();
    }

    public RegistrarFuncionario(Sistema s) {
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
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlIngresoDatos = new javax.swing.JPanel();
    txtNombre = new javax.swing.JTextField();
    txtNumero = new javax.swing.JTextField();
    txtEdad = new javax.swing.JTextField();
    lblNombre = new javax.swing.JLabel();
    lblEdad = new javax.swing.JLabel();
    lblNumero = new javax.swing.JLabel();
    btnAgregar = new javax.swing.JButton();
    pnlDatosFuncionarios = new javax.swing.JPanel();
    scrollFuncionarios = new javax.swing.JScrollPane();
    tblFuncionarios = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Registrar Funcionario");
    setPreferredSize(new java.awt.Dimension(1200, 400));
    setResizable(false);
    setSize(new java.awt.Dimension(1200, 400));
    getContentPane().setLayout(new java.awt.GridLayout(1, 2));

    pnlIngresoDatos.setToolTipText("");
    pnlIngresoDatos.setName(""); // NOI18N
    java.awt.GridBagLayout pnlIngresoDatosLayout = new java.awt.GridBagLayout();
    pnlIngresoDatosLayout.columnWidths = new int[] { 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0 };
    pnlIngresoDatosLayout.rowHeights = new int[] { 0, 31, 0, 31, 0, 31, 0, 31, 0, 31, 0, 31, 0 };
    pnlIngresoDatos.setLayout(pnlIngresoDatosLayout);

    txtNombre.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNombreActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pnlIngresoDatos.add(txtNombre, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(txtNumero, gridBagConstraints);

    txtEdad.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtEdadActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(txtEdad, gridBagConstraints);

    lblNombre.setText("Nombre");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(lblNombre, gridBagConstraints);

    lblEdad.setText("Edad");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(lblEdad, gridBagConstraints);

    lblNumero.setText("Numero de Funcionario");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    pnlIngresoDatos.add(lblNumero, gridBagConstraints);

    btnAgregar.setText("Agregar");
    btnAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAgregarActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(btnAgregar, gridBagConstraints);

    getContentPane().add(pnlIngresoDatos);

    pnlDatosFuncionarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
    pnlDatosFuncionarios.setLayout(new java.awt.BorderLayout());

    tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "Nombre", "Edad", "Numero de Funcionario"
        }) {
      Class[] types = new Class[] {
          java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
      };
      boolean[] canEdit = new boolean[] {
          false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    scrollFuncionarios.setViewportView(tblFuncionarios);
    if (tblFuncionarios.getColumnModel().getColumnCount() > 0) {
      tblFuncionarios.getColumnModel().getColumn(0).setResizable(false);
      tblFuncionarios.getColumnModel().getColumn(2).setResizable(false);
    }

    pnlDatosFuncionarios.add(scrollFuncionarios, java.awt.BorderLayout.CENTER);

    getContentPane().add(pnlDatosFuncionarios);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_txtEdadActionPerformed

    private void btnAgregarActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().equals("")) {
            showError("Ingrese nombre de funcionario.");
        } else if (txtEdad.getText().equals("")) {
            showError("Ingrese edad del funcionario.");
        } else if (txtNumero.getText().equals("")) {
            showError("Ingrese numero de funcionario.");
        } else if (Pattern.matches(".*[a-zA-Z]+.*", txtEdad.getText())
                || Integer.parseInt(txtEdad.getText()) < 18
                || Integer.parseInt(txtEdad.getText()) > 120) {
            showError("Edad invalida.");
        } else if (Pattern.matches(".*[a-zA-Z]+.*", txtNumero.getText())) {
            showError("Numero de funcionario invalido.");
        } else if (!(this.sistema.buscarFuncionario(Integer.parseInt(txtNumero.getText())) == null)) {
            showError("El funcionario ya existe.");
        } else {
            this.sistema.agregarFuncionario(
                    txtNombre.getText(),
                    Integer.parseInt(txtEdad.getText()),
                    Integer.parseInt(txtNumero.getText()));

            hydrate();
            showSuccess("Funcionario registrado correctamente.");
        }
    } // GEN-LAST:event_btnAgregarActionPerformed

    public void showSuccess(String message) {
        JOptionPane.showMessageDialog(null, message, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void hydrate() {
        ArrayList<Funcionario> funcionarios = this.sistema.getFuncionarios();

        DefaultTableModel tblModel = (DefaultTableModel) tblFuncionarios.getModel();

        tblModel.setRowCount(0);

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            String[] row = {
                funcionario.getNombre(),
                String.valueOf(funcionario.getEdad()),
                String.valueOf(funcionario.getNumero())
            };
            tblModel.addRow(row);
        }

        txtNombre.setText("");
        txtNumero.setText("");
        txtEdad.setText("");
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAgregar;
  private javax.swing.JLabel lblEdad;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblNumero;
  private javax.swing.JPanel pnlDatosFuncionarios;
  private javax.swing.JPanel pnlIngresoDatos;
  private javax.swing.JScrollPane scrollFuncionarios;
  private javax.swing.JTable tblFuncionarios;
  private javax.swing.JTextField txtEdad;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtNumero;
  // End of variables declaration//GEN-END:variables
}
