package br.edu.empresa.gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {
	
	public void criarTela() {
		
		JFrame telaRetangulo = new JFrame();
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Usando para fechar da memoria a tela quando apertar no X 
		telaRetangulo.setSize(500, 300); // Define tamanho da tela
		telaRetangulo.setTitle("Cálculos com Retângulo"); // Nome na parte superior da tela
		telaRetangulo.setLayout(null); // Define layout nulo, onde vc define ele
		telaRetangulo.setLocationRelativeTo(null);
		
//		Criação de label/rotulo/etiqueta
		JLabel labelAltura = new JLabel(); 
		JLabel labelBase = new JLabel();
		labelAltura.setText("Altura:"); // Usado para definir o texto
		labelAltura.setBounds(10, 20, 80, 20); // Usado para colocar a posição e tamanho do label x, y, width, height
		labelBase.setText("Base");
		labelBase.setBounds(10, 55, 80, 20);
		telaRetangulo.getContentPane().add(labelAltura);  // Usado para colocar a label dentro do painel de conteudo
		telaRetangulo.getContentPane().add(labelBase);
		
//		labelAltura.setBorder(BorderFactory.createLineBorder(Color.black)); // TESTE para adicionar borda
		
		// Criação de field
		JTextField textAltura = new JTextField();
		JTextField textBase = new JTextField();
		textAltura.setBounds(70, 20, 100, 20);
		textBase.setBounds(70, 55, 100, 20);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(textBase);
		
		// Criar botão
		JButton  buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(10, 95, 160, 30);
		telaRetangulo.getContentPane().add(buttonCalcular);
		
		
		
		telaRetangulo.setVisible(true);
		buttonCalcular.addActionListener(new ActionListener() { // Clique da tela, para ler o botão
			
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r = new Retangulo();
				r.setAltura(Double.parseDouble(textAltura.getText())); // Pegar a String do container e converter em double
				r.setBase(Double.parseDouble(textBase.getText()));
				
				labelAltura.setText(String.valueOf(r.calcularArea())); // Colocar o valor do calcular nas label de altura e base
				labelBase.setText(String.valueOf(r.calcularPerimetro()));
			}
		});  
	}
}