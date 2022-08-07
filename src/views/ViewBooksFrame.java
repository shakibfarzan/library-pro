/*
 * Created by JFormDesigner on Sat Aug 06 17:41:40 IRDT 2022
 */

package views;

import models.ReadingStatus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class ViewBooksFrame extends JFrame {
    private MainFrame mainFrame;
    public ViewBooksFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        readingStatusComboBox.setModel(new DefaultComboBoxModel(ReadingStatus.values()));
    }

    private void thisWindowClosing(WindowEvent e) {
        mainFrame.setEnabled(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        scrollPane1 = new JScrollPane();
        bookList = new JList();
        filterByCategoryLbl = new JLabel();
        filterByAuthorLbl = new JLabel();
        categoryComboBox = new JComboBox();
        authorComboBox = new JComboBox();
        separator = new JSeparator();
        titleLbl = new JLabel();
        authorLbl = new JLabel();
        categoryLbl = new JLabel();
        readingStatusValueLbl = new JLabel();
        filterByReadingLbl = new JLabel();
        readingStatusComboBox = new JComboBox();
        titleValueLbl = new JLabel();
        authorValueLbl = new JLabel();
        categoryValueLbl = new JLabel();
        openFileBtn = new JButton();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setResizable(false);
        setType(Window.Type.UTILITY);
        setTitle("View Books");
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

            //---- filterByCategoryLbl ----
            filterByCategoryLbl.setText("Filter by category:");
            filterByCategoryLbl.setForeground(new Color(251, 207, 10));
            filterByCategoryLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            filterByCategoryLbl.setLabelFor(categoryComboBox);
            panel.add(filterByCategoryLbl);
            filterByCategoryLbl.setBounds(190, 15, 145, 25);

            //---- filterByAuthorLbl ----
            filterByAuthorLbl.setText("Filter by author:");
            filterByAuthorLbl.setForeground(new Color(251, 207, 10));
            filterByAuthorLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            filterByAuthorLbl.setLabelFor(authorComboBox);
            panel.add(filterByAuthorLbl);
            filterByAuthorLbl.setBounds(190, 55, 145, 25);

            //---- categoryComboBox ----
            categoryComboBox.setBackground(new Color(251, 207, 10));
            categoryComboBox.setForeground(new Color(53, 0, 0));
            categoryComboBox.setBorder(null);
            categoryComboBox.setFocusable(false);
            panel.add(categoryComboBox);
            categoryComboBox.setBounds(380, 15, 155, categoryComboBox.getPreferredSize().height);

            //---- authorComboBox ----
            authorComboBox.setBackground(new Color(251, 207, 10));
            authorComboBox.setForeground(new Color(53, 0, 0));
            authorComboBox.setBorder(null);
            authorComboBox.setFocusable(false);
            panel.add(authorComboBox);
            authorComboBox.setBounds(380, 55, 155, authorComboBox.getPreferredSize().height);

            //---- separator ----
            separator.setForeground(new Color(251, 207, 10));
            panel.add(separator);
            separator.setBounds(170, 135, 395, separator.getPreferredSize().height);

            //---- titleLbl ----
            titleLbl.setText("Title:");
            titleLbl.setForeground(new Color(251, 207, 10));
            titleLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            panel.add(titleLbl);
            titleLbl.setBounds(190, 220, 75, 25);

            //---- authorLbl ----
            authorLbl.setText("Author:");
            authorLbl.setForeground(new Color(251, 207, 10));
            authorLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            panel.add(authorLbl);
            authorLbl.setBounds(190, 255, 75, 25);

            //---- categoryLbl ----
            categoryLbl.setText("Category:");
            categoryLbl.setForeground(new Color(251, 207, 10));
            categoryLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            panel.add(categoryLbl);
            categoryLbl.setBounds(190, 290, 110, 25);

            //---- readingStatusValueLbl ----
            readingStatusValueLbl.setText("Reading Status");
            readingStatusValueLbl.setForeground(new Color(251, 207, 10));
            readingStatusValueLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            panel.add(readingStatusValueLbl);
            readingStatusValueLbl.setBounds(440, 145, 105, 25);

            //---- filterByReadingLbl ----
            filterByReadingLbl.setText("Filter by reading status:");
            filterByReadingLbl.setForeground(new Color(251, 207, 10));
            filterByReadingLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
            filterByReadingLbl.setLabelFor(readingStatusComboBox);
            panel.add(filterByReadingLbl);
            filterByReadingLbl.setBounds(190, 95, 175, 25);

            //---- readingStatusComboBox ----
            readingStatusComboBox.setBackground(new Color(251, 207, 10));
            readingStatusComboBox.setForeground(new Color(53, 0, 0));
            readingStatusComboBox.setBorder(null);
            readingStatusComboBox.setFocusable(false);
            panel.add(readingStatusComboBox);
            readingStatusComboBox.setBounds(380, 95, 155, 24);

            //---- titleValueLbl ----
            titleValueLbl.setText("Title Value");
            titleValueLbl.setForeground(new Color(255, 247, 160));
            titleValueLbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
            panel.add(titleValueLbl);
            titleValueLbl.setBounds(305, 220, 250, 25);

            //---- authorValueLbl ----
            authorValueLbl.setText("Author Value");
            authorValueLbl.setForeground(new Color(255, 247, 160));
            authorValueLbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
            panel.add(authorValueLbl);
            authorValueLbl.setBounds(305, 255, 250, 26);

            //---- categoryValueLbl ----
            categoryValueLbl.setText("Category Value");
            categoryValueLbl.setForeground(new Color(255, 247, 160));
            categoryValueLbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
            panel.add(categoryValueLbl);
            categoryValueLbl.setBounds(305, 290, 250, 25);

            //---- openFileBtn ----
            openFileBtn.setText("Open File");
            openFileBtn.setBackground(new Color(251, 207, 10));
            openFileBtn.setForeground(new Color(53, 0, 0));
            openFileBtn.setBorder(null);
            openFileBtn.setBorderPainted(false);
            openFileBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            openFileBtn.setFocusable(false);
            openFileBtn.setFocusPainted(false);
            panel.add(openFileBtn);
            openFileBtn.setBounds(205, 345, 325, 35);

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
    private JLabel filterByCategoryLbl;
    private JLabel filterByAuthorLbl;
    private JComboBox categoryComboBox;
    private JComboBox authorComboBox;
    private JSeparator separator;
    private JLabel titleLbl;
    private JLabel authorLbl;
    private JLabel categoryLbl;
    private JLabel readingStatusValueLbl;
    private JLabel filterByReadingLbl;
    private JComboBox readingStatusComboBox;
    private JLabel titleValueLbl;
    private JLabel authorValueLbl;
    private JLabel categoryValueLbl;
    private JButton openFileBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
