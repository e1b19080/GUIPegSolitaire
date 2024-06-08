import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainPage extends JFrame{

    mainPage(){
        JLabel label = new JLabel("メニュー");
        label.setPreferredSize(new Dimension(220,40));
        JButton button1 = new JButton("あそぶ！");
        button1.setPreferredSize(new Dimension(220,40));
        JButton button2 = new JButton("こたえ！");
        button2.setPreferredSize(new Dimension(220,40));

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("勉強しろ");
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("自分で考えろ");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        panel.add(button1,BorderLayout.CENTER);
        panel.add(button2,BorderLayout.SOUTH);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ペグソリティア");
        pack();
        setVisible(true);

    }


    public static void main(String[] args){
        new mainPage();
    }

}




