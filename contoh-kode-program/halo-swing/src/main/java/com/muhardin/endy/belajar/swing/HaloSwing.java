package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;

public class HaloSwing {

	public static void main(String[] x){
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Halo Swing");
		fr.setSize(400,300);
		fr.setLocationRelativeTo(null);

		JButton btnOk = new JButton("Ok");
		fr.getContentPane().add(btnOk);

		fr.setVisible(true);
	}

}