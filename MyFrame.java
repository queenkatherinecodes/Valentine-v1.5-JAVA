import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	void expose() throws InterruptedException, LineUnavailableException, MalformedURLException, UnsupportedAudioFileException, IOException {
		clip = AudioSystem.getClip();
		AudioInputStream ais = AudioSystem.getAudioInputStream(audioUrl);
		clip.open(ais);
		clip.start();
		labels[0].setVisible(true);
		Thread.sleep(1500);
		labels[1].setVisible(true);
		Thread.sleep(1000);
		labels[2].setVisible(true);
		Thread.sleep(1000);
		labels[3].setVisible(true);
		Thread.sleep(2000);
		labels[4].setVisible(true);
		labels[5].setVisible(true);
		labels[6].setVisible(true);
		String s = "";
		for(int i=0; i<29; i++) {
			s = s +"-";
			labels[5].setText(s);
			labels[6].setText(s);
			Thread.sleep(100);
		}
		Thread.sleep(1000);
		button[0].setVisible(true);
		button[1].setVisible(true);
		balloon();
	}
	
	void balloon() {
		labels[9].setVisible(true);
		labels[10].setVisible(true);
		labels[11].setVisible(true);
		int i=0;
		while(i==0) {
			labels[9].setLocation(labels[9].getX(), (labels[9].getY()-1));
			labels[10].setLocation(labels[10].getX(), (labels[10].getY()-1));
			labels[11].setLocation(labels[11].getX(), (labels[11].getY()-1));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {}
			if(labels[11].getY()==-300) {
				labels[9].setBounds(10, 820, 300, 200);
				labels[10].setBounds(260, 820, 300, 200);
				labels[11].setBounds(110, 720, 300, 200);
			}
		}
	}
	
	private static final long serialVersionUID = 1L;
	
	JLabel labels[] = new JLabel[12];
	URL imageURL, imageURL2, imageURL3, imageURL4, imageURL5, imageURL6, imageURL7, imageURL8;
	URL urlsd, audioUrl = getClass().getResource("music.wav"), heart = getClass().getResource("1.png");
	JButton button[] = new JButton[2];
	int countNo = 0;
	ImageIcon imageIcon5, imageIcon3;
	Clip clip;
	
	MyFrame() throws InterruptedException, LineUnavailableException, UnsupportedAudioFileException, IOException{
		
		imageURL = new URL("https://user-images.githubusercontent.com/119154806/216777668-d3819eb6-06aa-4977-a5a6-633765270eb0.png");
		Image img = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL);
		Image dimg = img.getScaledInstance(350, 450, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		
		imageURL2 = new URL("https://user-images.githubusercontent.com/119154806/215511510-112d477c-462b-4c08-9ee9-ea2af5e8063f.png");
		Image img2 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL2);
		Image dimg2 = img2.getScaledInstance(120, 90, Image.SCALE_SMOOTH);
		ImageIcon imageIcon2 = new ImageIcon(dimg2);
		
		imageURL3 = new URL("https://user-images.githubusercontent.com/119154806/217014917-57faf79a-c7ac-4cbe-bf0c-fb134d84ef48.png");
		Image img3 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL3);
		Image dimg3 = img3.getScaledInstance(17, 21, Image.SCALE_SMOOTH);
		imageIcon3 = new ImageIcon(dimg3);
		
		imageURL4 = new URL("https://user-images.githubusercontent.com/119154806/217309407-26cc91ab-d353-4181-b87a-91f31e86a1b8.png");
		Image img4 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL4);
		Image dimg4 = img4.getScaledInstance(20, 23, Image.SCALE_SMOOTH);
		ImageIcon imageIcon4 = new ImageIcon(dimg4);
		
		imageURL5 = new URL("https://user-images.githubusercontent.com/119154806/217546946-cafd812f-3e26-427b-8c3d-96d8005c4afa.png");
		Image img5 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL5);
		Image dimg5 = img5.getScaledInstance(20, 23, Image.SCALE_SMOOTH);
		imageIcon5 = new ImageIcon(dimg5);
		
		imageURL7 = new URL("https://user-images.githubusercontent.com/119154806/216778810-6c045fcc-99c6-4306-aef7-02a0d10210c4.png");
		Image img7 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL7);
		Image dimg7 = img7.getScaledInstance(100, 200, Image.SCALE_SMOOTH);
		ImageIcon imageIcon7 = new ImageIcon(dimg7);
		
		imageURL8 = new URL("https://user-images.githubusercontent.com/119154806/216823065-bdd79048-675a-4ce7-b62b-15c2f5c952b6.png");
		Image img8 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL8);
		Image dimg8 = img8.getScaledInstance(150, 200, Image.SCALE_SMOOTH);
		ImageIcon imageIcon8 = new ImageIcon(dimg8);
		
		String lab[] = {"", "Heyy!!", "I have a question.", "", "Will you be my valentine?", "", "", "","", "", "", ""};
		String but[] = {"Yes!", "No!"};
		for(int i=0; i<12; i++) {
			labels[i] = new JLabel(lab[i]);
			labels[i].setForeground(Color.RED);
			labels[i].setVisible(false);
			this.add(labels[i]);
			labels[i].setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
			if(i<2) {
				button[i] = new JButton(but[i]);
				button[i].setForeground(Color.BLACK);
				button[i].setBackground(new Color(241, 112, 176));
				button[i].setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				button[i].setFocusable(false);
				button[i].setVisible(false);
				button[i].addActionListener(this);
				this.add(button[i]);
			}
		}
		
		labels[9].setIcon(imageIcon7);
		labels[10].setIcon(imageIcon7);
		labels[11].setIcon(imageIcon8);
		labels[9].setBounds(10, 820, 300, 200);
		labels[10].setBounds(260, 820, 300, 200);
		labels[11].setBounds(110, 720, 300, 200);
		button[0].setIcon(imageIcon3);
		button[1].setIcon(imageIcon4);
		labels[0].setIcon(imageIcon);
		labels[3].setIcon(imageIcon2);
		labels[8].setIcon(imageIcon4);
		labels[0].setBounds(5, 20, 500, 450);
		labels[1].setBounds(150, 60, 250, 30);
		labels[2].setBounds(110, 100, 250, 30);
		labels[3].setBounds(115, 145, 135, 100);
		labels[4].setBounds(75, 265, 250, 30);
		labels[5].setBounds(65, 240, 250, 30);
		labels[6].setBounds(65, 290, 250, 30);
		button[0].setBounds(70, 340, 100, 30);
		button[1].setBounds(195, 340, 100, 30);
		labels[7].setBounds(90, 380, 250, 30);
		labels[8].setBounds(260, 380, 250, 30);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(new Dimension(370, 520));
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);
		this.addWindowStateListener(new WindowStateListener() {
	        @Override
	        public void windowStateChanged(WindowEvent e) {
	        	System.out.println("kk");
	        	if(e.getNewState()==0)
	        		clip.start();
	        	else
	        		clip.stop();
	        }
	    });
		expose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button[0]) {
			if(button[0].getText().equals("Yes!")) {
				labels[1].setVisible(false);
				labels[2].setBounds(90, 100, 250, 30);
				labels[2].setText("OOOOOOOOOOOO");

				ImageIcon imageIcon6 = new ImageIcon(heart);				
				labels[3].setIcon(imageIcon6);
				labels[4].setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
				labels[4].setText("I... I can't express my feelings.");
				
				button[0].setText("A Special Gift");
				button[1].setText("Chat With Me");
				button[1].setIcon(imageIcon5);
				button[0].setBounds(85, 340, 200, 30);
				button[1].setBounds(85, 380, 200, 30);
				labels[7].setVisible(false);
				labels[8].setVisible(false);
				button[1].setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else {
				String url = "https://youtu.be/lntkaWeaUuU";
				try {
					Desktop.getDesktop().browse(new URI(url));
					setState(JFrame.ICONIFIED);
				} catch (IOException | URISyntaxException e1) {}
			}
		}
		
		if(e.getSource()==button[1]) {
			if(button[1].getText().equals("No!")) {
				if(countNo == 0) {
					labels[7].setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
					labels[7].setText("Please Dont say NO!");
					labels[7].setVisible(true);
					labels[8].setVisible(true);
					countNo++;
				}
				else if(countNo == 1) {
					labels[7].setText("Say NO and I'll Hack you!");
					labels[8].setIcon(imageIcon5);	
					countNo++;
					labels[7].setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
					labels[7].setBounds(75, 380, 250, 30);
					labels[8].setBounds(270, 380, 250, 30);
				}
				else {
					String url = "https://youtu.be/RHtox-eDKK8";
					try {
						Desktop.getDesktop().browse(new URI(url));
						setState(JFrame.ICONIFIED);
					} catch (IOException | URISyntaxException e1) {}
					labels[7].setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
					labels[7].setText("Please say Yes");
					labels[8].setIcon(imageIcon3);
					labels[7].setBounds(110, 380, 250, 30);
					labels[8].setBounds(235, 380, 250, 30);
					button[1].setVisible(false);
					button[0].setBounds(85, 340, 200, 30);
				}
			}
			else {
				String url = "https://wa.link/7wmt0y";
				try {
					Desktop.getDesktop().browse(new URI(url));
				} catch (IOException | URISyntaxException e1) {}
			}
			}
		}
	}
