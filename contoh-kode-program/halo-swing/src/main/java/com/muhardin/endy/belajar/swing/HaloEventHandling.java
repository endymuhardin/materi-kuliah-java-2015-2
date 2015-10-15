package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HaloEventHandling {

	public static void main(String[] x){
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Halo Event Handling");
		fr.setSize(400,300);
		fr.setLocationRelativeTo(null);

		JButton btnOk1 = new JButton("Satu");
		JButton btnOk2 = new JButton("2");
		JButton btnOk3 = new JButton("Tombol 3");
		JButton btnOk4 = new JButton("IV");
		JButton btnOk5 = new JButton("Tombol Nomer Lima");


		FlowLayout layout = new FlowLayout();
		fr.getContentPane().setLayout(layout);
		fr.getContentPane().add(btnOk1);
		fr.getContentPane().add(btnOk2);
		fr.getContentPane().add(btnOk3);
		fr.getContentPane().add(btnOk4);
		fr.getContentPane().add(btnOk5);

		// registrasi event handler
		EventHandlerKu e = new EventHandlerKu();
		btnOk1.addActionListener(e);
		btnOk2.addActionListener(e);

		EventMousePadaButton em = new EventMousePadaButton();
		btnOk3.addMouseListener(em);

		fr.setVisible(true);
	}

	static class EventHandlerKu implements ActionListener {

		public void actionPerformed(ActionEvent e){
			System.out.println("Terjadi event");
			Object sumber = e.getSource();
			JButton tombolYangDiklik = (JButton) sumber;
			String tulisan = tombolYangDiklik.getText();
			System.out.println("Tombol "+tulisan+" diklik");
		}

	}

	static class EventMousePadaButton implements MouseListener {
		public void mouseClicked(MouseEvent e){
			System.out.println("Mouse diklik");
			System.out.println("Tombol yang ditekan : "+e.getButton());
			System.out.println("Jumlah klik : "+e.getClickCount());
			System.out.println("Posisi kursor - X : "+e.getX()+", Y : "+e.getY());
		}
		public void mousePressed(MouseEvent e){
			System.out.println("Tombol mouse ditekan");
		}
		public void mouseReleased(MouseEvent e){
			System.out.println("Tombol mouse dilepas");
		}
		public void mouseEntered(MouseEvent e){
			System.out.println("Pointer mouse mengenai komponen");
		}
		public void mouseExited(MouseEvent e){
			System.out.println("Pointer mouse meninggalkan komponen");
		}
	}

}