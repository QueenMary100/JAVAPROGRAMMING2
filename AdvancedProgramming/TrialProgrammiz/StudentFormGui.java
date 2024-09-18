import javax.swing.*;
import java.awt.*;

public class StudentFormGui {
    
    public static void main(String[] args){

       
        JTextField txt = new JTextField();

        JFrame frame  = new JFrame("Student Form");
        frame.setSize(400,200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));

        JLabel namelabel = new JLabel("Name");
        JTextField nametxt = new JTextField();
        panel.add(namelabel);
        panel.add(nametxt);

        JLabel reglabel = new JLabel("RegNo");
        JTextField regtxt = new JTextField();

        panel.add(reglabel);
        panel.add(regtxt);

        JButton clearBtn = new JButton("Clear");
        panel.add(clearBtn);
        JButton submitBtn = new JButton("Submit");
        panel.add(submitBtn);

        JLabel resultlabel = new JLabel("");
        panel.add(resultlabel);

        frame.add(panel);
        frame.setVisible(true);
        


    }

}
