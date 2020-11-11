package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem0;
public class Player {

    private long score;


    public Player() {
        this.score = 0;
    }


    public long getScore() {
        return this.score;
    }


    public void scoreToAdd(int stars) {
        this.score += stars;
    }

}
