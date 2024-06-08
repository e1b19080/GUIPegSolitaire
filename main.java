import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.AWTEvent;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowEvent;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//ペグソリティアをつくるクラス
class playGame extends JFrame {
    playGame() {
        GridLayout layout = new GridLayout(9, 9, 0, 0);
        this.setLayout(layout);
        JButton btn[] = new JButton[49];
        for (int i = 0; i < 49; i++) {
            btn[i] = new JButton(Integer.toString(i + 1));
        }
        for (int i = 0; i < 49; i++) {
            switch (i) {
                case 0, 1, 5, 6, 7, 8, 12, 13, 36, 37, 41, 42, 43, 44, 47, 48:
                    add(btn[i]);
                    break;
                default:
                    add(btn[i]);
            }
        }

        this.setTitle("peg初期画面");
        this.setSize(380, 380);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new playGame();
    }
}
