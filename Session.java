/**
 * ------------------------------------------------------------
 * Class Name   : Session
 * Description  : Represents a study session during the day.
 * Author       : Your Name
 * Created Date : 2025-XX-XX
 * Version      : 1.0
 * ------------------------------------------------------------
 */

public class Session {

    // ===== Attributes =====
    private int startTime;
    private int endTime;
    private String location;

    // ===== Constructor =====
    public Session(int startTime, int endTime, String location) {
        setDuration(startTime, endTime);
        this.location = location;
    }

    // ===== Getters =====
    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    // ===== Setters =====
    /**
     * Sets the session duration.
     * Throws IllegalArgumentException if startTime >= endTime.
     */
    public void setDuration(int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException(
                "Start time must be less than end time."
            );
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
}

