package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class VCadastrar_Aluno extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textNMatricula;
	private JTextField textData;
	private JTextField textCidade;
	private JTextField textUf;
	private JTextField textField;
	private VMenu_Principal menu_p;
	private VContatoAluno vcontatoaluno;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCadastrar_Aluno frame = new VCadastrar_Aluno();
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
	public VCadastrar_Aluno() {
		setFont(new Font("Arial", Font.PLAIN, 15));
		setTitle("Cadastro de Aluno");
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
		JMenu CD = new JMenu("Contatos Aluno");
		JMenuItem CD_Aluno = new JMenuItem("Telefone");
		CD_Aluno.setAction(action);
		CD.add(CD_Aluno);
		menubar.add(CD);
		setJMenuBar(menubar);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(10, 11, 53, 14);
		contentPane.add(lblNewLabel);
		
		textId = new JTextField();
		textId.setBounds(56, 8, 62, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(128, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setBounds(173, 8, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de Matricula");
		lblNewLabel_2.setBounds(288, 11, 137, 14);
		contentPane.add(lblNewLabel_2);
		
		textNMatricula = new JTextField();
		textNMatricula.setBounds(435, 8, 86, 20);
		contentPane.add(textNMatricula);
		textNMatricula.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Cadastro");
		lblNewLabel_3.setBounds(288, 42, 101, 14);
		contentPane.add(lblNewLabel_3);
		
		textData = new JFormattedTextField();
		textData.setBounds(435, 39, 86, 20);
		textData.setText("__/__/____");
		contentPane.add(textData);
		textData.setColumns(10);
		
		textCidade = new JTextField();
		textCidade.setBounds(56, 36, 70, 23);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cidade");
		lblNewLabel_4.setBounds(10, 42, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("UF");
		lblNewLabel_5.setBounds(138, 42, 36, 14);
		contentPane.add(lblNewLabel_5);
		
		textUf = new JTextField();
		textUf.setBounds(173, 39, 44, 20);
		contentPane.add(textUf);
		textUf.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Curso");
		lblNewLabel_6.setBounds(10, 87, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		
		textField = new JTextField();
		textField.setBounds(56, 84, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		
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
		btnNewButton_1_1_1.setAction(action_2);
		btnNewButton_1_1_1.setBounds(326, 156, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setAction(action_1);
		btnNewButton_2.setBounds(425, 156, 89, 23);
		contentPane.add(btnNewButton_2);
			
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Telefone");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			vcontatoaluno= new VContatoAluno();
			vcontatoaluno.setVisible(true);
			
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
			putValue(NAME, "Fechar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}
