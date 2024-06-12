import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
//import java.awt.BorderLayout;
//import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;

//ペグソリティアをつくるクラス
class playGame extends JFrame {
    playGame() {
        GridLayout layout = new GridLayout(7, 7, 0, 0);
        this.setLayout(layout);
        JButton pin[] = new JButton[49];
        String color[] = new String[49];
        ImageIcon icon = new ImageIcon("images/pin.png");
        ImageIcon icon2 = new ImageIcon("images/pin2.png");

        for (int i = 0; i < 49; i++) {
            int num = i;
            pin[i] = new JButton();
            pin[i].setBorderPainted(false);

            switch (i) {
                case 0, 1, 5, 6, 7, 8, 12, 13, 35, 36, 40, 41, 42, 43, 47, 48:
                    pin[i].setBackground(Color.WHITE);
                    pin[num].setEnabled(false);
                    break;
                case 24:
                    pin[i].setBackground(Color.lightGray);
                    color[num] = "WHITE";
                    pin[i].setIcon(icon2);
                    break;
                default:
                    pin[i].setBackground(Color.lightGray);
                    color[num] = "BLACK";
                    pin[i].setIcon(icon);
            }

            // 押されたピンが白⇔黒になる(i使えないのでnum作ってコピーしとく)
            pin[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (color[num] == "BLACK") {
                        pin[num].setIcon(icon2);
                        color[num] = "WHITE";
                    } else {
                        pin[num].setIcon(icon);
                        color[num] = "BLACK";
                    }

                }
            });
            add(pin[i]);
        }

        this.setTitle("peg初期画面");
        this.setSize(490, 490);
        this.setVisible(true);

    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // String command = e.getActionCommand();
    // if ("pin[i]".equals(command)) {
    // int num = Integer.parseInt(pin[1].getText());
    // }
    // }

    // }

    public static void main(String[] args) {
        new playGame();
    }
}
