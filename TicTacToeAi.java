import java.util.*;
public class TicTacToeAi {
    static int countBoardForGameEnd;
    void initialBoard(String[][] gameBoard){

        System.out.println("|  0   |   1  |  2   | ");
        for(int i=0; i<3; i++){
            System.out.println("---------------------------");
            for(int j=0; j<3; j++){
                gameBoard[i][j]="|  -   ";
                System.out.print(gameBoard[i][j]);
            }System.out.println( "|  "+i);
        }System.out.println("---------------------------");
    }
    //empty space for x
    boolean checkEmptyForX1(int row,int col,String[][] gameBoard){
        if(row>=3||col>=3){
            System.out.println("enter valid choice");
            return true;
        }if((gameBoard[row][col]!="|  X   ")&&(gameBoard[row][col]!="|  O   ")){
            gameBoard[row][col]="|  X   ";
            return false;
        }else {
            System.out.println("enter valid choice");
        }
        return true;
    }
    //empty space for o
    boolean checkEmptyForO1(int row,int col,String[][] gameBoard){
        if((gameBoard[row][col]!="|  X   ")&&(gameBoard[row][col]!="|  O   ")){
            gameBoard[row][col]="|  O   ";
            return false;
        }
        return true;
    }

    //for winning check empty space
    boolean checkEmptyForO(int row,int col,String[][] gameBoard){
        if((gameBoard[row][col]!="|  X   ")&&(gameBoard[row][col]!="|  O   ")){
            System.out.println("enter row(horizontal line) : "+row);
            System.out.println("enter col(vertical line) : "+col);
            gameBoard[row][col]="|  O   ";
            return true;
        }
        return false;
    }
    // for player to lose check empty space
    boolean checkEmptyForX(int row,int col,String[][] gameBoard){
       if((gameBoard[row][col]!="|  X   ")&&(gameBoard[row][col]!="|  O   ")){
            System.out.println("enter row(horizontal line) : "+row);
            System.out.println("enter col(vertical line) : "+col);
            gameBoard[row][col]="|  O   ";
            return true;
        }
        return false;
    }
    //is player  winning in dia
    boolean playerWinChanceDiagonal(String[][] gameBoard){
        //diagonal check
        if(gameBoard[0][0].equals("|  X   ")&&gameBoard[1][1].equals("|  X   ")){
           if(checkEmptyForX(2,2,gameBoard)){
               return true;
        }
       }
        if(gameBoard[0][0].equals("|  X   ")&&gameBoard[2][2].equals("|  X   ")){
            if(checkEmptyForX(1,1,gameBoard)){
                return true;
            }
        }if(gameBoard[1][1].equals("|  X   ")&&gameBoard[2][2].equals("|  X   ")){
            if(checkEmptyForX(0,0,gameBoard)){
                return true;
            }
        }if(gameBoard[0][2].equals("|  X   ")&&gameBoard[1][1].equals("|  X   ")){
            if(checkEmptyForX(2,0,gameBoard)){
                return true;
            }
        }if(gameBoard[2][0].equals("|  X   ")&&gameBoard[1][1].equals("|  X   ")){
            if(checkEmptyForX(0,2,gameBoard)){
                return true;
            }
        }if(gameBoard[2][0].equals("|  X   ")&&gameBoard[0][2].equals("|  X   ")){
            if(checkEmptyForX(1,1,gameBoard)){
                return true;
            }
        }
        return false;
    }
    //is player  winning in row
    boolean playerWinChanceRow(String[][] gameBoard){
        //diagonal check
        if(gameBoard[0][0].equals("|  X   ")&&gameBoard[0][1].equals("|  X   ")){
            if(checkEmptyForX(0,2,gameBoard)){
                return true;
            }
        }
        if(gameBoard[0][0].equals("|  X   ")&&gameBoard[0][2].equals("|  X   ")){
            if(checkEmptyForX(0,1,gameBoard)){
                return true;
            }
        }if(gameBoard[0][1].equals("|  X   ")&&gameBoard[0][2].equals("|  X   ")){
            if(checkEmptyForX(0,0,gameBoard)){
                return true;
            }
        }if(gameBoard[1][0].equals("|  X   ")&&gameBoard[1][1].equals("|  X   ")){
            if(checkEmptyForX(1,2,gameBoard)){
                return true;
            }
        }if(gameBoard[1][0].equals("|  X   ")&&gameBoard[1][2].equals("|  X   ")){
            if(checkEmptyForX(1,1,gameBoard)){
                return true;
            }
        }if(gameBoard[1][1].equals("|  X   ")&&gameBoard[1][2].equals("|  X   ")){
            if(checkEmptyForX(1,0,gameBoard)){
                return true;
            }
        }if(gameBoard[2][0].equals("|  X   ")&&gameBoard[2][1].equals("|  X   ")){
            if(checkEmptyForX(2,2,gameBoard)){
                return true;
            }
        }if(gameBoard[2][0].equals("|  X   ")&&gameBoard[2][2].equals("|  X   ")){
            if(checkEmptyForX(2,1,gameBoard)){
                return true;
            }
        }if(gameBoard[2][1].equals("|  X   ")&&gameBoard[2][2].equals("|  X   ")){
            if(checkEmptyForX(2,0,gameBoard)){
                return true;
            }
        }
        return false;
    }
    //is player  winning in col
    boolean playerWinChanceCol(String[][] gameBoard){
        //diagonal check
        if(gameBoard[0][0].equals("|  X   ")&&gameBoard[1][0].equals("|  X   ")){
            if(checkEmptyForX(2,0,gameBoard)){
                return true;
            }
        }
        if(gameBoard[0][0].equals("|  X   ")&&gameBoard[2][0].equals("|  X   ")){
            if(checkEmptyForX(1,0,gameBoard)){
                return true;
            }
        }if(gameBoard[1][0].equals("|  X   ")&&gameBoard[2][0].equals("|  X   ")){
            if(checkEmptyForX(0,0,gameBoard)){
                return true;
            }
        }if(gameBoard[0][1].equals("|  X   ")&&gameBoard[1][1].equals("|  X   ")){
            if(checkEmptyForX(2,1,gameBoard)){
                return true;
            }
        }if(gameBoard[0][1].equals("|  X   ")&&gameBoard[2][1].equals("|  X   ")){
            if(checkEmptyForX(1,1,gameBoard)){
                return true;
            }
        }if(gameBoard[1][1].equals("|  X   ")&&gameBoard[2][1].equals("|  X   ")){
            if(checkEmptyForX(0,1,gameBoard)){
                return true;
            }
        }if(gameBoard[0][2].equals("|  X   ")&&gameBoard[1][2].equals("|  X   ")){
            if(checkEmptyForX(2,2,gameBoard)){
                return true;
            }
        }if(gameBoard[0][2].equals("|  X   ")&&gameBoard[2][2].equals("|  X   ")){
            if(checkEmptyForX(1,2,gameBoard)){
                return true;
            }
        }if(gameBoard[1][2].equals("|  X   ")&&gameBoard[2][2].equals("|  X   ")){
            if(checkEmptyForX(0,2,gameBoard)){
                return true;
            }
        }
        return false;
    }
    // final all x win
    boolean playerWinChanceX(String[][] gameBoard){
       // System.out.println("chances");
        if(playerWinChanceCol(gameBoard)){
         //   System.out.println("col");
            return true;
        } else if (playerWinChanceDiagonal(gameBoard)) {
           // System.out.println("dia");
            return true;
        } else if (playerWinChanceRow(gameBoard)) {
            //System.out.println("row");
            return true;
        }


        return false;
    }
    // comp win chance in dia
    boolean playerWinChanceDiagonalO(String[][] gameBoard){
        //diagonal check
        if(gameBoard[0][0].equals("|  O   ")&&gameBoard[1][1].equals("|  O   ")){
            if(checkEmptyForO(2,2,gameBoard)){
                return true;
            }
        }
        if(gameBoard[0][0].equals("|  O   ")&&gameBoard[2][2].equals("|  O   ")){
            if(checkEmptyForO(1,1,gameBoard)){
                return true;
            }
        }if(gameBoard[1][1].equals("|  O   ")&&gameBoard[2][2].equals("|  O   ")){
            if(checkEmptyForO(0,0,gameBoard)){
                return true;
            }
        }if(gameBoard[0][2].equals("|  O   ")&&gameBoard[1][1].equals("|  O   ")){
            if(checkEmptyForO(2,0,gameBoard)){
                return true;
            }
        }if(gameBoard[2][0].equals("|  O   ")&&gameBoard[1][1].equals("|  O   ")){
            if(checkEmptyForO(0,2,gameBoard)){
                return true;
            }
        }if(gameBoard[2][0].equals("|  O   ")&&gameBoard[0][2].equals("|  O   ")){
            if(checkEmptyForO(1,1,gameBoard)){
                return true;
            }
        }
        return false;
    }
    //comp win chance in row
    boolean playerWinChanceRowO(String[][] gameBoard){
        //diagonal check
        if(gameBoard[0][0].equals("|  O   ")&&gameBoard[0][1].equals("|  O   ")){
            if(checkEmptyForO(0,2,gameBoard)){
                return true;
            }
        }
        if(gameBoard[0][0].equals("|  O   ")&&gameBoard[0][2].equals("|  O   ")){
            if(checkEmptyForO(0,1,gameBoard)){
                return true;
            }
        }if(gameBoard[0][1].equals("|  O   ")&&gameBoard[0][2].equals("|  O   ")){
            if(checkEmptyForO(0,0,gameBoard)){
                return true;
            }
        }if(gameBoard[1][0].equals("|  O   ")&&gameBoard[1][1].equals("|  O   ")){
            if(checkEmptyForO(1,2,gameBoard)){
                return true;
            }
        }if(gameBoard[1][0].equals("|  O   ")&&gameBoard[1][2].equals("|  O   ")){
            if(checkEmptyForO(1,1,gameBoard)){
                return true;
            }
        }if(gameBoard[1][1].equals("|  O   ")&&gameBoard[1][2].equals("|  O   ")){
            if(checkEmptyForO(1,0,gameBoard)){
                return true;
            }
        }if(gameBoard[2][0].equals("|  O   ")&&gameBoard[2][1].equals("|  O   ")){
            if(checkEmptyForO(2,2,gameBoard)){
                return true;
            }
        }if(gameBoard[2][0].equals("|  O   ")&&gameBoard[2][2].equals("|  O   ")){
            if(checkEmptyForO(2,1,gameBoard)){
                return true;
            }
        }if(gameBoard[2][1].equals("|  O   ")&&gameBoard[2][2].equals("|  O   ")){
            if(checkEmptyForO(2,0,gameBoard)){
                return true;
            }
        }
        return false;
    }
    //comp win chance in col
    boolean playerWinChanceColO(String[][] gameBoard){
        //diagonal check
        if(gameBoard[0][0].equals("|  O   ")&&gameBoard[1][0].equals("|  O   ")){
            if(checkEmptyForO(2,0,gameBoard)){
                return true;
            }
        }
        if(gameBoard[0][0].equals("|  O   ")&&gameBoard[2][0].equals("|  O   ")){
            if(checkEmptyForO(1,0,gameBoard)){
                return true;
            }
        }if(gameBoard[1][0].equals("|  O   ")&&gameBoard[2][0].equals("|  O   ")){
            if(checkEmptyForO(0,0,gameBoard)){
                return true;
            }
        }if(gameBoard[0][1].equals("|  O   ")&&gameBoard[1][1].equals("|  O   ")){
            if(checkEmptyForO(2,1,gameBoard)){
                return true;
            }
        }if(gameBoard[0][1].equals("|  O   ")&&gameBoard[2][1].equals("|  O   ")){
            if(checkEmptyForO(1,1,gameBoard)){
                return true;
            }
        }if(gameBoard[1][1].equals("|  O   ")&&gameBoard[2][1].equals("|  O   ")){
            if(checkEmptyForO(0,1,gameBoard)){
                return true;
            }
        }if(gameBoard[0][2].equals("|  O   ")&&gameBoard[1][2].equals("|  O   ")){
            if(checkEmptyForO(2,2,gameBoard)){
                return true;
            }
        }if(gameBoard[0][2].equals("|  O   ")&&gameBoard[2][2].equals("|  O   ")){
            if(checkEmptyForO(1,2,gameBoard)){
                return true;
            }
        }if(gameBoard[1][2].equals("|  O   ")&&gameBoard[2][2].equals("|  O   ")){
            if(checkEmptyForO(0,2,gameBoard)){
                return true;
            }
        }
        return false;
    }
    // final win chance comp
    boolean playerWinChanceO(String[][] gameBoard){
        //System.out.println("comp ai to win");


        if(playerWinChanceColO(gameBoard)){
          //  System.out.println("col");
            return true;
        } else if (playerWinChanceDiagonalO(gameBoard)) {
            //System.out.println("dia");
            return true;
        } else if (playerWinChanceRowO(gameBoard)) {
            //System.out.println("row");
            return true;
        }


        return false;
    }//r  winning in row
    boolean checkWinRow(String[][] gameBoard){
        if((gameBoard[0][0].equals("|  X   ")&& gameBoard[0][1].equals("|  X   ")&&gameBoard[0][2].equals("|  X   "))||
                (gameBoard[0][0].equals("|  O   ")&& gameBoard[0][1].equals("|  O   ")&&gameBoard[0][2].equals("|  O   "))){
            return true;
        } else if ((gameBoard[1][0].equals("|  X   ")&& gameBoard[1][1].equals("|  X   ")&&gameBoard[1][2].equals("|  X   "))||
                (gameBoard[1][0].equals("|  O   ")&& gameBoard[1][1].equals("|  O   ")&&gameBoard[1][2].equals("|  O   "))) {
            return true;
        } else if ((gameBoard[2][0].equals("|  X   ")&& gameBoard[2][1].equals("|  X   ")&&gameBoard[2][2].equals("|  X   "))||
                (gameBoard[2][0].equals("|  O   ")&& gameBoard[2][1].equals("|  O   ")&&gameBoard[2][2].equals("|  O   "))) {
            return true;
        }return false;
    }
    //  winning in col
    boolean checkWinCol(String[][] gameBoard){
        if((gameBoard[0][0].equals("|  X   ")&& gameBoard[1][0].equals("|  X   ")&&gameBoard[2][0].equals("|  X   "))||
                (gameBoard[0][0].equals("|  O   ")&& gameBoard[1][0].equals("|  O   ")&&gameBoard[2][0].equals("|  O   "))){
            return true;
        } else if ((gameBoard[0][1].equals("|  X   ")&& gameBoard[1][1].equals("|  X   ")&&gameBoard[2][1].equals("|  X   "))||
                (gameBoard[0][1].equals("|  O   ")&& gameBoard[1][1].equals("|  O   ")&&gameBoard[2][1].equals("|  O   "))) {
            return true;
        } else if ((gameBoard[0][2].equals("|  X   ")&& gameBoard[1][2].equals("|  X   ")&&gameBoard[2][2].equals("|  X   "))||
                (gameBoard[0][2].equals("|  O   ")&& gameBoard[1][2].equals("|  O   ")&&gameBoard[2][2].equals("|  O   "))) {
            return true;
        }
        return false;
    }
    //  winning in dia
    boolean checkWinDiagonal(String[][] gameBoard){
        if((gameBoard[0][0].equals("|  X   ")&&gameBoard[1][1].equals("|  X   ")&&gameBoard[2][2].equals("|  X   "))||
                (gameBoard[0][0].equals("|  O   ")&&gameBoard[1][1].equals("|  O   ")&&gameBoard[2][2].equals("|  O   "))){
            return true;
        } else if((gameBoard[0][2].equals("|  X   ")&&gameBoard[1][1].equals("|  X   ")&&gameBoard[2][0].equals("|  X   "))||
                (gameBoard[0][2].equals("|  O   ")&&gameBoard[1][1].equals("|  O   ")&&gameBoard[2][0].equals("|  O   "))){
            return true;
        }
        return false;
    }
    // win final check
    boolean FinalCheck(String[][] gameBoard){
        boolean flag1=checkWinRow(gameBoard);
        boolean flag2=checkWinDiagonal(gameBoard);
        boolean flag3=checkWinCol(gameBoard);
        if(flag1||flag2||flag3){
            return false;
        }
        return true;
    }
    void printBoard(String[][] gameBoard){
        System.out.println("|  0   |   1  |  2   | ");
        for(int i=0; i<3; i++){
            System.out.println("---------------------------");
            for(int j=0; j<3; j++){
                System.out.print(gameBoard[i][j]);
            }System.out.println( "|  "+i);
        }System.out.println("---------------------------");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String[][] gameBoard=new String[3][3];
        TicTacToeAi s=new TicTacToeAi();
        s.initialBoard(gameBoard);
        boolean flagCheckEmpty=true;
        boolean flag=true;
        do {
            do {
                System.out.println("\n"+"your  turn  :  X");
                System.out.print("enter row(horizontal line) : ");
                String row1=sc.nextLine();
                System.out.print("enter col(vertical line) : ");
                String col1=sc.nextLine();
                boolean rowFlag=false;
                for(int i=0; i<row1.length();i++){
                    if(row1.charAt(i)>='0'&&row1.charAt(i)<='9'){
                        rowFlag=true;
                    }   else {
                        rowFlag=false;
                        break;
                    }
                }boolean colFlag=false;
                for(int i=0; i<col1.length();i++){
                    if(col1.charAt(i)>='0'&&col1.charAt(i)<='9'){
                        colFlag=true;
                    }   else {
                        colFlag=false;
                        break;
                    }
                }if(rowFlag&&colFlag){
                    int row = Integer.parseInt(row1);
                    int col = Integer.parseInt(col1);
                    flagCheckEmpty = s.checkEmptyForX1(row, col, gameBoard);
                }else {
                    System.out.println("enter only number");
                }
            } while (flagCheckEmpty == true);
            countBoardForGameEnd++;
            s.printBoard(gameBoard);
            flag=s.FinalCheck(gameBoard);
            if(flag==false){
                System.out.println("x wins");
                break;
            }if(countBoardForGameEnd==9){
                System.out.println("its a tie");
                break;
            }

            flagCheckEmpty = false;
            boolean playerAi=false;
            boolean computerWin=false;
            computerWin=s.playerWinChanceO(gameBoard);
            if(computerWin==true){
                playerAi=true;
            }
            else {
                playerAi=s.playerWinChanceX(gameBoard);
            }

            if(playerAi==false) {
                do {
                  //  System.out.println("random");
                    System.out.println("\n" + "computer turn  :  O");
                    int row = random.nextInt(0, 3);

                    int col = random.nextInt(0, 3);

                    flagCheckEmpty = s.checkEmptyForO1(row, col, gameBoard);
                   // System.out.println("empty "+flagCheckEmpty);
                    if(flagCheckEmpty==false){
                        System.out.println("enter row(horizontal line) : "+row);
                        System.out.println("enter col(vertical line) : "+col);
                    }
                }while (flagCheckEmpty == true);
                countBoardForGameEnd++;
                s.printBoard(gameBoard);
            }else {
                countBoardForGameEnd++;
                s.printBoard(gameBoard);
            }
            flag= s.FinalCheck(gameBoard);
            if(flag==false){
                System.out.println("comp wins!!");
            }
        }while (flag==true);
    }
}
