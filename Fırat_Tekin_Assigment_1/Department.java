package assigment1;

public class Department {
    protected String name;
    protected int numberOfWorker;
    public static int number;


    public String getName(){
        return name;
    }

    public Department(String name , int numberOfEmployee){
        this.name=name;
        this.numberOfWorker=numberOfEmployee;
        number++;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Department)
            return this.name.equals(((Department)obj).name) && this.numberOfWorker==((Department)obj).numberOfWorker;
        return false;
    }

    @Override
    public String toString(){
        return this.name+"/number of worker : "+this.numberOfWorker;
    }







}
