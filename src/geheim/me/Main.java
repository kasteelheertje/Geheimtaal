package geheim.me;

import java.util.Scanner;


import javax.swing.JOptionPane;

public class Main {
	public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			String fn = JOptionPane.showInputDialog("Do you want to send or receive a message?");
			if (fn.equalsIgnoreCase("send")) {
			String stringetje = JOptionPane.showInputDialog("Enter message here:");
			stringetje = stringetje.replaceAll("a", "12254");
			stringetje = stringetje.replaceAll("b", "23456");
			stringetje = stringetje.replaceAll("c", "17523");
			stringetje = stringetje.replaceAll("d", "77885");
			stringetje = stringetje.replaceAll("e", "22584");
			stringetje = stringetje.replaceAll("f", "51276");
			stringetje = stringetje.replaceAll("g", "43214");
			stringetje = stringetje.replaceAll("h", "65984");
			stringetje = stringetje.replaceAll("i", "12447");
			stringetje = stringetje.replaceAll("j", "09530");
			stringetje = stringetje.replaceAll("k", "00923");
			stringetje = stringetje.replaceAll("l", "32453");
			stringetje = stringetje.replaceAll("m", "56432");
			stringetje = stringetje.replaceAll("n", "27532");
			stringetje = stringetje.replaceAll("o", "43289");
			stringetje = stringetje.replaceAll("p", "03412");
			stringetje = stringetje.replaceAll("q", "23453");
			stringetje = stringetje.replaceAll("r", "34563");
			stringetje = stringetje.replaceAll("s", "12312");
			stringetje = stringetje.replaceAll("t", "56754");
			stringetje = stringetje.replaceAll("u", "66234");
			stringetje = stringetje.replaceAll("v", "21233");
			stringetje = stringetje.replaceAll("w", "13456");
			stringetje = stringetje.replaceAll("x", "89764");
			stringetje = stringetje.replaceAll("y", "47796");
			stringetje = stringetje.replaceAll("z", "35689");
			stringetje = stringetje.replaceAll(" ", "95678");
			JOptionPane.showMessageDialog(null, "The message you want to send is in the console." , "the title", JOptionPane.PLAIN_MESSAGE);
			System.out.println(stringetje);
			} else if (fn.equalsIgnoreCase("receive")) {
				String stringetje = JOptionPane.showInputDialog("Enter message here:");
				stringetje = stringetje.replaceAll("12254", "a");
				stringetje = stringetje.replaceAll("23456", "b");
				stringetje = stringetje.replaceAll("17523", "c");
				stringetje = stringetje.replaceAll("77885", "d");
				stringetje = stringetje.replaceAll("22584", "e");
				stringetje = stringetje.replaceAll("51276", "f");
				stringetje = stringetje.replaceAll("43214", "g");
				stringetje = stringetje.replaceAll("65984", "h");
				stringetje = stringetje.replaceAll("12447", "i");
				stringetje = stringetje.replaceAll("09530", "j");
				stringetje = stringetje.replaceAll("00923", "k");
				stringetje = stringetje.replaceAll("32453", "l");
				stringetje = stringetje.replaceAll("56432", "m");
				stringetje = stringetje.replaceAll("27532", "n");
				stringetje = stringetje.replaceAll("43289", "o");
				stringetje = stringetje.replaceAll("03412", "p");
				stringetje = stringetje.replaceAll("23453", "q");
				stringetje = stringetje.replaceAll("34563", "r");
				stringetje = stringetje.replaceAll("12312", "s");
				stringetje = stringetje.replaceAll("56754", "t");
				stringetje = stringetje.replaceAll("66234", "u");
				stringetje = stringetje.replaceAll("21233", "v");
				stringetje = stringetje.replaceAll("13456", "w");
				stringetje = stringetje.replaceAll("89764", "x");
				stringetje = stringetje.replaceAll("47796", "y");
				stringetje = stringetje.replaceAll("35689", "z");
				stringetje = stringetje.replaceAll("95678", " ");
				JOptionPane.showMessageDialog(null, "The message you received is: " + stringetje, "Message received", JOptionPane.PLAIN_MESSAGE);
			}
			}

		

	}

