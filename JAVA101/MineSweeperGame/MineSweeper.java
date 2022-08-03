import java.util.Scanner;;

public class MineSweeper{
    String[][] minedMap;
    String[][] game;
    int rowNumber;
    int columnNumber;
    int mineNumber;


    MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.minedMap = new String[rowNumber][columnNumber];
        this.game = new String[rowNumber][columnNumber];
        this.mineNumber = (rowNumber * columnNumber) / 4;

    }

    void showingMap() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(this.game[i][j] + " ");
            }
            System.out.println();
        }
    }

    void gameMap() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                this.game[i][j] = "-";
            }
        }
    }

    void minedMap() {

        for (int i = 0; i < mineNumber; i++) {
            int tempRow = (int) (Math.random() * rowNumber);
            int tempColumn = (int) (Math.random() * columnNumber);
            if (this.minedMap[tempRow][tempColumn] != "*") {
                this.minedMap[tempRow][tempColumn] = "*";
            } else {
                i--;
            }
        }

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                if (this.minedMap[i][j] != "*") {
                    this.minedMap[i][j] = "-";
                }
                System.out.print(this.minedMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void showingMinedMap() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(this.minedMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run() {
        int totalMove = (columnNumber * rowNumber) - mineNumber;
        Scanner inp = new Scanner(System.in);

        System.out.println("=== Welcome to Minesweeper Game ===");

        gameMap();
        minedMap();

        while (totalMove > 0) {
            int mineVision = 0;

            System.out.println("===================================");
            showingMap();
            System.out.print("Please enter a row number : ");
            int rowInput = inp.nextInt();

            System.out.print("Please enter a column number : ");
            int columnInput = inp.nextInt();

            if ((rowInput < 0 || rowInput >= rowNumber) || (columnInput < 0 || columnInput >= columnNumber)) {
                System.out.println("You have entered incorrectly. Please choose within limits!!!");
                continue;
            } else {
                if (this.minedMap[rowInput][columnInput] == "*") {
                    System.out.println("You stepped on a mine.Game over.");
                    showingMinedMap();
                    break;
                } else {
                    int minusRow = (rowInput-1), sumRow= (rowInput+1);
                    int minusColumn = (columnInput-1), sumColumn = (columnInput+1);

                    if ((minusRow < 0) || (minusColumn < 0)) {
                        minusRow = 0;
                        minusColumn = 0;
                    }

                    if ((sumRow >= columnNumber) || (sumColumn >= columnNumber)) {
                        sumRow = rowInput;
                        sumColumn = columnInput;
                    }

                    for (int i = minusRow; i <= sumRow; i++) {
                        for (int j = minusColumn; j <= sumColumn; j++) {
                            if (this.minedMap[i][j] == "*") {
                                mineVision++;
                            }
                        }
                    }
                    String convertMineVision = String.valueOf(mineVision);
                    this.game[rowInput][columnInput] = convertMineVision;
                    totalMove--;
                }
            }
        }

        if (totalMove == 0) {
            System.out.println("Congratulations. Win the game!!");
        }
    }
}