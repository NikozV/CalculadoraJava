/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vassa
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
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
        txtResul = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnRaizCubica = new javax.swing.JButton();
        btnRaizCuadrada = new javax.swing.JButton();
        btnDiv1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResul)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtResul, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Entrada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("N??mero 1:");

        jLabel2.setText("N??mero 2:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(txtNum1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Calculos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnSuma.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnRaizCubica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRaizCubica.setText("???3");
        btnRaizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCubicaActionPerformed(evt);
            }
        });

        btnRaizCuadrada.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRaizCuadrada.setText("???2");
        btnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCuadradaActionPerformed(evt);
            }
        });

        btnDiv1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDiv1.setText("Factorial");
        btnDiv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiv1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnMulti)
                        .addGap(18, 18, 18)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDiv1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRaizCuadrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRaizCubica)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma)
                    .addComponent(btnResta)
                    .addComponent(btnRaizCuadrada)
                    .addComponent(btnRaizCubica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMulti)
                    .addComponent(btnDiv)
                    .addComponent(btnDiv1))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        double num1= Double.parseDouble(txtNum1.getText());
        double num2= Double.parseDouble(txtNum2.getText());
        
        txtResul.setText(String.valueOf(num1 + num2));
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
        double num1= Double.parseDouble(txtNum1.getText());
        double num2= Double.parseDouble(txtNum2.getText());
        
        txtResul.setText(String.valueOf(num1 - num2));
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        // TODO add your handling code here:
        double num1= Double.parseDouble(txtNum1.getText());
        double num2= Double.parseDouble(txtNum2.getText());
        
        txtResul.setText(String.valueOf(num1 * num2));
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        double num1= Double.parseDouble(txtNum1.getText());
        double num2= Double.parseDouble(txtNum2.getText());
        
        txtResul.setText(String.valueOf(num1 / num2));
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnDiv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiv1ActionPerformed
        // TODO add your handling code here:
        int x = Integer.valueOf(txtNum1.getText());
        int factorial =1;
        while (x !=0){
            factorial *=x;
            x--;
            txtResul.setText(String.valueOf(factorial));
        }
    }//GEN-LAST:event_btnDiv1ActionPerformed

    private void btnRaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCubicaActionPerformed
        // TODO add your handling code here:
        double x = Double.parseDouble(txtNum1.getText());
        double raiz;
        raiz = Math.cbrt(x);
        txtResul.setText(String.valueOf(raiz));
    }//GEN-LAST:event_btnRaizCubicaActionPerformed

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCuadradaActionPerformed
        // TODO add your handling code here:
        double x = Double.parseDouble(txtNum1.getText());
        double raiz;
        raiz = Math.sqrt(x);
        txtResul.setText(String.valueOf(raiz));
    }//GEN-LAST:event_btnRaizCuadradaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDiv1;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnRaizCuadrada;
    private javax.swing.JButton btnRaizCubica;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtResul;
    // End of variables declaration//GEN-END:variables
}
