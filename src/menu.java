import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {

    public static void main (String[] args) {
    JFrame frame = new JFrame ("menu");
frame.setVisible(true);
frame.setSize(800,400);
frame.setIgnoreRepaint(true);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar (menubar);

    JMenu file;
        file = new JMenu ( "/Users/ridwan/IdeaProjects/frontpage/src/resources/menu.png");
        menubar.add (file);
        JMenuItem kasse = new JMenuItem("Åben Kasse");
        file.add(kasse);
        JMenuItem historik = new JMenuItem("Historik");
        file.add(historik);
        JMenuItem betaling = new JMenuItem("Del Betaling");
        file.add(betaling);
        JMenuItem print = new JMenuItem("Print");
        file.add (print);
        JMenuItem exit = new JMenuItem("Afslut Dag");
        file.add (exit);


    class exitaction implements ActionListener {
        public void actionPerformed (ActionEvent e) {
          System.exit (1);
        }

    }
exit.addActionListener (new exitaction());

}
}