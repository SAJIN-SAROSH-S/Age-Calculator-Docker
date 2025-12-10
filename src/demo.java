import java.util.Scanner;
public class demo {
    public static void main (String[] args){
        int present =0;
        int born = 0;
        System.out.print("Hi User, This is a Age Calculator!\n");
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Enter a present year : ");
         present = scanner.nextInt();

        if (present >0){
            break;
        }else{
            System.out.println("Enter the valid Year!!!!");
        }
        }
        while(true){

        
        System.out.print("Enter a year you Born : ");
        born = scanner.nextInt();
        if (born >0 && born<=present){
           break;
        }
        else{
             System.out.print("Enter the correct present Year !\n");
        }
        }
        int Age = present - born;
        System.out.print("Your are "+ Age +" Years old ! \n" );
        
        
        scanner.close();

    }
}