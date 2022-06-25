package zaliczenie.projekt.wzorceProjektowe.database.tables;

public class Messages {
    private int id_sender;
    private int id_receiver;
    private String message;

    private Messages(int id_sender, int id_receiver, String message) {
        this.id_sender = id_sender;
        this.id_receiver = id_receiver;
        this.message = message;
    }

    public int getId_sender() {
        return id_sender;
    }

    public int getId_receiver() {
        return id_receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setId_sender(int id_sender) {
        this.id_sender = id_sender;
    }

    public void setId_receiver(int id_receiver) {
        this.id_receiver = id_receiver;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class MessagesBuilder {

    }
}
