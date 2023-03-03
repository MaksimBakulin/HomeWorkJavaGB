package family_tree;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class IO {
    public class IO implements LoadFrom, SaveAs {

        // Загрузка данных из файла
        @Override
        public Serializable load(String path) {
            Serializable personRestored = null;
            try (ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(path))) {
                personRestored = (Serializable) objectInputStream.readObject();
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }

            return personRestored;
        }

        // Сохранение данных в файл
        @Override
        public void save(String path, Serializable obj) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(path))) {
                objectOutputStream.writeObject(obj);
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
    }
}
