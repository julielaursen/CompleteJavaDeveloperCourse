package JuliePackage;

/**
 * Created by Julie on 12/29/2017.
 */
public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        chicagoCubs.addPlayer(pat);

        Team<SoccerPlayer> austinBats = new Team<>("Austin Bats");
        austinBats.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
    }
}
