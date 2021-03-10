package session11HoldingYourObject;
//Producing an alphabetic listing.
import java.util.*;

import util.TextFile;

public class UniqueWordsAlphabetic {

	public static void main(String[] args) {
		Set<String> words=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("src/util/TextFile.java","\\W+"));
		System.out.println(words);
	}

}
