/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class Caceria extends javax.swing.JFrame {

    /**
     * Creates new form Caceria
     */
    public Caceria() {
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
        textArea1 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea1.setBackground(new java.awt.Color(102, 102, 255));
        textArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textArea1.setText("Nos estamos haciendo mal \nen lugar de partir las diferencias. \nNos abrimos más heridas \ncon el filo que nos queda. \n\nNos usamos de paracaídas, \ngritándonos “sálvese quien pueda”, \nnos estamos haciendo mal. \n\nNos estamos haciendo mal \nen lugar de servir a la inconciencia, \nnos mentimos por la espalda, \ncon el miedo que nos quema. \n\nNos matamos en la cacería, \ncontamos el viento que nos lleva. \nNos estamos haciendo mal. \n\nA veces nos alcanza con mirarnos, \na veces con lastimarnos. \n¿Cómo he llegado aquí? ¿Qué hacíamos allí? \nNo había tiempo para explicarnos. \nA veces nos alcanza con mirarnos. \n\nNos estamos haciendo al \nen lugar de aceptar la derrota, \nmaquillamos la miseria \npor la furia que provoca. \nEvitamos palabras prohibidas, \ntemblamos rozándonos la boca. \n\nA veces nos alcanza con mirarnos, \na veces con lastimarnos. \n¿Cómo he llegado aquí? ¿Qué hacíamos allí? \nNo había tiempo para explicarnos. \nA veces nos alcanza con mirarnos. \n\nA veces nos alcanza con mirarnos, \ny a veces con lastimarnos. \n¿Cómo he llegado aquí? ¿Qué hacías tú allí? \nNo había tiempo para explicarnos. \nA veces nos alcanza con mirarnos. \nOh, mirarnos. ");
        jPanel1.add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 377, 404));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Caceria");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 20, 115, 43));

        jButton1.setText("Volver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
Aplicacion obj1 = new Aplicacion();
        obj1.setVisible(true);
        dispose();



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Caceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caceria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
