import java.util.Scanner;
public class Actions
{
    private static String usrchoice;
    
    public static void getInput()
    {
        Scanner usrinput=new Scanner(System.in);
        System.out.println(": ");
        usrchoice=usrinput.nextLine();
    }
   
}
