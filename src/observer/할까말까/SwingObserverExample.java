package 할까말까;

import javax.swing.*;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go(){
        frame = new JFrame();

        JButton button = new JButton("할까 말까?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
    };
}
