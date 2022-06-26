package zaliczenie.projekt.wzorceProjektowe.backend.convrefresh;

import zaliczenie.projekt.wzorceProjektowe.database.Database;

public class RefreshesThread  implements Observer {
    private int currentUserID;
    private int conversationID;


    public RefreshesThread(int currentUserID, int conversationID) {
        this.currentUserID = currentUserID;
        this.conversationID = conversationID;
    }

    @Override
    public void entry() {
        //Sprawdzenie odświerzenia w bazie
        //wywołanie go

//        Database.getInstance().checkRefresh(currentUserID, conversationID);
    }
}
