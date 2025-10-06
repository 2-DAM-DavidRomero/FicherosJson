package semana05.ejercicio2;

public class EventResult {
    private String place;
    private Event event;

    public EventResult() {
    }

    public EventResult(String place, Event event) {
        this.place = place;
        this.event = event;
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }

    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
}
