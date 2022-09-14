public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomeTeamScore() {
        return homeTeamPoints;
    }

    public int getVisitingTeamScore() {
        return visitingTeamPoints;
    }

    public boolean isWinner(String team){
        if(team.equals(homeTeam) && homeTeamPoints > visitingTeamPoints){
            return true;
        }

        if(team.equals(visitingTeam) && visitingTeamPoints > homeTeamPoints){
            return true;
        }
        return false;
    }

}
