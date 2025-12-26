/**
 * ------------------------------------------------------------
 * Class Name   : Session
 * Description  : Represents a study session during the day.
 * Author       : Your Name
 * Created Date : 2025-XX-XX
 * Version      : 1.0
 * ------------------------------------------------------------
 */

public class Subject {
    public static final int MAX_CREDITS = 5;

    private String subjectCode;
    private String name;
    private int credits;

    public Subject(String subjectCode, String name, int credits) {
        this.subjectCode = subjectCode;
        setName(name); // validation inside setter
        this.credits = credits;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
        this.name = name;
    }
}

