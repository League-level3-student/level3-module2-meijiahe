package _02_More_Algorithms;

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
	public static String findLongestWord(List<String> words) {
		
		return "ehdfjisoi";
	}
}
