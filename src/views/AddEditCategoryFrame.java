/*
 * Created by JFormDesigner on Sun Aug 07 23:31:07 IRDT 2022
 */

package views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class AddEditCategoryFrame extends JFrame {
    private MainFrame mainFrame;
    public AddEditCategoryFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    private void thisWindowClosing(WindowEvent e) {
        mainFrame.setEnabled(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        scrollPane1 = new JScrollPane();
        authorList = new JList();
        categoryNaneLbl = new JLabel();
        categoryNameTextField = new JTextField();
        saveBtn = new JButton();

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

                //---- authorList ----
                authorList.setBackground(new Color(255, 247, 160));
                authorList.setForeground(new Color(53, 0, 0));
                authorList.setVisibleRowCount(20);
                authorList.setSelectionBackground(new Color(53, 0, 0));
                authorList.setSelectionForeground(new Color(255, 247, 160));
                scrollPane1.setViewportView(authorList);
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
            panel.add(saveBtn);
            saveBtn.setBounds(190, 110, 240, 35);

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
    private JList authorList;
    private JLabel categoryNaneLbl;
    private JTextField categoryNameTextField;
    private JButton saveBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
