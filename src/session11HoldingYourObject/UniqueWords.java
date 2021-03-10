package session11HoldingYourObject;

import java.util.Set;
import java.util.TreeSet;

import util.TextFile;

public class UniqueWords {

	public static void main(String[] args) {
		Set<String> words=new TreeSet<String>(new TextFile("src/util/TextFile.java","\\W+"));
		System.out.println(words);
	}

}
