public class MonitoringZone {
    private int id;
    private String name;
    private String coordinates;
    private String status;
    private String monitoringLevel;

    public MonitoringZone() {
        this.id = 1;
        this.name = "Північний сектор";
        this.coordinates = "50.45, 30.52";
        this.status = "Активно";
        this.monitoringLevel = "Високий";
    }

    public MonitoringZone(int id, String name, String coordinates, String status, String monitoringLevel) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.status = status;
        this.monitoringLevel = monitoringLevel;
    }

    // метод, наближений до реального життя замість стандартного сетера
    public void activateZone(String newMonitoringLevel) {
        if (newMonitoringLevel != null && !newMonitoringLevel.isEmpty()) {
            this.monitoringLevel = newMonitoringLevel;
            this.status = "Активно";
        }
    }

    public void deactivateZone() {
        this.status = "Неактивно";
    }

    // гетери та сетери
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return "Зона моніторингу: id=" + id +
                ", Назва='" + name + '\'' +
                ", Координати='" + coordinates + '\'' +
                ", Статус='" + status + '\'' +
                ", Рівень моніторингу='" + monitoringLevel + '\'';
    }
}