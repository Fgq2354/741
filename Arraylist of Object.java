import java.util.ArrayList;
import java.util.Scanner;

class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private String eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, String eventDate, ArrayList<String> eventAttendees) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = eventAttendees;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventAttendees(ArrayList<String> eventAttendees) {
        this.eventAttendees = eventAttendees;
    }

    public void organizeEvent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event ID: ");
        this.eventID = scanner.nextLine();

        System.out.print("Enter event name: ");
        this.eventName = scanner.nextLine();

        System.out.print("Enter event venue: ");
        this.eventVenue = scanner.nextLine();

        System.out.print("Enter event date: ");
        this.eventDate = scanner.nextLine();

        this.eventAttendees = new ArrayList<>();
    }}

    @Override
    public String toString() 

