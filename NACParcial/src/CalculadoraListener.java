//Complemento do Classe Calculadora

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CalculadoraListener implements ActionListener, MouseListener {
	
	private JTextField txtNumero1;
	private JTextField txtNumero2;


	public CalculadoraListener(JTextField txtNumero1, JTextField txtNumero2) {
		this.txtNumero1 = txtNumero1;
		this.txtNumero2 = txtNumero2;
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String numero1 = String.valueOf( txtNumero1.getText());
		String numero2 = String.valueOf( txtNumero2.getText());
		String soma = numero1;
		String salvo = numero1;
        String salvo1 = numero2;
		
		
		
		JOptionPane.showMessageDialog(null, "Soma vale" + soma);
		System.out.println(numero1);
        System.out.println(numero2);
        
        
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("mouse in");
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		//System.out.println("mouse out");
		
	}

}
