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
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class VContatoAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textTpTelefone;
	private JTextField textTelefone;
	private VCadastrar_Aluno telefones;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VContatoAluno frame = new VContatoAluno();
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
	public VContatoAluno() {
		
		setFont(new Font("Arial", Font.PLAIN, 15));
		setTitle("Telefone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240,255,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Telefone");
		lblNewLabel.setBounds(10, 26, 118, 14);
		contentPane.add(lblNewLabel);
		
		textTpTelefone = new JTextField();
		textTpTelefone.setBounds(123, 23, 86, 20);
		contentPane.add(textTpTelefone);
		textTpTelefone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone");
		lblNewLabel_1.setBounds(251, 26, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(336, 23, 86, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(32, 156, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(128, 156, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Excluir");
		btnNewButton_1_1.setBounds(227, 156, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Fechar");
		btnNewButton_1_1_1.setAction(action_1);
		btnNewButton_1_1_1.setBounds(326, 156, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setAction(action);
		btnNewButton_2.setBounds(425, 156, 89, 23);
		contentPane.add(btnNewButton_2);
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Voltar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			telefones = new VCadastrar_Aluno();
			telefones.setVisible(true);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Fechar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}

