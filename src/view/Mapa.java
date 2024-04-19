package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Mapa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa frame = new Mapa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mapa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("ESTADOS UNIDOS");
		btnNewButton.setBounds(10, 11, 67, 71);
		btnNewButton.setEnabled(false);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnPersonagem = new JButton("BRASIL");
		btnPersonagem.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPersonagem.setHorizontalAlignment(SwingConstants.LEFT);
		btnPersonagem.setEnabled(false);
		btnPersonagem.setBounds(10, 93, 67, 71);
		contentPane.add(btnPersonagem);
		
		JButton btnNewButton_1_1 = new JButton("CANADÁ");
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.setBounds(10, 175, 67, 71);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("CHINA");
		btnNewButton_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1.setEnabled(false);
		btnNewButton_1_1_1.setBounds(10, 257, 67, 71);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("JAPÃO");
		btnNewButton_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1.setEnabled(false);
		btnNewButton_1_1_1_1.setBounds(10, 339, 67, 71);
		contentPane.add(btnNewButton_1_1_1_1);
	}
}
