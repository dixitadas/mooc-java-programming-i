
import java.util.ArrayList;
import java.util.List;

public class RemoveLast {

    public static void main(String[] args) {

        // Try your method in here
        ArrayList<String> list = new ArrayList<>();
        removeLast(list);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() - 1);
    }

}
