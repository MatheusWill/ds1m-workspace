package br.edu.empresa.gui;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

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
		labelAltura.setText("Altura:"); // Usado para definir o texto
		labelAltura.setBounds(10, 20, 80, 20); // Usado para colocar a posição e tamanho do label x, y, width, height
		telaRetangulo.getContentPane().add(labelAltura);  // Usado para colocar a label dentro do painel de conteudo
		JLabel labelBase = new JLabel();
		labelBase.setText("Base:");
		labelBase.setBounds(10, 55, 80, 20);
		telaRetangulo.getContentPane().add(labelBase);
		JLabel labelArea = new JLabel();
		labelArea.setText("Área:");
		labelArea.setBounds(220, 20, 80, 20);
		telaRetangulo.getContentPane().add(labelArea);
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Perímetro:");
		labelPerimetro.setBounds(220, 55, 80, 20);
		telaRetangulo.getContentPane().add(labelPerimetro);
		JLabel labelResultadoArea = new JLabel();
		labelResultadoArea.setBounds(320, 20, 80, 20);
		telaRetangulo.getContentPane().add(labelResultadoArea);
		JLabel labelResultadoPerimetro = new JLabel();
		labelResultadoPerimetro.setBounds(320, 55, 80, 20);
		telaRetangulo.getContentPane().add(labelResultadoPerimetro);		
		labelResultadoArea.setBorder(BorderFactory.createLineBorder(Color.black));
		labelResultadoPerimetro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		labelResultadoArea.setHorizontalAlignment(SwingConstants.CENTER);
		labelResultadoPerimetro.setHorizontalAlignment(SwingConstants.CENTER);
		
		
//		labelAltura.setBorder(BorderFactory.createLineBorder(Color.black)); // TESTE para adicionar borda
//		label.setHorizontalTextPosition(SwingConstants.CENTER); // TESTE para centralizar o texto		
		

		// Criação de field
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 20, 100, 20);
		telaRetangulo.getContentPane().add(textAltura);
		JTextField textBase = new JTextField();
		textBase.setBounds(70, 55, 100, 20);
		telaRetangulo.getContentPane().add(textBase);
		
		// Criar botão
		JButton  buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(10, 95, 160, 30);
		telaRetangulo.getContentPane().add(buttonCalcular);
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(10, 135, 160, 30);
		telaRetangulo.getContentPane().add(buttonLimpar);
		
		
		telaRetangulo.setVisible(true);
		
		buttonCalcular.addActionListener(new ActionListener() { // Clique da tela, para ler o botão
			
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r = new Retangulo();
				r.setAltura(Double.parseDouble(textAltura.getText())); // Pegar a String do container e converter em double
				r.setBase(Double.parseDouble(textBase.getText()));
				
				labelResultadoArea.setText(String.valueOf(r.calcularArea())); 
				labelResultadoPerimetro.setText(String.valueOf(r.calcularPerimetro()));
				
			}
		}); 
		buttonLimpar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				labelResultadoArea.setText("");
				labelResultadoPerimetro.setText("");
				textAltura.setText("");
				textBase.setText("");
			}
		});
		
		
		
		
/*		labelPerimetro.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) { //solto
				
			}
			
			public void mousePressed(MouseEvent e) { // pressionado
				
			}
			
			public void mouseExited(MouseEvent e) {	// retirar o mouse do elemento
				
			}
			
			public void mouseEntered(MouseEvent e) { // aplicar quando encostar o mouse
				JOptionPane.showMessageDialog(null, "Salve!!");
			}
			
			public void mouseClicked(MouseEvent e) {
				
			}
		}); */
	}
}