package zaliczenie.projekt.wzorceProjektowe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zaliczenie.projekt.wzorceProjektowe.database.Database;
import zaliczenie.projekt.wzorceProjektowe.database.tables.message.Messages;

import java.util.List;

@SpringBootApplication
public class WzorceProjektoweApplication {

	public static void main(String[] args) {
		SpringApplication.run(WzorceProjektoweApplication.class, args);

	}

}
