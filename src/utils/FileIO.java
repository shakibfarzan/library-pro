package utils;

import java.io.*;
import java.util.ArrayList;

public class FileIO {
    private static FileIO instance;
    private FileIO() {}

    public static FileIO getInstance() {
        if (instance == null){
            instance = new FileIO();
        }
        return instance;
    }

    public Object readObjFile(String path){
        try {

            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();
            objectIn.close();
            return obj;

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void writeObjToFile(String path, Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
