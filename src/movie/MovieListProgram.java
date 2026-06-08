package movie;
import javax.swing.JOptionPane;

public class MovieListProgram {
    public static void main(String[] args) {

        String[] usernames = {"admin", "phyo", "student"};
        String[] passwords = {"123", "456", "789"};

        String[] movies = new String[100];
        int movieCount = 0;

        boolean loginSuccess = false;

        while (!loginSuccess) {
            String inputUser = JOptionPane.showInputDialog("Enter Username:");
            String inputPass = JOptionPane.showInputDialog("Enter Password:");

            for (int i = 0; i < usernames.length; i++) {
                if (inputUser.equals(usernames[i]) && inputPass.equals(passwords[i])) {
                    loginSuccess = true;
                    break;
                }
            }

            if (!loginSuccess) {
                JOptionPane.showMessageDialog(null, "Wrong username or password!");
            }
        }

        JOptionPane.showMessageDialog(null, "Login Successful!");

        boolean running = true;

        while (running) {
            String menu = JOptionPane.showInputDialog(
                    "Movie List Program\n\n" +
                    "1. Create New Movie List\n" +
                    "2. Delete One Item\n" +
                    "3. System Logout\n" +
                    "4. Show Overall Movie List\n\n" +
                    "Choose option:"
            );

            if (menu == null) {
                break;
            }

            int choice = Integer.parseInt(menu);

            if (choice == 1) {
                int total = Integer.parseInt(
                        JOptionPane.showInputDialog("How many movies do you want to input?")
                );

                for (int i = 0; i < total; i++) {
                    String movieName = JOptionPane.showInputDialog("Enter movie name " + (i + 1) + ":");
                    movies[movieCount] = movieName;
                    movieCount++;
                }

                JOptionPane.showMessageDialog(null, "Movie list created!");
            }

            else if (choice == 2) {
                if (movieCount == 0) {
                    JOptionPane.showMessageDialog(null, "Movie list is empty!");
                } else {
                    String movieListText = "Current Movie List:\n";

                    for (int i = 0; i < movieCount; i++) {
                        movieListText += (i + 1) + ". " + movies[i] + "\n";
                    }

                    String deleteName = JOptionPane.showInputDialog(
                            movieListText + "\nEnter movie name to delete:"
                    );

                    boolean found = false;

                    for (int i = 0; i < movieCount; i++) {
                        if (movies[i].equalsIgnoreCase(deleteName)) {

                            for (int j = i; j < movieCount - 1; j++) {
                                movies[j] = movies[j + 1];
                            }

                            movies[movieCount - 1] = null;
                            movieCount--;
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(null, "Movie deleted successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Movie name not found!");
                    }
                }
            }

            else if (choice == 3) {
                JOptionPane.showMessageDialog(null, "System Logged Out!");
                running = false;
            }

            else if (choice == 4) {
                if (movieCount == 0) {
                    JOptionPane.showMessageDialog(null, "No movies in the list yet!");
                } else {
                    String movieListText = "Overall Movie List:\n\n";

                    for (int i = 0; i < movieCount; i++) {
                        movieListText += (i + 1) + ". " + movies[i] + "\n";
                    }

                    JOptionPane.showMessageDialog(null, movieListText);
                }
            }

            else {
                JOptionPane.showMessageDialog(null, "Invalid option!");
            }
        }
    }
}