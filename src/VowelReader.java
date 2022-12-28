import java.util.ArrayList;
import java.util.List;

public class VowelReader {

    public List<Integer> readVowels(List<String> names){

        List<Integer> numbers=new ArrayList<>();
        for (int i=0;i<names.size();i++){
            String name= names.get(i);
            int count=0;
            for (int j = 0; j < name.length(); j++) {
                // check if char[i] is vowel
                if (name.charAt(j) == 'a' || name.charAt(j) == 'e'
                        || name.charAt(j) == 'i'
                        || name.charAt(j) == 'o'
                        || name.charAt(j) == 'u'
                        || name.charAt(j) == 'A'
                        || name.charAt(j) == 'E'
                        || name.charAt(j) == 'I'
                        || name.charAt(j) == 'O'
                        || name.charAt(j) == 'U'
                        ) {
                    count++;
                }
        }
            numbers.add(count);
    }
     return  numbers;
}

}
