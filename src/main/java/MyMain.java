import java.util.ArrayList;
import java.util.Collections;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count=0;
        for(String i:list){
            if (i.charAt(0)=='a'||i.charAt(0)=='A'){
                count++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for(int i=0; i<list.size();i++){
            list.set(i, list.get(i)+"!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i:list1){
            for(int j:list2){
                if (i==j){
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count=0;
        for (int i:list){
            if (i%2!=0){
                count++;
            }
        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            Integer b=new Integer(i);
            list.add(b);
        }
        return list;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:list1){
            list.add(i);
        }
        for(int i:list2){
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
