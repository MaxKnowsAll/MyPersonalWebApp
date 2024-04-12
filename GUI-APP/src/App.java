import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your Name");
    JOptionPane.showMessageDialog(null, "Oh Hello.." +name);
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
}
}