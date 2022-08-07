/*
 * Created by JFormDesigner on Sun Aug 07 22:09:41 IRDT 2022
 */

package views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class AddEditAuthorFrame extends JFrame {
    private MainFrame mainFrame;
    public AddEditAuthorFrame(MainFrame mainFrame) {
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
        firstnameLbl = new JLabel();
        firstnameTextField = new JTextField();
        saveBtn = new JButton();
        lastnameLbl = new JLabel();
        lastnameTextField = new JTextField();

        //======== this ========
        setTitle("Add/Edit Author");
        setType(Window.Type.UTILITY);
        setResizable(false);
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
            scrollPane1.setBounds(0, 0, 170, 440);

            //---- firstnameLbl ----
            firstnameLbl.setText("First name:");
            firstnameLbl.setForeground(new Color(251, 207, 10));
            firstnameLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            firstnameLbl.setLabelFor(firstnameTextField);
            panel.add(firstnameLbl);
            firstnameLbl.setBounds(205, 145, 75, 25);

            //---- firstnameTextField ----
            firstnameTextField.setBackground(new Color(251, 207, 10));
            firstnameTextField.setForeground(new Color(53, 0, 0));
            firstnameTextField.setBorder(null);
            firstnameTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            panel.add(firstnameTextField);
            firstnameTextField.setBounds(375, 145, 155, 25);

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
            saveBtn.setBounds(205, 260, 325, 35);

            //---- lastnameLbl ----
            lastnameLbl.setText("Last name:");
            lastnameLbl.setForeground(new Color(251, 207, 10));
            lastnameLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            lastnameLbl.setLabelFor(firstnameTextField);
            panel.add(lastnameLbl);
            lastnameLbl.setBounds(205, 195, 75, 25);

            //---- lastnameTextField ----
            lastnameTextField.setBackground(new Color(251, 207, 10));
            lastnameTextField.setForeground(new Color(53, 0, 0));
            lastnameTextField.setBorder(null);
            lastnameTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            panel.add(lastnameTextField);
            lastnameTextField.setBounds(375, 195, 155, 25);

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
        panel.setBounds(0, 0, 565, 440);

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
    private JLabel firstnameLbl;
    private JTextField firstnameTextField;
    private JButton saveBtn;
    private JLabel lastnameLbl;
    private JTextField lastnameTextField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
