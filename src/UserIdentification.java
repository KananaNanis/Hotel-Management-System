

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claire Chemutai
 * @author Nanis Kanana
 */
public class UserIdentification extends javax.swing.JFrame {

    /**
     * Creates new form UserIdentification
     */
    Intermediary inter;
    public UserIdentification(Intermediary inter) { 
        initComponents();
        this.inter = inter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDisplay = new javax.swing.JLabel();
        custButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        labelDisplay.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        labelDisplay.setText("Welcome to Royal Star Hotel");
        getContentPane().add(labelDisplay);
        labelDisplay.setBounds(90, 20, 254, 26);

        custButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        custButton.setText("CUSTOMER");
        custButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custButtonActionPerformed(evt);
            }
        });
        getContentPane().add(custButton);
        custButton.setBounds(10, 130, 150, 40);

        staffButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        staffButton.setText("STAFF");
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });
        getContentPane().add(staffButton);
        staffButton.setBounds(230, 130, 150, 40);

        aboutBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aboutBtn.setText("ABOUT");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutBtn);
        aboutBtn.setBounds(130, 220, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 380));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 380));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 380));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custButtonActionPerformed
      CustomerService custService = new CustomerService(inter);
        //int var = userInputTxtField.getInput();
        this.setVisible(false);
        custService.setVisible(true);
            
    }//GEN-LAST:event_custButtonActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        // TODO add your handling code here:
        StaffService staffService = new StaffService(inter);
        //int var = userInputTxtField.getInput();
        this.setVisible(false);
        staffService.setVisible(true);
    }//GEN-LAST:event_staffButtonActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        // TODO add your handling code here:
        displayOrg();
            
    }//GEN-LAST:event_aboutBtnActionPerformed
    public void displayOrg(){
        OrgStructure<String> royalStarOrgChart = new OrgStructure<>("Hotel Manager");
        OrgStructure<String> foodManager = new OrgStructure<>("Food manager");
        OrgStructure<String> hsechef = new OrgStructure<>("Head Chef");
        OrgStructure<String> restManager = new OrgStructure<>("Restaurant Manager");
        
        OrgStructure<String> hsemanager = new OrgStructure<>("Front of House Manager");
        OrgStructure<String> hreception = new OrgStructure<>("Head Reception");
        OrgStructure<String> hsekeeper = new OrgStructure<>("House Keeper");
                
        royalStarOrgChart.setSubTrees(foodManager, hsemanager);
        hsemanager.setSubTrees(hreception, hsekeeper);
        foodManager.setSubTrees(hsechef, restManager);
        
        
        
        System.out.println("Here's the hotel organizational structure:");
        royalStarOrgChart.drawTree();
        System.out.println();
               
}
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton custButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDisplay;
    private javax.swing.JButton staffButton;
    // End of variables declaration//GEN-END:variables
}

