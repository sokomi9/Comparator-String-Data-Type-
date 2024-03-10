import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class index{
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String str1, String str2){
                   if(str1.length() > str2.length())
                    return 1;
                    else
                    return -1;
                   
            }
        };
       List<String> names = new ArrayList<String>();

       names.add("Abiud");
       names.add("John");
       names.add("Emichende");
       names.add("Amang'alia");
       names.add("Fredrick");

       Collections.sort(names, comp);
       System.out.println(names);
    }
}