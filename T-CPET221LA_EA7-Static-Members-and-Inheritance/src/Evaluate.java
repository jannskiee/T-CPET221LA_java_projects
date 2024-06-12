public class Evaluate {
    public int score1;
    public int score2;
    public int score3;
    public int score4;
    public int score5;
    int groupScore;
    int groupAverage;
    int overAllAverage;

    Evaluate(int score1, int score2, int score3, int score4, int score5){
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
    }

    public void Department(){
        groupScore = score1 + score2 + score3 + score4 + score5;

    }

    public int getGroupAverage(){
        groupAverage = groupScore / 5;
        return groupAverage;
    }

    public void displayAverage(Evaluate groupB){
        overAllAverage = (groupAverage + groupB.getGroupAverage()) / 2;
        System.out.println("\nThe overall average score of the department is: " + overAllAverage);
    }

    public void overAllScore(Evaluate groupB){
        int overAllScore = (groupScore + groupB.groupScore);
        System.out.println("The overall score of the department is: " + overAllScore);
    }
}
