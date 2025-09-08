import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String name;
        int choice;

        do {

            name = JOptionPane.showInputDialog(null, "Enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);

            if (name == null) System.exit(0);

            choice = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!" );
            }

        } while (choice != JOptionPane.YES_OPTION);
    }
}
