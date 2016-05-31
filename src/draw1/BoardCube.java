package draw1;


import java.awt.Color;
import java.awt.Font;
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
   int counter ;

    public BoardCube(){
        this.setFont(new Font("Arial", Font.PLAIN, 200));
        //this.setText("x");
        this.setSize(200, 200);
        counter = 0;
        
        this.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                if(counter == 0 ){
                    setText("");
                    counter = 1;
                    setText("x");
                    return;
            }
                else if(counter == 1){
                    setText("");
                    counter = 0;
                    setText("o");
                    return;
            }
                
            }
        });
        
    }
    


    
        


       

        
        
        
    }