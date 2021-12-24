package questao3.Desafio;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

public class TelaCliente extends JFrame {

	JMenuBar menuBar;
	JMenu cadastrarMenu, sairMenu;

	JLabel textClienteLabel, nomeLabel, cpfLabel, foneLabel, emailLabel;
	JTextField nomeField, emailField;
	JFormattedTextField cpfField, foneField;

	JRadioButton masculinoRadio, femininoRadio;

	JCheckBox receberPromoBox;

	public TelaCliente() {
		super("MPOO Market");

		setSize(380, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		
		menu();
		
		panelTextInfoTela();
		
		panelLabelField();
		
		panelRadioButton();
	
		
		setVisible(true);
	}

	public void menu() {
		menuBar = new JMenuBar();
		cadastrarMenu = new JMenu("Cadastrar");
		sairMenu = new JMenu("Sair");

		menuBar.add(cadastrarMenu);
		menuBar.add(sairMenu);
		
		add(menuBar, BorderLayout.NORTH);

	}
	
	public void panelTextInfoTela() {
		JPanel panelTextInfo = new JPanel();
		
		textClienteLabel = new JLabel("Cliente");
		textClienteLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		
		panelTextInfo.add(textClienteLabel);
		
		add(panelTextInfo, BorderLayout.BEFORE_LINE_BEGINS);
		
	}
	
	public void panelLabelField() {
		JPanel panelLabelAndField = new JPanel();
		panelLabelAndField.setLayout(new SpringLayout());

		nomeLabel = new JLabel("Nome: ");
		cpfLabel = new JLabel("CPF: ");
		foneLabel = new JLabel("Fone: ");
		emailLabel = new JLabel("E-mail: ");

		nomeField = new JTextField(5);
		nomeField.setSize(10, 10);

		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		try {
			foneField = new JFormattedTextField(new MaskFormatter("(##) ####-####"));
			foneField.setColumns(2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	

		emailField = new JTextField(2);
		

		panelLabelAndField.add(nomeLabel);
		panelLabelAndField.add(nomeField);

		panelLabelAndField.add(cpfLabel);
		panelLabelAndField.add(cpfField);

		panelLabelAndField.add(foneLabel);
		panelLabelAndField.add(foneField);

		panelLabelAndField.add(emailLabel);
		panelLabelAndField.add(emailField);

		SpringUtilities.makeGrid(panelLabelAndField, 4, 2, 1, 1, 1, 1);

		add(panelLabelAndField, BorderLayout.CENTER);
	}
	
	public void panelRadioButton() {
		JPanel panelOpcoes = new JPanel();
		
		ButtonGroup group = new ButtonGroup();

		masculinoRadio = new JRadioButton("Masculino");
		femininoRadio = new JRadioButton("Feminino");

		group.add(masculinoRadio);
		group.add(femininoRadio);
		
		panelOpcoes.add(masculinoRadio);
		panelOpcoes.add(femininoRadio);
		
		receberPromoBox = new JCheckBox("Aceita receber promoção");

		panelOpcoes.add(receberPromoBox);
		
		add(panelOpcoes, BorderLayout.PAGE_END);
	}

}
