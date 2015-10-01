package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class HaloFlowLayout {

	public static void main(String[] x){
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Halo Swing");
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

		fr.setVisible(true);
	}

}