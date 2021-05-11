package assigment2;

public class Erasmus extends Student{
    String country;
    Erasmus(String name , double GPA , String country){
        this.country=country;
        super.GPA=GPA;
        super.name=name;
    }
    @Override
    public double calculateAchievement() {
        return 0;
    }
}
