import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Panel panel = new Panel();

    Frame() {
        //FRAME
        this.getRootPane().putClientProperty("apple.awt.transparentTitleBar", true);  // Dzięki temu można zmienić kolor Bara
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(30, 30, 30));
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}