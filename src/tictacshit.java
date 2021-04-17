import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tictacshit {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    private static String des;

    public static void main(String[] args) {
        Random rand = new Random();
        char[][] board = { { ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ' },
                { '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-' },
                { ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ' },
                { '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-' },
                { ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ' } };

        printGameboard(board);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Your Placement(1-9): ");
            int player = scan.nextInt();
            while (playerPositions.contains(player) || cpuPositions.contains(player)) {
                System.out.print("The Spot is taken pick another Position: ");
                player = scan.nextInt();
            }
            gamePiece(player, board, "Player");
            des = winChecker();
            if (des.length() > 0) {
                System.out.println(des);
                break;
            }

            int cpu = rand.nextInt(9) + 1;
            while (playerPositions.contains(cpu) || cpuPositions.contains(cpu)) {
                cpu = rand.nextInt(9) + 1;
            }
            gamePiece(cpu, board, "Cpu");
            printGameboard(board);
            des = winChecker();
            if (des.length() > 0) {
                System.out.println(des);
                break;
            }

        }

    }

    public static void printGameboard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void gamePiece(int place, char[][] board, String user) {

        char symbol = ' ';
        if (user.equals("Player")) {
            symbol = 'X';
            playerPositions.add(place);
        } else if (user.equals("Cpu")) {
            symbol = 'O';
            cpuPositions.add(place);
        }

        switch (place) {
        case 1:
            board[0][1] = symbol;
            break;
        case 2:
            board[0][5] = symbol;
            break;
        case 3:
            board[0][9] = symbol;
            break;
        case 4:
            board[2][1] = symbol;
            break;
        case 5:
            board[2][5] = symbol;
            break;
        case 6:
            board[2][9] = symbol;
            break;
        case 7:
            board[4][1] = symbol;
            break;
        case 8:
            board[4][5] = symbol;
            break;
        case 9:
            board[4][9] = symbol;
            break;
        default:
            break;
        }
    }

    public static String winChecker() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winCond = new ArrayList<List>();
        winCond.add(topRow);
        winCond.add(botRow);
        winCond.add(midRow);
        winCond.add(midCol);
        winCond.add(leftCol);
        winCond.add(rightCol);
        winCond.add(cross1);
        winCond.add(cross2);

        for (List l : winCond) {
            if (playerPositions.containsAll(l)) {
                return "You Win Fucker";
            } else if (cpuPositions.containsAll(l)) {
                return "You Stink :(";
            } else if (cpuPositions.size() + playerPositions.size() == 9) {
                return "Zapustit' snova";
            }
        }

        return "";
    }

}
