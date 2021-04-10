package quiz;

public class Violin extends StringedInstrument{

    public Violin(){
        super.name="ElectricGuitar";
        super.numberOfStrings=6;
    }

    public Violin(int numberOfStrings){
        super.numberOfStrings=numberOfStrings;
    }

    @Override
    void play() {
        System.out.println(super.numberOfStrings+"-Strings "+super.name+" is playing.");
    }
}
