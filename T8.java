package MockInterview;

import java.util.ArrayList;

public class T8 {
    public static void main(String[] args) {

        ArrayList<String> stringList=new ArrayList<>();

        stringList.add("Ali");
        stringList.add("Ahmed");
        stringList.add("Ahu");
        stringList.add("Cihan");
        stringList.add("Elif");

        ArrayList<String> filteredList=new ArrayList<>();
        for(String str: stringList){
            if(str.startsWith("A")) {
                filteredList.add(str.toLowerCase());
            }
        }
        System.out.println(filteredList);

    }
}
