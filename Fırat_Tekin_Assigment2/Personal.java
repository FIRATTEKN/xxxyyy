package assigment2;

public abstract class Personal implements Lecturable{
    String name;
    int birthYear;
    String department;



    @Override
    public boolean isQualified() {
        return this.calculateAchievement()>1;
    }
}
