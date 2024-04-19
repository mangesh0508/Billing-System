package electricity.billing.system;

import javax.swing.*;
// extended swing to use functions setSwing and setVisible
import java.awt.*;
// Image function is from awt calss

public class Splash extends JFrame implements Runnable{
    // as we implement Runnable. Override abstract method in Runnable i.e. run()
    Thread t;
    // declaring a thread
    
    Splash(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        // getting image from its location
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        // scaling image according to frame dimentions
        ImageIcon i3 = new ImageIcon(i2);
        // as JLabel won't accept Image. So converting i2 to ImageIcon
        JLabel image = new JLabel(i3);
        //passing image to JLabel object
        add(image);
        // adding image to frame        
        
        setSize(730,550);
        // to create a frame with dimentions
        setLocation(400, 150);
        // seting location of frame
        t = new Thread(this);
        // creating an object of thread
        t.start();
        // to call run method
        setVisible(true);
        // make frame visible
    }
    
     public void run(){
         try{
            Thread.sleep(1000);
            setVisible(false);
            // will hide the frame after 1s
            
            new Login();
            // show login frame after 1st frame is shut
         }catch(Exception e){
             e.printStackTrace();
             // prints error if any
         }
     }
    
    public static void main(String[] args) {
        new Splash();
    }
            
}
