
import java.util.*;


public class DuplicateWord {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word for the duplicate search:");
        String sentence = sc.nextLine();

        String[] strings = sentence.split(" ");

        for (String st : strings) {
            if (!(set.contains(st))) {set.add(st);}
            else {}
        }

        for(String s:set){
            System.out.println(s+" ");
        }

    }
}
