package T1;



import java.util.*;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali","Davood", "Reza", "Mohsen");

        Map<Integer ,List<String>> myMap = myList.stream().collect(Collectors.groupingBy(String::length));


        System.out.println(myMap);

        Map<Integer,Long> map2  =myList.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        Map<Map.Entry<Integer,List<String>>,Long> result=new HashMap<>();

        for (Map.Entry<Integer,List<String>> e: myMap.entrySet()) {
            result.put(e,map2.get(e.getKey()));
        }

        System.out.println(map2);

    }
}
