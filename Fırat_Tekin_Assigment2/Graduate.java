package assigment2;

public class Graduate extends Student{
    int numberOfPaper;
    Graduate(String name , double GPA , int numberOfPaper){
        this.numberOfPaper=numberOfPaper;
        super.GPA=GPA;
        super.name=name;
    }
    @Override
    public double calculateAchievement() {
        return this.numberOfPaper*30+super.GPA*20;
    }
}
