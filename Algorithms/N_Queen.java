package Algorithms;

import java.util.Scanner;

public class N_Queen {

    public static boolean isSafe(char[][] Board, int row, int col, int n){
        int i,j;

        for(i=0;i<col;i++){
            if(Board[row][i]=='Q'){
                return false;
            }
        }
        for(i=row,j=col;i>0&&j>0;i--,j--){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        for(i=row,j=col;i<n && j>0;i++,j--){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean solveNQueens(char[][] Board, int col, int n){
        if(col>=n){
            return true;
        }
        for(int i=0;i<n;i++){
            if(isSafe(Board,i,col,n)){
                Board[i][col]='Q';
                if(solveNQueens(Board,col+1,n)){
                    return true;
                }
                Board[i][col]='-';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the board size (N): ");
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        if (solveNQueens(board, 0, n)) {
            System.out.println("Solution found:");
            printSolution(board, n);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static void printSolution(char[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
