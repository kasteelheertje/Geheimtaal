package geheim.me;

import javax.swing.JOptionPane;

public class TranslateTo {
	public static void trenslate() {
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
		JOptionPane.showMessageDialog(null,
				"The message you want to send is in the console.", "the title",
				JOptionPane.PLAIN_MESSAGE);
		System.out.println(stringetje);
	}

}
