public class Alert {
    private int id;
    private int eventId;
    private String time;
    private String type;
    private String dangerLevel;
    private String status;

    public Alert(int id, int eventId, String time, String type, String dangerLevel, String status) {
        this.id = id;
        this.eventId = eventId;
        this.time = time;
        this.type = type;
        this.dangerLevel = dangerLevel;
        this.status = status;
    }

    // життєвий метод
    public void elevateDangerLevel(String newLevel) {
        this.dangerLevel = newLevel;
        this.status = "Підвищена увага";
    }

    public void resolveAlert() {
        this.status = "Вирішено";
    }

    public int getId() {
        return id;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public String toString() {
        return "Сповіщення: id=" + id +
                ", ID події=" + eventId +
                ", Час='" + time + '\'' +
                ", Тип='" + type + '\'' +
                ", Рівень небезпеки='" + dangerLevel + '\'' +
                ", Статус='" + status + '\'';
    }
}