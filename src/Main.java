import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        

        int marks[] = new int[7];
        int i;
        float total = 0, average;
        Scanner scanner = new Scanner(System.in);

        for(i =0; i<7; i++){
            System.out.println("Enter the marks of Subject "+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];

        }

        scanner.close();
        //Calculating the average
        average = total /8;
        System.out.println("The student Grade is: ");
        if(average>= 80){
            System.out.print("A");
        }

        else if(average>=60 && average<80){
            System.out.println("B");

        }

        else if (average >=40 && average<60){
            System.out.println("C");
        }

        else{
            System.out.println("D");
        }


    }
}