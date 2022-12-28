import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numberOfVowels {

    public static void main(String[] args) {
//        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of text you have.");
        int number=sc.nextInt();
        ArrayList<String> names=new ArrayList<>();
        System.out.println("enter your names");

        for (int i=0;i<number;i++) {
            String name=sc.next();
            names.add(name);
        }
        VowelReader vowelReader=new VowelReader();
        List<Integer> numbers= vowelReader.readVowels(names);
        for (int singleNumber:numbers)
        {
            if(singleNumber == 0) System.out.println("no vowels");
            else if(singleNumber>10) System.out.println(("too many vowel"));
            else System.out.println(singleNumber);
        }
        }

    }

