package assigment2;

public abstract class Student implements Lecturable{
    String name;
    double GPA;

    @Override
    public boolean isQualified() {
        return this.calculateAchievement()>100;
    }
}
