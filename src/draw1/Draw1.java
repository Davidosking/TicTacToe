package draw1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author David Jennings
 */
public class Draw1 extends JFrame implements ActionListener {

    public Draw1() {

        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            this.add(new BoardCube());
        }

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Draw1 c = new Draw1();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
