package questao1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCalculadora extends JFrame {

	JButton umButton, doisButton, tresButton, quatroButton,
			cincoButton, seisButton, seteButton, oitoButton,
			noveButton, zeroButton, iqualButton, somaButton,
			subtracaoButton, multiplicacaoButton, divisaoButton,
			setaEsquerdaButton, cButton, maisOuMenosButton, raizButton,
			elevadoQuadradoButton, elevadoAoCuboButton, umPorXButton,
			virgulaButton;
	
	JTextField visorField;
	
	public TelaCalculadora() {
		super("Calculadora");
		setSize(260, 255);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		setLayout(new GridBagLayout());

		GridBagConstraints metodosGrid = new GridBagConstraints();
		metodosGrid.insets = new Insets(1, 1, 1, 1);
		visorField = new JTextField("0");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.ipady = 20;
		metodosGrid.ipadx = 20;
		metodosGrid.gridx = 0;
		metodosGrid.gridy = 0;
		metodosGrid.gridheight = 1;
		metodosGrid.gridwidth = 5;
		visorField.setHorizontalAlignment(JTextField.RIGHT);
		
		add(visorField, metodosGrid);
		
		setaEsquerdaButton = new JButton("←");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.ipadx = 0;
		metodosGrid.ipady = 0;
		metodosGrid.ipadx = 0;
		metodosGrid.gridx = 0;
		metodosGrid.gridy = 1;
		metodosGrid.gridheight = 1;
		metodosGrid.gridwidth = 1;
		setaEsquerdaButton.setBackground(new Color(213, 224, 237));

		add(setaEsquerdaButton, metodosGrid);

		cButton = new JButton("C");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 1;
		metodosGrid.gridy = 1;
		cButton.setBackground(new Color(213, 224, 237));

		add(cButton, metodosGrid);

		maisOuMenosButton = new JButton("+-");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 2;
		metodosGrid.gridy = 1;
		maisOuMenosButton.setBackground(new Color(213, 224, 237));
		
		add(maisOuMenosButton, metodosGrid);

		raizButton = new JButton("√");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 3;
		metodosGrid.gridy = 1;
		raizButton.setBackground(new Color(213, 224, 237));
		
		add(raizButton, metodosGrid);

		elevadoQuadradoButton = new JButton("x²");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 4;
		metodosGrid.gridy = 1;
		elevadoQuadradoButton.setBackground(new Color(213, 224, 237));

		add(elevadoQuadradoButton, metodosGrid);

		seteButton = new JButton("7");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 0;
		metodosGrid.gridy = 2;
		seteButton.setBackground(new Color(239, 244 , 249));

		add(seteButton, metodosGrid);

		oitoButton = new JButton("8");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 1;
		metodosGrid.gridy = 2;
		oitoButton.setBackground(new Color(239, 244 , 249));

		add(oitoButton, metodosGrid);

		noveButton = new JButton("9");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 2;
		metodosGrid.gridy = 2;
		noveButton.setBackground(new Color(239, 244 , 249));

		add(noveButton, metodosGrid);

		divisaoButton = new JButton("/");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 3;
		metodosGrid.gridy = 2;
		divisaoButton.setBackground(new Color(213, 224, 237));
			
		add(divisaoButton, metodosGrid);

		elevadoAoCuboButton = new JButton("X³");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 4;
		metodosGrid.gridy = 2;
		elevadoAoCuboButton.setBackground(new Color(213, 224, 237));	
		
		add(elevadoAoCuboButton, metodosGrid);

		quatroButton = new JButton("4");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 0;
		metodosGrid.gridy = 3;
		quatroButton.setBackground(new Color(239, 244 , 249));

		add(quatroButton, metodosGrid);

		cincoButton = new JButton("5");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 1;
		metodosGrid.gridy = 3;
		cincoButton.setBackground(new Color(239, 244 , 249));

		add(cincoButton, metodosGrid);

		seisButton = new JButton("6");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 2;
		metodosGrid.gridy = 3;
		seisButton.setBackground(new Color(239, 244 , 249));

		add(seisButton, metodosGrid);

		multiplicacaoButton = new JButton("*");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 3;
		metodosGrid.gridy = 3;
		multiplicacaoButton.setBackground(new Color(213, 224, 237));

		add(multiplicacaoButton, metodosGrid);

		umPorXButton = new JButton("1/X");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 4;
		metodosGrid.gridy = 3;
		umPorXButton.setBackground(new Color(213, 224, 237));
		
		add(umPorXButton, metodosGrid);

		umButton = new JButton("1");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 0;
		metodosGrid.gridy = 4;
		umButton.setBackground(new Color(239, 244 , 249));
		
		add(umButton, metodosGrid);

		doisButton = new JButton("2");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 1;
		metodosGrid.gridy = 4;
		doisButton.setBackground(new Color(239, 244 , 249));
		
		add(doisButton, metodosGrid);

		tresButton = new JButton("3");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 2;
		metodosGrid.gridy = 4;
		tresButton.setBackground(new Color(239, 244 , 249));
		
		add(tresButton, metodosGrid);

		subtracaoButton = new JButton("-");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 3;
		metodosGrid.gridy = 4;
		subtracaoButton.setBackground(new Color(213, 224, 237));
		
		add(subtracaoButton, metodosGrid);

		
		iqualButton = new JButton("=");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 4;
		metodosGrid.gridy = 4;
		metodosGrid.gridheight = 2;
		metodosGrid.gridwidth = 1;
		metodosGrid.ipady = 30;
		iqualButton.setBackground(new Color(213, 224, 237));
		
		add(iqualButton, metodosGrid);

		zeroButton = new JButton("0");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 0;
		metodosGrid.gridy = 5;
		metodosGrid.gridheight = 1;
		metodosGrid.gridwidth = 2;
		metodosGrid.ipady = 0;
		zeroButton.setBackground(new Color(239, 244 , 249));

		add(zeroButton, metodosGrid);

		metodosGrid.ipadx = 0;
		virgulaButton = new JButton(",");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 2;
		metodosGrid.gridy = 5;
		metodosGrid.gridwidth = 1;
		metodosGrid.gridheight = 1;
		virgulaButton.setBackground(new Color(239, 244 , 249));

		add(virgulaButton, metodosGrid);

		somaButton = new JButton("+");
		metodosGrid.fill = GridBagConstraints.HORIZONTAL;
		metodosGrid.gridx = 3;
		metodosGrid.gridy = 5;
		somaButton.setBackground(new Color(213, 224, 237));
		
		add(somaButton, metodosGrid);
		
		setVisible(true);
	}
}
