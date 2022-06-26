package zaliczenie.projekt.wzorceProjektowe.database.tables.message;

public abstract class MessagesComponent {
    private int id_sender;
    private int id_receiver;

    public MessagesComponent(int id_sender, int id_receiver) {
        this.id_sender = id_sender;
        this.id_receiver = id_receiver;
    }

    protected MessagesComponent() {
    }

    public int getId_sender() {
        return id_sender;
    }

    public int getId_receiver() {
        return id_receiver;
    }

    public void add(MessagesComponent messagesComponent) {
        throw new UnsupportedOperationException();
    }

    public abstract void displayMessages();
}
