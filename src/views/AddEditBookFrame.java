/*
 * Created by JFormDesigner on Sun Aug 07 19:58:03 IRDT 2022
 */

package views;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class AddEditBookFrame extends JFrame {
    public AddEditBookFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        scrollPane1 = new JScrollPane();
        bookList = new JList();

        //======== this ========
        setTitle("Add/Edit Book");
        setType(Window.Type.UTILITY);
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
                bookList.setBackground(new Color(251, 207, 10));
                bookList.setForeground(new Color(53, 0, 0));
                bookList.setVisibleRowCount(20);
                bookList.setSelectionBackground(new Color(53, 0, 0));
                bookList.setSelectionForeground(new Color(251, 207, 10));
                scrollPane1.setViewportView(bookList);
            }
            panel.add(scrollPane1);
            scrollPane1.setBounds(0, 0, 170, 440);

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
