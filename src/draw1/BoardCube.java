package draw1;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author David Jennings
 */
class BoardCube extends JButton {
    int counter = 0;

    public BoardCube(){
        this.setSize(200, 200);
        
        this.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                
            }
        });
        
    }
    
protected void paintComponent(Graphics graph) {

            super.paintComponent(graph);
            graph.setColor(Color.blue);
//            if(counter == 0 ||counter == 2){
//                counter = 1;
//                this.repaint();
//            graph.drawLine(0, 0, 200, 200);
//            graph.drawLine(0, 200, 200, 0);
//            }
            
            if(counter == 1){
                this.repaint();
                counter = 2;
            graph.drawOval(20, 20, 150, 150);
            }

        
            
        }

    
        


       

        
        
        
    }