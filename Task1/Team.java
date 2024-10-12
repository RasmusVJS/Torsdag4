import java.util.ArrayList;

public class Team{
	String teamName;
	int rank;
	ArrayList<String> memberNames = new ArrayList<>();

	public Team(String teamName){
		this.teamName = teamName;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public void addPlayer(String name){
		memberNames.add(name);
	}

	public String toString(){
		String list = "Hold: " + teamName + ": " + rank;
		for (String i : memberNames){
			list = list.concat("\n" + i);
		}
		return list;
	}
}