package TicTakToe;

import java.util.Scanner;

public class Game
{
    Game()
    {
        System.out.println("TicTacToe is ready to Run ");
    }
    public static void Run()
    {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                board[i][j] = ' ';
            }
        }

        char player = 'X' ;
        boolean gameover = false;
        Scanner scanner = new Scanner(System.in);
        int turn = 0;

        while (!gameover)
        {
            printBoard(board);
            if(turn >= 3 * 3)
            {
                System.out.println("Board is FUll");
                break;
            }
            if(turn == 0)
            {
                System.out.println("In Order places 'X' or 'O'  use rows and columns as Position point");
                System.out.println("row and columns must be within [0][0] To [2][2]");
            }
            System.out.println("Player - "+player+" Turn");
            System.out.print("row    - ");
            int row = scanner.nextInt();
            System.out.print("Column - ");
            int col = scanner.nextInt();
            boolean reTrycheck = false;

            if(isCorrect(row,col,board,player))
            {
                board[row][col] = player;
                reTrycheck = true;
                turn += 1;
            }
            else
            {
                player = player == 'X' ? 'O' : 'X';
            }

            if(reTrycheck)
            {
                gameover = winCheck(row,col,board,player);
            }

            player = player == 'X' ? 'O' : 'X';
        }
    }

    private static boolean winCheck(int row, int col, char[][] board, char player)
    {
        if(board[1][1] == player)
        {
            if(board[1][0] == player && board[1][2] == player)
            {
                printBoard(board);
                System.out.println(" %  "+player+"  % is the %  Winner %");
                return true;
            }
            if(board[0][1] == player && board[2][1] == player)
            {
                printBoard(board);
                System.out.println(" %  "+player+"  % is the %  Winner %");
                return true;
            }
            if(board[0][0] == player && board[2][2] == player)
            {
                printBoard(board);
                System.out.println(" %  "+player+"  % is the %  Winner %");
                return true;
            }
            if(board[0][2] == player && board[2][0] == player)
            {
                printBoard(board);
                System.out.println(" %  "+player+"  % is the %  Winner %");
                return true;
            }

        }
        if(board[1][0] == player)
        {
            if(board[0][0] == player && board[2][0] == player)
            {
                printBoard(board);
                System.out.println(" %  "+player+"  % is the %  Winner %");
                return true;
            }
        }
        if(board[0][1] == player)
        {
            if(board[0][0] == player && board[0][2] == player)
            {
                printBoard(board);
                System.out.println(" %  "+player+"  % is the %  Winner %");
                return true;
            }
        }
        if(board[1][2] == player)
        {
            if(board[0][2] == player && board[2][2] == player)
            {
                printBoard(board);
                System.out.println(" %  "+player+"  % is the %  Winner %");
                return true;
            }
        }
        if(board[2][1] == player)
        {
            if(board[2][0] == player && board[2][2] == player)
            {
                printBoard(board);
                System.out.println(" %  "+player+"  % is the %  Winner %");
                return true;
            }
        }
        return false;
    }

    private static boolean isCorrect(int row, int col,char[][] board, char cat)
    {
        if(row >= board.length|| col >= board[0].length|| col < 0 || row < 0)
        {
            System.out.println("Position of "+cat+" is out of bond");
            System.out.println("row and columns must be within [0][0] To [2][2]");
            return false;
        }
        if(board[row][col] != ' ')
        {
            System.out.println("This Position is already taken By "+cat);
            return false;
        }
        return true;
    }

    private static void printBoard(char[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                System.out.print("[ "+board[i][j]+" ]");
            }
            System.out.println();
        }
    }
}
