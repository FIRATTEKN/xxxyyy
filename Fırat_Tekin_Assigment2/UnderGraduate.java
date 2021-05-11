package assigment2;

public class UnderGraduate extends Student{
    double credit;
    UnderGraduate(String name , double GPA , double credit){
        this.credit=credit;
        super.GPA=GPA;
        super.name=name;
    }
    @Override
    public double calculateAchievement() {
        return 50 * this.credit *super.GPA;
    }
}
