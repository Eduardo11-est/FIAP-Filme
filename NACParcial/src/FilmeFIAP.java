//Codigo Principal esta na classe Calculadora.


import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;




public class FilmeFIAP extends JFrame{
	
	public void init() {
		JTabbedPane abas = new JTabbedPane();
		
		
		JPanel panelCalculadora = new JPanel();
		JTextField textFieldNumero1 = new JTextField(10);
		JTextField textFieldNumero2 = new JTextField(10);
		JButton buttonSalvar = new JButton("Salvar");
		
		JPanel panel = new JPanel(new FlowLayout());
		JLabel Label = new MeuLabel("Titulo");
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 30));
		text.setBorder(BorderFactory.criar());
		JLabel Label2 = new MeuLabel("Sinopse");
		JTextArea descricao = new JTextArea();
		descricao.setColumns(30);
		descricao.setRows(2);
		descricao.setBorder(BorderFactory.criar());	
		JCheckBox CheckBox = new JCheckBox("Assistido");
		
	    MeuLabel JLabel4 = new MeuLabel("Onde Assistir");
		
		
		
		
		RadioGroup radioGroup = new RadioGroup(List.of("Netflix", "Prime Video", "Pirate Bay"));
		
		
		
		
		String[] cidades = {"Terror", "Drama", "Ação"};
		
		
		MeuLabel Genero = new MeuLabel("Gênero");
		MeuLabel JLabel3 = new MeuLabel("Avaliação");
		
	
		
		
		
		
		panelCalculadora.add(Label);
		panelCalculadora.add(textFieldNumero1);
		
		panelCalculadora.add(Label2);
		panelCalculadora.add(textFieldNumero2);
		
		
		panelCalculadora.add(Genero);
		panelCalculadora.add(new JComboBox<String>(cidades));
		
		panelCalculadora.add(JLabel4);
		panelCalculadora.add(radioGroup);
		
		panelCalculadora.add(CheckBox);
		panelCalculadora.add(buttonSalvar);
		panelCalculadora.add(new JButton("Cancelar"));
		
		
		
		panelCalculadora.add(JLabel3);
		panelCalculadora.add(new StarRater(5));
		panelCalculadora.add(new JLabel(new ImageIcon("src/HomemAranha.JPG")));
		
		
		
	    CalculadoraListener listener = new CalculadoraListener(textFieldNumero1, textFieldNumero2 );
		buttonSalvar.addActionListener(listener);
		textFieldNumero1.addMouseListener(listener);
		
		abas.add("Cadastro", panelCalculadora);
		abas.add("Lista", new JLabel("Desenvolvido Pelo Eduardo"));
		
		add(abas);
		
		setSize(600, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Calculadora().init();
		
	}

}
