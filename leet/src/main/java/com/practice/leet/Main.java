package com.practice.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

interface A {
	default void methodA() {
		System.out.println("Default method A from A");
	}
}

interface B {
	default void methodB() {
		System.out.println("Default method B from B");
	}
}

interface C {
	default void methodC() {
		System.out.println("Default method C from C");
	}
}

public class Main implements A, B, C {
	@Override
	public void methodA() {
		System.out.println("Overridden method A in D");
	}

	public static void main(String[] args) {
//		Main obj = new Main();
//		obj.methodB();
//		obj.methodA();
//
//		LinkedList<String> list = new LinkedList<String>();
//		ArrayList<String> arrlist = new ArrayList<String>();
//		list.add(0, "sfs");
//		list.add(0, "Rohin");
//		System.out.println(list.toString());

		sortarr();
	}

	public static void sortarr() {

		String arr[] = { "namrata", "rohin", "jyot", "adarsh" };
		String temp = "";
		int arrsize[] = new int[arr.length];
		String returnarr[] = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arrsize[i] = arr[i].length();

		}

		Arrays.sort(arrsize);

	

		for (String a : returnarr) {
			System.out.println(a);
		}

	}
	// No need to override methodB() or methodC() if default implementations are
	// sufficient
}
