package org.sourceit.piduna.homework_5_2;

import java.util.*;
/**
 * Created by Valeriu on 28.08.2015.
 */
public class Main {

    //I using in that example method:
    //toList, loSet, toQueue, toDequeue
    //There are four methods.
    //You may to put: toList2, toList3, toList4 & other collections
    //You may use method fromArrayToCollection (work for all collections, need to convert in wrapper):
    //    int [] i = new int[]{1,2};
    //    Integer [] ii = c.toObject(i);
    //    List<Integer> il = new ArrayList<>();
    //    c.fromArrayToCollection(ii,  il);
    //Warning!!!
    //In toList, loSet, toQueue, toDequeue we may use not wrapped array

    public static void main(String[] args) {

        Convertor c = new Convertor();

       //Car
        Car [] cars = new Car[2];
        cars[0] = new Car(1, "Volvo", "2612AXA");
        cars[1] = new Car(2, "Toyota", "1861AXA");
        //Int
        int [] i = new int[]{1,2};
        //Double
        double [] d = new double[]{1.0,2.0};
        //Long
        long [] l = new long[]{1L,2L};
        //Boolean
        boolean [] b = new boolean[]{true,false};
        //String
        String [] s = new String[]{"One","Two"};

        //all convert. without car and string
        //because car it is class & string it is
        //reference type
        //Int
        Integer [] ii = c.toObject(i);
        //Double
        Double [] dd = c.toObject(d);
        //Long
        Long [] ll = c.toObject(l);
        //Boolean
        Boolean [] bb = c.toObject(b);

        //Convert collection
        //Car, list
        List<Car> cl = c.toList(cars);
        //Car, set
        Set <Car> cs = c.toSet(cars);
        //Car, queue
        Queue <Car> cq = c.toQueue(cars);
        //Car, dequeue
        Deque <Car> cd = c.toDequeue(cars);
        //Demo on collections list. Pick your own collections
        cl.add(new Car(3, "Volga", "2214AXA"));
        cl.add(new Car(4, "Jelly", "218-116AXA"));
        System.out.println("Car converted into list: ");
        System.out.println(cl);
        //Convert to array. Write, what collections you need to convert
        Car [] carss = c.toCars(cl);
        System.out.println("Car converted into array (length): ");
        System.out.println(carss.length);

        System.out.println(" ");
        //Convert collection
        //int, list
        List<Integer> il = c.toList(ii);
        //int, set
        Set <Integer> is = c.toSet(ii);
        //int, queue
        Queue <Integer> iq = c.toQueue(ii);
        //int, dequeue
        Deque <Integer> id = c.toDequeue(ii);
        //Demo on collections list. Pick your own collections
        il.add(3);
        il.add(4);
        System.out.println("int converted into list: ");
        System.out.println(il);
        //Convert to array. Write, what collections you need to convert
        int  [] iii = c.toInts(il);
        System.out.println("converted into array (length): ");
        System.out.println(iii.length);

        System.out.println(" ");
        //Convert collection
        //double, list
        List<Double> dl = c.toList(dd);
        //double, set
        Set <Double> ds = c.toSet(dd);
        //double, queue
        Queue <Double> dq = c.toQueue(dd);
        //double, dequeue
        Deque <Double> ddq = c.toDequeue(dd);
        //Demo on collections list. Pick your own collections
        dl.add(3.0);
        dl.add(4.0);
        System.out.println("double converted into list: ");
        System.out.println(dl);
        //Convert to array. Write, what collections you need to convert
        double [] ddd = c.toDoubles(dl);
        System.out.println("converted into array (length): ");
        System.out.println(ddd.length);

        System.out.println(" ");
        //Convert collection
        //long, list
        List<Long> lll = c.toList(ll);
        //long, set
        Set <Long> ls = c.toSet(ll);
        //long, queue
        Queue <Long> lq = c.toQueue(ll);
        //long, dequeue
        Deque <Long> ld = c.toDequeue(ll);
        //Demo on collections list. Pick your own collections
        lll.add(3L);
        lll.add(4L);
        System.out.println("long converted into list: ");
        System.out.println(lll);
        //Convert to array. Write, what collections you need to convert
        long [] llll = c.toLongs(lll);
        System.out.println("converted into array (length): ");
        System.out.println(llll.length);

        System.out.println(" ");
        //Convert collection
        //boolean, list
        List<Boolean> bl = c.toList(bb);
        //boolean, set
        Set <Boolean> bs = c.toSet(bb);
        //boolean, queue
        Queue <Boolean> bq = c.toQueue(bb);
        //boolean, dequeue
        Deque <Boolean> bd = c.toDequeue(bb);
        //Demo on collections list. Pick your own collections
        bl.add(true);
        bl.add(false);
        System.out.println("boolean converted into list: ");
        System.out.println(bl);
        //Convert to array. Write, what collections you need to convert
        boolean [] bbb = c.toBooleans(bl);
        System.out.println("converted into array (length): ");
        System.out.println(bbb.length);

        System.out.println(" ");
        //Convert collection
        //boolean, list
        List<String> sl = c.toList(s);
        //boolean, set
        Set <String> ss = c.toSet(s);
        //boolean, queue
        Queue <String> sq = c.toQueue(s);
        //boolean, dequeue
        Deque <String> sd = c.toDequeue(s);
        //Demo on collections list. Pick your own collections
        sl.add("Three");
        sl.add("Four");
        System.out.println("String converted into list: ");
        System.out.println(sl);
        //Convert to array. Write, what collections you need to convert
        String [] sss = c.toStrings(sl);
        System.out.println("String converted into array (length): ");
        System.out.println(sss.length);


    }
}
