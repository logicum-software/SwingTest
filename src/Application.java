import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        JFrame f=new JFrame();//creating instance of JFrame
        UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());

        JButton b=new JButton("Berechnen");
        JProgressBar jProgressBar = new JProgressBar(0, 10000);
        b.setBounds(14,14,100, 20);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jProgressBar.setValue(5000);
            }
        });
        jProgressBar.setBounds(14, 48, 350, 20);

        f.add(b);
        f.add(jProgressBar);

        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
