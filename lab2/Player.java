public class Player {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;
    public Player(String n, int j){
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }
    public void print(){
        System.out.println(name+": "+jerseyNumber);
    }
    public void playGame(){
        minutesPlayed = minutesPlayed + 1;
    }
    public int getMinutesPlayed(){
        return minutesPlayed;
    }
}
