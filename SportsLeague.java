import java.util.Scanner;

// Base Team class
class Team {
    protected String name;
    protected int matchesPlayed;
    protected int wins;
    protected int draws;

    // Constructor
    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    // Method to calculate points
    int calculatePoints() {
        return 0;
    }

    @Override
    public String toString() {
        return "Team: " + name +
                "\nPoints: " + calculatePoints();
    }
}

// Cricket Team
class CricketTeam extends Team {

    CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    // Method overriding
    @Override
    int calculatePoints() {
        return (wins * 2) + (draws * 1);
    }

    @Override
    public String toString() {
        return "Team: " + name + " (Cricket)" +
                "\nPoints: " + calculatePoints();
    }
}

// Football Team
class FootballTeam extends Team {

    FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    // Method overriding
    @Override
    int calculatePoints() {
        return (wins * 3) + (draws * 1);
    }

    @Override
    public String toString() {
        return "Team: " + name + " (Football)" +
                "\nPoints: " + calculatePoints();
    }
}

// Main class
public class SportsLeague {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cricket input
        System.out.println("Enter Cricket team details:");
        String input1 = sc.nextLine();

        String[] data1 = input1.split(",");

        String type1 = data1[0];
        String name1 = data1[1];
        int matches1 = Integer.parseInt(data1[2]);
        int wins1 = Integer.parseInt(data1[3]);
        int draws1 = Integer.parseInt(data1[4]);

        Team cricket = new CricketTeam(
                name1, matches1, wins1, draws1
        );

        // Football input
        System.out.println("Enter Football team details:");
        String input2 = sc.nextLine();

        String[] data2 = input2.split(",");

        String type2 = data2[0];
        String name2 = data2[1];
        int matches2 = Integer.parseInt(data2[2]);
        int wins2 = Integer.parseInt(data2[3]);
        int draws2 = Integer.parseInt(data2[4]);

        Team football = new FootballTeam(
                name2, matches2, wins2, draws2
        );

        // Output
        System.out.println();
        System.out.println(cricket);
        System.out.println();

        System.out.println(football);

        sc.close();
    }
}
