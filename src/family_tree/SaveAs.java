package family_tree;
import java.io.Serializable;
public class SaveAs {
    public interface SaveAs {
        void save(String path, Serializable obj);
    }
}
