import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<String> listStrings = new ArrayList<>();
        listStrings.add("Five");
        listStrings.add("Six");
        listStrings.add("Seven");
        listStrings.add("Eight");

        if (listStrings.remove("Ten")){
            System.out.println("removed");
        } else {
            System.out.println("There is no such element");
        }
    }
}
