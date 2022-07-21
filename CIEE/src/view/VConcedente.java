package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class VConcedente extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNConvenio;
	private JTextField textRS;
	private JTextField textNF;
	private JTextField textNomeSupervisor;
	private JTextField textNomeResponsavelEstagio;
	private JTextField textDTIConvenio;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private VConcedente_Telefone_Email telefone_email;
	private VMenu_Principal menu_p;
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
					VConcedente frame = new VConcedente();
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
	public VConcedente() {
		setTitle("Cadastro Conciente");
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
		JMenu CDCONC = new JMenu("Contatos Concedente");
		JMenuItem CDConcedente = new JMenuItem("Telefone / E-mail");
		CDConcedente.setAction(action);
		
		CDCONC.add(CDConcedente);
		menubar.add(CDCONC);
		setJMenuBar(menubar);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(81, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textId = new JTextField();
		textId.setBounds(117, 8, 46, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de Convenio");
		lblNewLabel_1.setBounds(173, 11, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		textNConvenio = new JTextField();
		textNConvenio.setBounds(319, 8, 86, 20);
		contentPane.add(textNConvenio);
		textNConvenio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Razão Social");
		lblNewLabel_2.setBounds(424, 11, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		textRS = new JTextField();
		textRS.setBounds(513, 8, 86, 20);
		contentPane.add(textRS);
		textRS.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nome Fantasia");
		lblNewLabel_3.setBounds(10, 52, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		textNF = new JTextField();
		textNF.setBounds(117, 49, 86, 20);
		contentPane.add(textNF);
		textNF.setColumns(10);
		
		textNomeSupervisor = new JTextField();
		textNomeSupervisor.setBounds(346, 49, 253, 20);
		contentPane.add(textNomeSupervisor);
		textNomeSupervisor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nome Supervisor");
		lblNewLabel_4.setBounds(241, 52, 107, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nome Responsavel pelo Estagio");
		lblNewLabel_5.setBounds(152, 93, 338, 14);
		contentPane.add(lblNewLabel_5);
		
		textNomeResponsavelEstagio = new JTextField();
		textNomeResponsavelEstagio.setBounds(346, 90, 253, 20);
		contentPane.add(textNomeResponsavelEstagio);
		textNomeResponsavelEstagio.setColumns(10);
		
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Data Inicio do Convenio");
		lblNewLabel_6.setBounds(10, 145, 193, 14);
		contentPane.add(lblNewLabel_6);
		
		textDTIConvenio = new JTextField();
		textDTIConvenio.setBounds(151, 142, 125, 20);
		contentPane.add(textDTIConvenio);
		textDTIConvenio.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Data de Fim do Convenio");
		lblNewLabel_7.setBounds(319, 145, 153, 14);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(474, 142, 125, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Data de Cadastro");
		lblNewLabel_8.setBounds(10, 199, 117, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 196, 124, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Cidade");
		lblNewLabel_9.setBounds(319, 199, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		textField_2 = new JTextField();
		textField_2.setBounds(366, 196, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("UF");
		lblNewLabel_10.setBounds(474, 199, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(495, 196, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
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
		btnNewButton_1_1_1.setAction(action_2);
		btnNewButton_1_1_1.setBounds(319, 290, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setAction(action_1);
		btnNewButton_2.setBounds(414, 290, 89, 23);
		contentPane.add(btnNewButton_2);
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Telefone/E-mail");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			telefone_email=new VConcedente_Telefone_Email();
			telefone_email.setVisible(true);
			
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
