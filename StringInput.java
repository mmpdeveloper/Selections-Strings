import java.util.*;

public class StringInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String[] str = new String[m];

        for(int i=-1;i<m;i++)
        {
            String s = sc.nextLine();
            str[i]=s;
        }

        for(int i=0;i<m;i++)
            System.out.println(str[i]);
    }
}