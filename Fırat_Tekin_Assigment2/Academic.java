package assigment2;

import java.util.Calendar;

public class Academic extends Personal{
    int numberOfPaper ;
    int numberOfSymposium;


    Academic(String name , int birthYear , String department , int numberOfPaper , int numberOfSymposium){
        this.numberOfPaper=numberOfPaper;
        this.numberOfSymposium=numberOfSymposium;
        super.name=name;
        super.birthYear=birthYear;
        super.department=department;
    }

    @Override
    public double calculateAchievement() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year-super.birthYear;
        return ((3 * this.numberOfPaper)+(2 *this.numberOfSymposium))/age ;
    }
}
