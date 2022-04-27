import java.util.Scanner;

public class StringCom2 {
    public static void main(String[] args) {
        String[] array = new String[30];
        System.out.println("Please enter programs found on the user's computer");
        Scanner s1 = new Scanner(System.in);

        for(int i = 0; i < 30;){
            array[i] = s1.nextLine();
        }
    }
}
