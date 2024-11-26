import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myNumber=new LinkedList<Integer>();
        myNumber.add(30);
        myNumber.add(10);
        myNumber.add(5);
        myNumber.add(4);
        myNumber.add(67);
        myNumber.add(41);
   Collections.sort(myNumber);
   myNumber.remove(3);
        myNumber.remove(2);
        myNumber.remove(1);
        myNumber.clear();
        myNumber.add(7);
        myNumber.add(1);
//        myNumber.addFirst(30);u
   Collections.sort(myNumber);

for(Integer i:myNumber){
    System.out.println(i);
}
        System.out.println( myNumber.getFirst());
        System.out.println( myNumber.getLast());
    }
}