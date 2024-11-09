import java.util.ArrayList;

abstract class Commom {

    public static int ToInt(String text) {
        return Integer.parseInt(text);
    }

    public static void ShowList(ArrayList<?> lista) {
        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }
}
