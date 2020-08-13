
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 5Replace_space{
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        String string = str.toString();
        int space_count =0;
        for(int i =0; i < string.length(); i++){
            if(string.charAt(i) == ' '){
                int index = i + space_count*2;
                str.replace(index, index + 1, "%20" );
                space_count ++ ;
            }
        }
        return str.toString();
    }
}