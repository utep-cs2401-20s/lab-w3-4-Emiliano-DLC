public class TorusGameOfLife extends GameOfLife {
    public int[][]boardCopy;
    //constructor
    public TorusGameOfLife() {
    }

    public TorusGameOfLife(int size) {
        super(size);
    }

    public TorusGameOfLife(int[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                this.boardCopy[i][j] = a[i][j];
            }
        }
    }

    @Override
    public int neighbors(int a, int b){
        int count = 0;
        if (a == 0 && b == 0){
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a+1][b]==1)
                count = count+1;
            if(board[a+1][b+1]==1)
                count = count+1;
            if(board[board.length-1][b]==1)
                count = count+1;
            if(board[board.length-1][b+1]==1)
                count = count+1;
            if(board[a][board[a].length-1]==1)
                count = count+1;
            if(board[a+1][board[a].length-1]==1)
                count = count+1;
            if(board[board.length-1][board[a].length-1]==1)
                count = count+1;
            return count;
        }
        if(a==0 && b==board.length-1){
            if(board[a][b-1] == 1)
                count = count+1;
            if(board[a+1][b-1]==1)
                count = count+1;
            if(board[a+1][b]==1)
                count = count+1;
            if(board[0][0]==1)
                count = count+1;
            if(board[1][0]==1)
                count = count+1;
            if(board[board.length-1][0]==1)
                count = count+1;
            if(board[board.length-1][board.length-2]==1)
                count = count+1;
            if(board[board.length-1][board.length-1]==1)
                count = count+1;
            return count;
        }
        if(a==board.length-1 && b == 0){
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a-1][b]==1)
                count = count+1;
            if(board[a-1][b+1]==1)
                count = count+1;
            if(board[0][0]==1)
                count = count+1;
            if(board[0][b+1]==1)
                count = count+1;
            if(board[0][board.length-1]==1)
                count = count+1;
            if(board[a-1][board.length-1]==1)
                count = count+1;
            if(board[a][board.length-1]==1)
                count = count+1;
            return count;
        }
        if(a == board.length-1 && b == board.length-1){
            if(board[a-1][b-1] == 1)
                count = count+1;
            if(board[a-1][b] == 1)
                count = count+1;
            if(board[a][b-1]==1)
                count = count+1;
            if(board[0][0]==1)
                count = count+1;
            if(board[0][b-1]==1)
                count = count+1;
            if(board[0][b]==1)
                count = count+1;
            if(board[a-1][0]==1)
                count = count+1;
            if(board[a][0]==1)
                count = count+1;
            return count;
        }
        if (a == 0) {
            if(board[a][b-1] == 1)
                count = count+1;
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a+1][b+1] == 1)
                count = count+1;
            if(board[a+1][b] == 1)
                count = count+1;
            if(board[a+1][b-1] == 1)
                count = count+1;
            if(board[board.length-1][b]==1)
                count = count+1;
            if(board[board.length-1][b-1]==1)
                count = count+1;
            if(board[board.length-1][b+1]==1)
                count = count+1;
            return count;
        }
        if (a == board.length-1) {
            if(board[a][b-1] == 1)
                count = count+1;
            if(board[a-1][b-1] == 1)
                count = count+1;
            if(board[a-1][b] == 1)
                count = count+1;
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a-1][b+1] == 1)
                count = count+1;
            if(board[0][b-1]==1)
                count = count+1;
            if(board[0][b]==1)
                count = count+1;
            if(board[0][b+1]==1)
                count = count+1;
            return count;
        }
        if (b == 0) {
            if(board[a-1][b] == 1)
                count = count+1;
            if(board[a-1][b+1] == 1)
                count = count+1;
            if(board[a+1][b] == 1)
                count = count+1;
            if(board[a+1][b+1] == 1)
                count = count+1;
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a][b+1] == 1)
                count = count+1;
            return count;
        }
        if (b == board.length-1) {
            if(board[a-1][b] == 1)
                count = count+1;
            if(board[a-1][b-1] == 1)
                count = count+1;
            if(board[a][b-1] == 1)
                count = count+1;
            if(board[a+1][b-1] == 1)
                count = count+1;
            if(board[a+1][b] == 1)
                count = count+1;
            if(board[a+1][0] == 1)
                count = count+1;
            if(board[a][0] == 1)
                count = count+1;
            if(board[a-1][0] == 1)
                count = count+1;
            return count;
        }
        if(a != 0 && a != this.board.length && b != 0 && b != this.board.length){
            if(this.board[a-1][b-1] == 1)
                count = count+1;
            if(board[a-1][b] == 1)
                count = count+1;
            if(board[a-1][b+1] == 1)
                count = count+1;
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a+1][b+1] == 1)
                count = count+1;
            if(board[a+1][b] == 1)
                count = count+1;
            if(board[a+1][b-1] == 1)
                count = count+1;
            if(board[a][b-1] == 1)
                count = count+1;
            return count;
        }
        return count;

    }

}
