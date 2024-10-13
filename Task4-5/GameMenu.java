import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{
	private ArrayList<String> actions = new ArrayList<>();

	GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}

	void displayMenu(){
		for (String i : actions)
			System.out.println(i);
	}

	int getAction(){
		System.out.println("Type a number to choose an action");
		displayMenu();
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		return choice;
	}
}