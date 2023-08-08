/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programas;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pujol
 */
public class consulta_usuarios extends javax.swing.JFrame {

    /**
     * Creates new form consulta_usuarios
     */
    String tablaus = "C:\\lab_proyecto\\tablas\\Usuarios.txt";
    int contador = 0;

    public consulta_usuarios() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        codbus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Usuarios");
        setAlwaysOnTop(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Apellidos", "Correo", "Nivel de Acceso"
            }
        ));
        tabla.setEnabled(false);
        jScrollPane2.setViewportView(tabla);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        codbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codbusKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        nombus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombusKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Nivel");

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "0", "1" }));
        combo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo1KeyPressed(evt);
            }
        });

        buscar.setIcon(new javax.swing.ImageIcon("C:\\lab_proyecto\\fotos\\buscar.png")); // NOI18N
        buscar.setContentAreaFilled(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(codbus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(nombus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(codbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codbusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codbusKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            Buscar();
        }
    }//GEN-LAST:event_codbusKeyPressed

    private void nombusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombusKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            Buscar();
        }
    }//GEN-LAST:event_nombusKeyPressed

    private void combo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            Buscar();
        }
    }//GEN-LAST:event_combo1KeyPressed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            Buscar();
        }
    }//GEN-LAST:event_buscarKeyPressed

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
            java.util.logging.Logger.getLogger(consulta_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField codbus;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombus;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
public void Buscar() {
        String[][] datos = new String[100][6];
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        tabla.setModel(model);
        model.setRowCount(0);
        try { //INSERTO LOS DATOS DEL  ARCHIVO EN UNA MATRIZ
            try (FileReader fr = new FileReader(tablaus); BufferedReader br = new BufferedReader(fr)) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] fila = linea.split(";");
                    datos[contador] = fila;
                    contador++;
                }
                fr.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int numFilas = datos.length;
        int numColumnasOriginal = datos[0].length;
        int numColumnasNueva = numColumnasOriginal - 1;
        String[][] imprimir = new String[numFilas][numColumnasNueva];
        int indiceNuevaColumna = 0;
        for (int i = 0; i < numFilas; i++) {
            int indiceColumnaOriginal = 0;
            for (int j = 0; j < numColumnasOriginal; j++) {
                if (j != 1) {
                    imprimir[i][indiceNuevaColumna] = datos[i][indiceColumnaOriginal];
                    indiceNuevaColumna++;
                }
                indiceColumnaOriginal++;
            }
            indiceNuevaColumna = 0; // Reinicia el índice de la nueva columna para la siguiente fila
        }

        if (codbus.getText().equals("") && nombus.getText().equals("") && combo1.getSelectedIndex() == 0) {
            model.setRowCount(0);
            for (String[] dato : imprimir) {
                if (dato[0] != null) {
                    model.addRow(dato);
                }
            }
        }
        if (!"".equals(codbus.getText())) {
            model.setRowCount(0);
            for (String[] dato : imprimir) {
                if (dato[0] != null && dato[0].equals(codbus.getText())) {
                    model.addRow(dato);
                } else if (dato[0] != null && dato[0].contains(codbus.getText())) {
                    model.addRow(dato);
                }
            }
        }
        if (!"".equals(nombus.getText())) {
            model.setRowCount(0);
            for (String[] dato : imprimir) {
                if (dato[0] != null && dato[1].equals(nombus.getText())) {
                    model.addRow(dato);
                } else if (dato[0] != null && dato[0].contains(nombus.getText())) {
                    model.addRow(dato);
                }
            }
        }
        if (combo1.getSelectedIndex() != 0) {
            model.setRowCount(0);
            for (String[] dato : imprimir) {
                if (dato[0] != null && dato[4].equals(combo1.getSelectedItem())) {
                    model.addRow(dato);
                }
            }
        }
    }

}