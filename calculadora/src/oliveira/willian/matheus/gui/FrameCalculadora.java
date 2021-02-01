package oliveira.willian.matheus.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import oliveira.willian.matheus.model.Calculadora;

public class FrameCalculadora {

	public void criarTela(){
		
		JFrame telaCalculadora = new JFrame();
		telaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCalculadora.setSize(300, 400);
		telaCalculadora.setTitle("Calculadora");
		telaCalculadora.setLayout(null);
		telaCalculadora.setLocationRelativeTo(null);
		
		JTextField textResultado = new JTextField();
		textResultado.setBounds(10, 10, 265, 40);
		
		
		JButton button0 = new JButton();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JButton button5 = new JButton();
		JButton button6 = new JButton();
		JButton button7 = new JButton();
		JButton button8 = new JButton();
		JButton button9 = new JButton();
		JButton buttonPonto = new JButton();
		JButton buttonIgual = new JButton();
		JButton buttonSoma = new JButton();
		JButton buttonSub = new JButton();
		JButton buttonDiv = new JButton();
		JButton buttonMult = new JButton();
		
		
		
		button0.setText("0");
		button0.setBounds(10, 225, 60, 40);
		buttonPonto.setText(".");
		buttonPonto.setBounds(80, 225, 60, 40);
		buttonIgual.setText("=");
		buttonIgual.setBounds(148, 225, 60, 40);
		buttonSoma.setText("+");
		buttonSoma.setBounds(215, 225, 60, 40);
		
		
		
		button1.setText("1");
		button1.setBounds(10, 175, 60, 40);
		button2.setText("2");
		button2.setBounds(80, 175, 60, 40);
		button3.setText("3");
		button3.setBounds(148, 175, 60, 40);
		buttonSub.setText("-");
		buttonSub.setBounds(215, 175, 60, 40);
		
		button4.setText("4");
		button4.setBounds(10, 125, 60, 40);
		button5.setText("5");
		button5.setBounds(80, 125, 60, 40);
		button6.setText("6");
		button6.setBounds(148, 125, 60, 40);
		buttonMult.setText("x");
		buttonMult.setBounds(215, 125, 60, 40);
		
		button7.setText("7");
		button7.setBounds(10, 75, 60, 40);
		button8.setText("8");
		button8.setBounds(80, 75, 60, 40);
		button9.setText("9");
		button9.setBounds(148, 75, 60, 40);
		buttonDiv.setText("/");
		buttonDiv.setBounds(215, 75, 60, 40);
		
		
		telaCalculadora.getContentPane().add(button0);
		telaCalculadora.getContentPane().add(button1);
		telaCalculadora.getContentPane().add(button2);
		telaCalculadora.getContentPane().add(button3);
		telaCalculadora.getContentPane().add(button4);
		telaCalculadora.getContentPane().add(button5);
		telaCalculadora.getContentPane().add(button6);
		telaCalculadora.getContentPane().add(button7);
		telaCalculadora.getContentPane().add(button8);
		telaCalculadora.getContentPane().add(button9);
		telaCalculadora.getContentPane().add(buttonPonto);
		telaCalculadora.getContentPane().add(buttonIgual);
		telaCalculadora.getContentPane().add(buttonSoma);
		telaCalculadora.getContentPane().add(buttonSub);
		telaCalculadora.getContentPane().add(buttonDiv);
		telaCalculadora.getContentPane().add(buttonMult);
		telaCalculadora.getContentPane().add(textResultado);
		
		telaCalculadora.setVisible(true);
		
		buttonSoma.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				Calculadora c = new Calculadora();
				textResultado.setText(String.valueOf(c.getResultado()));
				
			}
		});
	}
}
