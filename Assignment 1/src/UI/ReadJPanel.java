/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.ChefRecipe;
import Model.Recipe;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author nishipancholi
 */
public class ReadJPanel extends javax.swing.JPanel {
    private ChefRecipe chefRecipeDetails;

    /**
     * Creates new form ReadJPanel
     */
    public ReadJPanel() {
        initComponents();
    }

    ReadJPanel(ChefRecipe chefRecipeDetails) {
        initComponents();
        this.chefRecipeDetails = chefRecipeDetails;
        viewDetails(chefRecipeDetails);
        viewRecipeList();
    }
    
        public void viewDetails(ChefRecipe chefRecipeDetails) {
        
        chefFirstNameField.setText(this.chefRecipeDetails.getChefFirstName());
        chefLastNameField.setText(this.chefRecipeDetails.getChefLastName());
        chefUserNameField.setText(this.chefRecipeDetails.getUserName());
        chefEmailField.setText(this.chefRecipeDetails.getEmail());
        chefPhoneField.setText(this.chefRecipeDetails.getPhoneNo());

    }

    public void viewRecipeList() {
        for (Recipe foodRecipe : this.chefRecipeDetails.getRecipeList()) {
            recipeComboBox.addItem(foodRecipe.getTitle());
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

        yesNoButtonGroup = new javax.swing.ButtonGroup();
        header = new javax.swing.JLabel();
        chefFirstNameLabel = new javax.swing.JLabel();
        chefLastNameLabel = new javax.swing.JLabel();
        chefUserNameLabel = new javax.swing.JLabel();
        recipeLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        servingNoLabel = new javax.swing.JLabel();
        glutenLabel = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        catFoodLabel = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        ingredientsLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        chefFirstNameField = new javax.swing.JTextField();
        chefLastNameField = new javax.swing.JTextField();
        chefUserNameField = new javax.swing.JTextField();
        chefEmailField = new javax.swing.JTextField();
        servingsField = new javax.swing.JTextField();
        chefPhoneField = new javax.swing.JTextField();
        recipeTitleField = new javax.swing.JTextField();
        ingredientsField = new javax.swing.JTextField();
        difficultyField = new javax.swing.JTextField();
        categoryFoodField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        yesRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        imgDisplayField = new javax.swing.JLabel();
        recipeComboBox = new javax.swing.JComboBox();
        showBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(102, 0, 0));
        header.setFont(new java.awt.Font("Hubballi", 3, 18)); // NOI18N
        header.setText("Read Your Own");
        add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 6, -1, -1));

        chefFirstNameLabel.setBackground(new java.awt.Color(51, 0, 153));
        chefFirstNameLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        chefFirstNameLabel.setForeground(new java.awt.Color(102, 0, 102));
        chefFirstNameLabel.setText("Chef's First Name:");
        add(chefFirstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, -1, -1));

        chefLastNameLabel.setBackground(new java.awt.Color(51, 0, 153));
        chefLastNameLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        chefLastNameLabel.setForeground(new java.awt.Color(102, 0, 102));
        chefLastNameLabel.setText("Chef's Last Name:");
        add(chefLastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, -1, 23));

        chefUserNameLabel.setBackground(new java.awt.Color(51, 0, 153));
        chefUserNameLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        chefUserNameLabel.setForeground(new java.awt.Color(102, 0, 102));
        chefUserNameLabel.setText("Username:");
        add(chefUserNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 103, -1, 23));

        recipeLabel.setBackground(new java.awt.Color(51, 0, 153));
        recipeLabel.setFont(new java.awt.Font("Noteworthy", 3, 18)); // NOI18N
        recipeLabel.setForeground(new java.awt.Color(102, 0, 102));
        recipeLabel.setText("Recipe");
        add(recipeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 236, 71, 27));

        contactLabel.setBackground(new java.awt.Color(51, 0, 153));
        contactLabel.setFont(new java.awt.Font("New Peninim MT", 3, 12)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(102, 0, 102));
        contactLabel.setText("CONTACT INFORMATION");
        add(contactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 159, 23));

        phoneLabel.setBackground(new java.awt.Color(51, 0, 153));
        phoneLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(102, 0, 102));
        phoneLabel.setText("Phone No:");
        add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 201, -1, 23));

        emailLabel.setBackground(new java.awt.Color(51, 0, 153));
        emailLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(102, 0, 102));
        emailLabel.setText("Email ID:");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 169, -1, 23));

        titleLabel.setBackground(new java.awt.Color(51, 0, 153));
        titleLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 0, 102));
        titleLabel.setText("Title:");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 269, -1, 23));

        servingNoLabel.setBackground(new java.awt.Color(51, 0, 153));
        servingNoLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        servingNoLabel.setForeground(new java.awt.Color(102, 0, 102));
        servingNoLabel.setText("No. of Servings:");
        add(servingNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 303, -1, 23));

        glutenLabel.setBackground(new java.awt.Color(51, 0, 153));
        glutenLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        glutenLabel.setForeground(new java.awt.Color(102, 0, 102));
        glutenLabel.setText("Is Gluten free ?");
        add(glutenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 335, -1, 23));

        difficultyLabel.setBackground(new java.awt.Color(51, 0, 153));
        difficultyLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        difficultyLabel.setForeground(new java.awt.Color(102, 0, 102));
        difficultyLabel.setText("Difficulty Level:");
        add(difficultyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 365, -1, 23));

        catFoodLabel.setBackground(new java.awt.Color(51, 0, 153));
        catFoodLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        catFoodLabel.setForeground(new java.awt.Color(102, 0, 102));
        catFoodLabel.setText("Category of Food:");
        add(catFoodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, 23));

        imgLabel.setBackground(new java.awt.Color(51, 0, 153));
        imgLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        imgLabel.setForeground(new java.awt.Color(102, 0, 102));
        imgLabel.setText("Recipe Picture:");
        add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 341, -1, 23));

        ingredientsLabel.setBackground(new java.awt.Color(51, 0, 153));
        ingredientsLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        ingredientsLabel.setForeground(new java.awt.Color(102, 0, 102));
        ingredientsLabel.setText("No. of Ingredients:");
        add(ingredientsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 403, -1, 23));

        descriptionLabel.setBackground(new java.awt.Color(51, 0, 153));
        descriptionLabel.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(102, 0, 102));
        descriptionLabel.setText("Description:");
        add(descriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 303, -1, 23));

        chefFirstNameField.setBackground(new java.awt.Color(204, 204, 255));
        chefFirstNameField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        chefFirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefFirstNameFieldActionPerformed(evt);
            }
        });
        add(chefFirstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 36, 272, -1));

        chefLastNameField.setBackground(new java.awt.Color(204, 204, 255));
        chefLastNameField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        chefLastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefLastNameFieldActionPerformed(evt);
            }
        });
        add(chefLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 69, 272, -1));

        chefUserNameField.setBackground(new java.awt.Color(204, 204, 255));
        chefUserNameField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        chefUserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefUserNameFieldActionPerformed(evt);
            }
        });
        add(chefUserNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 102, 272, -1));

        chefEmailField.setBackground(new java.awt.Color(204, 204, 255));
        chefEmailField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        chefEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefEmailFieldActionPerformed(evt);
            }
        });
        add(chefEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 165, 272, -1));

        servingsField.setBackground(new java.awt.Color(204, 204, 255));
        servingsField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        servingsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servingsFieldActionPerformed(evt);
            }
        });
        add(servingsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 302, 154, -1));

        chefPhoneField.setBackground(new java.awt.Color(204, 204, 255));
        chefPhoneField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        chefPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefPhoneFieldActionPerformed(evt);
            }
        });
        add(chefPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 210, 272, -1));

        recipeTitleField.setBackground(new java.awt.Color(204, 204, 255));
        recipeTitleField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        recipeTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipeTitleFieldActionPerformed(evt);
            }
        });
        add(recipeTitleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 269, 154, -1));

        ingredientsField.setBackground(new java.awt.Color(204, 204, 255));
        ingredientsField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        ingredientsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientsFieldActionPerformed(evt);
            }
        });
        add(ingredientsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 399, 154, -1));

        difficultyField.setBackground(new java.awt.Color(204, 204, 255));
        difficultyField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        difficultyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyFieldActionPerformed(evt);
            }
        });
        add(difficultyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 364, 154, -1));

        categoryFoodField.setBackground(new java.awt.Color(204, 204, 255));
        categoryFoodField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        categoryFoodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFoodFieldActionPerformed(evt);
            }
        });
        add(categoryFoodField, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 269, 154, -1));

        descriptionField.setBackground(new java.awt.Color(204, 204, 255));
        descriptionField.setFont(new java.awt.Font("Hiragino Sans GB", 0, 13)); // NOI18N
        descriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionFieldActionPerformed(evt);
            }
        });
        add(descriptionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 302, 154, -1));

        yesNoButtonGroup.add(yesRadioButton);
        yesRadioButton.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        yesRadioButton.setText("Yes");
        yesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioButtonActionPerformed(evt);
            }
        });
        add(yesRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 339, -1, -1));

        yesNoButtonGroup.add(noRadioButton);
        noRadioButton.setFont(new java.awt.Font("New Peninim MT", 2, 12)); // NOI18N
        noRadioButton.setText("No");
        add(noRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 339, -1, -1));
        add(imgDisplayField, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 370, 154, 119));

        recipeComboBox.setBackground(new java.awt.Color(204, 204, 255));
        add(recipeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 156, -1));

        showBtn.setBackground(new java.awt.Color(204, 204, 255));
        showBtn.setText("Show");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void chefFirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefFirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chefFirstNameFieldActionPerformed

    private void chefLastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefLastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chefLastNameFieldActionPerformed

    private void chefUserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefUserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chefUserNameFieldActionPerformed

    private void chefEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chefEmailFieldActionPerformed

    private void servingsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servingsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servingsFieldActionPerformed

    private void chefPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chefPhoneFieldActionPerformed

    private void recipeTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipeTitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recipeTitleFieldActionPerformed

    private void ingredientsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingredientsFieldActionPerformed

    private void difficultyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_difficultyFieldActionPerformed

    private void categoryFoodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFoodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryFoodFieldActionPerformed

    private void descriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionFieldActionPerformed

    private void yesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesRadioButtonActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
                recipeTitleField.setEnabled(false);

        String recTitle = (String) recipeComboBox.getSelectedItem();
        Recipe recipe = this.chefRecipeDetails.findRecipe(recTitle);
        if (!recipe.equals(null)) {
            recipeTitleField.setText(recTitle);
            servingsField.setText(String.valueOf(recipe.getNoServings()));
            difficultyField.setText(String.valueOf(recipe.getDifficulty()));
            ingredientsField.setText(String.valueOf(recipe.getIngredientsNo()));
            categoryFoodField.setText(recipe.getFoodCategory());
            descriptionField.setText(recipe.getDescription());
            if (recipe.isGlutenFree() == true) {
                yesRadioButton.setSelected(true);
            }
            if (recipe.isGlutenFree() == false) {
                noRadioButton.setSelected(true);
            }
            ImageIcon ii = new ImageIcon(recipe.getRecipeImg());
            Image image = ii.getImage().getScaledInstance(imgDisplayField.getWidth(), imgDisplayField.getHeight(), Image.SCALE_SMOOTH);

            imgDisplayField.setIcon(new ImageIcon(image));
        } else {
            JOptionPane.showMessageDialog(null, "No Recipe Found!");
        }
    }//GEN-LAST:event_showBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel catFoodLabel;
    private javax.swing.JTextField categoryFoodField;
    private javax.swing.JTextField chefEmailField;
    private javax.swing.JTextField chefFirstNameField;
    private javax.swing.JLabel chefFirstNameLabel;
    private javax.swing.JTextField chefLastNameField;
    private javax.swing.JLabel chefLastNameLabel;
    private javax.swing.JTextField chefPhoneField;
    private javax.swing.JTextField chefUserNameField;
    private javax.swing.JLabel chefUserNameLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField difficultyField;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel glutenLabel;
    private javax.swing.JLabel header;
    private javax.swing.JLabel imgDisplayField;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JTextField ingredientsField;
    private javax.swing.JLabel ingredientsLabel;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JComboBox recipeComboBox;
    private javax.swing.JLabel recipeLabel;
    private javax.swing.JTextField recipeTitleField;
    private javax.swing.JLabel servingNoLabel;
    private javax.swing.JTextField servingsField;
    private javax.swing.JButton showBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.ButtonGroup yesNoButtonGroup;
    private javax.swing.JRadioButton yesRadioButton;
    // End of variables declaration//GEN-END:variables
}
