import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieHub {

    //info about all 20 movies

    public static String[] name = {
        "The Shawshank Redemption",
        "The Godfather",
        "The Dark Knight",
        "Pulp Fiction",
        "Schindler's List",
        "The Lord of the Rings: The Return of the King",
        "Forrest Gump",
        "Fight Club",
        "Inception",
        "The Matrix",
        "The Silence of the Lambs",
        "Gladiator",
        "The Departed",
        "The Green Mile",
        "The Pianist",
        "The Lion King",
        "The Avengers",
        "Avatar",
        "Toy Story",
        "Jurassic Park"
    };

    public static double[] rating = {
        9.3, 9.2, 9.0, 8.9, 8.9, 8.9, 8.8, 8.8, 8.8, 8.7,
        8.6, 8.5, 8.5, 8.6, 8.5, 8.5, 8.5, 7.8, 7.8, 8.3
    };

    public static String[] genre = {
        "Drama",
        "Crime, Drama",
        "Action, Crime, Drama",
        "Crime, Drama",
        "Biography, Drama, History",
        "Action, Adventure, Drama",
        "Drama, Romance",
        "Drama",
        "Action, Adventure, Sci-Fi",
        "Action, Sci-Fi",
        "Crime, Drama, Thriller",
        "Action, Adventure, Drama",
        "Crime, Drama, Thriller",
        "Crime, Drama, Fantasy",
        "Biography, Drama, Music",
        "Animation, Adventure, Drama",
        "Action, Adventure, Sci-Fi",
        "Action, Adventure, Fantasy",
        "Animation, Adventure, Comedy",
        "Action, Adventure, Sci-Fi"
    };

    public static int[] publishYear = {
        1994, 1972, 2008, 1994, 1993, 2003, 1994, 1999, 2010, 1999,
        1991, 2000, 2006, 1999, 1999, 2002, 1994, 2012, 2009, 1995
    };

    public static void main(String[] args) {
        //main frame
        JFrame frame = new JFrame("Movie Hub");
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        //search panel
        JPanel searchPanel = new JPanel();
        searchPanel.setBackground(Color.lightGray);
        searchPanel.setBounds(0, 0, 800, 50);

        // Create a JTextField for the search box
        JTextField searchBox = new JTextField(20);

        // Create a JButton for the submit button
        JButton submitButton = new JButton("Submit");

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchInput = searchBox.getText(); // Get the search input
                // You can use the searchInput variable here for your search functionality
            }
        });

        searchPanel.add(searchBox);
        searchPanel.add(submitButton);


        JPanel moviesPanel = new JPanel();
        moviesPanel.setLayout(new BoxLayout(moviesPanel, BoxLayout.Y_AXIS));
        moviesPanel.setBackground(Color.BLUE);
        moviesPanel.setBounds(0, 0, 600, 250);

        // loop that prints all the moives 
        for (int i = 0; i < name.length; i++) {
            showMovie(moviesPanel, name[i], rating[i], genre[i], publishYear[i]);
        }

        frame.add(searchPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(moviesPanel), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static void showMovie(JPanel moviesPanel, String name, double rating, String genre, int publishYear) {
        String movieInfo = "<html><b>Movie Name:</b> " + name + "<br>"
                + "<b>Rating:</b> " + rating + "<br>"
                + "<b>Genre:</b> " + genre + "<br>"
                + "<b>Publish Year:</b> " + publishYear + "<hr /></html>";
        JLabel label = new JLabel(movieInfo);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        moviesPanel.add(label);
    }
}

