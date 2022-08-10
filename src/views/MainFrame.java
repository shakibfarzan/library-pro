/*
 * Created by JFormDesigner on Wed Aug 03 19:59:00 IRDT 2022
 */

package views;


import controllers.AuthorController;
import controllers.BookController;
import controllers.CategoryController;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        initComponents();
        setResizable(false);
        imagePanel = new ImagePanel("book-image.jpg");
        imagePanel.setBounds(425, 30, 425, 585);
        panel.add(imagePanel);
        setIconImage(new ImageIcon("icon.png").getImage());
    }

    private void viewBooksBtnHandler(ActionEvent e) {
        setEnabled(false);
        var viewBooksFrame = new ViewBooksFrame(this);
        viewBooksFrame.setVisible(true);
    }

    private void addEditBookBtnHandler(ActionEvent e) {
        setEnabled(false);
        var addEditBookFrame = new AddEditBookFrame(this);
        addEditBookFrame.setVisible(true);
    }

    private void addEditAuthorBtnHandler(ActionEvent e) {
        setEnabled(false);
        var addEditAuthorFrame = new AddEditAuthorFrame(this);
        addEditAuthorFrame.setVisible(true);
    }

    private void addEditCategoryBtnHandler(ActionEvent e) {
        setEnabled(false);
        var addEditCategoryFrame = new AddEditCategoryFrame(this);
        addEditCategoryFrame.setVisible(true);
    }

    private void thisWindowClosing(WindowEvent e) {
        AuthorController.getInstance().writeToFile();
        BookController.getInstance().writeToFile();
        CategoryController.getInstance().writeToFile();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        viewBooksBtn = new JButton();
        addEditBookBtn = new JButton();
        addEditAuthorBtn = new JButton();
        addEditCategoryBtn = new JButton();

        //======== this ========
        setBackground(new Color(155, 168, 61));
        setTitle("My Library");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

            //---- viewBooksBtn ----
            viewBooksBtn.setText("View Books");
            viewBooksBtn.setBackground(new Color(251, 207, 10));
            viewBooksBtn.setForeground(new Color(53, 0, 0));
            viewBooksBtn.setBorder(null);
            viewBooksBtn.setBorderPainted(false);
            viewBooksBtn.setFocusPainted(false);
            viewBooksBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            viewBooksBtn.setFocusable(false);
            viewBooksBtn.addActionListener(e -> viewBooksBtnHandler(e));
            panel.add(viewBooksBtn);
            viewBooksBtn.setBounds(25, 80, 370, 40);

            //---- addEditBookBtn ----
            addEditBookBtn.setText("Add/Edit Book");
            addEditBookBtn.setBackground(new Color(251, 207, 10));
            addEditBookBtn.setForeground(new Color(53, 0, 0));
            addEditBookBtn.setBorder(null);
            addEditBookBtn.setBorderPainted(false);
            addEditBookBtn.setFocusable(false);
            addEditBookBtn.setFocusPainted(false);
            addEditBookBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addEditBookBtn.addActionListener(e -> addEditBookBtnHandler(e));
            panel.add(addEditBookBtn);
            addEditBookBtn.setBounds(25, 140, 370, 40);

            //---- addEditAuthorBtn ----
            addEditAuthorBtn.setText("Add/Edit Author");
            addEditAuthorBtn.setBackground(new Color(251, 207, 10));
            addEditAuthorBtn.setForeground(new Color(53, 0, 0));
            addEditAuthorBtn.setBorder(null);
            addEditAuthorBtn.setFocusPainted(false);
            addEditAuthorBtn.setFocusable(false);
            addEditAuthorBtn.setBorderPainted(false);
            addEditAuthorBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addEditAuthorBtn.addActionListener(e -> addEditAuthorBtnHandler(e));
            panel.add(addEditAuthorBtn);
            addEditAuthorBtn.setBounds(25, 200, 370, 40);

            //---- addEditCategoryBtn ----
            addEditCategoryBtn.setText("Add/Edit Category");
            addEditCategoryBtn.setBackground(new Color(251, 207, 10));
            addEditCategoryBtn.setForeground(new Color(53, 0, 0));
            addEditCategoryBtn.setBorder(null);
            addEditCategoryBtn.setBorderPainted(false);
            addEditCategoryBtn.setFocusable(false);
            addEditCategoryBtn.setFocusPainted(false);
            addEditCategoryBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addEditCategoryBtn.addActionListener(e -> addEditCategoryBtnHandler(e));
            panel.add(addEditCategoryBtn);
            addEditCategoryBtn.setBounds(25, 260, 370, 40);

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
        panel.setBounds(0, -30, 850, 615);

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
    private JButton viewBooksBtn;
    private JButton addEditBookBtn;
    private JButton addEditAuthorBtn;
    private JButton addEditCategoryBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private ImagePanel imagePanel;

}
