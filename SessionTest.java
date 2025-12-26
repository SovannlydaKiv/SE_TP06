public class SessionTest {

    public static void main(String[] args) {

        // Valid session
        Session session1 = new Session(9, 11, "Room A");
        System.out.println("Session time: "
                + session1.getStartTime() + " - "
                + session1.getEndTime());

        // Invalid session (will throw exception)
        try {
            Session session2 = new Session(14, 12, "Room B");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}