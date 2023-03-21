package src.main.java;
import java.util.*;

public class Sem6 {
    public static void main(String[] args) {
        Myset myset = new Myset();
        myset.putElement(5);
        myset.putElement(7);
        myset.putElement(1);
        myset.putElement(5);
        //myset.myPrint();
        //System.out.println(myset.myContains(10));
        myset.myRemove(10);
        //System.out.println(myset.mySize());
        //System.out.println(myset.myReturn(2));
        System.out.println(myset.myKeyList());
        System.out.println(myset.myRetList());
        myset.myPrint();
        myset.myClear();
        myset.myPrint();
    }
}
class Myset {
    private TreeMap<Integer,Object> trmap = new TreeMap<>();
    private static final Object TMP = new Object();

    public void putElement(int x) {
       trmap.put(x, TMP);
    }
    public void myPrint() {
        System.out.println(trmap.keySet());
    }
    public void myClear() {
        trmap.clear();
    }
    public Boolean myContains(int x) {
        return trmap.containsKey(x);
    }
    public void myRemove (int num) {
        trmap.remove(num);
    }
    public int mySize () {
        return trmap.size();
    }
    public int myReturn (int index) {
        return (int)trmap.keySet().toArray()[index];
    }
    public ArrayList<Object> myKeyList () {
        return new ArrayList<>(List.of(trmap.keySet().toArray()));
    }
        public ArrayList<Integer> myRetList() {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.addAll(trmap.keySet());
            return newList;
    }
}
