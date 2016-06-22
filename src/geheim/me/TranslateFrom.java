package geheim.me;

import javax.swing.JOptionPane;

public class TranslateFrom {
	public static void trenslate2() {
		String stringetje = JOptionPane.showInputDialog("Enter message here:");
		stringetje = stringetje.replaceAll("58724", "au");
		stringetje = stringetje.replaceAll("16234", "ch");
		stringetje = stringetje.replaceAll("42052", "oe");
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
		JOptionPane.showMessageDialog(null, "The message you received is: "
				+ stringetje, "Message received", JOptionPane.PLAIN_MESSAGE);
	}

}
