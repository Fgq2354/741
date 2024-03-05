public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    // Constructor
    public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numExtraActivities];
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    // Method to add extra activities
    public void addExtraActivity(int totalActivities) {
        for (int i = 0; i < totalActivities; i++) {
            // Assuming user input for activities, you can modify as needed
            // Here, we are just setting it as "Activity i"
            extraActivities[i] = "Activity " + (i + 1);
        }
    }

    // toString method to display student details
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append("\n");
        sb.append("Student Name: ").append(studentName).append("\n");
        sb.append("Extra Activities:\n");
        for (String activity : extraActivities) {
            sb.append(activity).append("\n");
        }
        return sb.toString();
    }
}
