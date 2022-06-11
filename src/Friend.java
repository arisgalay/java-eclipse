

public class Friend {

	String name;
	static int numberOfFriends;
	
	public Friend(String name){
		this.name = name;
		numberOfFriends++;
	}
	
	static void displayFriend() {
		System.out.println("Yoo have " + numberOfFriends + " friends.");
	}

}
