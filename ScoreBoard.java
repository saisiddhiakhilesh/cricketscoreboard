
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akhilesh dell 5558
 */
public class ScoreBoard extends javax.swing.JFrame {
    /**Creates a new match */
    public Cricket m = new Cricket();
    /**To keep track of no of overs */
    public int noOvers =3;
    /**Check whether a team has finished playing */
    public boolean flag1 = false, flag2 = false;
    /**Listens to the timer event */
    ActionListener act = new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   act();
                }
            };
               /**Timer which causes delay */
               Timer timer = new Timer(1000, act);
    
    /**
     * Creates new form ScoreCard
     */
    public ScoreBoard() {

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

        scoreLabel = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        begin = new javax.swing.JButton();
        toss = new javax.swing.JButton();
        overLabel = new javax.swing.JLabel();
        wicketLabel = new javax.swing.JLabel();
        overs = new javax.swing.JLabel();
        wickets = new javax.swing.JLabel();
        runLabel = new javax.swing.JLabel();
        runs = new javax.swing.JLabel();
        batLabel = new javax.swing.JLabel();
        bat = new javax.swing.JLabel();
        bowlLabel = new javax.swing.JLabel();
        bowler = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ind = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        eng = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        score1 = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ScoreBoard");
        setName("ScoreBoard"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        scoreLabel.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        scoreLabel.setText("SCORE:");
        scoreLabel.setEnabled(false);

        score.setText(" ");

        begin.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        begin.setText("BEGIN");
        begin.setEnabled(false);
        begin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginActionPerformed(evt);
            }
        });

        toss.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        toss.setText("TOSS");
        toss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tossActionPerformed(evt);
            }
        });

        overLabel.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        overLabel.setText("OVERS:");
        overLabel.setEnabled(false);

        wicketLabel.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        wicketLabel.setText("WICKETS:");
        wicketLabel.setEnabled(false);

        overs.setText(" ");

        wickets.setText(" ");

        runLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        runLabel.setText("RUNS:");
        runLabel.setEnabled(false);

        runs.setText(" ");

        batLabel.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        batLabel.setText("BATSMAN:");
        batLabel.setEnabled(false);

        bowlLabel.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        bowlLabel.setText("BOWLER:");
        bowlLabel.setEnabled(false);

        statusLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        statusLabel.setText("STATUS:");
        statusLabel.setEnabled(false);

        ind.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "INDIA"
            }
        ));
        jScrollPane2.setViewportView(ind);

        eng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ENGLAND"
            }
        ));
        jScrollPane3.setViewportView(eng);

        jLabel1.setText("Score:");

        jLabel2.setText("Score:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(toss, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(204, 204, 204))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(statusLabel)
                                        .addGap(41, 41, 41)
                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(runLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(runs, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(276, 276, 276)
                                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(overLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(overs, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(begin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addComponent(wicketLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wickets, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(batLabel)
                                .addGap(18, 18, 18)
                                .addComponent(bat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bowlLabel)
                                .addGap(35, 35, 35)))
                        .addComponent(bowler, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(score1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bowlLabel)
                                .addComponent(batLabel))
                            .addComponent(bowler, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(runLabel)
                                .addComponent(runs)
                                .addComponent(statusLabel)))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score))
                        .addGap(18, 18, 18)
                        .addComponent(toss, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(begin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wicketLabel)
                            .addComponent(wickets)
                            .addComponent(overLabel)
                            .addComponent(overs))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    /**Main action of the program where turn is checked */
     private void act() {
        /**Score */
        int s = 0;
        /**Player 1 */
        int p1 = 0;
        /**Player 2 */
        int p2 = 1;
        /**Current player */
        int p;
    
        if(m.t1.turn == 1 && flag1 == false)
        {
            flag1 = m.bowl(m.t1, ind, 0, runs, overs, wickets, score, bat, bowler, status, score1);
            
            if((int)m.t1.ov == noOvers || flag1 == true )
            {
                m.t1.turn = 0;
                m.t2.turn = 1;
                flag1 = true;
                JOptionPane.showMessageDialog(this, m.t1.name+" has finished playing");
            }
        } 
        if(m.t2.turn == 1 && flag2 == false)
        {
            flag2 = m.bowl(m.t2, eng , 0, runs, overs, wickets, score, bat, bowler, status, score2);
            if((int)m.t2.ov == noOvers || flag2 == true )
            {
                m.t2.turn = 0;
                m.t1.turn = 1;
                flag2 = true;
                JOptionPane.showMessageDialog(this, m.t2.name+" has finished playing");
            }
        }
        if(flag1 == true && flag2 == false)
        {
            if(m.t2.sc > m.t1.sc)
            {
               flag2 = true;
               //JOptionPane.showMessageDialog(this, "Team 2 has won the Match!");
            }
        }
        if(flag2 == true && flag1 == false)
        {
            if(m.t1.sc > m.t2.sc)
                flag1 = true;
        }
        if(flag1 == true && flag2 == true)
        {
            if(m.t1.sc > m.t2.sc)
                JOptionPane.showMessageDialog(this, "The match has finished! "+m.t1.name+" has won the GAME!!");
            else if(m.t1.sc < m.t2.sc)
                JOptionPane.showMessageDialog(this, "The match has finished! "+m.t2.name+" has won the GAME!!");
            else
                JOptionPane.showMessageDialog(this, "The match has finished a draw!!");
            timer.stop();
        } 
    }
     /**Action for button 'Begin' */
    private void beginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginActionPerformed
        for(int i = 0; i <= noOvers; i++)
        timer.start(); 
        begin.setVisible(false);
    }//GEN-LAST:event_beginActionPerformed
    /**Action for button 'Toss' */
    private void tossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tossActionPerformed
        try{
        noOvers = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the number of overs: "));
        }
        catch(Exception e)
        {
            
        }
        scoreLabel.setEnabled(true);
        begin.setEnabled(true);
        toss.setVisible(false);
        runLabel.setEnabled(true);
        overLabel.setEnabled(true);
        wicketLabel.setEnabled(true);
        //teamSheet.setEnabled(true);
        runLabel.setEnabled(true);
        batLabel.setEnabled(true);
        bowlLabel.setEnabled(true);
        statusLabel.setEnabled(true);
        int t = (int) (Math.random()*2);
        
         for(int j = 0; j < 11; j++)
                {
                    ind.setValueAt(m.t1.players[j].name, j, 0);
                }
                for(int i = 0; i < 11; i++)
                {
                    eng.setValueAt(m.t2.players[i].name, i, 0);
                }
        if(t == 0)
        {
            m.t1.turn = 1;
            m.t1.players[0].play = 1;
            m.t1.players[1].play = 1;
            JOptionPane.showMessageDialog(this, m.t1.name+" won the toss.");
        }
        else
        {
            m.t2.turn = 1;
            m.t2.players[0].play = 1;
            m.t2.players[1].play = 1;
            JOptionPane.showMessageDialog(this, m.t2.name+" won the toss.");
        }
        
    }//GEN-LAST:event_tossActionPerformed
    /**Action when the window opens */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bat;
    private javax.swing.JLabel batLabel;
    private javax.swing.JButton begin;
    private javax.swing.JLabel bowlLabel;
    private javax.swing.JLabel bowler;
    private javax.swing.JTable eng;
    private javax.swing.JTable ind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel overLabel;
    private javax.swing.JLabel overs;
    private javax.swing.JLabel runLabel;
    private javax.swing.JLabel runs;
    private javax.swing.JLabel score;
    private javax.swing.JLabel score1;
    private javax.swing.JLabel score2;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel status;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton toss;
    private javax.swing.JLabel wicketLabel;
    private javax.swing.JLabel wickets;
    // End of variables declaration//GEN-END:variables

   


}
