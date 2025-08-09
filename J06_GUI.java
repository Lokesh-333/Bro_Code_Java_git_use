import javax.swing.JOptionPane; // JOptionPane is a class for GUI (Graphical User Interface)

public class J06_GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name"); // shows input dialog box
        JOptionPane.showMessageDialog(null, "Hello "+name+"!"); // shows message dialog box
        // null means center of screen

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are "+age+" years old!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm)"));
        JOptionPane.showMessageDialog(null, "you are "+height+" cm tall!");
    }
}
