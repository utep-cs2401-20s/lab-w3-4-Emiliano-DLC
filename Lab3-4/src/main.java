public class main {
    public static void main(String[] args) {
        GameOfLife gOL = new GameOfLife(6);
        gOL.setDeathaAll(gOL.getBoard());
        gOL.setAlive(2,2);
        gOL.setAlive(2,4);
        gOL.setAlive(2,3);
        gOL.setAlive(3,2);
        gOL.setAlive(3,1);
        gOL.setAlive(3,3);
        /*gOL.printBoard();
        System.out.println(" ");
        for(int i = 0; i < 8; i++) {
            gOL.evolution(i);
            gOL.printBoard();
            System.out.println(" ");*/
       // }

        TorusGameOfLife tgol = new TorusGameOfLife(5);
        tgol.setDeathaAll(tgol.getBoard());
        tgol.setAlive(2,1);
        tgol.setAlive(2,2);
        tgol.setAlive(2,3);
        tgol.printBoard();
        System.out.println(" ");
            tgol.evolution(1);
            tgol.printBoard();
            System.out.println(" ");
    }
}
