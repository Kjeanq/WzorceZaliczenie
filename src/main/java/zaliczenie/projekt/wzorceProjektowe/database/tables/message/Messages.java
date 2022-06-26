package zaliczenie.projekt.wzorceProjektowe.database.tables.message;

public class Messages extends MessagesComponent{
    private int id_sender;
    private int id_receiver;
    private String message;

    private Messages(MessagesBuilder messagesBuilder) {
        this.id_sender = messagesBuilder.id_sender;
        this.id_receiver = messagesBuilder.id_receiver;
        this.message = messagesBuilder.message;
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

    @Override
    public void displayMessages() {
        System.out.println(getMessage());
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
        private final int id_sender;
        private final int id_receiver;
        private String message;

        public MessagesBuilder(int id_sender, int id_receiver) {
            this.id_sender = id_sender;
            this.id_receiver = id_receiver;
        }

        public void setMessage(String message) {
            this.message = message;
        }
        public Messages build() {
            return new Messages(this);
        }
    }
}
