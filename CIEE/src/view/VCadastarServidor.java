package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
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

public class VCadastarServidor extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textMatricula;
	private JTextField textData;
	private JTextField textCidade;
	private JTextField textUF;
	private JTextField textTipoServidor;
	private final Action action = new SwingAction();
	private VCadastrarServidor_Contatos contatos;
	private final Action action_1 = new SwingAction_1();
	private VMenu_Principal menu_p;
	private final Action action_2 = new SwingAction_2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCadastarServidor frame = new VCadastarServidor();
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
	public VCadastarServidor() {
		setTitle("Cadastrar Servidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240,255,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menubar = new JMenuBar();
		menubar.setForeground(Color.DARK_GRAY);
		menubar.setBackground( new Color(95,158,160));
		JMenu CD_Serv = new JMenu("Contatos Servidor");
		JMenuItem CD_Servidor = new JMenuItem("Telefone / Email");
		CD_Servidor.setAction(action);
		menubar.add(CD_Serv);
		CD_Serv.add(CD_Servidor);
		setJMenuBar(menubar);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textId = new JTextField();
		textId.setBounds(31, 8, 86, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(140, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setBounds(179, 8, 176, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Matricula");
		lblNewLabel_2.setBounds(382, 11, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(441, 8, 164, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Cadastro");
		lblNewLabel_3.setBounds(10, 53, 107, 14);
		contentPane.add(lblNewLabel_3);
		
		textData = new JFormattedTextField();
		textData.setBounds(127, 50, 86, 20);
		textData.setText("__/__/____");
		contentPane.add(textData);
		textData.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cidade");
		lblNewLabel_4.setBounds(234, 53, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textCidade = new JTextField();
		textCidade.setBounds(280, 50, 86, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("UF");
		lblNewLabel_5.setBounds(382, 53, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textUF = new JTextField();
		textUF.setBounds(411, 50, 46, 20);
		contentPane.add(textUF);
		textUF.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Tipo de Servidor");
		lblNewLabel_6.setBounds(10, 101, 93, 14);
		contentPane.add(lblNewLabel_6);
		
		textTipoServidor = new JTextField();
		textTipoServidor.setBounds(127, 98, 86, 20);
		contentPane.add(textTipoServidor);
		textTipoServidor.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(31, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(127, 214, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Excluir");
		btnNewButton_1_1.setBounds(226, 214, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Fechar");
		btnNewButton_1_1_1.setAction(action_2);
		btnNewButton_1_1_1.setBounds(325, 214, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setAction(action_1);
		btnNewButton_2.setBounds(424, 214, 89, 23);
		contentPane.add(btnNewButton_2);
			
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Telefone / E-mail");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			contatos = new VCadastrarServidor_Contatos ();
			contatos.setVisible(true);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Voltar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			menu_p = new VMenu_Principal ();
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
