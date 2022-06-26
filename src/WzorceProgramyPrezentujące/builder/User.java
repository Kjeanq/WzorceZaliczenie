package builder;

public class User {

		private final String name;
		private final String lastName;
		private final int userAge; 
		private final String phoneNumber; 
		private final String userAddress; 

		private User(UserBuilder builder) {
			this.name = builder.name;
			this.lastName = builder.lastName;
			this.userAge = builder.age;
			this.phoneNumber = builder.phone;
			this.userAddress = builder.address;
		}

		public String gettName() {
			return name;
		}
		public String getLastName() {
			return lastName;
		}
		public int getUserAge() {
			return userAge;
		}
		public String getUserPhone() {
			return phoneNumber;
		}
		public String getUserAddress() {
			return userAddress;
		}

		@Override
		public String toString() {
			return "Uzytkownik: "+this.name+", "+this.lastName+", "+this.userAge+", "+this.phoneNumber+", "+this.userAddress;
		}

		public static class UserBuilder
		{
			private final String name;
			private final String lastName;
			private int age;
			private String phone;
			private String address;

			public UserBuilder(String firstName, String lastName) {
				this.name = firstName;
				this.lastName = lastName;
			}
			public UserBuilder age(int age) {
				this.age = age;
				return this;
			}
			public UserBuilder phone(String phone) {
				this.phone = phone;
				return this;
			}
			public UserBuilder address(String address) {
				this.address = address;
				return this;
			}
			public User build() {
				User user =  new User(this);
				return user;
			}
		}

}
