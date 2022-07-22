package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class VMenu_Principal extends JFrame {

	private JPanel contentPane;
	private VCadastrar_Aluno  cd_Aluno;
	private VConcedente 	  cd_concedente;
	private VCadastarServidor cd_Servidor;
	private VCadastroEstagio cd_Estagio;
	private final Action action_1 = new SwingAction_1();
	private final Action action = new SwingAction();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VMenu_Principal frame = new VMenu_Principal();
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
	public VMenu_Principal() {
		setTitle("CIEE");
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
		JMenu CD = new JMenu("Cadastrar");
		JMenu PQ = new JMenu("Pesquisar");
		JMenu ECE = new JMenu("Encerramento de Estagio");
		
		JMenuItem CD_Aluno = new JMenuItem("Cadastrar  Aluno");
		CD_Aluno.setAction(action_1);
		JMenuItem CD_Concedente = new JMenuItem("Cadastrar  Concedente");
		CD_Concedente.setAction(action);
		JMenuItem CD_Estagio = new JMenuItem("Cadastrar  Estagio");
		CD_Estagio.setAction(action_3);
		JMenuItem CD_Servidor = new JMenuItem("Cadastrar  Servidor");
		CD_Servidor.setAction(action_2);
		
		JMenuItem PQ_Aluno = new JMenuItem("Pesquisar Aluno");
		JMenuItem PQ_Concedente= new JMenuItem("Pesquisar Concedente");
		JMenuItem PQ_Estagio = new JMenuItem("Pesquisar Estagio");
		JMenuItem PQ_Servidor = new JMenuItem("Pesquisar Servidor");
		
		JMenuItem ECE_Estagio = new JMenuItem("Encerramento de Estagio");
		
		
		
		CD.add(CD_Aluno);
		CD.add(CD_Concedente);
		CD.add(CD_Estagio);
		CD.add(CD_Servidor);
		
		PQ.add(PQ_Aluno);
		PQ.add(PQ_Concedente);
		PQ.add(PQ_Estagio);
		PQ.add(PQ_Servidor);
		
		ECE.add(ECE_Estagio);
		
		menubar.add(PQ);
		menubar.add(CD);
		menubar.add(ECE);
		
		
		
		setJMenuBar(menubar);
	}
	
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Cadastar Aluno");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			cd_Aluno = new VCadastrar_Aluno();
			cd_Aluno.setVisible(true);
			
		}
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Cadastrar Concedente");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			cd_concedente=new VConcedente();
			cd_concedente.setVisible(true);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Cadastrar Servidor");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			cd_Servidor = new VCadastarServidor();
			cd_Servidor.setVisible(true);
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Cadastrar Estagio");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			cd_Estagio= new VCadastroEstagio();
			cd_Estagio.setVisible(true);
		}
	}
}
