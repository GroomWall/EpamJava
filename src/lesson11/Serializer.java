package lesson11;

import java.io.*;
import java.util.HashMap;

public class Serializer {
    public void serialization(HashMap<String, String> hashMap, String fileName) {
        File file = new File(fileName + ".txt");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(hashMap);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public HashMap<String, String> deserialization(String fileName) throws InvalidObjectException {
        File file = new File(fileName + ".txt");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                return (HashMap<String, String>) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException ignored) {
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Object fail");
    }
}
