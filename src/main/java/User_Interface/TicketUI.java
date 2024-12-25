package User_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicketUI extends JFrame {
    private JComboBox<String> movieComboBox;
    private JComboBox<String> theaterComboBox;
    private JComboBox<String> screeningTimeComboBox;
    private JButton buyTicketButton;

    public TicketUI() {
        setTitle("购票界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel movieLabel = new JLabel("电影:");
        panel.add(movieLabel);

        movieComboBox = new JComboBox<>(new String[]{"电影1", "电影2", "电影3"});
        panel.add(movieComboBox);

        JLabel theaterLabel = new JLabel("影院:");
        panel.add(theaterLabel);

        theaterComboBox = new JComboBox<>(new String[]{"影院1", "影院2", "影院3"});
        panel.add(theaterComboBox);

        JLabel screeningTimeLabel = new JLabel("放映时间:");
        panel.add(screeningTimeLabel);

        screeningTimeComboBox = new JComboBox<>(new String[]{"时间1", "时间2", "时间3"});
        panel.add(screeningTimeComboBox);

        buyTicketButton = new JButton("购买");
        panel.add(buyTicketButton);

        add(panel);

        buyTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movie = (String) movieComboBox.getSelectedItem();
                String theater = (String) theaterComboBox.getSelectedItem();
                String screeningTime = (String) screeningTimeComboBox.getSelectedItem();

                // 在这里处理购票逻辑
                JOptionPane.showMessageDialog(TicketUI.this, "购买成功！\n电影: " + movie + "\n影院: " + theater + "\n放映时间: " + screeningTime);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicketUI().setVisible(true);
            }
        });
    }
}
