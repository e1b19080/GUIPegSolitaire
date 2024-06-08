import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.AWTEvent;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class DetermineBoard extends JFrame{

    JSpinner spinc = new JSpinner();
    JSpinner spinr = new JSpinner();
    JLabel labelc = new JLabel("縦：");
    JLabel labelr = new JLabel("横：");
    JLabel labelg = new JLabel();

    class calculateGrid implements ChangeListener {
        public void stateChanged(ChangeEvent e){
            int c = (Integer)(spinc.getValue());
            int r = (Integer)(spinr.getValue());
            int g = c*r;
            String s = String.format("マス数=%2d", g);
            labelg.setText(s);
        }
    }

    DetermineBoard(){
        SpinnerModel modelc = new SpinnerNumberModel(3,1,9,1);
        SpinnerModel modelr = new SpinnerNumberModel(3,1,9,1);
        spinc.setModel(modelc);
        spinr.setModel(modelr);
        spinc.addChangeListener(new calculateGrid());
        spinr.addChangeListener(new calculateGrid());
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 4;
        layout.setConstraints(labelc,gbc);
        add(labelc);
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 4;
        layout.setConstraints(spinc,gbc);
        add(spinc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.gridheight = 4;
        layout.setConstraints(labelr,gbc);
        add(labelr);
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.gridheight = 4;
        layout.setConstraints(spinr,gbc);
        add(spinr);
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        layout.setConstraints(labelg,gbc);
        add(labelg);
        spinc.setValue(3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280,150);
        setTitle("NumUpDown");
        setVisible(true);
    }
}




class mainPage extends JFrame{

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
        //new mainPage();
        new DetermineBoard();
    }

}




