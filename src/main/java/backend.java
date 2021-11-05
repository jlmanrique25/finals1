import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.*;

@ManagedBean
@SessionScoped
@Named
public class backend implements Serializable {
    private String move;

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public backend(){

    }

    public backend(String move) {
        this.move = move;
    }


    @Override
    public String toString() {
        return "backend{" +
                "move=" + move +
                '}';
    }
}
