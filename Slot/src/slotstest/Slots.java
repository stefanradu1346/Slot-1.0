
package slotstest;

import java.io.File;
import javax.swing.JOptionPane;

public class Slots extends javax.swing.JFrame {

    int miza = 0;
    
    String username = JOptionPane.showInputDialog("Nume:");
    int bani = Integer.parseInt(JOptionPane.showInputDialog("Suma bani(lei):"));
    String valoarebani = String.valueOf(bani);
    
    public Slots() {
        initComponents();
        UsernameAless.setText(username);
        LabelBani.setText(valoarebani + "lei");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miza2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buton = new javax.swing.JButton();
        Slot3 = new javax.swing.JLabel();
        Slot2 = new javax.swing.JLabel();
        Slot1 = new javax.swing.JLabel();
        LabelBani = new javax.swing.JLabel();
        Slot4 = new javax.swing.JLabel();
        Slot5 = new javax.swing.JLabel();
        Slot6 = new javax.swing.JLabel();
        Slot9 = new javax.swing.JLabel();
        Slot8 = new javax.swing.JLabel();
        Slot7 = new javax.swing.JLabel();
        Labelmiza = new javax.swing.JLabel();
        miza1 = new javax.swing.JButton();
        miza10 = new javax.swing.JButton();
        miza4 = new javax.swing.JButton();
        miza5 = new javax.swing.JButton();
        miza3 = new javax.swing.JButton();
        miza6 = new javax.swing.JButton();
        Cashout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UsernameAles = new javax.swing.JLabel();
        UsernameAless = new javax.swing.JLabel();
        Buton0 = new javax.swing.JButton();

        miza2.setText("+1");
        miza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miza2ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aparat 777");
        setBackground(new java.awt.Color(153, 0, 153));

        buton.setBackground(new java.awt.Color(204, 0, 0));
        buton.setForeground(new java.awt.Color(240, 240, 240));
        buton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotstest/buton play.jpg"))); // NOI18N
        buton.setText("SPIN");
        buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonActionPerformed(evt);
            }
        });

        Slot3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot3.setText("0");
        Slot3.setToolTipText("");

        Slot2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot2.setText("0");
        Slot2.setToolTipText("");

        Slot1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot1.setText("0");
        Slot1.setToolTipText("");

        LabelBani.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelBani.setText("   lei");

        Slot4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot4.setText("0");
        Slot4.setToolTipText("");

        Slot5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot5.setText("0");
        Slot5.setToolTipText("");

        Slot6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot6.setText("0");
        Slot6.setToolTipText("");

        Slot9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot9.setText("0");
        Slot9.setToolTipText("");

        Slot8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot8.setText("0");
        Slot8.setToolTipText("");

        Slot7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Slot7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slot7.setText("0");
        Slot7.setToolTipText("");

        Labelmiza.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Labelmiza.setText("0  lei");

        miza1.setText("+1");
        miza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miza1ActionPerformed(evt);
            }
        });

        miza10.setText("+10");
        miza10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miza10ActionPerformed(evt);
            }
        });

        miza4.setText("-1");
        miza4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miza4ActionPerformed(evt);
            }
        });

        miza5.setText("-10");
        miza5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miza5ActionPerformed(evt);
            }
        });

        miza3.setText("+100");
        miza3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miza3ActionPerformed(evt);
            }
        });

        miza6.setText("-100");
        miza6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miza6ActionPerformed(evt);
            }
        });

        Cashout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotstest/cashoutbb.png"))); // NOI18N
        Cashout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Username:");

        UsernameAless.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UsernameAless.setText("nume");

        Buton0.setText("0");
        Buton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buton0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cashout, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(miza1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(miza10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(miza4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(miza5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Labelmiza, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(miza3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(miza6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buton0))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(LabelBani, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameAless, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(UsernameAles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(UsernameAles)
                            .addComponent(UsernameAless))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(LabelBani)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(miza1)
                                    .addComponent(miza10)
                                    .addComponent(miza3))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Buton0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cashout, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(miza4)
                            .addComponent(miza5)
                            .addComponent(miza6))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Labelmiza)
                            .addComponent(buton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonActionPerformed
        
        if(miza == 0)
            JOptionPane.showMessageDialog(this,"Baga bani pentru a juca");
        if(miza > bani){
            JOptionPane.showMessageDialog(this,"Ai depasit limita de bani");
            bani=bani+miza;
        }
        bani-=miza;
         int slot1 = (int) (Math.random() * 7 ) + 1 ;
         int slot2 = (int) (Math.random() * 7) + 1;
         int slot3 = (int) (Math.random() * 7) + 1;
         int slot4 = (int) (Math.random() * 7) + 1 ;
         int slot5 = (int) (Math.random() * 7) + 1;
         int slot6 = (int) (Math.random() * 7) + 1;
         int slot7 = (int) (Math.random() * 7) + 1;
         int slot8 = (int) (Math.random() * 7) + 1;
         int slot9 = (int) (Math.random() * 7) + 1;
         
         
         Slot1.setText(String.valueOf(slot1));
         Slot2.setText(String.valueOf(slot2));
         Slot3.setText(String.valueOf(slot3));
         Slot4.setText(String.valueOf(slot4));
         Slot5.setText(String.valueOf(slot5));
         Slot6.setText(String.valueOf(slot6));
         Slot7.setText(String.valueOf(slot7));
         Slot8.setText(String.valueOf(slot8));
         Slot9.setText(String.valueOf(slot9));
         
         
        if(slot1==slot2 && slot1==slot3){
         switch(slot1){
            case 1:
                bani*=1.5;              
                break;
            case 2:
                bani*=1.7;
                break;
            case 3:
                bani*=1.9;               
                break;
            case 4:
                bani*=2;               
                break;
            case 5:
                bani*=2.5;                
                break;
            case 6:
                bani*=3;               
                break;
            case 7:
                bani*=10;
                break;
            default:
                bani+=slot1;
         }
        }
         if(slot4==slot5 && slot5==slot6){
         switch(slot4){
            case 1:
                bani*=1.5;                
                break;
            case 2:
                bani*=1.7;               
                break;
            case 3:
                bani*=1.9;               
                break;
            case 4:
                bani*=2;               
                break;
            case 5:
                bani*=2.5;              
                break;
            case 6:
                bani*=3;              
                break;
            case 7:
                bani*=10;
                break;
            default:
                bani+=slot4;
         }
        }
         if(slot7==slot8 && slot8==slot9){
         switch(slot7){
            case 1:
                bani*=1.5;               
                break;
            case 2:
                bani*=1.7;                
                break;
            case 3:
                bani*=1.9;               
                break;
            case 4:
                bani*=2;               
                break;
            case 5:
                bani*=2.5;              
                break;
            case 6:
                bani*=3;               
                break;
            case 7:
                bani*=10; 
                break;
            default:
                bani+=slot7;
         }
        }
        if(slot1==slot5 && slot5==slot9){
         switch(slot1){
             case 1:
                bani*=1.5;                
                break;
            case 2:
                bani*=1.7;              
                break;
            case 3:
                bani*=1.9;                
                break;
            case 4:
                bani*=2;
                break;
            case 5:
                bani*=2.5;                
                break;
            case 6:
                bani*=3;               
                break;
            case 7:
                bani*=10;                
                break;
            default:
                bani+=slot1;
         }
        }
        if(slot3==slot5 && slot5==slot7){
         switch(slot3){
            case 1:
                bani*=1.5;                
                break;
            case 2:
                bani*=1.7;                
                break;
            case 3:
                bani*=1.9;                
                break;
            case 4:
                bani*=2;                
                break;
            case 5:
                bani*=2.5;                
                break;
            case 6:
                bani*=3;                
                break;
            case 7:
                bani*=10;                
                break;
            default:
                bani+=slot3;
         }
        }
        LabelBani.setText(String.valueOf(bani)+"lei");    
        
        if(bani == 0){
            int n = JOptionPane.showConfirmDialog(this,
                                                      "Nu mai ai bani. Mai vrei"
                                                              + " sa bagi?",
                                                      "Atentie",
                                                     JOptionPane.YES_NO_OPTION);
            if(n == 0){
                bani = Integer.parseInt(JOptionPane.showInputDialog("Suma bani(lei):")); ;
                LabelBani.setText(String.valueOf(bani)+"lei");
            }else{
                System.exit(0);
            }
        }
    }//GEN-LAST:event_butonActionPerformed

    private void miza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miza1ActionPerformed
        miza+=1;
        Labelmiza.setText(String.valueOf(miza)+"lei");
        if(miza>bani){
            JOptionPane.showMessageDialog(this,"Ai depasit limita");
            miza-=1;
            Labelmiza.setText(String.valueOf(miza)+"lei");
        }
    }//GEN-LAST:event_miza1ActionPerformed

    private void miza10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miza10ActionPerformed
        miza+=10;
        Labelmiza.setText(String.valueOf(miza)+"lei");
        if(miza>bani){
            JOptionPane.showMessageDialog(this,"Ai depasit limita");
            miza-=10;
            Labelmiza.setText(String.valueOf(miza)+"lei");
        }
    }//GEN-LAST:event_miza10ActionPerformed

    private void miza2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miza2ActionPerformed
        
    }//GEN-LAST:event_miza2ActionPerformed

    private void miza4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miza4ActionPerformed
        miza-=1;
        if(miza < 0){
            JOptionPane.showMessageDialog(this,"Nu poti avea miza negativa");
            miza+=1;
        }
        Labelmiza.setText(String.valueOf(miza)+"lei");
    }//GEN-LAST:event_miza4ActionPerformed

    private void miza5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miza5ActionPerformed
        miza-=10;
        if(miza < 0){
            JOptionPane.showMessageDialog(this,"Nu poti avea miza negativa");
            miza+=10;
        }
        Labelmiza.setText(String.valueOf(miza)+"lei");
    }//GEN-LAST:event_miza5ActionPerformed

    private void miza3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miza3ActionPerformed
        miza+=100;
        Labelmiza.setText(String.valueOf(miza)+"lei");
        if(miza>bani){
            JOptionPane.showMessageDialog(this,"Ai depasit limita");
            miza-=100;
            Labelmiza.setText(String.valueOf(miza)+"lei");
        }
    }//GEN-LAST:event_miza3ActionPerformed

    private void miza6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miza6ActionPerformed
        miza-=100;
        if(miza < 0){
            JOptionPane.showMessageDialog(this,"Nu poti avea miza negativa");
            miza+=100;
        }
        Labelmiza.setText(String.valueOf(miza)+"lei");
    }//GEN-LAST:event_miza6ActionPerformed

    private void CashoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashoutActionPerformed
        int n = JOptionPane.showConfirmDialog(this,
                                                      "Esti sigur?",
                                                      "Atentie",
                                                     JOptionPane.YES_NO_OPTION);
            if(n == 0){
                JOptionPane.showMessageDialog(this,"Ai castigat "+ bani +  "lei");
                System.exit(0);
            }
    }//GEN-LAST:event_CashoutActionPerformed

    private void Buton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buton0ActionPerformed
        miza=0;
        Labelmiza.setText(String.valueOf(miza)+"lei");
    }//GEN-LAST:event_Buton0ActionPerformed
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slots().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buton0;
    private javax.swing.JButton Cashout;
    private javax.swing.JLabel LabelBani;
    private javax.swing.JLabel Labelmiza;
    private javax.swing.JLabel Slot1;
    private javax.swing.JLabel Slot2;
    private javax.swing.JLabel Slot3;
    private javax.swing.JLabel Slot4;
    private javax.swing.JLabel Slot5;
    private javax.swing.JLabel Slot6;
    private javax.swing.JLabel Slot7;
    private javax.swing.JLabel Slot8;
    private javax.swing.JLabel Slot9;
    private javax.swing.JLabel UsernameAles;
    private javax.swing.JLabel UsernameAless;
    private javax.swing.JButton buton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton miza1;
    private javax.swing.JButton miza10;
    private javax.swing.JButton miza2;
    private javax.swing.JButton miza3;
    private javax.swing.JButton miza4;
    private javax.swing.JButton miza5;
    private javax.swing.JButton miza6;
    // End of variables declaration//GEN-END:variables
}
