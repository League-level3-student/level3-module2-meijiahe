package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				return i;
			}
		}
		return -1;
	}

	public static double findTallest(List<Double> peeps) {
		double big = Integer.MIN_VALUE;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > big) {
				big = peeps.get(i);

			}
		}
		return big;
	}

	public static String findLongestWord(List<String> w) {
		int longest = 0;
		String l = "";
		for (int i = 0; i < w.size(); i++) {
			if (w.get(i).length() > longest) {
				longest = w.get(i).length();
				l = w.get(i);
			}
		}
		return l;
	}

	public static boolean containsSOS(List<String> m) {
		if (m.contains("... --- ...")) {
			return true;
		} else {
			return false;
		}
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean isorder = false;
		while (isorder == false) {
			isorder=true;
		for (int i = 1; i < results.size(); i++) {
			if (results.get(i) < results.get(i - 1)) {
				double num = results.get(i);
				results.set(i, results.get(i - 1));
				results.set(i - 1, num);
				isorder=false;
			}

		}
		}
		return results;
	}
	
	public static List<String> sortDNA (List<String> sortedSequences) {
		boolean isorder = false;
		while (isorder == false) {
			isorder=true;
		for (int i = 1; i < sortedSequences.size(); i++) {
			if (sortedSequences.get(i).length() < sortedSequences.get(i - 1).length()) {
				String num = sortedSequences.get(i);
				sortedSequences.set(i, sortedSequences.get(i - 1));
				sortedSequences.set(i - 1, num);
				isorder=false;
			}

		}
		}
		return sortedSequences;
	}
	public static List<String> sortWords (List<String> words){
		boolean isorder = false;
		while (isorder == false) {
			isorder=true;
			for (int i = 1; i < words.size(); i++) {
				if (words.get(i).compareTo(words.get(i - 1))<0) {
					String num = words.get(i);
					words.set(i, words.get(i - 1));
					words.set(i - 1, num);
					isorder=false;
				}

			}
		}
		return words;
	}
}
