public class Main{
	public static void main(String[] args){
		Team team1 = new Team("Dream Team");
		team1.setRank(10);
		team1.addPlayer("Rasmus");
		Team team2 = new Team("Cream Team");
		Team team3 = new Team("Gleam Team");
		Team team4 = new Team("Stream Team");
		Team team5 = new Team("Team Team");
		Team team6 = new Team("Meme Team");
		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());
		System.out.println(team6.toString());
	}
}