package zaliczenie.projekt.wzorceProjektowe.backend;

import zaliczenie.projekt.wzorceProjektowe.database.Database;
import zaliczenie.projekt.wzorceProjektowe.database.tables.User;
import java.util.List;

public class RegistrationBackend {

    public boolean loginCheck(String nickValue) {
        List<User> result = Database.getInstance().getAllUsers();
        for (User u: result) {
            if (u.getLogin() == nickValue) return true;
        }
        return false;
    }
}
