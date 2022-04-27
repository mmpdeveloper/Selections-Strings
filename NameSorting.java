import java.util.Scanner;
public class NameSorting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] array = new String[20];

        System.out.println("Please enter 20 names to sort");
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < 20;){

            array[i] = s1.nextLine();


        }


        //Just to test
        System.out.println(array[0]);

    }

}