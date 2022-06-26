package zaliczenie.projekt.wzorceProjektowe.backend;

import zaliczenie.projekt.wzorceProjektowe.database.Database;
import zaliczenie.projekt.wzorceProjektowe.database.tables.User;

import java.util.List;

public class LoginBackend {

    private List<User> userList;
    public boolean isLogged (String login, String password){

        boolean isCorrect = logincheck(login, password);
        return isCorrect;
    }
    public boolean logincheck(String login, String password) {
        userList = Database.getInstance().getAllUsers();
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getLogin().equals(login) && userList.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
