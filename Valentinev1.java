import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class Valentinev1 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	String url = "https://wa.link/za7082";
	JLabel label = new JLabel("Will You be my valentine? ");
	JLabel label2 = new JLabel("😍");
	JButton but[] = new JButton[2];
	
	Valentinev1(){
		String buttons[] = {"Yes!", "No!"};
		for(int i=0; i<2; i++) {
				but[i] = new JButton(buttons[i]);
				but[i].setForeground(Color.BLACK);
				but[i].setBackground(new Color(123,100,255));
				but[i].setFont(new Font("MV Boli", Font.PLAIN, 15));
				but[i].setFocusable(false);
				but[i].setVisible(true);
				but[i].addActionListener(this);
				this.add(but[i]);
		}
		
	//	label = new JLabel(labels[i]);
		label.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label.setForeground(Color.RED);
		label.setVisible(true);
		this.add(label);
		
		label2.setForeground(Color.RED);
		label2.setVisible(true);
		this.add(label2);
		
		label2.setBounds(205, 30, 20, 35);
		
		label.setBounds(20, 30, 205, 35);
		but[0].setBounds(20, 80, 80, 35);
		but[1].setBounds(120, 80, 80, 35);
		
		//FRAME
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(new Dimension(250,250));
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==but[1]) {
			if(but[1].getText().equals("No!"))
				JOptionPane.showMessageDialog(null, "Please Don't say No 😞", "Information", JOptionPane.INFORMATION_MESSAGE);
			else
				try {
					Desktop.getDesktop().browse(new URI(url));
				} catch (Exception e1) {} 
			}
		if(e.getSource()==but[0]) {
			if(but[0].getText().equals("Yes!")) {
				label.setText("Woooo! Thanks for that");
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				label2.setText("💘");
				label2.setBounds(193, 30, 20, 35);
				but[0].setText("Close");
				but[1].setText("Chat");
			}
			else
				System.exit(0);
		}
	}
}
