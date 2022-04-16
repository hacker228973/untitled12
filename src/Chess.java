import java.util.ArrayList;

public class Chess {
    public static void main(String[] args) {
        ArrayList<ChessItem> chess =new ArrayList<>();
        ChessItem chessItem=new Pawn(1,1);
        chess.add(chessItem);
        ChessItem chessItem2=new King(2,3);
        chess.add(chessItem2);
        ChessItem chessItem3=new Queen(3,2);
        chess.add(chessItem3);
        for(ChessItem item : chess){
            item.draw();
        }
    }
}
