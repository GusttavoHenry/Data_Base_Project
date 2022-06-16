package com.mycompany.connectpeople.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatCliente extends javax.swing.JFrame {

    static Socket socket;
    static DataInputStream msgEntrada;
    static DataOutputStream msgSaida;

    public ChatCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EnviarMensagem = new javax.swing.JToggleButton();
        campoMsg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CaixaMensagem = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));

        EnviarMensagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\send.png")); // NOI18N
        EnviarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarMensagemActionPerformed(evt);
            }
        });

        campoMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMsgActionPerformed(evt);
            }
        });

        CaixaMensagem.setColumns(20);
        CaixaMensagem.setRows(5);
        CaixaMensagem.setMinimumSize(new java.awt.Dimension(800, 600));
        jScrollPane1.setViewportView(CaixaMensagem);

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("                                                      Chat Usuario");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jButton34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\red-user-icon.png")); // NOI18N
        jButton34.setText("            Usuario 01");
        jButton34.setAutoscrolls(true);
        jButton34.setBorder(null);

        jButton35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\red-user-icon.png")); // NOI18N
        jButton35.setText("            Usuario 07");
        jButton35.setAutoscrolls(true);
        jButton35.setBorder(null);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\red-user-icon.png")); // NOI18N
        jButton36.setText("            Usuario 02");
        jButton36.setAutoscrolls(true);
        jButton36.setBorder(null);

        jButton37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\red-user-icon.png")); // NOI18N
        jButton37.setText("            Usuario 03");
        jButton37.setAutoscrolls(true);
        jButton37.setBorder(null);

        jButton38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton38.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\red-user-icon.png")); // NOI18N
        jButton38.setText("            Usuario 04");
        jButton38.setAutoscrolls(true);
        jButton38.setBorder(null);

        jButton39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton39.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\red-user-icon.png")); // NOI18N
        jButton39.setText("            Usuario 06");
        jButton39.setAutoscrolls(true);
        jButton39.setBorder(null);

        jButton40.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton40.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\red-user-icon.png")); // NOI18N
        jButton40.setText("            Usuario 08");
        jButton40.setAutoscrolls(true);
        jButton40.setBorder(null);

        jButton41.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\red-user-icon.png")); // NOI18N
        jButton41.setText("            Usuario 09");
        jButton41.setAutoscrolls(true);
        jButton41.setBorder(null);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jButton42.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\sms-4-icon.png")); // NOI18N
        jButton42.setBorder(null);

        jButton43.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\email-download-icon.png")); // NOI18N
        jButton43.setBorder(null);

        jButton44.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\people-icon.png")); // NOI18N
        jButton44.setBorder(null);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        SairButton.setBackground(new java.awt.Color(242, 242, 242));
        SairButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Documentos\\ConnectPeople\\src\\main\\java\\com\\mycompany\\connectpeople\\chat\\icons\\sair-button-icon.png")); // NOI18N
        SairButton.setBorder(null);
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(campoMsg)
                        .addGap(18, 18, 18)
                        .addComponent(EnviarMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SairButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SairButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EnviarMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(campoMsg))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarMensagemActionPerformed
        try{
            // Leitura da mensagem
            String msg = "";
            msg = campoMsg.getText();
            
            // Inicializa conexão entre Server e Cliente
            Socket socket = new Socket("127.0.0.1", 40000);
            
            // Codifica a mensagem em byte para UTF-8
            DataOutputStream msgSaida = new DataOutputStream(socket.getOutputStream());
            msgSaida.writeUTF(msg);
            campoMsg.setText("eae mano");
        }
        catch(Exception e)
        {
            System.out.print("Erro ao enviar mensagem: " + e);
        }

    }//GEN-LAST:event_EnviarMensagemActionPerformed

    private void campoMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMsgActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChatCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatCliente().setVisible(true);
            }
        });
        
        // Envio da mensagem
        try {
            String msg = "";
            
            // Inicializa conexão
            Socket socket = new Socket("127.0.0.1", 50001); // o endereço de ip é o locallhost, assim o servidor ira rodar na mesma maquina
            DataInputStream msgEntrada = new DataInputStream(socket.getInputStream());
            DataOutputStream msgSaida = new DataOutputStream(socket.getOutputStream());

            while (!msg.equals("sair")) {
                msg = msgEntrada.readUTF();
                CaixaMensagem.setText(CaixaMensagem.getText() + "\n Profissional: " + msg);
            }

        } catch (Exception e) {
             System.out.print("Erro ao enviar mensagem (Server): " + e); 

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea CaixaMensagem;
    private javax.swing.JToggleButton EnviarMensagem;
    private javax.swing.JButton SairButton;
    private javax.swing.JTextField campoMsg;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
