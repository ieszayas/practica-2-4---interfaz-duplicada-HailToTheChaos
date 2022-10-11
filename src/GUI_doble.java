
import java.awt.Color;
import javax.swing.border.LineBorder;

public class GUI_doble extends javax.swing.JFrame {

    public GUI_doble() {        
        initComponents();
        check.setVisible(false);
        estado_correo.setVisible(false);
        buttonGroup1.add(RadioButton_opc1);
        buttonGroup1.add(RadioButton_opc2);
        buttonGroup1.add(RadioButton_opc3);
        
        buttonGroup_duplicado.add(RadioButton_opc1_dup);
        buttonGroup_duplicado.add(RadioButton_opc2_dup);
        buttonGroup_duplicado.add(RadioButton_opc3_dup);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup_duplicado = new javax.swing.ButtonGroup();
        Panel_principal = new javax.swing.JPanel();
        RadioButton_opc1 = new javax.swing.JRadioButton();
        RadioButton_opc2 = new javax.swing.JRadioButton();
        RadioButton_opc3 = new javax.swing.JRadioButton();
        CheckBox_opc4 = new javax.swing.JCheckBox();
        CheckBox_opc5 = new javax.swing.JCheckBox();
        CheckBox_opc6 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        ComboBox_primero = new javax.swing.JComboBox<>();
        Spinner = new javax.swing.JSpinner();
        Label_correo = new javax.swing.JLabel();
        jTextField_correo = new javax.swing.JTextField();
        check = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Panel_duplicado = new javax.swing.JPanel();
        Spinner_duplicado = new javax.swing.JSpinner();
        Label_correo5 = new javax.swing.JLabel();
        jTextField_correo_duplicado = new javax.swing.JTextField();
        RadioButton_opc1_dup = new javax.swing.JRadioButton();
        RadioButton_opc2_dup = new javax.swing.JRadioButton();
        RadioButton_opc3_dup = new javax.swing.JRadioButton();
        CheckBox_opc4_dup = new javax.swing.JCheckBox();
        CheckBox_opc5_dup = new javax.swing.JCheckBox();
        CheckBox_opc6_dup = new javax.swing.JCheckBox();
        Textfield_duplicado = new javax.swing.JTextField();
        ComboBox_duplicado = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        Panel_estado = new javax.swing.JPanel();
        estado_correo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        RadioButton_opc1.setText("Opción 1");
        RadioButton_opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_opc1ActionPerformed(evt);
            }
        });

        RadioButton_opc2.setText("Opción 2");
        RadioButton_opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_opc2ActionPerformed(evt);
            }
        });

        RadioButton_opc3.setText("Opción 3");
        RadioButton_opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_opc3ActionPerformed(evt);
            }
        });

        CheckBox_opc4.setText("Opción 4");
        CheckBox_opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_opc4ActionPerformed(evt);
            }
        });

        CheckBox_opc5.setText("Opción 5");
        CheckBox_opc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_opc5ActionPerformed(evt);
            }
        });

        CheckBox_opc6.setText("Opción 6");
        CheckBox_opc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_opc6ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        ComboBox_primero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_primeroActionPerformed(evt);
            }
        });

        Spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerStateChanged(evt);
            }
        });

        Label_correo.setText("Correo");

        jTextField_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_correoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_correoKeyReleased(evt);
            }
        });

        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/sign-check-icon.png"))); // NOI18N

        javax.swing.GroupLayout Panel_principalLayout = new javax.swing.GroupLayout(Panel_principal);
        Panel_principal.setLayout(Panel_principalLayout);
        Panel_principalLayout.setHorizontalGroup(
            Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RadioButton_opc3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioButton_opc2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioButton_opc1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox_opc4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_opc6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_opc5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Spinner, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboBox_primero, javax.swing.GroupLayout.Alignment.LEADING, 0, 91, Short.MAX_VALUE))))
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addComponent(Label_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        Panel_principalLayout.setVerticalGroup(
            Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_opc1)
                    .addComponent(CheckBox_opc4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_opc2)
                    .addComponent(CheckBox_opc5)
                    .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_opc3)
                    .addComponent(CheckBox_opc6)
                    .addComponent(ComboBox_primero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_correo)
                    .addComponent(check))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_duplicado.setOpaque(false);

        Spinner_duplicado.setEnabled(false);

        Label_correo5.setText("Correo");
        Label_correo5.setEnabled(false);

        jTextField_correo_duplicado.setEnabled(false);

        RadioButton_opc1_dup.setText("Opción 1");
        RadioButton_opc1_dup.setEnabled(false);
        RadioButton_opc1_dup.setOpaque(true);

        RadioButton_opc2_dup.setText("Opción 2");
        RadioButton_opc2_dup.setEnabled(false);

        RadioButton_opc3_dup.setText("Opción 3");
        RadioButton_opc3_dup.setEnabled(false);

        CheckBox_opc4_dup.setText("Opción 4");
        CheckBox_opc4_dup.setEnabled(false);

        CheckBox_opc5_dup.setText("Opción 5");
        CheckBox_opc5_dup.setEnabled(false);

        CheckBox_opc6_dup.setText("Opción 6");
        CheckBox_opc6_dup.setEnabled(false);

        Textfield_duplicado.setEnabled(false);

        ComboBox_duplicado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_duplicado.setEnabled(false);

        javax.swing.GroupLayout Panel_duplicadoLayout = new javax.swing.GroupLayout(Panel_duplicado);
        Panel_duplicado.setLayout(Panel_duplicadoLayout);
        Panel_duplicadoLayout.setHorizontalGroup(
            Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_duplicadoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_duplicadoLayout.createSequentialGroup()
                        .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RadioButton_opc3_dup, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioButton_opc2_dup, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioButton_opc1_dup, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox_opc4_dup, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_opc6_dup, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_opc5_dup, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Textfield_duplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Spinner_duplicado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboBox_duplicado, javax.swing.GroupLayout.Alignment.LEADING, 0, 91, Short.MAX_VALUE))))
                    .addGroup(Panel_duplicadoLayout.createSequentialGroup()
                        .addComponent(Label_correo5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jTextField_correo_duplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_duplicadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
        );
        Panel_duplicadoLayout.setVerticalGroup(
            Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_duplicadoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_opc1_dup)
                    .addComponent(CheckBox_opc4_dup)
                    .addComponent(Textfield_duplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_opc2_dup)
                    .addComponent(CheckBox_opc5_dup)
                    .addComponent(Spinner_duplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_opc3_dup)
                    .addComponent(CheckBox_opc6_dup)
                    .addComponent(ComboBox_duplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_duplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_correo_duplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_correo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        estado_correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_correo.setText("El correo que ha introducido es correcto.");

        javax.swing.GroupLayout Panel_estadoLayout = new javax.swing.GroupLayout(Panel_estado);
        Panel_estado.setLayout(Panel_estadoLayout);
        Panel_estadoLayout.setHorizontalGroup(
            Panel_estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_estadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estado_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_estadoLayout.setVerticalGroup(
            Panel_estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_estadoLayout.createSequentialGroup()
                .addComponent(estado_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(Panel_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_duplicado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_duplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButton_opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_opc3ActionPerformed
        check_radioBut(RadioButton_opc3, RadioButton_opc3_dup);
    }//GEN-LAST:event_RadioButton_opc3ActionPerformed

    private void jTextField_correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_correoKeyPressed
        if (jTextField_correo.getText().matches("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+")) {
            jTextField_correo.setBorder(new LineBorder(Color.green, 1));
            check.setVisible(true);
            estado_correo.setVisible(true);
        } else {
            jTextField_correo.setBorder(new LineBorder(Color.red, 1));
            check.setVisible(false);            
            estado_correo.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_correoKeyPressed

    private void RadioButton_opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_opc1ActionPerformed
        check_radioBut(RadioButton_opc1, RadioButton_opc1_dup);
    }//GEN-LAST:event_RadioButton_opc1ActionPerformed

    private void RadioButton_opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_opc2ActionPerformed
        check_radioBut(RadioButton_opc2, RadioButton_opc2_dup);
    }//GEN-LAST:event_RadioButton_opc2ActionPerformed

    private void CheckBox_opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_opc4ActionPerformed
        check_chkbox(CheckBox_opc4, CheckBox_opc4_dup);
    }//GEN-LAST:event_CheckBox_opc4ActionPerformed

    private void CheckBox_opc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_opc5ActionPerformed
        check_chkbox(CheckBox_opc5, CheckBox_opc5_dup);
    }//GEN-LAST:event_CheckBox_opc5ActionPerformed

    private void CheckBox_opc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_opc6ActionPerformed
        check_chkbox(CheckBox_opc6, CheckBox_opc6_dup);
    }//GEN-LAST:event_CheckBox_opc6ActionPerformed

    private void jTextField_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_correoKeyReleased
        jTextField_correo_duplicado.setText(jTextField_correo.getText());
    }//GEN-LAST:event_jTextField_correoKeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        Textfield_duplicado.setText(new StringBuilder(jTextField1.getText()).reverse().toString());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void SpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerStateChanged
        Spinner_duplicado.setValue(Spinner.getValue());
    }//GEN-LAST:event_SpinnerStateChanged

    private void ComboBox_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_primeroActionPerformed
        ComboBox_duplicado.setSelectedIndex(ComboBox_primero.getSelectedIndex());
    }//GEN-LAST:event_ComboBox_primeroActionPerformed

    private void check_chkbox(javax.swing.JCheckBox checkbox, javax.swing.JCheckBox duplicado) {
        if (checkbox.isSelected()) {
            duplicado.setSelected(true);
        } else {
            duplicado.setSelected(false);
        }
    }

    private void check_radioBut(javax.swing.JRadioButton radiobutton, javax.swing.JRadioButton duplicado) {
        if (radiobutton.isSelected()) {
            duplicado.setSelected(true);
        } else {
            duplicado.setSelected(false);
        }
    }

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
            java.util.logging.Logger.getLogger(GUI_doble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_doble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_doble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_doble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_doble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_opc4;
    private javax.swing.JCheckBox CheckBox_opc4_dup;
    private javax.swing.JCheckBox CheckBox_opc5;
    private javax.swing.JCheckBox CheckBox_opc5_dup;
    private javax.swing.JCheckBox CheckBox_opc6;
    private javax.swing.JCheckBox CheckBox_opc6_dup;
    private javax.swing.JComboBox<String> ComboBox_duplicado;
    private javax.swing.JComboBox<String> ComboBox_primero;
    private javax.swing.JLabel Label_correo;
    private javax.swing.JLabel Label_correo5;
    private javax.swing.JPanel Panel_duplicado;
    private javax.swing.JPanel Panel_estado;
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JRadioButton RadioButton_opc1;
    private javax.swing.JRadioButton RadioButton_opc1_dup;
    private javax.swing.JRadioButton RadioButton_opc2;
    private javax.swing.JRadioButton RadioButton_opc2_dup;
    private javax.swing.JRadioButton RadioButton_opc3;
    private javax.swing.JRadioButton RadioButton_opc3_dup;
    private javax.swing.JSpinner Spinner;
    private javax.swing.JSpinner Spinner_duplicado;
    private javax.swing.JTextField Textfield_duplicado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup_duplicado;
    private javax.swing.JLabel check;
    private javax.swing.JLabel estado_correo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_correo_duplicado;
    // End of variables declaration//GEN-END:variables
}
