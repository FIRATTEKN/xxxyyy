import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class adress {
    static String filename= "transactions.txt";
    static int limitRecord=100;
    static Record[] records;
    static int lastIndex; // Do not change
    static class Record
    {
        String name;
        Integer price, number;
    }
    public static void main(String[] args) throws IOException {
        initialProcess(); // Do not change
        // Write your codes here

        showManu();



    }
    private static void showManu() throws IOException {
        System.out.println("-----------------MENU-------------------");
        System.out.println("--------------1- ADD RECORD ------------");
        System.out.println("-------------2- REMOVE RECORD ----------");
        System.out.println("-------------3- SEARCH RECORD ----------");
        System.out.println("--------------4- LIST ALL --------------");
        System.out.println("------------5- DELETE ALL --------------");
        System.out.println("--------------6- CLOSE -------------------");
        System.out.println("please make a choice");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Please enter name");
                String name = in.next();
                System.out.println("Please enter Price");
                int price = in.nextInt();
                System.out.println("Please enter number");
                int number = in.nextInt();
                addRecord(name, price, number);
                update();
                System.out.println("Record is added");
                showManu();
            }
            case 2 -> {
                System.out.println("Please enter Name");
                String name = in.next();
                if (removeRecord(name)) {
                    lastIndex--;
                    update();
                    System.out.println("Record is removed.");
                } else
                    System.out.println("Records is not avaliable.");
                showManu();  // removeRecord();
            }
            case 3 -> {
                System.out.println("Plese enter Name");
                String name = in.next();
                searchRecord(name);
                showManu();
            }
            case 4 -> {
                listRecord();
                showManu();
            }
            case 5 -> {
                System.out.println("Are you sure ? y/n");
                String ask = in.next();
                if (ask.equals("y"))
                    deleteall();
                showManu();
            }
            case 6 -> System.exit(0);
        }
    }
    private static void listRecord()
    {

        for (int i = 0 ; i<lastIndex ; i++){
            System.out.println(records[i].name+" "+records[i].number+" "+records[i].price);
        }
        // Write your codes here
    }


    private static void addRecord(String name, Integer price, Integer number)
    {

        Record newRecord = new Record();
        newRecord.name=name;
        newRecord.price=price;
        newRecord.number=number;

        records[lastIndex]=newRecord;
        lastIndex++;
    }
    private static void update() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(filename)));


        for (int i = 0 ; i<lastIndex ; i++){
            dataOutputStream.writeBytes(records[i].name+"\t"+records[i].price+"\t"+records[i].number+"\n");
        }

        dataOutputStream.close();

    }
    private static boolean removeRecord(String name) {
        boolean process = false;
        int i ;
        for (i = 0 ;i<lastIndex ; i++){
            if (records[i].name.equals(name)){
                process = true;
                break;
            }


        }
        records[i]=new Record();
        int a ;
        for (a = i ; a<lastIndex-i ;a++){
            records[a]=records[a+1];
        }
        records[a]=new Record();

        return process;
    }
    private static void searchRecord(String name)
    {
        boolean process = false;
        int i ;
        for (i = 0 ;i<lastIndex ; i++){
            if (records[i].name.equals(name)){
                process = true;
                break;
            }
        }

        if (process)
            System.out.println(records[i].name+"\t"+records[i].price+"\t"+records[i].number);
        else
            System.out.println("Record is not avaliable");
    }

    private static void deleteall() throws IOException {
        records=new Record[limitRecord];
        for (int i=0;i<limitRecord;i++)
        {
            records[i]=new Record();
        }
        System.out.println("All recors are deleted");
        lastIndex=0;
        update();
    }

    // initialProcess() method must not be changed.
    private static void initialProcess()
    {
        records=new Record[limitRecord];
        for (int i=0;i<limitRecord;i++)
        {
            records[i]=new Record();
        }

        try {
            Reader reader=new InputStreamReader(new FileInputStream(filename),"Windows-1254");
            BufferedReader br=new BufferedReader(reader);

            String strLine;
            int i=0;
            while((strLine=br.readLine())!=null)
            {
                StringTokenizer tokens=new StringTokenizer(strLine,"\t");
                String[] t=new String[3];
                int j=0; while (tokens.hasMoreTokens())
            {
                t[j]=tokens.nextToken();
                j++;
            }
                records[i].name=t[0];
                records[i].price=Integer.valueOf(t[1]);
                records[i].number=Integer.valueOf(t[2]);
                i++;
            }
            lastIndex=i;
            reader.close();
        } catch (Exception e) {
            System.err.println("Error: "+e.getMessage());
        }
    }
}
