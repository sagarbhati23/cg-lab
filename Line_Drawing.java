import javax.swing.*;
import java.awt.*;
import java.util.*;

// DDA Algorithm Implementation in Java
public class Line_Drawing extends JPanel {
    public void DDA_Algo(Graphics g, int x1, int y1, int x2, int y2){
        int length;
        float xinc, yinc;

        if(Math.abs(x2 - x1) > Math.abs(y2 - y1)){
            length = Math.abs(x2 - x1);
        }else{
            length = Math.abs(y2 - y1);
        }
        xinc = (x2 - x1) / length;
        yinc = (y2 - y1) / length;
        float x = x1;
        float y = y1;
        for (int i = 0; i<length; i++){
            g.fillRect(Math.round(x), Math.round(y), 1, 1);
            x += xinc;
            y += yinc;
        }
    }


    // Main method to test the DDA algorithm
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setForeground(Color.RED);
        // g.fillRect(200, 200, 20, 20);
        DDA_Algo(g, 0, 0, 300, 300);
    }


    public static void main(String[] args) {
        JFrame jf = new JFrame("DDA Implementation");
        Line_Drawing lobj = new Line_Drawing();
        jf.add(lobj);
        jf.setSize(1000, 1000);
        jf.setVisible(true);
       }
}

