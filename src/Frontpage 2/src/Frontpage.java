import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.io.InputStream.*;
import javax.swing.border.*;

import static java.lang.String.*;


class Main implements ActionListener {

    JFrame guiFrame;
    JPanel buttonPanel;
    JPanel buttonPanel2;
    JPanel buttonPanel3;


    //Note: Typically the main method will be in a
    //separate class. As this is a simple one class
    //example it's all in the one class.
    public static void main(String[] args) {

        //Use the event dispatch thread for Swing components
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                new Main();
            }
        });

    }


    {
        guiFrame = new JFrame();


        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Basis Baren");
        guiFrame.setSize(1500, 1000);
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);


        //I added a buttonpanel in the bigger frame
        buttonPanel = new JPanel();
        guiFrame.add(buttonPanel, BorderLayout.WEST);
        buttonPanel.setLayout(new GridLayout(4, 0));

        buttonPanel2 = new JPanel();
        guiFrame.add(buttonPanel2, BorderLayout.EAST);
        buttonPanel2.setLayout(new GridLayout(1, 0));
        buttonPanel2.setLayout(new BorderLayout(0,0));
        buttonPanel2.setPreferredSize(new Dimension(200,100));
        buttonPanel2.setBorder(new LineBorder(Color.black));

        buttonPanel3 = new JPanel();
        guiFrame.add(buttonPanel3, BorderLayout.PAGE_END);
        buttonPanel3.setLayout(new GridLayout(2,0));
        buttonPanel3.setLayout(new BorderLayout(0,0));
        buttonPanel3.setPreferredSize(new Dimension(200,200));
        buttonPanel3.setBorder(new LineBorder(Color.black));

        guiFrame.setVisible(true);

        //Making a constructor for ButtonImage
        class ButtonImage extends JFrame {
            JButton firstButton, secondButton, thirdButton, fourthButton, fifthButton;

            ButtonImage() {

            }
        }

        ImageIcon firstButton = new ImageIcon("/Users/hindmorzogh/Frontpage/src/resources/first.png");
        JButton b1 = new JButton(firstButton);
        b1.setPreferredSize(new Dimension(150, 150));
        ImageIcon secondButton = new ImageIcon("/Users/hindmorzogh/Frontpage/src/resources/second.png");
        JButton b2 = new JButton(secondButton);
        b2.setPreferredSize(new Dimension(150, 150));
        ImageIcon thirdButton = new ImageIcon("/Users/hindmorzogh/Frontpage/src/resources/third.png");
        JButton b3 = new JButton(thirdButton);
        b3.setPreferredSize(new Dimension(150, 150));
        ImageIcon fourthButton = new ImageIcon("/Users/hindmorzogh/Frontpage/src/resources/fourth.png");
        JButton b4 = new JButton(fourthButton);
        b4.setPreferredSize(new Dimension(150, 150));

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


        //Constructor for ButtonKvittering
        class ButtonKvittering extends JFrame {
            JButton sletAltButton, kortButton, kontantButton;

            ButtonKvittering() {

            }

        }

        JLabel label = new JLabel("Kvittering");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        //Slet alt knap - kvittering
        ImageIcon sletAltButton = new ImageIcon();
        JButton b5 = new JButton (sletAltButton);
        b5.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b5.setHorizontalAlignment(JButton.CENTER);
        b5.setVerticalAlignment(JButton.BOTTOM);
        b5.setPreferredSize(new Dimension(50,50));
        b5.setBackground(Color.red);
        b5.setText("Slet alt");


        buttonPanel2.add(b5, BorderLayout.PAGE_END);
        buttonPanel2.add(label);




        b5.addActionListener(this);





        }

        //As all the buttons are doing the same thing it's
        //easier to make the class implement the ActionListener
        //interface and control the button clicks from one place
        @Override
        public void actionPerformed(ActionEvent event) {
            //get the Action Command text from the button
            String action = event.getActionCommand();

            //set the text using the Action Command text

        }

        private class OperatorAction implements ActionListener {
            private int operator;

            public OperatorAction(int operation) {
                operator = operation;
            }

            public void actionPerformed(ActionEvent event) {

            }
        }

        private class Path {
        }
    }





