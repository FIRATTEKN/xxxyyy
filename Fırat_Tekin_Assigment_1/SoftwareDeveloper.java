package assigment1;

public class SoftwareDeveloper extends Employee{

    protected Department department;
    protected String projectName;

    public static int getNumber(){
        return number;
    }

    public SoftwareDeveloper (String name, int yearOfSeniority, String projectName, Department department){
        super(name,yearOfSeniority);
        this.department = department;
        this.projectName = projectName;
    }

    @Override
    public boolean equals(Object obj){
        return this.projectName.equals(((SoftwareDeveloper)obj).projectName) && this.yearOfSeniority==((SoftwareDeveloper)obj).yearOfSeniority;
    }

    @Override
    public String toString(){
        return super.name+"@"+department.name+"-P:"+projectName+"-S:"+super.yearOfSeniority;
    }

    @Override
    public double calculateSalary() {
        return 2000+(30*Math.pow(super.yearOfSeniority,2));
    }
}
