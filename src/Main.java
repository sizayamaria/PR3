public class Main {
    public static void main(String[] args) {
        MonitoringZone zone = new MonitoringZone(1, "Південний сектор", "46.48, 30.73", "Активно", "Середній");
        Alert alert = new Alert(501, 8945, "08:02", "Загроза БПЛА", "Високий", "Новий");
        Message msg = new Message(10, "08:03", "Увага! Зафіксовано об'єкт.", "Оператор");

        // демонстрація інкапсуляції та життєвих методів
        zone.activateZone("Критичний");
        alert.elevateDangerLevel("Максимальний");

        System.out.println(zone);
        System.out.println(alert);
        System.out.println(msg);
    }
}