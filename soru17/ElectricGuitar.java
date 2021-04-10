package quiz;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(){
        super.name="ElectricGuitar";
        super.numberOfStrings=6;
    }

    public ElectricGuitar(int numberOfStrings){
        super.numberOfStrings=numberOfStrings;
    }

    @Override
    void play() {
        System.out.println(super.numberOfStrings+"-Strings "+super.name+" is playing.");
    }
}
