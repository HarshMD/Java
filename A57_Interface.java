public class A57_Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up down left right diagonal(in all direction)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up down left right diagonal(by one step)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up down left right");
    }
}

