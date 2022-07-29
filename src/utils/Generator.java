package utils;

public class Generator {
    public static int idGenerator(Object specifyObj) {
        return Integer.parseInt(specifyObj.hashCode() + "" + System.currentTimeMillis());
    }
}
