/*
 * Created by JFormDesigner on Sun Aug 07 23:31:07 IRDT 2022
 */

package views;

import javax.swing.event.*;
import controllers.AuthorController;
import controllers.CategoryController;
import models.Author;
import models.Category;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class AddEditCategoryFrame extends JFrame {
    private MainFrame mainFrame;
    private Category category;
    public AddEditCategoryFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        updateList();
    }

    private void thisWindowClosing(WindowEvent e) {
        mainFrame.setEnabled(true);
    }


    private void saveBtnHandler(ActionEvent e) {
        String categoryName = categoryNameTextField.getText();
        try {
            if (category != null) CategoryController.getInstance().updateCategory(category.getName(), categoryName);
            else CategoryController.getInstance().addCategory(categoryName);
            categoryNameTextField.setText(null);
            updateList();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateList() {
        DefaultListModel<Category> defaultListModel = new DefaultListModel<>();
        defaultListModel.addAll(CategoryController.getInstance().getCategories());
        categoryList.setModel(defaultListModel);
    }

    private void categoryListValueChanged(ListSelectionEvent e) {
        this.category = (Category) categoryList.getSelectedValue();
        if (category != null) categoryNameTextField.setText(category.getName());
        else categoryNameTextField.setText(null);
    }

    private void removeBtnHandler(ActionEvent e) {
        if (category != null) {
            try {
                CategoryController.getInstance().removeCategoryByName(category.getName());
                updateList();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        scrollPane1 = new JScrollPane();
        categoryList = new JList();
        categoryNaneLbl = new JLabel();
        categoryNameTextField = new JTextField();
        saveBtn = new JButton();
        removeBtn = new JButton();

        //======== this ========
        setResizable(false);
        setTitle("Add/Edit Category");
        setType(Window.Type.UTILITY);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel ========
        {
            panel.setBackground(new Color(53, 0, 0));
            panel.setForeground(new Color(251, 207, 10));
            panel.setLayout(null);

            //======== scrollPane1 ========
            {

                //---- categoryList ----
                categoryList.setBackground(new Color(255, 247, 160));
                categoryList.setForeground(new Color(53, 0, 0));
                categoryList.setVisibleRowCount(20);
                categoryList.setSelectionBackground(new Color(53, 0, 0));
                categoryList.setSelectionForeground(new Color(255, 247, 160));
                categoryList.addListSelectionListener(e -> categoryListValueChanged(e));
                scrollPane1.setViewportView(categoryList);
            }
            panel.add(scrollPane1);
            scrollPane1.setBounds(0, 0, 145, 205);

            //---- categoryNaneLbl ----
            categoryNaneLbl.setText("Category Name:");
            categoryNaneLbl.setForeground(new Color(251, 207, 10));
            categoryNaneLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            categoryNaneLbl.setLabelFor(categoryNameTextField);
            panel.add(categoryNaneLbl);
            categoryNaneLbl.setBounds(170, 50, 120, 25);

            //---- categoryNameTextField ----
            categoryNameTextField.setBackground(new Color(251, 207, 10));
            categoryNameTextField.setForeground(new Color(53, 0, 0));
            categoryNameTextField.setBorder(null);
            categoryNameTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            panel.add(categoryNameTextField);
            categoryNameTextField.setBounds(305, 51, 155, 25);

            //---- saveBtn ----
            saveBtn.setText("Save");
            saveBtn.setBackground(new Color(251, 207, 10));
            saveBtn.setForeground(new Color(53, 0, 0));
            saveBtn.setBorder(null);
            saveBtn.setBorderPainted(false);
            saveBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            saveBtn.setFocusable(false);
            saveBtn.setFocusPainted(false);
            saveBtn.addActionListener(e -> saveBtnHandler(e));
            panel.add(saveBtn);
            saveBtn.setBounds(175, 110, 130, 35);

            //---- removeBtn ----
            removeBtn.setText("Remove");
            removeBtn.setBackground(new Color(251, 207, 10));
            removeBtn.setForeground(new Color(53, 0, 0));
            removeBtn.setBorder(null);
            removeBtn.setBorderPainted(false);
            removeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            removeBtn.setFocusable(false);
            removeBtn.setFocusPainted(false);
            removeBtn.addActionListener(e -> removeBtnHandler(e));
            panel.add(removeBtn);
            removeBtn.setBounds(325, 110, 130, 35);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel.getComponentCount(); i++) {
                    Rectangle bounds = panel.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel.setMinimumSize(preferredSize);
                panel.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel);
        panel.setBounds(0, 0, 480, 205);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel;
    private JScrollPane scrollPane1;
    private JList categoryList;
    private JLabel categoryNaneLbl;
    private JTextField categoryNameTextField;
    private JButton saveBtn;
    private JButton removeBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
