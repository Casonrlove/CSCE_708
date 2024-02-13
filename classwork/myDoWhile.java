import javax.swing.JOptionPane;

public class myDoWhile {
    public static void main(String[] args) {
        String output = "Welcome to the Hilton TV System";
        String title = "Hilton TV System";

        JOptionPane.showMessageDialog(null, output, title, 3);

        int channel = 0;
        int result;

        do {
            output = String.format("You are watching %d.\n Yes to stay here.\n No to go to next channel.\n Cancel to exit.", ++channel);
            result = JOptionPane.showOptionDialog(null, output, title, 
            JOptionPane.YES_NO_CANCEL_OPTION, 1, null, null, null);

            if (result == JOptionPane.YES_OPTION) {
                output = String.format("You are watching %d.\n Click ok to leave", channel);
                JOptionPane.showMessageDialog(null, output, title, result);
                break;
            }
        } while (result != JOptionPane.CANCEL_OPTION);
    }
}
