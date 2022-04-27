import java.util.Scanner;

public class StringsCom {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter programs");

        String programsEntered = myObj.nextLine();
        //System.out.println("Programs required are: " + programsEntered); // output

        String adobeString = "Adobe";
        String sec1 = "Adobe Reader Pro";
        //for (int i = 0; i < programsEntered.length(); i++) {
        if (programsEntered.equals(adobeString)){
            System.out.println("Programs required " + adobeString);
        }if(programsEntered.equalsIgnoreCase(sec1)) {
            System.out.println(sec1);
        }
       // System.out.println(programsEntered.equals(adobeString));
    }

    /** will not iternate multiple strings. array class may need to be user**/

}
