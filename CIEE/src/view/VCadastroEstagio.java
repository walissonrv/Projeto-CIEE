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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class VCadastroEstagio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private VMenu_Principal menu_p;
	private VEncerramento_Estagio encerramento;
	private VRegistroEstagio registroEstagio;
	private VAgenteMediador  agenteMediador;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCadastroEstagio frame = new VCadastroEstagio();
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
	public VCadastroEstagio() {
		setFont(new Font("Arial", Font.PLAIN, 15));
		setTitle("Cadastrar Estagio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240,255,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menubar = new JMenuBar();
		menubar.setForeground(Color.DARK_GRAY);
		menubar.setBackground( new Color(95,158,160));
		JMenu CD = new JMenu("Cadastrar Agente Mediador");
		JMenuItem CD_AgenteMediador = new JMenuItem("Agente Mediador");
		CD_AgenteMediador.setAction(action_4);
		JMenu CD1 = new JMenu("Cadastrar Registro Estagio");
		JMenuItem CD_RegistroEstagio = new JMenuItem("Registro Estagio");
		CD_RegistroEstagio.setAction(action_3);
		JMenu CD2 = new JMenu("Cadastrar Encerramendo de Estagio");
		JMenuItem CD_Encerramento = new JMenuItem("Encerramento de Estagio");
		CD_Encerramento.setAction(action_2);
		CD.add(CD_AgenteMediador);
		CD1.add(CD_RegistroEstagio);
		CD2.add(CD_Encerramento);
		
		menubar.add(CD);
		menubar.add(CD1);
		menubar.add(CD2);
		setJMenuBar(menubar);
		
		JLabel lblNewLabel = new JLabel("Modalidade de Estagio");
		lblNewLabel.setBounds(10, 21, 139, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(149, 18, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Inicio");
		lblNewLabel_1.setBounds(259, 21, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(347, 18, 86, 20);
		textField_1.setText("__/__/____");
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Data de Fim");
		lblNewLabel_1_1.setBounds(443, 21, 101, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(518, 18, 86, 20);
		textField_2.setText("__/__/____");
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Previsão de Entrega");
		lblNewLabel_2.setBounds(112, 76, 187, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(284, 73, 86, 20);
		textField_3.setText("__/__/____");
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Cadastro");
		lblNewLabel_3.setBounds(399, 76, 109, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(518, 73, 86, 20);
		contentPane.add(textField_4);
		textField_4.setText("__/__/____");
		textField_4.setColumns(10);
		
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
		btnNewButton_1_1_1.setAction(action);
		btnNewButton_1_1_1.setBounds(326, 156, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("New button");
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
			menu_p = new VMenu_Principal();
			menu_p.setVisible(true);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Encerramento Estagio");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			encerramento= new VEncerramento_Estagio();
			encerramento.setVisible(true);
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Registro de Estagio");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			registroEstagio= new VRegistroEstagio();
			registroEstagio.setVisible(true);
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Agente Mediador");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			agenteMediador= new VAgenteMediador();
			agenteMediador.setVisible(true);
		}
	}
}
