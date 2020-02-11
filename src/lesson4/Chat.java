package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chat extends JFrame{
    JPanel jpN = new JPanel(new GridLayout());
    JPanel jpS = new JPanel(new GridLayout());
    JButton jb = new JButton("Отправить");
    JTextArea jta = new JTextArea();
    JScrollPane jsp = new JScrollPane(jta);
    JTextField jtf = new JTextField();
    PrintWriter print = new PrintWriter(new FileWriter("MessagesArhiv.txt"));

    Chat() throws IOException {
        super("Chat");
        setSize(300, 400);
        setMinimumSize(new Dimension(300, 400));
        jta.setLineWrap(true);
        jta.setEditable(false);
        jb.addActionListener(e -> {
            sendMessage();
        });
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
            }
        });

        jpN.add(jsp);
        jpS.add(jtf);
        jpS.add(jb);
        add(jpN);
        add("South", jpS);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void sendMessage() {
        String out = jtf.getText();
        jta.append(getTime() + ": " + out + "\n");
        print.append(getTime() + ": " + out + "\n");
        print.flush();
        jtf.setText("");
        jtf.grabFocus();
    }

    public String getTime() {
        return new SimpleDateFormat("HH:mm").format(new Date());
    }
}