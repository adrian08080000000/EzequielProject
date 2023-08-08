/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programas;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static programas.ManejoArchivo.Buscar;
import static programas.ManejoArchivo.Crear;
import static programas.ManejoArchivo.Modificar;

/**
 *
 * @author Ezequiel
 */
public class Catalogo_cuenta extends javax.swing.JFrame {

    /**
     * Creates new form Catalogo_cuenta
     */
    Boolean modi = false;
    String tabla = "catalogo.txt";
    int campos = 11;

    public Catalogo_cuenta() {
        initComponents();
        tffecha.setVisible(false);
        lblfecha.setVisible(false);
        lblhora.setVisible(false);
        tfhora.setVisible(false);
        lblnoedit.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfnumeroc = new javax.swing.JTextField();
        tfdescrip = new javax.swing.JTextField();
        tfcuentapadre = new javax.swing.JTextField();
        tffecha = new javax.swing.JTextField();
        tfhora = new javax.swing.JTextField();
        tfdebito = new javax.swing.JTextField();
        tfcredito = new javax.swing.JTextField();
        tfbalance = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        tfnivel = new javax.swing.JComboBox<>();
        tfgrupo = new javax.swing.JComboBox<>();
        tftipo = new javax.swing.JComboBox<>();
        lblnoedit = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de cuenta");

        jLabel2.setText("Descripcion de la cuenta");

        jLabel3.setText("Tipo de cuenta");

        jLabel4.setText("Cuenta padre");

        jLabel5.setText("nivel de cuenta");

        jLabel6.setText("Grupo de cuenta");

        lblfecha.setText("Fecha de creacion");

        lblhora.setText("hora de creacion");

        jLabel9.setText("Debito acomulado de cuenta");

        jLabel10.setText("Credito acomulado de cuenta");

        jLabel11.setText("Balanse de cuenta");

        tfnumeroc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfnumerocFocusLost(evt);
            }
        });
        tfnumeroc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnumerocActionPerformed(evt);
            }
        });
        tfnumeroc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfnumerocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfnumerocKeyTyped(evt);
            }
        });

        tfdescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfdescripKeyReleased(evt);
            }
        });

        tfcuentapadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfcuentapadreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcuentapadreKeyTyped(evt);
            }
        });

        tffecha.setEditable(false);

        tfhora.setEditable(false);

        tfdebito.setText("0");
        tfdebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdebitoKeyTyped(evt);
            }
        });

        tfcredito.setText("0");
        tfcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcreditoKeyTyped(evt);
            }
        });

        tfbalance.setText("0");
        tfbalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfbalanceKeyTyped(evt);
            }
        });

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        titulo.setText("Creando");

        tfnivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        tfnivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnivelActionPerformed(evt);
            }
        });
        tfnivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfnivelKeyPressed(evt);
            }
        });

        tfgrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital", "Ingresos", "Costos", "Gastos" }));

        tftipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Detalles" }));

        lblnoedit.setText("Esta cuenta tiene balance no puede ser editada");

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(lblfecha)
                            .addComponent(lblhora)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tftipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfnumeroc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdescrip, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfcredito, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfbalance, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdebito, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfhora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tffecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfgrupo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 171, Short.MAX_VALUE)
                            .addComponent(tfcuentapadre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfnivel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(titulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addComponent(jButton2)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(lblnoedit)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnumeroc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tftipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfnivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfcuentapadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfecha)
                    .addComponent(tffecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhora)
                    .addComponent(tfhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfdebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfcredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(titulo)
                    .addComponent(jButton2))
                .addGap(5, 5, 5)
                .addComponent(lblnoedit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        LocalDate fechaActual = LocalDate.now();
        String fechaActualStr = fechaActual.toString();
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss"); // Define el formato deseado
        String horaActualStr = horaActual.format(formato);
        String[] crear = new String[campos];
        crear[0] = tfnumeroc.getText();
        crear[1] = tfdescrip.getText();
        crear[2] = (String) tftipo.getSelectedItem();
        crear[3] = (String) tfnivel.getSelectedItem();
        crear[4] = tfcuentapadre.getText();
        crear[5] = (String) tfgrupo.getSelectedItem();
        crear[6] = fechaActualStr;
        crear[7] = horaActualStr;
        crear[8] = tfdebito.getText();
        crear[9] = tfcredito.getText();
        crear[10] = tfbalance.getText();

        if ("".equals(crear[0])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[1])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[2])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[3])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[4])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[5])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[6])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[7])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[8])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[9])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(crear[10])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else {
            if (modi == false) {
                try {
                    Crear(crear, tabla);
                    tffecha.setVisible(false);
                    lblfecha.setVisible(false);
                    lblhora.setVisible(false);
                    tfhora.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "DATOS GUARDADOS");
                    tfnumeroc.setText("");
                    tfdescrip.setText("");
                    tftipo.setSelectedItem(ABORT);
                    tfnivel.setSelectedItem(ABORT);
                    tfcuentapadre.setText("");
                    tfgrupo.setSelectedItem(ABORT);
                    tffecha.setText("");
                    tfhora.setText("");
                    tfdebito.setText("");
                    tfcredito.setText("");
                    tfbalance.setText("");
                    tfdescrip.enable(true);
                    tftipo.enable(true);
                    tfnivel.enable(true);
                    tfcuentapadre.enable(true);
                    tfgrupo.enable(true);
                    tfdebito.enable(true);
                    tfcredito.enable(true);
                    tfbalance.enable(true);
                } catch (FileNotFoundException | UnsupportedEncodingException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                Modificar(crear, tabla);
                tffecha.setVisible(false);
                lblfecha.setVisible(false);
                lblhora.setVisible(false);
                tfhora.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "DATOS GUARDADOS");
                tfnumeroc.setText("");
                tfdescrip.setText("");
                tftipo.setSelectedItem(ABORT);
                tfnivel.setSelectedItem(ABORT);
                tfcuentapadre.setText("");
                tfgrupo.setSelectedItem(ABORT);
                tffecha.setText("");
                tfhora.setText("");
                tfdebito.setText("");
                tfcredito.setText("");
                tfbalance.setText("");
                tfdescrip.enable(true);
                tftipo.enable(true);
                tfnivel.enable(true);
                tfcuentapadre.enable(true);
                tfgrupo.enable(true);
                tfdebito.enable(true);
                tfcredito.enable(true);
                tfbalance.enable(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfnumerocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnumerocActionPerformed


    }//GEN-LAST:event_tfnumerocActionPerformed

    private void tfnumerocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfnumerocFocusLost
        // TODO add your handling code here:
        String[] datos = new String[campos + 1];
        if ("".equals(tfnumeroc.getText())) {
            tffecha.setVisible(false);
            lblfecha.setVisible(false);
            lblhora.setVisible(false);
            tfhora.setVisible(false);
            tfdescrip.setText("");
            tftipo.setSelectedItem(ABORT);
            tfnivel.setSelectedItem(ABORT);
            tfcuentapadre.setText("");
            tfgrupo.setSelectedItem(ABORT);
            tffecha.setText("");
            tfhora.setText("");
            tfdebito.setText("");
            tfcredito.setText("");
            tfbalance.setText("");
            modi = false;
            tfdescrip.enable(true);
            tftipo.enable(true);
            tfnivel.enable(true);
            tfcuentapadre.enable(true);
            tfgrupo.enable(true);
            tfdebito.enable(true);
            tfcredito.enable(true);
            tfbalance.enable(true);
        } else {
            try {
                datos = Buscar(tfnumeroc.getText(), tabla, campos);

            } catch (IOException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("1".equals(datos[11])) {
            tffecha.setVisible(true);
            lblfecha.setVisible(true);
            lblhora.setVisible(true);
            tfhora.setVisible(true);
            tfdescrip.setText(datos[1]);
            tftipo.setSelectedItem(datos[2]);
            tfnivel.setSelectedItem(datos[3]);
            tfcuentapadre.setText(datos[4]);
            tfgrupo.setSelectedItem(datos[5]);
            tffecha.setText(datos[6]);
            tfhora.setText(datos[7]);
            tfdebito.setText(datos[8]);
            tfcredito.setText(datos[9]);
            tfbalance.setText(datos[10]);
            float nf = Float.parseFloat(datos[10]);
            if (nf > 0) {
                tfdescrip.enable(false);
                tftipo.enable(false);
                tfnivel.enable(false);
                tfcuentapadre.enable(false);
                tfgrupo.enable(false);
                tfdebito.enable(false);
                tfcredito.enable(false);
                tfbalance.enable(false);
                lblnoedit.setVisible(true);
            }

            titulo.setText("Modificando");
            modi = true;
        } else {
            tffecha.setVisible(false);
            lblfecha.setVisible(false);
            lblhora.setVisible(false);
            tfhora.setVisible(false);
            tfdescrip.setText("");
            tftipo.setSelectedItem(ABORT);
            tfnivel.setSelectedItem(ABORT);
            tfcuentapadre.setText("");
            tfgrupo.setSelectedItem(ABORT);
            tffecha.setText("");
            tfhora.setText("");
            tfdebito.setText("");
            tfcredito.setText("");
            tfbalance.setText("");
            tfdescrip.enable(true);
            tftipo.enable(true);
            tfnivel.enable(true);
            tfcuentapadre.enable(true);
            tfgrupo.enable(true);
            tfdebito.enable(true);
            tfcredito.enable(true);
            tfbalance.enable(true);
            titulo.setText("Creando");
        }
    }//GEN-LAST:event_tfnumerocFocusLost

    private void tfnumerocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfnumerocKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfnumeroc.requestFocus();
        }
    }//GEN-LAST:event_tfnumerocKeyReleased

    private void tfdescripKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdescripKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfdescrip.requestFocus();
        }
    }//GEN-LAST:event_tfdescripKeyReleased

    private void tfnivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnivelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfnivelActionPerformed

    private void tfnivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfnivelKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfnivel.requestFocus();
        }
    }//GEN-LAST:event_tfnivelKeyPressed

    private void tfcuentapadreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcuentapadreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfcuentapadre.requestFocus();
        }
    }//GEN-LAST:event_tfcuentapadreKeyPressed

    private void tfnumerocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfnumerocKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfnumerocKeyTyped

    private void tfcuentapadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcuentapadreKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfcuentapadreKeyTyped

    private void tfdebitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdebitoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || tfdebito.getText().contains("."))) {

            evt.consume();

        }
    }//GEN-LAST:event_tfdebitoKeyTyped

    private void tfcreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcreditoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || tfcredito.getText().contains("."))) {

            evt.consume();

        }
    }//GEN-LAST:event_tfcreditoKeyTyped

    private void tfbalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfbalanceKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || tfbalance.getText().contains("."))) {

            evt.consume();

        }
    }//GEN-LAST:event_tfbalanceKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tffecha.setVisible(false);
            lblfecha.setVisible(false);
            lblhora.setVisible(false);
            tfhora.setVisible(false);
             tfnumeroc.setText("");
            tfdescrip.setText("");
            tftipo.setSelectedItem(ABORT);
            tfnivel.setSelectedItem(ABORT);
            tfcuentapadre.setText("");
            tfgrupo.setSelectedItem(ABORT);
            tffecha.setText("");
            tfhora.setText("");
            tfdebito.setText("");
            tfcredito.setText("");
            tfbalance.setText("");
            tfdescrip.enable(true);
            tftipo.enable(true);
            tfnivel.enable(true);
            tfcuentapadre.enable(true);
            tfgrupo.enable(true);
            tfdebito.enable(true);
            tfcredito.enable(true);
            tfbalance.enable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Catalogo_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo_cuenta().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblnoedit;
    private javax.swing.JTextField tfbalance;
    private javax.swing.JTextField tfcredito;
    private javax.swing.JTextField tfcuentapadre;
    private javax.swing.JTextField tfdebito;
    private javax.swing.JTextField tfdescrip;
    private javax.swing.JTextField tffecha;
    private javax.swing.JComboBox<String> tfgrupo;
    private javax.swing.JTextField tfhora;
    private javax.swing.JComboBox<String> tfnivel;
    private javax.swing.JTextField tfnumeroc;
    private javax.swing.JComboBox<String> tftipo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}