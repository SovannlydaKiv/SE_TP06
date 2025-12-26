
public class SubjectTest {

    public static void main(String[] args) {

        Subject s1 = new Subject("SE201", "Software Engineering", 3);
        System.out.println("Subject name: " + s1.getName());


        try {
            Subject s2 = new Subject("SE202", "", 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



