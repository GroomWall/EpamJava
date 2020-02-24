package lesson10.homework;

import java.io.*;

public class Serializer {
    public void serialization(Book[] book, String fileName) {
        File file = new File(fileName + ".txt");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(book);
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

    public Book[] deserialization(String fileName) throws InvalidObjectException {
        File file = new File(fileName + ".txt");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                return (Book[]) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
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
