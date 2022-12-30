import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static void rulesRegulations() {
        System.out.println("Tic Tac Toe Game");
        System.out.println("First player *");
        System.out.println("Second player 0");
        System.out.println("For every move click one number from 1 to 9" + " which is visible");
        System.out.println("Lets Start");
    }

    public static void main(String[] args) {
        rulesRegulations();

        // creating the TicTacBox
        char[][] box = new char[3][3];
        // initialize by 1 2 3 4 5
        char num = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                box[i][j] =  num++;
            }
        }

        int total = 0;  // to count total moves
        char turn;  // to check the button

        while (total < 9) {
            printBox(box);
            tellingTheDirection(total);
            turn = scan.next().charAt(0);

            { // putTheMove
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (box[i][j] == turn) if (total % 2 == 0) box[i][j] = '*';
                        else box[i][j] = '0';
                    }
                }
            }

            char check = checkWhoWin(box);
            if (check == 'a') {
                total++;
            } else if (check == '*') {
                System.out.println("Player 1 Win");
                break;
            } else if (check == '0') {
                System.out.println("Player 2 Win");
                break;
            }
        }

    }  // End of main Method

    static void tellingTheDirection(int total) {
        if (total % 2 == 0) System.out.println("Player 1 move");
        else System.out.println("Player 2 move");
    }

    static void printBox(char[][] box) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(box[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    static char checkWhoWin(char[][] box) {
        //____________________Row Wise
        if (box[0][0] == box[0][1] && box[0][0] == box[0][2]) {
            return box[0][0];
        } else if (box[1][0] == box[1][1] && box[0][0] == box[1][2]) {
            return box[1][0];
        } else if (box[2][0] == box[1][1] && box[2][0] == box[2][2]) {
            return box[2][0];
        }
        //____________________column Wise
        else if (box[0][0] == box[1][0] && box[0][0] == box[2][0]) {
            return box[0][0];
        } else if (box[0][1] == box[1][1] && box[0][1] == box[2][1]) {
            return box[0][1];
        } else if (box[0][2] == box[1][2] && box[0][2] == box[2][2]) {
            return box[0][2];
        }
        //____________________diagonal
        else if (box[0][0] == box[1][1] && box[0][0] == box[2][2]) {
            return box[0][0];
        } else if (box[0][2] == box[1][1] && box[0][0] == box[2][0]) {
            return box[0][2];
        } else
            return 'a';
    }
}