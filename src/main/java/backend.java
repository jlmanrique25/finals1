import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.*;

@ManagedBean
@RequestScoped
@Named
public class backend{
    private String move;
    private long board_id;
    private String cell1;
    private String cell2;
    private String cell3;
    private String cell4;
    private String cell5;
    private String cell6;
    private String cell7;
    private String cell8;
    private String cell9;

    public long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(long board_id) {
        this.board_id = board_id;
    }

    public String getCell1() {
        return cell1;
    }

    public void setCell1(String cell1) {
        this.cell1 = cell1;
    }

    public String getCell2() {
        return cell2;
    }

    public void setCell2(String cell2) {
        this.cell2 = cell2;
    }

    public String getCell3() {
        return cell3;
    }

    public void setCell3(String cell3) {
        this.cell3 = cell3;
    }

    public String getCell4() {
        return cell4;
    }

    public void setCell4(String cell4) {
        this.cell4 = cell4;
    }

    public String getCell5() {
        return cell5;
    }

    public void setCell5(String cell5) {
        this.cell5 = cell5;
    }

    public String getCell6() {
        return cell6;
    }

    public void setCell6(String cell6) {
        this.cell6 = cell6;
    }

    public String getCell7() {
        return cell7;
    }

    public void setCell7(String cell7) {
        this.cell7 = cell7;
    }

    public String getCell8() {
        return cell8;
    }

    public void setCell8(String cell8) {
        this.cell8 = cell8;
    }

    public String getCell9() {
        return cell9;
    }

    public void setCell9(String cell9) {
        this.cell9 = cell9;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public backend(){

    }

    public backend(Long board_id, String cell1, String cell2, String cell3, String cell4, String cell5, String cell6, String cell7, String cell8, String cell9) {
        this.board_id = board_id;
        this.cell1 = cell1;
        this.cell2 = cell2;
        this.cell3 = cell3;
        this.cell4 = cell4;
        this.cell5 = cell5;
        this.cell6 = cell6;
        this.cell7 = cell7;
        this.cell8 = cell8;
        this.cell9 = cell9;
    }

    @Override
    public String toString() {
        return "backend{" +
                "move=" + move +
                '}';
    }
}
