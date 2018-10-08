package edu.wofford;


public class TicTacToeModel {

    public enum Mark { EMPTY, XMARK, OMARK };
    public enum Result { XWIN, OWIN, TIE, NONE };
    public boolean xturn = true;
    public Mark [][] board = new Mark[3][3];

    public TicTacToeModel() {
        //board = Mark[[EMPTY,EMPTY, EMPTY],[EMPTY,EMPTY,EMPTY],[EMPTY,EMPTY,EMPTY]];
        for(int i = 0; i < 3; i ++){
          for(int j = 0; j < 3; j ++){
            board[i][j] = Mark.EMPTY;
          }
        }
    }

    public boolean setMarkAt(int row, int col) {
        if (getResult() == Result.OWIN || getResult() == Result.XWIN || getResult() == Result.TIE){
          return false;
        }
        if(board[row][col] == Mark.EMPTY){
            if(xturn){
              board[row][col] = Mark.XMARK;
              xturn = false;
              return true;
            }
            else{
              board[row][col] = Mark.OMARK;
              xturn = true;
              return true;
            }
        }
        else{
          return false;
        }
    }
    //need to check if value is valid
    public Mark getMarkAt(int row, int col) {
      return board[row][col];
    }

    public Result getResult() {

        /* win states:
          00,01,02  00,10,20  00,11,22
          10,11,12  01,11,21  20,11,02
          20,21,22  02,12,22
        */
        Result result = Result.NONE;
        char zz = toString().charAt(0);
        char zo = toString().charAt(2);
        char zt = toString().charAt(4);
        char oz = toString().charAt(12);
        char oo = toString().charAt(14);
        char ot = toString().charAt(16);
        char tz = toString().charAt(24);
        char to = toString().charAt(26);
        char tt = toString().charAt(28);
        //top row across
        if(zz == zo && zo == zt && zz != ' '){
          if (zz == 'X'){
            result = Result.XWIN;
          }
          else if(zz == 'O'){
            result =  Result.OWIN;
          }
        }
        //mid row across
        else if(oz == oo && oo == ot && oz != ' '){
          if (oz == 'X'){
            result =  Result.XWIN;
          }
          else if(oz == 'O'){
            result =  Result.OWIN;
          }
        }
        //bot row across
        else if(tz == to && to == tt && tz != ' '){
          if (tz == 'X'){
            result =  Result.XWIN;
          }
          else if(tz == 'O'){
            result =  Result.OWIN;
          }
        }
        //left col down
        else if(zz == oz && oz == tz && zz != ' '){
          if (zz == 'X'){
            result = Result.XWIN;
          }
          else if(zz == 'O'){
            result =  Result.OWIN;
          }
        }
        //mid col down
        else if(zo == oo && oo == to && zo != ' '){
          if (zo == 'X'){
            result =  Result.XWIN;
          }
          else if(zo == 'O'){
            result =  Result.OWIN;
          }
        }
        //right col down
        else if(zt == ot && ot == tt && zt != ' ' ){
          if (zt == 'X'){
            result =  Result.XWIN;
          }
          else if(zt == 'O'){
            result =  Result.OWIN;
          }
        }
        //down left up right diagonal
        else if(tz == oo && oo == zt && tz != ' '){
          if (tz == 'X'){
            result =  Result.XWIN;
          }
          else if(tz == 'O'){
            result =  Result.OWIN;
          }
        }
        //up left down right diagonal
        else if(zz == oo && oo == tt && zz != ' '){
          if (zz == 'X'){
            result =  Result.XWIN;
          }
          else if(zz == 'O'){
            result =  Result.OWIN;
          }
        }
        else if(zz==' '||zo==' '||zt==' '||oz==' '||oo==' '||ot==' '||tz==' '||to==' '||tt==' ' ){
            result =  Result.NONE;
        }

        else{
          result = Result.TIE;
        }
        return result;
    }

    private String getTranslation(Mark theMark){
      if(theMark == Mark.XMARK){
        return "X";
      }
      else if(theMark == Mark.OMARK){
        return "O";
      }
      return " ";
    }

    //should it take int row int col?
    public String toString() {

        String boardString = "";

        boardString += getTranslation(getMarkAt(0, 0))
                + "|" + getTranslation(getMarkAt(0,1))
                + "|" + getTranslation(getMarkAt(0,2))
                + "\n-----\n"
                + getTranslation(getMarkAt(1, 0))
                + "|" + getTranslation(getMarkAt(1,1))
                + "|" + getTranslation(getMarkAt(1,2))
                + "\n-----\n"
                + getTranslation(getMarkAt(2, 0))
                + "|" + getTranslation(getMarkAt(2,1))
                + "|" + getTranslation(getMarkAt(2,2));

        return boardString;

    }

}
