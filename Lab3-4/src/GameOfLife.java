public class GameOfLife {
    public int size;
    public int[][] board;
    public int[][] boardCopy;

    public GameOfLife() {
    }

    public GameOfLife(int size) {
        this.size = size;
        this.board = new int[size][size];
        //this.boardCopy = new int[size][size];
    }

    public GameOfLife(int[][] a) {
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                this.boardCopy[i][j] = a[i][j];
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    public void setSize(int s) {
        this.size = s;
    }

    public void setBoard(int[][] b) {
        this.board = b;
    }

    public void setBoardCopy(int[][] bC) {
        this.boardCopy = bC;
    }

    public int getHeigth() {
        return size;
    }

    public int[][] getBoard() {
        return board;
    }

    public int[][] getBoardCopy() {
        return boardCopy;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////

    public int neighbors(int a, int b) {
        int count = 0;
        if (a == 0 && b == 0){
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a+1][b]==1)
                count = count+1;
            if(board[a+1][b+1]==1)
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
            return count;
        }
        if(a==board.length-1 && b == 0){
            if(board[a][b+1] == 1)
                count = count+1;
            if(board[a-1][b]==1)
                count = count+1;
            if(board[a-1][b+1]==1)
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


    //how many cells are alive aroud
    public void oneStep() {
        for(int i = 0; i<board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
                int count = neighbors(i,j);
                if(board[i][j] == 1) {
                    //Any live cell with fewer than two live neighbours dies, as if by underpopulation.
                    //Any live cell with more than three live neighbours dies, as if by overpopulation.
                    if (count < 2 || count > 3) {
                        board[i][j] = 0;
                    }
                    //Any live cell with two or three live neighbours lives on to the next generation.
                    if(count == 3 || count == 2){
                        board[i][j] = 1;
                    }
                }
                if(this.board[i][j] == 0){
                    //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
                    if(count == 3)
                        this.board[i][j] = 1;
                }
            }
        }
    }

    public void evolution(int a) {
        for(int i = 0; i < a; i++)
            oneStep();
    }

////////////////////////////////////////////////////////////////////////////////////////////

    public void setAlive(int a, int b) {
        this.board[a][b] = 1;
    }

    public void setDeath(int a, int b){this.board[a][b] = 0;}

    public void setDeathaAll(int[][]arr){
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0; j<arr[i].length-1; j++){
                this.board[i][j] = 0;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < board[i].length; j++) {
                if (this.board[i][j] == 0) {
                    System.out.print("0");
                }
                else System.out.print("1");
            }
        }

    }
}