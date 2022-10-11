import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
public class test {
    // to handle exceptions include throws
    public static void main(String[] args)
        throws IOException
    {        
        File myFile = new File("C:\\Users\\Kien-PC\\Desktop\\province.txt");
        List<String> listOfStrings
            = new ArrayList<String>();
        TreeMap<String, String> tree = new TreeMap<>();               
        FileReader fr = new FileReader(myFile);             
        String s = new String();
        char ch;               
        while (fr.ready()) {
            ch = (char)fr.read();                     
            if (ch == '\n') {               
                listOfStrings.add(s.toString());   
                s = new String();
            }
            else {           
                s += ch;
            }
        }
        if (s.length() > 0) {             
            listOfStrings.add(s.toString());
        }
        String[] array = listOfStrings.toArray(new String[0]);                  
        int cout = array.length-1;
        String[] tach = new String[100]; 
        String[] value = new String[50];       
        while(cout > 0){
            
            tach = array[cout].split(" ");
            value = array[cout].split(tach[tach.length-1]);
            
            tree.put(tach[tach.length-1],value[0]);
            cout--;            
        }       
        System.out.println(tree.get("77"));
       
          //Test pull
    }
}

