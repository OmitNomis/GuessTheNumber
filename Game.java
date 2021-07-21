/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess.game;

/**
 *
 * @author user
 */
public class Game extends javax.swing.JFrame {

    int randomNumber = 0;
    int userInput = 0;
    int guessNum = 0;
    int bestNum=10;
    
    void generateNumber(){
        
        int randomNumber = (int) (Math.random()*100 + 1);
        this.randomNumber = randomNumber;
    }
    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bestScoreLable = new javax.swing.JLabel();
        bestScore = new javax.swing.JLabel();
        guessesLable = new javax.swing.JLabel();
        guesses = new javax.swing.JLabel();
        descLable = new javax.swing.JLabel();
        headLable = new javax.swing.JLabel();
        guessBox = new javax.swing.JTextField();
        guessButton = new javax.swing.JButton();
        giveUpButton = new javax.swing.JButton();
        playAgainButton = new javax.swing.JButton();
        notiBox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(530, 400));
        setResizable(false);

        bestScoreLable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bestScoreLable.setText("Best Score:");

        bestScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        guessesLable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guessesLable.setText("Guesses:");

        guesses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        descLable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        descLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descLable.setText("Enter a Number between 1 and 100");

        headLable.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        headLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headLable.setText("Guess The Number");

        guessBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        guessButton.setText("Guess");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        giveUpButton.setText("Show Answer");
        giveUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveUpButtonActionPerformed(evt);
            }
        });

        playAgainButton.setText("Play Again!");
        playAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainButtonActionPerformed(evt);
            }
        });

        notiBox.setBackground(java.awt.Color.red);
        notiBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bestScoreLable)
                .addGap(18, 18, 18)
                .addComponent(bestScore, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(guessesLable)
                .addGap(18, 18, 18)
                .addComponent(guesses, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guessBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(giveUpButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(descLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(headLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notiBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guesses, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bestScoreLable)
                        .addComponent(bestScore, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guessesLable)))
                .addGap(28, 28, 28)
                .addComponent(headLable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descLable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notiBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guessBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giveUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        try{
            int userInput = Integer.parseInt(guessBox.getText());
            if (userInput> 100 || userInput <0) {               
                guessBox.setText("");
                notiBox.setText("Invalid Input, please enter a number between 0 and 100");  
            }
            else{
                if (guessNum==0) {
                generateNumber();
                }
                checkNumber(userInput);
            }
        }
        catch(NumberFormatException e){
            notiBox.setText("Invalid Input, please enter a number");
        }
        
        
    
    }//GEN-LAST:event_guessButtonActionPerformed

    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        
        if (guessNum==0){
            notiBox.setText("Please have atleast 1 attempt!");
        }
        else{
            if (bestNum >= guessNum){
            bestNum = guessNum;
            System.out.println(bestNum);
            bestScore.setText(String.valueOf(bestNum));
            }
            guesses.setText("");
            guessNum=0;
            notiBox.setText("");
        }
        
        
    }//GEN-LAST:event_playAgainButtonActionPerformed

    private void giveUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveUpButtonActionPerformed
        notiBox.setText("The Answer is: "+ randomNumber+" Click on \"Play Again\"");
        guesses.setText("");
        guessNum=0;
        
    }//GEN-LAST:event_giveUpButtonActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bestScore;
    private javax.swing.JLabel bestScoreLable;
    private javax.swing.JLabel descLable;
    private javax.swing.JButton giveUpButton;
    private javax.swing.JTextField guessBox;
    private javax.swing.JButton guessButton;
    private javax.swing.JLabel guesses;
    private javax.swing.JLabel guessesLable;
    private javax.swing.JLabel headLable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel notiBox;
    private javax.swing.JButton playAgainButton;
    // End of variables declaration//GEN-END:variables

    private void checkNumber(int userInput) {

        int counter = guessNum;
        
        if (guessNum<9){
        
            if (randomNumber > userInput) {
                notiBox.setText("Wrong Answer!!, Try guessing higher!");
                guessBox.setText("");
                counter++;
                guessNum=counter;
                guesses.setText(String.valueOf(guessNum));
                
            }
            else if(randomNumber<userInput){
                notiBox.setText("Wrong Answer!!, Try guessing lower!");
                guessBox.setText("");
                counter++;
                guessNum=counter;
                guesses.setText(String.valueOf(guessNum));
            }
            else{
                notiBox.setText("Correct Answer, Congratulations, Click \" Play Again\" to play again!");
                guessBox.setText("");
                counter++;
                guessNum=counter;
                guesses.setText(String.valueOf(guessNum));
                
            }
        }
        else{
            notiBox.setText("You've run out of chances. Click on \"Play Again\" to play again.");
            guessBox.setText("");
            guesses.setText("");
        }
        
    }
    
}

