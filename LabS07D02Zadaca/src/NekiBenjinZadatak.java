

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class NekiBenjinZadatak {
	
	private static class MainWindow extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Da li imate 18 godina?", 20, 30);
		}
	}

	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	public static class MouseButtonHandler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
									
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {

			
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}

	public static void main(String[] args) {
		MainWindow displayPanel = new MainWindow();
		JButton yesButton = new JButton("OK");
		JTextField enterText = new JTextField("",20);	

		MouseButtonHandler mblistener = new MouseButtonHandler();
		yesButton.addMouseListener(mblistener);
		
		
		
		JPanel content = new JPanel();
		
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.CENTER);
		
		content.add(enterText);
		content.add(yesButton);
		JFrame window = new JFrame("GUI Test");
		
		window.setContentPane(content);
		window.setSize(200, 100);
		window.setLocation(100, 100);
		window.setVisible(true);
		
	}
}