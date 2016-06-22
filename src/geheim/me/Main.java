package geheim.me;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class Main {
	public static void main(String args[]) {
		TranslateFrom translatefrom = new TranslateFrom();
		TranslateTo translateto = new TranslateTo();
		String fn = JOptionPane
				.showInputDialog("Do you want to send or receive a message?");
		if (fn.equalsIgnoreCase("send")) {
			TranslateTo.trenslate();
		} else if (fn.equalsIgnoreCase("receive")) {
			TranslateFrom.trenslate2();
		} else if (!fn.equalsIgnoreCase("send") || !fn.equalsIgnoreCase("receive")) {
			JOptionPane.showInputDialog("Please enter send or receive");
		}
	}
}

