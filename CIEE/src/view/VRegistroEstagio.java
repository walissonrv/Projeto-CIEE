package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class VRegistroEstagio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private VCadastroEstagio cd_estagio;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VRegistroEstagio frame = new VRegistroEstagio();
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
	public VRegistroEstagio() {
		setFont(new Font("Arial", Font.PLAIN, 15));
		setTitle(" Cadastrar Registro Estagio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240,255,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(10, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(34, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero Registro");
		lblNewLabel_1.setBounds(130, 24, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(244, 21, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ano");
		lblNewLabel_2.setBounds(340, 24, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(366, 21, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Registro");
		lblNewLabel_3.setBounds(10, 63, 111, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(148, 60, 86, 20);
		textField_3.setText("__/__/____");
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data Cadastro");
		lblNewLabel_4.setBounds(244, 63, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(340, 60, 86, 20);
		textField_4.setText("__/__/____");
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(379, 106, 232, 97);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_5 = new JLabel("Observação");
		lblNewLabel_5.setBounds(464, 89, 111, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(31, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(130, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Excluir");
		btnNewButton_1_1.setAction(action);
		btnNewButton_1_1.setBounds(229, 227, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Fechar");
		btnNewButton_1_1_1.setAction(action_1);
		btnNewButton_1_1_1.setBounds(328, 227, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setAction(action_1);
		btnNewButton_2.setBounds(425, 156, 89, 23);
		contentPane.add(btnNewButton_2);
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Fechar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Voltar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			cd_estagio = new VCadastroEstagio();
			cd_estagio.setVisible(true);
		}
	}
}
