import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        mainFrame obj = new mainFrame();
    }
}

class mainFrame {
    JFrame frmOne = new JFrame();
    JButton btnOne = new JButton();
    Timer timer = new Timer(100, new TimerEvent());
    int count = 0;
    boolean timerStart = false;

    mainFrame() {
        initFrmOne();
        initButton(btnOne, 100, 50, 200, 200, Color.WHITE, "Start");
    }

    public void initFrmOne() {
        frmOne.setTitle("Color Switching Program");
        frmOne.setSize(500, 500);
        frmOne.setLocation(300, 100);
        frmOne.getContentPane().setBackground(Color.BLACK);
        frmOne.setResizable(false);
        frmOne.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frmOne.setLayout(null);
        frmOne.setVisible(true);
        frmOne.add(btnOne);
    }

    public void initButton(JButton btn, int w, int h, int x, int y, Color c, String title) {
        btn.setSize(w, h);
        btn.setLocation(x, y);
        btn.setBackground(c);
        btn.setText(title);
        btn.addActionListener(new ActionEvent());
    }

    public class ActionEvent implements ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == btnOne) {
                if (!timerStart) {
                    timer.start();
                    timerStart = true;
                } else {
                    timer.stop();
                    timerStart = false;
                }
            }
        }
    }


    class TimerEvent implements ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == timer) {
                count++;
                if (count == 1) {
                    frmOne.getContentPane().setBackground(Color.RED);
                } else if (count == 2) {
                    frmOne.getContentPane().setBackground(Color.GREEN);
                } else if (count == 3) {
                    frmOne.getContentPane().setBackground(Color.BLUE);
                } else if (count == 4) {
                    frmOne.getContentPane().setBackground(Color.YELLOW);
                } else if (count == 5) {
                    frmOne.getContentPane().setBackground(Color.PINK);
                } else if (count == 6) {
                    frmOne.getContentPane().setBackground(Color.ORANGE);
                } else if (count == 7) {
                    frmOne.getContentPane().setBackground(Color.MAGENTA);
                } else if (count == 8) {
                    frmOne.getContentPane().setBackground(Color.WHITE);
                    count = 0;
                }
            }
        }
    }
}
