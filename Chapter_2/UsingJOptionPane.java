import javax.swing.*;

public class UsingJOptionPane {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        
            int result = JOptionPane.showConfirmDialog(
            null,
            "Is this your name: " + name + "?",
            "Confirm Name",
            JOptionPane.YES_NO_OPTION
        );
        
        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Hello, " + name);
        } else {
        JOptionPane.showConfirmDialog(
            null,
            "Is this your name: " + name + "?",
            "Confirm Name",
            JOptionPane.YES_NO_OPTION
        );

                  }
    }
}
