package zaliczenie.projekt.wzorceProjektowe.backend;


import zaliczenie.projekt.wzorceProjektowe.backend.convrefresh.CurrentConversation;
import zaliczenie.projekt.wzorceProjektowe.backend.convrefresh.Observer;
import zaliczenie.projekt.wzorceProjektowe.backend.convrefresh.RefreshesThread;

public class ChatWindowBackend {

    private int currentUserID;
    private int conversationID;

    private RefreshesThread refreshesThread;
    private CurrentConversation currentConversation;

    public ChatWindowBackend(int currentUserID, int conversationID) {
        this.currentUserID = currentUserID;
        this.conversationID = conversationID;
        currentConversation = new CurrentConversation();
        refreshesThread = new RefreshesThread(currentUserID, conversationID);
        currentConversation.conversationEntry(refreshesThread);
    }

}
