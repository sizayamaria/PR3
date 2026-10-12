public class Message {
    private int id;
    private String timestamp;
    private String content;
    private String sender;

    public Message(int id, String timestamp, String content, String sender) {
        this.id = id;
        this.timestamp = timestamp;
        this.content = content;
        this.sender = sender;
    }

    // метод взаємодії
    void sendSystemMessage() {
        // package-private метод для внутрішньої взаємодії в пакетах
        System.out.println("Відправка системного повідомлення від: " + sender);
    }

    public String toString() {
        return "Повідомлення: id=" + id +
                ", Час='" + timestamp + '\'' +
                ", Зміст='" + content + '\'' +
                ", Відправник='" + sender + '\'';
    }
}