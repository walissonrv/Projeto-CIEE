package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class VConcedente_Telefone_Email extends JFrame {

	private JPanel contentPane;
	private JTextField textTelefoneConcedente;
	private JTextField textTipoEmail;
	private JTextField textEmailConcedente;
	private VConcedente cd_concedente;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VConcedente_Telefone_Email frame = new VConcedente_Telefone_Email();
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
	public VConcedente_Telefone_Email() {
		setTitle("Telefone / E-mail");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240,255,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Telefone");
		lblNewLabel.setBounds(23, 56, 89, 14);
		contentPane.add(lblNewLabel);
		
		textTelefoneConcedente = new JTextField();
		textTelefoneConcedente.setBounds(100, 53, 86, 20);
		contentPane.add(textTelefoneConcedente);
		textTelefoneConcedente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo E-mail");
		lblNewLabel_1.setBounds(232, 56, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		textTipoEmail = new JTextField();
		textTipoEmail.setBounds(296, 53, 129, 20);
		contentPane.add(textTipoEmail);
		textTipoEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail");
		lblNewLabel_2.setBounds(435, 56, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textEmailConcedente = new JTextField();
		textEmailConcedente.setBounds(475, 53, 150, 20);
		contentPane.add(textEmailConcedente);
		textEmailConcedente.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(23, 290, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(125, 290, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Excluir");
		btnNewButton_1_1.setBounds(224, 290, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Fechar");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_1.setBounds(319, 290, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setAction(action);
		btnNewButton_2.setBounds(418, 290, 89, 23);
		contentPane.add(btnNewButton_2);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Voltar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			cd_concedente = new VConcedente();
			cd_concedente.setVisible(true);
		}
	}
}
