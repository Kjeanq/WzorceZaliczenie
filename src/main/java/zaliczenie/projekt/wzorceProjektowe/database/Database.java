package zaliczenie.projekt.wzorceProjektowe.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import zaliczenie.projekt.wzorceProjektowe.database.tables.message.Messages;
import zaliczenie.projekt.wzorceProjektowe.database.tables.Refreshes;
import zaliczenie.projekt.wzorceProjektowe.database.tables.User;

import javax.sql.DataSource;
import java.util.List;

public class Database {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Bean
    public DataSource mysqlDarasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/messages");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssword1");
        return dataSource;
    }
    static Database database = new Database();
    private Database() {
        jdbcTemplate = new JdbcTemplate(mysqlDarasource());
    }
    public List<User> getAllUsers() {
        return jdbcTemplate.query("SELECT * FROM users",
                BeanPropertyRowMapper.newInstance(User.class));
    }
//    public List<Messages> getAllMessages() {
//        return jdbcTemplate.query("SELECT * FROM messages",
//                BeanPropertyRowMapper.newInstance(Messages.class));
//    }
    public List<Refreshes> getAllRefresh() {
        return jdbcTemplate.query("SELECT * FROM refreshes",
                BeanPropertyRowMapper.newInstance(Refreshes.class));
    }

//    public List<Messages> getConversation(int user1, int user2)
//    {
//        return jdbcTemplate.query("SELECT * FROM messages WHERE (id_sender = '"+user1+"' AND id_reciver = '"+user2+"') OR (id_sender = '"+user2+"' AND id_reciver = '"+user1+"')",
//                BeanPropertyRowMapper.newInstance(Messages.class));
//    }

//    public List<Messages> getConversationUpdate(int user1, int user2, int id)
//    {
//        return jdbcTemplate.query("SELECT * FROM messages WHERE ((id_sender = '"+user1+"' AND id_reciver = '"+user2+"') OR (id_sender = '"+user2+"' AND id_reciver = '"+user1+"')) AND id_message > '"+id+"'",
//                BeanPropertyRowMapper.newInstance(Messages.class));
//    }
    public boolean register(String login, String password) {
        if (login != null && password != null) {
            jdbcTemplate.update("INSERT INTO users (login, password) VALUES('" + login + "','" + password + "')");
            return true;
        }
        return false;
    }

    public boolean sendMessage(int idSender, int idReciver, String message) {
        jdbcTemplate.execute("INSERT INTO  messages (id_sender, id_reciver, message) VALUES ('" + idSender + "','" + idReciver + "','" + message +"' )");
        return true;
    }

    public boolean changeRefresh (int id) {
        jdbcTemplate.update("UPDATE refreshes set refresh = 1 where id_user = '" + id + "'");
        return true;
    }
    public boolean checkRefresh (int logedid){
        List<Refreshes> refreshes = jdbcTemplate.query("SELECT  * FROM refreshes where id_user ='" + logedid + "'", BeanPropertyRowMapper.newInstance(Refreshes.class));
        if (refreshes.get(logedid).getRefresh() == 1) {
            jdbcTemplate.update("UPDATE refreshes set refresh = 0 where id_user = '" + logedid + "'");
            return true;
        }
        return false;
    }
    public static Database getInstance() {
        return database;
    }

}
