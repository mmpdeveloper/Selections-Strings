import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        int no;
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends?");
        no = input.nextInt();

        //skip line separater
        input.skip(System.lineSeparator());
        String[] names = new String[no];

        //we want to continue this for loop as long as this counter variable
        //contains a value which is less than the value present in
        //the no variable. the counter is starting from 0, then we will
        //increment the value of this counter variable
        for (int counter = 0; counter < no; counter++){
            //the counter is starting from 0, the counter will display the friend 0 if we dont include the 1.
            System.out.println("enter the name of friends " + (counter+1));
            //next we will store it in the names array and we will store it
            //in the position wanted by this counter variable
            names[counter] = input.next();
            //after this for loop, the names will contain the names of all the friends the user has entered
        }
        input.close(); //close the scanner
        //another for loop to display all the names
        for (int counter=0; counter < no; counter++){
            System.out.println(names[counter]);

        }

    }

}