/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programas;

import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.ABORT;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static programas.ManejoArchivo.Buscar;
import static programas.ManejoArchivo.Crear;
import static programas.ManejoArchivo.Modificar;

/**
 *
 * @author Ezequiel
 */
public class cabeceracontable extends javax.swing.JFrame {

    /**
     * Creates new form cabeceracontable
     */
    Boolean modi = false;
    String tabla = "mant_doc.txt";
    int campos = 2;

    String tabla1 = "catalogo.txt";
    int campos1 = 11;

    public cabeceracontable() throws IOException {
        initComponents();
        File F2 = new File("actual.txt");
        try {
            if (!F2.exists()) {
                F2.createNewFile();
            }
            try (Scanner s = new Scanner(F2)) {
                if (s.hasNextLine()) {
                    String linea = s.nextLine();
                    Scanner sl = new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    String nivel_us = sl.next();

                    tfhecho.setText(nivel_us);
                }
                s.close();
            } catch (Exception ex) {
                System.out.println("z01 " + ex);
            }

        } catch (FileNotFoundException e1) {
            System.out.println("x02 Error al leer Archivo " + e1);
        }
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
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfnumdoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tftipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfmonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfcuenta = new javax.swing.JTextField();
        tfdebito = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tffecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfdesc = new javax.swing.JTextField();
        tfcomen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfcredito = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfhecho = new javax.swing.JTextField();
        tfsecu = new javax.swing.JTextField();
        tfdescuenta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Num_doc");

        tfnumdoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfnumdocFocusLost(evt);
            }
        });
        tfnumdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnumdocActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo doc");

        tftipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Factura", "Ajuste", "Documento interno" }));

        jLabel4.setText("Monto");

        tfmonto.setEditable(false);
        tfmonto.setText("0");

        jLabel5.setText("Cuenta");

        tfcuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfcuentaFocusLost(evt);
            }
        });
        tfcuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcuentaKeyTyped(evt);
            }
        });

        tfdebito.setText("0");
        tfdebito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfdebitoFocusLost(evt);
            }
        });
        tfdebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdebitoKeyTyped(evt);
            }
        });

        jLabel6.setText("Debito");

        jLabel7.setText("Fecha");

        tffecha.setEditable(false);

        jLabel8.setText("comentario");

        tfdesc.setEditable(false);

        jLabel10.setText("Descripcion");

        jLabel11.setText("Credito");

        tfcredito.setText("0");
        tfcredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfcreditoFocusLost(evt);
            }
        });
        tfcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcreditoKeyTyped(evt);
            }
        });

        jLabel12.setText("Hecho por");

        tfhecho.setEditable(false);

        tfsecu.setEditable(false);
        tfsecu.setEnabled(false);
        tfsecu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsecuActionPerformed(evt);
            }
        });

        jLabel13.setText("descripcion cuenta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdebito)
                            .addComponent(tfcuenta)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfsecu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tftipo, 0, 156, Short.MAX_VALUE)
                            .addComponent(tfmonto)
                            .addComponent(tfnumdoc))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfcomen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfcredito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tffecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfhecho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdescuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfnumdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tftipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfsecu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfhecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(tfmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfdescuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfcredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfdebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Secuencia", "Num_Doc", "Cuenta", "Credito", "Debito", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable);

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)
                                    .addComponent(jButton3))))
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(60, 60, 60))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(14, 14, 14)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(22, 22, 22)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LocalDate fechaActual = LocalDate.now();
        String fechaActualStr = fechaActual.toString();
        tffecha.setText(fechaActualStr);
        int currentValue = 0;

        // Intentamos leer el valor actual desde el archivo
        try {
            BufferedReader reader = new BufferedReader(new FileReader("secuencia.txt"));
            String line = reader.readLine();
            if (line != null) {
                currentValue = Integer.parseInt(line);
            }
            reader.close();
        } catch (IOException | NumberFormatException e) {
            // Manejo de excepciones en caso de fallo en la lectura
            e.printStackTrace();
        }

        // Incrementar la secuencia
        currentValue++;

        // Guardar el nuevo valor en el archivo
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("secuencia.txt"));
            writer.println(currentValue);
            writer.close();
            System.out.println("Valor actualizado y guardado en archivo.");
        } catch (IOException e) {
            // Manejo de excepciones en caso de fallo en la escritura
            e.printStackTrace();
        }

        String numsecu = currentValue + "";

        DefaultTableModel modelo = (DefaultTableModel) jtable.getModel();

        String titulo[] = {"Secuencia", "Num_Doc", "Cuenta", "Credito", "Debito", "Comentario"};

        modelo.setColumnIdentifiers(titulo);

        String registros[] = new String[6];

        registros[0] = numsecu;
        registros[1] = tfnumdoc.getText();
        registros[2] = tfcuenta.getText();
        registros[3] = tfcredito.getText();
        registros[4] = tfdebito.getText();
        registros[5] = tfcomen.getText();
        

        if ("".equals(registros[0])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(registros[1])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(registros[2])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(registros[3])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(registros[4])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else if ("".equals(registros[5])) {
            JOptionPane.showMessageDialog(rootPane, "FALTAN CAMPOS POR DIGITAR");
        } else {
            modelo.addRow(registros);
            tfmonto.setText("0");
            tfcuenta.setText("");
            tfcredito.setText("0");
            tfdebito.setText("0");
            tfcomen.setText("");
            tfdescuenta.setText("");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfnumdocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfnumdocFocusLost
        // TODO add your handling code here:
        String[] datos = new String[campos + 1];
        if ("".equals(tfnumdoc.getText())) {

            tfdesc.setText("");

        } else {
            try {
                datos = Buscar(tfnumdoc.getText(), tabla, campos);

            } catch (IOException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("1".equals(datos[2])) {

            tfdesc.setText(datos[1]);

            modi = true;
        } else {

            int codigo = JOptionPane.showConfirmDialog(null, "Este documento no existe ¿Quieres crearlo?", "INFORMACION", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (codigo == JOptionPane.YES_OPTION) {
                mantenimiento_doc abrir = new mantenimiento_doc();
                abrir.setVisible(true);
                this.dispose();
            } else if (codigo == JOptionPane.NO_OPTION) {
                tfdesc.setText("");
                tfnumdoc.setText("");
            }
        }
        LocalDate fechaActual = LocalDate.now();
        String fechaActualStr = fechaActual.toString();
        tffecha.setText(fechaActualStr);
    }//GEN-LAST:event_tfnumdocFocusLost

    private void tfcuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfcuentaFocusLost
        // TODO add your handling code here:
        String[] datos = new String[campos1 + 1];
        if ("".equals(tfcuenta.getText())) {

        } else {
            try {
                datos = Buscar(tfcuenta.getText(), tabla1, campos1);

            } catch (IOException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("1".equals(datos[11])) {
            int contar = jtable.getRowCount();
            if (("Detalles".equals(datos[2]))) {
                
            
            tfdescuenta.setText(datos[1]);
            for (int i = 0; i < contar; i++) {
                if (jtable.getValueAt(i, 2).equals(tfcuenta.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Ya existe una trasacion con estacuenta");
                    tfcuenta.setText("");
                    tfdescuenta.setText("");
                }
            }
            }else {
                JOptionPane.showMessageDialog(rootPane, "La cuenta debe ser tipo detalle");
            }
            modi = true;
            
        } else {

            int codigo = JOptionPane.showConfirmDialog(null, "Esta cuenta no existe ¿Quieres crearla?", "INFORMACION", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (codigo == JOptionPane.YES_OPTION) {
                Catalogo_cuenta abrir = new Catalogo_cuenta();
                abrir.setVisible(true);
                this.dispose();
            } else if (codigo == JOptionPane.NO_OPTION) {
                tfcuenta.setText("");

            }
        }
    }//GEN-LAST:event_tfcuentaFocusLost

    private void tfdebitoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdebitoFocusLost
        // TODO add your handling code here:
        float nf = Float.parseFloat(tfcredito.getText());
        if (nf > 0) {
            JOptionPane.showMessageDialog(rootPane, "Credito no puede tener valor");
            tfcredito.setText("0");

        }
    }//GEN-LAST:event_tfdebitoFocusLost

    private void tfcreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfcreditoFocusLost
        // TODO add your handling code here:
        float nf = Float.parseFloat(tfdebito.getText());
        if (nf > 0) {
            JOptionPane.showMessageDialog(rootPane, "Debito no puede tener valor");
            tfdebito.setText("0");

        }
    }//GEN-LAST:event_tfcreditoFocusLost

    private void tfnumdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnumdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnumdocActionPerformed

    private void tfcuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcuentaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfcuentaKeyTyped

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
                && (caracter != '.' || tfdebito.getText().contains("."))) {

            evt.consume();

        }
    }//GEN-LAST:event_tfcreditoKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int contar = jtable.getRowCount();
        int suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Integer.parseInt(jtable.getValueAt(i, 3).toString());
        }
        int suma1 = 0;
        for (int i = 0; i < contar; i++) {
            suma1 = suma1 + Integer.parseInt(jtable.getValueAt(i, 4).toString());
        }
        int total = suma - suma1;
        if (total == 0) {

            String[] columnNames = {"Secuencia", "Num_Doc", "Cuenta", "Credito", "Debito", "Comentario"};

            // Filas y columnas que deseas guardar en el archivo
            int[] selectedColumns = {0, 1, 2, 3, 4, 5};

            // Nombre del archivo
            String fileName = "transacion_contable.txt";

            // Guardar los datos seleccionados en el archivo
            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
                for (int row = 0; row < jtable.getRowCount(); row++) {
                    for (int col : selectedColumns) {
                        writer.print(jtable.getValueAt(row, col));
                        if (col < selectedColumns[selectedColumns.length - 1]) {
                            writer.print(";");  // Separador entre columnas
                        }
                    }
                    writer.println();
                }
                JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Nombre del archivo
            String fileName2 = "cabesera_contable.txt";
            String[] crear = new String[8];
            crear[0] = tfnumdoc.getText();
            crear[1] = tffecha.getText();
            crear[2] = (String) tftipo.getSelectedItem();
            crear[3] = tfdesc.getText();
            crear[4] = tfhecho.getText();
            crear[5] = tfmonto.getText();
            crear[6] = tffecha.getText();
            crear[7] = ("false");

            // Guardar los datos seleccionados en el archivo
            try {
                Crear(crear, fileName2);

                JOptionPane.showMessageDialog(rootPane, "DATOS GUARDADOS");
                tfdesc.setText("");
                tfnumdoc.setText("");
                tftipo.setSelectedItem(ABORT);
                tfmonto.setText("");
                
            } catch (FileNotFoundException | UnsupportedEncodingException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Creditos y debitos no son iguales diguite otra transacion");
        }
         File archivoOriginal = new File("secuencia.txt");
         archivoOriginal.delete();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tfsecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsecuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsecuActionPerformed

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
            java.util.logging.Logger.getLogger(cabeceracontable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cabeceracontable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cabeceracontable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cabeceracontable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new cabeceracontable().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(cabeceracontable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField tfcomen;
    private javax.swing.JTextField tfcredito;
    private javax.swing.JTextField tfcuenta;
    private javax.swing.JTextField tfdebito;
    private javax.swing.JTextField tfdesc;
    private javax.swing.JTextField tfdescuenta;
    private javax.swing.JTextField tffecha;
    private javax.swing.JTextField tfhecho;
    private javax.swing.JTextField tfmonto;
    private javax.swing.JTextField tfnumdoc;
    private javax.swing.JTextField tfsecu;
    private javax.swing.JComboBox<String> tftipo;
    // End of variables declaration//GEN-END:variables
}