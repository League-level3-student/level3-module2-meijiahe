package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i=0;i<eggs.size();i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oysters) {
		for (int i=0;i<oysters.size();i++) {
			if (oysters.get(i)==true) {
				return i;
			}
		}
		return -1;
	}
	public static double findTallest(List<Double> peeps) {
		double big=Integer.MIN_VALUE;
		for (int i=0;i<peeps.size();i++) {
			if (peeps.get(i)>big) {
				big=peeps.get(i);
			
			}
		}
		return big;
	}
	public static String findLongestWord(List<String> w) {
		int longest = 0;
		String l = "";
		for (int i =0;i<w.size();i++) {
			if (w.get(i).length()>longest) {
				longest =w.get(i).length();
				l = w.get(i);
			}
		}
		return l;
	}
	
	public static boolean containsSOS (List<String> m) {
		if (m.contains("... --- ...")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static List<Double> sortScores (List<Double> results) {
		List<Double> out= new ArrayList<Double>();
		return out;
	}
	
}
