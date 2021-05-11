package assigment2;

public class Preparatory extends Student{
    int levelOfEnglish;
    Preparatory(String name , double GPA , int levelOfEnglish){
        this.levelOfEnglish=levelOfEnglish;
        super.GPA=GPA;
        super.name=name;
    }
    @Override
    public double calculateAchievement() {
        return this.levelOfEnglish * 10 * super.GPA;
    }
}
