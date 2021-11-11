import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.*;
@SessionScoped
@Named
public class functions implements Serializable {

    List<String> board = Arrays.asList("1","2","3","4","5","6","7","8","9");
    private String winner;
    private backend move = new backend();
    private List<backend> form_board = new ArrayList<>();

    public String mod_board(){
        long board_id =form_board.size() + 1;
        this.form_board.add(new backend(board_id, this.move.getCell1(), this.move.getCell2(), this.move.getCell3(), this.move.getCell4(), this.move.getCell5(), this.move.getCell6(), this.move.getCell7(), this.move.getCell8(),this.move.getCell9()));

        this.form_board.stream().forEach(item->{
            System.out.println(form_board.toString());
        });
        return "Some string";
    }

    public void set_items(){
        move.setCell1(board.get(0));
        move.setCell2(board.get(1));
        move.setCell3(board.get(2));
        move.setCell4(board.get(3));
        move.setCell5(board.get(4));
        move.setCell6(board.get(5));
        move.setCell7(board.get(6));
        move.setCell8(board.get(7));
        move.setCell9(board.get(8));
    }

    public String main_method(){
//        if (form_board == null){
//            List<String> board = Arrays.asList("1","2","3","4","5","6","7","8","9");
//        }else{
//            //List<String> board = Arrays.asList(move.getCell1(),move.getCell2(),move.getCell3(),move.getCell4(),move.getCell5(),move.getCell6(),move.getCell7(),move.getCell8(),move.getCell9());
//            board.set(0, move.getCell1());
//            board.set(1, move.getCell2());
//            board.set(2, move.getCell3());
//            board.set(3, move.getCell4());
//            board.set(4, move.getCell5());
//            board.set(5, move.getCell6());
//            board.set(6, move.getCell7());
//            board.set(7, move.getCell8());
//            board.set(8, move.getCell9());
//        }

        if(!check_move(move.getMove(), true)){
            //move.setNew_board(board);
            return "index?faces-redirect=true";
            //this is the move where the player cell is taken
        }else {
            switch (check_board()){
                case "1p":
                    winner = "user!";
                    return "winner?faces-redirect=true";
                case "2p":
                    winner ="computer!";
                    return "winner?faces-redirect=true";
                case "tie":
                    winner="none";
                    return "winner?faces-redirect=true";
                default:
                    set_items();
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
                    }else{
                        board.set(0, "O");
                    }
                    return true;
                }
            case "2":
                if(board.get(1).equals("X") || board.get(1).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(1, "X");
                    }else{
                        board.set(1, "O");
                 }
                    return true;
                }
            case "3":
                if(board.get(2).equals("X") || board.get(2).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(2, "X");
                    }else{
                        board.set(2, "O");
                    }
                    return true;
                }
            case "4":
                if(board.get(3).equals("X") || board.get(3).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(3, "X");
                    }else{
                        board.set(3, "O");
                    }
                    return true;
                }
            case "5":
                if(board.get(4).equals("X") || board.get(4).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(4, "X");
                    }else{
                        board.set(4, "O");
                    }
                    return true;
                }
            case "6":
                if(board.get(5).equals("X") || board.get(5).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(5, "X");
                    }else{
                        board.set(5, "O");
                    }
                    return true;
                }
            case "7":
                if(board.get(6).equals("X") || board.get(6).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(6, "X");
                    }else{
                        board.set(6, "O");
                    }
                    return true;
                }
            case "8":
                if(board.get(7).equals("X") || board.get(7).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(7, "X");
                    }else{
                        board.set(7, "O");
                    }
                    return true;
                }
            case "9":
                if(board.get(8).equals("X") || board.get(8).equals("O")){
                    return false;
                }else{
                    if (player){
                        board.set(8, "X");
                    }else{
                        board.set(8, "O");
                    }
                    return true;
                }
            default:
                return false;
        }


    }

    public String check_board(){
        boolean counter = false;
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

    public String reset_board(){
        board.set(0, "1");
        board.set(1, "2");
        board.set(2, "3");
        board.set(3, "4");
        board.set(4, "5");
        board.set(5, "6");
        board.set(6, "7");
        board.set(7, "8");
        board.set(8, "9");

        return "index?faces=redirect=true";
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

    public  backend getMove() {
        return move;
    }

    public void setMove(backend move) {
        this.move = move;
    }
}
