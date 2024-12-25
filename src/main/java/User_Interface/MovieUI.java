package User_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieUI extends JFrame {
    private JTextField movieTitleField;
    private JTextField movieDirectorField;
    private JTextField movieReleaseYearField;
    private JTextField movieGenreField;
    private JTextArea movieDescriptionArea;
    private JTextField moviePosterUrlField;
    private JButton addMovieButton;
    private JButton updateMovieButton;

    public MovieUI() {
        setTitle("电影管理界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 2));

        JLabel movieTitleLabel = new JLabel("电影标题:");
        panel.add(movieTitleLabel);

        movieTitleField = new JTextField();
        panel.add(movieTitleField);

        JLabel movieDirectorLabel = new JLabel("导演:");
        panel.add(movieDirectorLabel);

        movieDirectorField = new JTextField();
        panel.add(movieDirectorField);

        JLabel movieReleaseYearLabel = new JLabel("发行年份:");
        panel.add(movieReleaseYearLabel);

        movieReleaseYearField = new JTextField();
        panel.add(movieReleaseYearField);

        JLabel movieGenreLabel = new JLabel("类型:");
        panel.add(movieGenreLabel);

        movieGenreField = new JTextField();
        panel.add(movieGenreField);

        JLabel movieDescriptionLabel = new JLabel("描述:");
        panel.add(movieDescriptionLabel);

        movieDescriptionArea = new JTextArea(5, 20);
        panel.add(movieDescriptionArea);

        JLabel moviePosterUrlLabel = new JLabel("海报URL:");
        panel.add(moviePosterUrlLabel);

        moviePosterUrlField = new JTextField();
        panel.add(moviePosterUrlField);

        addMovieButton = new JButton("添加电影");
        panel.add(addMovieButton);

        updateMovieButton = new JButton("更新电影");
        panel.add(updateMovieButton);

        add(panel);

        addMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = movieTitleField.getText();
                String director = movieDirectorField.getText();
                int releaseYear = Integer.parseInt(movieReleaseYearField.getText());
                String genre = movieGenreField.getText();
                String description = movieDescriptionArea.getText();
                String posterUrl = moviePosterUrlField.getText();

                // 在这里处理添加电影逻辑
                JOptionPane.showMessageDialog(MovieUI.this, "添加成功！\n电影: " + title + "\n导演: " + director + "\n发行年份: " + releaseYear + "\n类型: " + genre + "\n描述: " + description + "\n海报URL: " + posterUrl);
            }
        });

        updateMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = movieTitleField.getText();
                String director = movieDirectorField.getText();
                int releaseYear = Integer.parseInt(movieReleaseYearField.getText());
                String genre = movieGenreField.getText();
                String description = movieDescriptionArea.getText();
                String posterUrl = moviePosterUrlField.getText();

                // 在这里处理更新电影逻辑
                JOptionPane.showMessageDialog(MovieUI.this, "更新成功！\n电影: " + title + "\n导演: " + director + "\n发行年份: " + releaseYear + "\n类型: " + genre + "\n描述: " + description + "\n海报URL: " + posterUrl);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MovieUI().setVisible(true);
            }
        });
    }
}
