package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regdemo {
	public static void main(String[] args) {
		String reg = "[a-z][0-9]+[a-z]";
		Pattern pattern = Pattern.compile(reg);
		
		Matcher matcher = pattern.matcher("a1a");
		boolean match = matcher.find();
		if(match)
			System.out.print("Match found");
		else {
			System.out.print("Match not found");
		}
	}
}
