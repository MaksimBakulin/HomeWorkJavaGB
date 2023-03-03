package family_tree;
import java.io.Serializable;
public class LoadFrom {
    public interface LoadFrom {
        Serializable load(String path);
    }
}
