import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> reversedList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements are there in the list: ");
        int length = input.nextInt();
        //get user inputs for linkedList
        System.out.println("Enter integer values for the list: ");

        try {
            for (int i = 0; i < length; i++) {
                int x = input.nextInt();
                list.add(x);

            }
        }catch(Exception e){
            System.out.println("give integer values");
        }

        System.out.println("list = "+list);

        for(int i = (length - 1); i >=0; i--){
            reversedList.add(list.get(i));
        }

        System.out.println("reversed list = "+reversedList);

        if(list.equals(reversedList)){
            System.out.println("ArrayList is a PALINDROME!");
        }
        else{
            System.out.println("ArrayList is not a palindrome!");
        }


    }
}
