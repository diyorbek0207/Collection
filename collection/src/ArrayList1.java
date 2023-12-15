import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        list.add("Qora");
        list.add("OQ");
        list.add("Qizil");
        list.add("Sariq");
        list.add("Yashil");
        list.add("Ko'k");
        list.add("Pushti");
        System.out.println(list);
        list.set(3,"Qora");
        list.forEach(s->{
            System.out.println(s.length());
        });
    }
}

class ArrayList2{
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);
        //System.out.println(arr.contains(40));

        ArrayList <Integer> arr2=new ArrayList<>(arr);
        for (int i = 0; i < arr.size(); i++) {
            int j=3;
            Collections.swap(arr,j,i);
            j=+1;
        }

        System.out.println(arr);


    }
}

class ArrayList3{
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.addFirst(45);
        list.addFirst(19);
        list.addFirst(75);
        list.addFirst(33);
        list.addFirst(21);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }

}

class ArrayList4{
    public static void main(String[] args) {
        ArrayList <String> list1=new ArrayList<>();
        ArrayList <String> list2=new ArrayList<>();
        ArrayList <String> list3=new ArrayList<>();
        list1.add("Qora");
        list1.add("OQ");
        list1.add("Qizil");
        list1.add("Yashil");

        list2.add("Qora");
        list2.add("Sariq");
        list2.add("Ko'k");
        list2.add("Yashil");

        for (int i = 0; i < list1.size(); i++) {
            String arr1=list1.get(i);
            String arr2=list2.get(i);
            if (arr2 ==arr1){
                list3.add("yes");
            }
            else {
                list3.add("now");
            }
        }
           System.out.println(list3);
    }

}

class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> myList = new ArrayList<>();

        list1.add(21);
        list1.add(14);
        list1.add(54);

        list2.add(47);
        list2.add(25);
        list2.add(98);

        Collections.swap(list1,0,1);
        list1.addAll(list2);


        // 3 ta element qo'shamiz
        for (int i = 1; i <= 3; i++) {
            myList.add(i);
        }

        // to'plam o'lchamini 6 taga oshiramiz
        for (int i = 4; i <= 6; i++) {
            myList.add(i);
        }

        System.out.println(myList);

    }

}
