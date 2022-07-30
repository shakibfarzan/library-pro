package utils;

public class Generator {
    public static int idGenerator(Object specifyObj) {
        return Integer.parseInt(String.valueOf(specifyObj.hashCode() + (int)System.currentTimeMillis()));
    }
}
