package fr.hamza;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CodeCracker {
    public static HashMap<String, String> code = new HashMap<>();

	public static String manipulerMot(String word, boolean isDecryption) {
		fillCode();
		String result = "";
		List<String> lettresArray = Arrays.asList(word.split(""));
		for (String lettre : lettresArray) {
			if (isDecryption) {
				for (String i : code.keySet()) {
					if (code.get(i).equals(lettre)) {
						result += i;
					}
				}
			} else {
				result += code.get(lettre);
			}
		}

		return result;
	}

	public static void fillCode() {
		code.put("a", "!");
		code.put("b", ")");
		code.put("c", "\"");
		code.put("d", "(");
		code.put("e", "£");
		code.put("f", "!");
		code.put("g", "%");
		code.put("h", "&");
		code.put("i", ">");
		code.put("j", "<");
		code.put("k", "@");
		code.put("l", "a");
		code.put("m", "b");
		code.put("n", "c");
		code.put("o", "d");
		code.put("p", "e");
		code.put("q", "f");
		code.put("r", "g");
		code.put("s", "h");
		code.put("t", "i");
		code.put("u", "j");
		code.put("v", "k");
		code.put("w", "l");
		code.put("x", "m");
		code.put("y", "n");
		code.put("z", "o");
	}

}
