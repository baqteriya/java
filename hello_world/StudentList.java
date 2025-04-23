
import java.util.ArrayList;

class StudentList {

    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("moni");
        studentNames.add("sonu");
        studentNames.add("monu");
        studentNames.add("soni");
        //add element in b/w
        studentNames.add(2, "priya");
        //display
        for (String name : studentNames) {
            System.out.println(name);
        }

    }
}
