package zaliczenie.projekt.wzorceProjektowe.database.tables.message;

import java.util.ArrayList;
import java.util.List;

public class Conversation extends MessagesComponent{
    private int id_sender;
    private int id_receiver;

    List<MessagesComponent> messagesComponentList = new ArrayList<>();


    private Conversation (ConversationBuilder conversationBuilder){

    }

    public Conversation(int id_sender, int id_receiver) {
        this.id_sender = id_sender;
        this.id_receiver = id_receiver;
    }

    @Override
    public int getId_sender() {
        return id_sender;
    }

    @Override
    public int getId_receiver() {
        return id_receiver;
    }

    @Override
    public void displayMessages() {
        this.messagesComponentList.forEach(MessagesComponent::displayMessages);
    }

    @Override
    public void add(MessagesComponent messagesComponent) {
        this.messagesComponentList.add(messagesComponent);
    }

    public static class ConversationBuilder {
        private int id_sender;
        private int id_receiver;

        public ConversationBuilder(int id_sender, int id_receiver) {
            this.id_sender = id_sender;
            this.id_receiver = id_receiver;
        }

        public Conversation build() {
            return new Conversation(this);
        }
    }
}
