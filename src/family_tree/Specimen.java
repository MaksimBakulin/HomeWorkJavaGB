package family_tree;
import java.util.ArrayList;
public class Specimen {
    public abstract class Specimen {
        boolean alive;
        ArrayList<Specimen> children = new ArrayList<>();
        ArrayList<Specimen> parents = new ArrayList<>();

        private Specimen(boolean alive, Specimen children, Specimen parents){
            this.alive = alive;
            this.children.add(children);
            this.parents.add(parents);
        }

        private Specimen(){
            this.alive = true;
        }




    }
}
