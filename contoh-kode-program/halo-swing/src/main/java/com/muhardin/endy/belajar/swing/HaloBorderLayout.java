package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class HaloBorderLayout {

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


		BorderLayout layout = new BorderLayout();
		fr.getContentPane().setLayout(layout);
		fr.getContentPane().add(btnOk1, BorderLayout.NORTH);
		fr.getContentPane().add(btnOk2, BorderLayout.SOUTH);
		fr.getContentPane().add(btnOk3, BorderLayout.WEST);
		fr.getContentPane().add(btnOk4, BorderLayout.EAST);
		fr.getContentPane().add(btnOk5, BorderLayout.CENTER);

		fr.setVisible(true);
	}

}