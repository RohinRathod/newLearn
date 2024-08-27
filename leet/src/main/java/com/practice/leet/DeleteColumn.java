package com.practice.leet;

public class DeleteColumn {

	public static void main(String[] args) {
//		String[] strs = { "cba", "daf", "ghi" };
//
//		int totaldeletedColumn = minDeletionSize(strs);
//		System.out.println(totaldeletedColumn);

		String name = "leelee";
		String typed = "lleeelee";

		boolean flag = isLongPressedName(name, typed);

		System.out.println(flag);
	}

	public static boolean isLongPressedName(String name, String typed) {

		int inter = 1;
		int countvar = 0;
		int countss = 0;
		char temp = 0;

		if (name.charAt(0) != typed.charAt(0)) {
			return false;
		}

		if (name.length() > typed.length()) {
			return false;
		}

		for (int i = 1; i < name.length(); i++) {

			if (temp == name.charAt(i)) {
				countvar++;
			}

			temp = name.charAt(i);
			for (int j = inter; j < typed.length();) {

				if (name.charAt(i) == typed.charAt(j)) {
					inter++;
					if (i != name.length() - 1) {
						break;
					}
				} else if (name.charAt(i - 1) == typed.charAt(j)) {
					countss++;
					if (countss > countvar) {
						return false;
					}
					inter++;
					if (i != name.length() - 1) {
						i--;
						break;
					}
					i--;
				} else {
					return false;
				}
			}

			if (i != name.length() - 1 && inter == typed.length() - 1) {

				return false;
			}

		}

		return true;

	}

//	public static int minDeletionSize(String[] strs) {
//
//		int totaldelete = 0;
//		int iter = 0;
//		boolean incremented = false;
//
//		char latest = 0;
//		char previos = 0;
//		for (int i = 0; i < strs.length; i++) {
//			incremented = false;
//			for (int j = iter; j < strs[i].length();) {
//				System.out.print(strs[i].charAt(j));
//
//				if (i == 0) {
//					latest = strs[i].charAt(j);
//					break;
//				}
//				latest = strs[i].charAt(j);
//				if (i == strs.length - 1) {
//					i = -1;
//					iter++;
//					incremented = true;
//				}
//
//				if (previos > latest) {
//					if (!incremented) {
//						i = -1;
//						iter++;
//					}
//					totaldelete = totaldelete + 1;
//					break;
//				}
//
//				break;
//			}
//
//			if (i == strs.length - 1 && iter == strs[i].length() - 1) {
//				return totaldelete;
//			}
//
//			previos = latest;
//
//			System.out.println();
//		}
//		return totaldelete;
//
//	}

	public static int minDeletionSize(String[] strs) {
		int totalDelete = 0;
		int numRows = strs.length;
		int numCols = strs[0].length();

		for (int col = 0; col < numCols; col++) {
			for (int row = 1; row < numRows; row++) {
				if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
					totalDelete++;
					break;
				}
			}
		}

		return totalDelete;
	}

}
