package com.practice.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution extends Exception {
	public Solution(String string) {
		super(string);
	}

	public static void main(String[] args) throws Solution {
//		String[] words = { "bella", "label", "roller" };
//
//		Solution obj = new Solution();
//		// obj.commonChars(words);
//
//		obj.commonCharswithArr(words);

//		HashSet<String> set = new HashSet<String>();
//
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		set.add("s");
//		set.add("q");
//
//		ArrayList<String> listobj = new ArrayList<>();
//		listobj.add("Apple");
//		listobj.add("Banana");
//		listobj.add("Peru");
//
//		System.out.println(listobj.get(0));
//
//		List<String> linklist = new LinkedList<>();
//		linklist.add("Green");
//		linklist.add("Blue");
//
//		System.out.println(linklist.get(1));
//
//		linklist.add(0, "white");
//		linklist.remove(0);
//		map.put("present", 2);
//		int[] arr = new arr(); 
//			{ 3, 2, 4 };
//
//		System.out.println(linklist.toString());
//		System.out.println(map.toString());
//
//		System.out.println(arr.toString());

//
//		listobj.addAll(set);
//
//		System.out.println(listobj.size());
//		System.out.println(listobj.toString());
//
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			throw new Solution("ss");
		}
	}

	public static void main() throws Solution {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			throw new Solution("Division by zero error");
		}

	}

	public void commonCharswithArr(String[] words) {

		int[] as = new int[26];

		for (int i = 0; i < words[0].length(); i++) {

			as[words[0].charAt(i) - 'a'] += 1;

		}

		for (int i = 1; i < words.length; i++) {

			int[] cur = new int[26];
			for (int j = 0; j < words[i].length(); j++) {
				cur[words[i].charAt(j) - 'a'] += 1;
			}

			for (int j = 0; j < words[i].length(); j++) {
				if (as[j] != cur[j]) {
					as[j] = as[j] - 1;
				} else if (as[j] < cur[j]) {
					as[j] = cur[j] - as[j];
				}
			}
		}

		for (int j = 0; j < 26; j++) {

			if (as[j] != 0) {
				char s = (char) (j + 97);
				System.out.println(s);
			}
		}

	}

	public List<String> commonChars(String[] words) {

		String temp = "";

		List<String> returnlist = new ArrayList<String>();

		if (words.length - 1 < 1) {

			for (char ch : words[0].toCharArray()) {
				returnlist.add(String.valueOf(ch));
			}
			return returnlist;

		}

		for (int i = 1; i < words.length; i++) {
			temp = "";
			returnlist.clear();
			for (int j = 0; j < words[i].length(); j++) {

				if (words[i - 1].indexOf(words[i].charAt(j)) != -1) {
					int indexToRemove = words[i - 1].indexOf(words[i].charAt(j));
					String newStringss = words[i - 1].substring(0, indexToRemove)
							+ words[i - 1].substring(indexToRemove + 1);
					words[i - 1] = newStringss;

					temp += words[i].charAt(j);
					returnlist.add(String.valueOf(words[i].charAt(j)));
				}

			}

			words[i] = temp;
		}

		return returnlist;
	}

}