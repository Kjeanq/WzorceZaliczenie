package builder;

public class Main {
	
	public static void main(String[] args) 
	{
		User user1 = new User.UserBuilder("Jan", "Kowalski")
		.age(22)
		.phone("222333444")
		.address("labiszynska 25")
		.build();

		System.out.println(user1);

		User user2 = new User.UserBuilder("Adam", "Nowak")
		.age(11)
		.phone("333444555")
		.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Ferdynant", "Kiepski")
		.build();

		System.out.println(user3);
	}

}
