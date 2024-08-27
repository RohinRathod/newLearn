package com.practice.leet;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		NQueens solver = new NQueens();
		List<List<String>> solutions = solver.solveNQueens(4);
		for (List<String> solution : solutions) {
			for (String row : solution) {
				System.out.println(row);
			}
			System.out.println();
		}
	}

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> solutions = new ArrayList<>();
		char[][] board = new char[n][n];

		// Initialize the board with '.'
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}//PURE BOARD PE . DAAL DIYA

		solve(solutions, board, 0, n);
		return solutions;
	}

	private void solve(List<List<String>> solutions, char[][] board, int row, int n) {
	//n number for given row our done row  ka na
		if (row == n) {
			solutions.add(constructSolution(board, n));
			return;
		}

		for (int col = 0; col < n; col++) {
			if (isSafe(board, row, col, n)) {
				board[row][col] = 'Q';
				solve(solutions, board, row + 1, n);
				board[row][col] = '.';
			}
		}
	}

	private boolean isSafe(char[][] board, int row, int col, int n) {
		// Check column
		for (int i = 0; i < row; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}

		// Check upper left diagonal
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}

		// Check upper right diagonal
		for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}

		return true;
	}

	private List<String> constructSolution(char[][] board, int n) {
		List<String> solution = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			solution.add(new String(board[i]));
		}
		return solution;
	}
}
