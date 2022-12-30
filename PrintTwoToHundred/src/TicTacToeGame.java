import java.util.Scanner;

public class TicTacToeGame {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Some print
        {
            System.out.println("\n\n________Some Rules To Play________");
            System.out.println("To give your move Choose any digit(1-9) that is visible \n");
            System.out.println("' * ' -> for player 1");
            System.out.println("' 0 ' -> for player 2");
            System.out.print("\nLets play?\nPress 'enter' to play ");
            sc.nextLine();
        }

        //Playing board
        char[][] playingBoard = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

        //Loop
        int n = 9, flag = 0;
        while (n != 0) {

            //Which player turn
            if (n % 2 != 0)
                System.out.println("\nPlayer 1's turn!");
            else
                System.out.println("\nPlayer 2's turn!");

            //Showing playing board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++)
                    System.out.print(playingBoard[i][j] + " ");
                System.out.println();
            }

            //Taking choice from player
            char x = sc.next().charAt(0);

            //Replace digit(1-9) by */0
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (playingBoard[i][j] == x) {
                        if (n % 2 != 0) playingBoard[i][j] = '*';
                        else playingBoard[i][j] = '0';
                    }

            //Result check
            {

                //Case 1:
                int p1 = 0, p2 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == j) {
                            if (playingBoard[i][j] == '*') p1++;
                            else if (playingBoard[i][j] == '0') p2++;
                        }
                    }
                }
                if (p1 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                } else if (p2 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                }

                //Case 2:
                p1 = 0;
                p2 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (j == (3 - i - 1)) {
                            if (playingBoard[i][j] == '*') p1++;
                            else if (playingBoard[i][j] == '0') p2++;
                        }
                    }
                }
                if (p1 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                } else if (p2 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                }

                //Case 3:
                p1 = 0;
                p2 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 0) {
                            if (playingBoard[i][j] == '*') p1++;
                            else if (playingBoard[i][j] == '0') p2++;
                        }
                    }
                }
                if (p1 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                } else if (p2 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                }

                //Case 4:
                p1 = 0;
                p2 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (j == 0) {
                            if (playingBoard[i][j] == '*') p1++;
                            else if (playingBoard[i][j] == '0') p2++;
                        }
                    }
                }
                if (p1 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                } else if (p2 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                }

                //Case 5:
                p1 = 0;
                p2 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 1) {
                            if (playingBoard[i][j] == '*') p1++;
                            else if (playingBoard[i][j] == '0') p2++;
                        }
                    }
                }
                if (p1 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                } else if (p2 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                }

                //Case 6:
                p1 = 0;
                p2 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (j == 1) {
                            if (playingBoard[i][j] == '*') p1++;
                            else if (playingBoard[i][j] == '0') p2++;
                        }
                    }
                }
                if (p1 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                } else if (p2 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                }

                //Case 7:
                p1 = 0;
                p2 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 2) {
                            if (playingBoard[i][j] == '*') p1++;
                            else if (playingBoard[i][j] == '0') p2++;
                        }
                    }
                }
                if (p1 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                } else if (p2 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                }

                //Case 8:
                p1 = 0;
                p2 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (j == 2) {
                            if (playingBoard[i][j] == '*') p1++;
                            else if (playingBoard[i][j] == '0') p2++;
                        }
                    }
                }
                if (p1 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                } else if (p2 == 3) {
                    System.out.println("Player 1 won!");
                    flag = 1;
                    break;
                }

            }
            n--;
        }

        if (flag == 0) System.out.println("No one are won!");
    }
}
