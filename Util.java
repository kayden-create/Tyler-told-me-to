
public class Util {
    public static boolean osIsWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("win");
    }
}
