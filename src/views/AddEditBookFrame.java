/*
 * Created by JFormDesigner on Sun Aug 07 19:58:03 IRDT 2022
 */

package views;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 * @author unknown
 */
public class AddEditBookFrame extends JFrame {

    private MainFrame mainFrame;
    public AddEditBookFrame(MainFrame mainFrame) {
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
        bookList = new JList();
        titleLbl = new JLabel();
        authorLbl = new JLabel();
        categoryLbl = new JLabel();
        readingStatusLbl = new JLabel();
        categoryComboBox = new JComboBox();
        authorComboBox = new JComboBox();
        readingStatusComboBox = new JComboBox();
        titleTextField = new JTextField();
        chooseFileBtn = new JButton();
        fileNameLbl = new JLabel();
        saveBtn = new JButton();

        //======== this ========
        setTitle("Add/Edit Book");
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

                //---- bookList ----
                bookList.setBackground(new Color(255, 247, 160));
                bookList.setForeground(new Color(53, 0, 0));
                bookList.setVisibleRowCount(20);
                bookList.setSelectionBackground(new Color(53, 0, 0));
                bookList.setSelectionForeground(new Color(255, 247, 160));
                scrollPane1.setViewportView(bookList);
            }
            panel.add(scrollPane1);
            scrollPane1.setBounds(0, 0, 170, 440);

            //---- titleLbl ----
            titleLbl.setText("Title:");
            titleLbl.setForeground(new Color(251, 207, 10));
            titleLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            titleLbl.setLabelFor(titleTextField);
            panel.add(titleLbl);
            titleLbl.setBounds(200, 60, 75, 25);

            //---- authorLbl ----
            authorLbl.setText("Author:");
            authorLbl.setForeground(new Color(251, 207, 10));
            authorLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            authorLbl.setLabelFor(authorComboBox);
            panel.add(authorLbl);
            authorLbl.setBounds(200, 105, 75, 25);

            //---- categoryLbl ----
            categoryLbl.setText("Category:");
            categoryLbl.setForeground(new Color(251, 207, 10));
            categoryLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            categoryLbl.setLabelFor(categoryComboBox);
            panel.add(categoryLbl);
            categoryLbl.setBounds(200, 150, 110, 25);

            //---- readingStatusLbl ----
            readingStatusLbl.setText("Reading status:");
            readingStatusLbl.setForeground(new Color(251, 207, 10));
            readingStatusLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            readingStatusLbl.setLabelFor(readingStatusComboBox);
            panel.add(readingStatusLbl);
            readingStatusLbl.setBounds(200, 195, 110, 25);

            //---- categoryComboBox ----
            categoryComboBox.setBackground(new Color(251, 207, 10));
            categoryComboBox.setForeground(new Color(53, 0, 0));
            categoryComboBox.setBorder(null);
            categoryComboBox.setFocusable(false);
            panel.add(categoryComboBox);
            categoryComboBox.setBounds(370, 110, 155, 24);

            //---- authorComboBox ----
            authorComboBox.setBackground(new Color(251, 207, 10));
            authorComboBox.setForeground(new Color(53, 0, 0));
            authorComboBox.setBorder(null);
            authorComboBox.setFocusable(false);
            panel.add(authorComboBox);
            authorComboBox.setBounds(370, 150, 155, 24);

            //---- readingStatusComboBox ----
            readingStatusComboBox.setBackground(new Color(251, 207, 10));
            readingStatusComboBox.setForeground(new Color(53, 0, 0));
            readingStatusComboBox.setBorder(null);
            readingStatusComboBox.setFocusable(false);
            panel.add(readingStatusComboBox);
            readingStatusComboBox.setBounds(370, 195, 155, 24);

            //---- titleTextField ----
            titleTextField.setBackground(new Color(251, 207, 10));
            titleTextField.setForeground(new Color(53, 0, 0));
            titleTextField.setBorder(null);
            titleTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            panel.add(titleTextField);
            titleTextField.setBounds(370, 60, 155, 25);

            //---- chooseFileBtn ----
            chooseFileBtn.setText("Choose File");
            chooseFileBtn.setBackground(new Color(255, 247, 160));
            chooseFileBtn.setForeground(new Color(53, 0, 0));
            chooseFileBtn.setBorder(null);
            chooseFileBtn.setBorderPainted(false);
            chooseFileBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            chooseFileBtn.setFocusable(false);
            chooseFileBtn.setFocusPainted(false);
            panel.add(chooseFileBtn);
            chooseFileBtn.setBounds(200, 240, 110, 30);

            //---- fileNameLbl ----
            fileNameLbl.setText("file name");
            fileNameLbl.setForeground(new Color(251, 207, 10));
            fileNameLbl.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            fileNameLbl.setLabelFor(titleTextField);
            panel.add(fileNameLbl);
            fileNameLbl.setBounds(325, 245, 205, 25);

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
            saveBtn.setBounds(205, 350, 325, 35);

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
    private JList bookList;
    private JLabel titleLbl;
    private JLabel authorLbl;
    private JLabel categoryLbl;
    private JLabel readingStatusLbl;
    private JComboBox categoryComboBox;
    private JComboBox authorComboBox;
    private JComboBox readingStatusComboBox;
    private JTextField titleTextField;
    private JButton chooseFileBtn;
    private JLabel fileNameLbl;
    private JButton saveBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
