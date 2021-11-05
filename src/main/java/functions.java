import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.*;
@RequestScoped
@Named
public class functions {
    List<String> board = Arrays.asList("1","2","3","4","5","6","7","8","9");
    private String winner;
    private backend move = new backend();



    public String main_method(){
        if(!check_move(move.getMove(), true)){
            return "index?faces-redirect=true";
            //this is the move where the player cell is taken
        }else {
            switch (check_board()){
                case "1p":
                    return "winner?faces-redirect=true";
                case "2p":
                    return "winner?faces-redirect=true";
                case "tie":
                    return "winner?faces-redirect=true";
                default:
                    return "index?faces=redirect=true";
            }
        }
    }

    public Boolean check_move(String the_move, Boolean player){
        switch (the_move){
            case "1":
                if(board.get(0).equals("X") || board.get(0).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(0, "X");
                        return true;
                    }else{
                        board.set(0, "O");
                        return true;
                    }
                }
            case "2":
                if(board.get(1).equals("X") || board.get(1).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(1, "X");
                        return true;
                    }else{
                        board.set(1, "O");
                        return true;
                    }
                }
            case "3":
                if(board.get(2).equals("X") || board.get(2).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(2, "X");
                        return true;
                    }else{
                        board.set(2, "O");
                        return true;
                    }
                }
            case "4":
                if(board.get(3).equals("X") || board.get(3).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(3, "X");
                        return true;
                    }else{
                        board.set(3, "O");
                        return true;
                    }
                }
            case "5":
                if(board.get(4).equals("X") || board.get(4).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(4, "X");
                        return true;
                    }else{
                        board.set(4, "O");
                        return true;
                    }
                }
            case "6":
                if(board.get(5).equals("X") || board.get(5).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(5, "X");
                        return true;
                    }else{
                        board.set(5, "O");
                        return true;
                    }
                }
            case "7":
                if(board.get(6).equals("X") || board.get(6).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(6, "X");
                        return true;
                    }else{
                        board.set(6, "O");
                        return true;
                    }
                }
            case "8":
                if(board.get(7).equals("X") || board.get(7).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(7, "X");
                        return true;
                    }else{
                        board.set(7, "O");
                        return true;
                    }
                }
            case "9":
                if(board.get(8).equals("X") || board.get(8).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(8, "X");
                        return true;
                    }else{
                        board.set(8, "O");
                        return true;
                    }
                }
            default:
                return false;
        }


    }

    public String check_board(){
        Boolean counter = false;
        for(int j=0; j<9;j++){
            if(board.get(j).equals("X") || board.get(j).equals("O")){
                counter = true;
                break;
            }
        }

        return check_winner(counter, false);
    }

    public String check_winner(boolean spaces, boolean comp_turn){
        if (spaces){
            if(board.get(0).equals("X") && board.get(1).equals("X")  && board.get(2).equals("X") ){
                return "1p";
            }else if(board.get(0).equals("O")  && board.get(1).equals("O")  && board.get(2).equals("O") ){
                return "2p";
            }else if(board.get(0).equals("X")  && board.get(3).equals("X")  && board.get(6).equals("X") ){
                return "1p";
            }else if(board.get(0).equals("O")  && board.get(3).equals("O")  && board.get(6).equals("O") ){
                return "2p";
            }else if(board.get(0).equals("X")  && board.get(4).equals("X")  && board.get(8).equals("X") ){
                return "1p";
            }else if(board.get(0).equals("O")  && board.get(4).equals("O")  && board.get(8).equals("O") ){
                return "2p";
            }else if(board.get(1).equals("X")  && board.get(4).equals("X")  && board.get(7).equals("X") ){
                return "1p";
            }else if(board.get(1).equals("O")  && board.get(4).equals("O")  && board.get(7).equals("O") ){
                return "2p";
            }else if(board.get(2).equals("X")  && board.get(4).equals("X")  && board.get(6).equals("X") ){
                return "1p";
            }else if(board.get(2).equals("O")  && board.get(4).equals("O")  && board.get(6).equals("O") ){
                return "2p";
            }else if(board.get(3).equals("X")  && board.get(4).equals("X")  && board.get(5).equals("X") ){
                return "1p";
            }else if(board.get(3).equals("O")  && board.get(4).equals("O")  && board.get(5).equals("O") ){
                return "2p";
            }else if(board.get(6).equals("X")  && board.get(7).equals("X")  && board.get(8).equals("X")){
                return "1p";
            }else if(board.get(6).equals("O")  && board.get(7).equals("O")  && board.get(8).equals("O") ){
                return "2p";
            }else{
                if (comp_turn){
                    return "none";
                }else{
                    comp_move();
                }
            }
        }else{
            return "tie";
        }

        return "none";
    }

    public void comp_move(){
        Random rand = new Random();
        int upperbound = 9;

        while(true){
            int comp_move = rand.nextInt(upperbound);
            String real_move = String.valueOf(comp_move);

            if(check_move(real_move, false)){
                break;
            }
        }

        check_winner(true, true);

    }

    public List<String> getBoard() {
        return board;
    }

    public void setBoard(List<String> board) {
        this.board = board;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public backend getMove() {
        return move;
    }

    public void setMove(backend move) {
        this.move = move;
    }
}
