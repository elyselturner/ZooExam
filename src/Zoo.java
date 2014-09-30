import java.util.ArrayList;

/**
 * Created by elyseturner on 9/29/14.
 */
public class Zoo {
    private ArrayList<Pen> pens = new ArrayList<Pen>();

    public ArrayList<Pen> getPens() {
        return pens;
    }

    public boolean removePen(int penIndex) {
        if (penIndex >= 0 && penIndex < pens.size()) {
            pens.remove(penIndex);
            return true;
        } else {
            return false;
        }
    }

    public void addPen(Pen pen){
        pens.add(pen);
    }
}
