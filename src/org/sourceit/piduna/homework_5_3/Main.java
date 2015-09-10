package org.sourceit.piduna.homework_5_3;

import java.util.*;
import java.util.function.IntFunction;

/**
 * Created by Valeriu on 05.09.2015.
 */
public class Main {

    //generic method that implement all map collections
    //and all wrapper types
    //in main, we need to create object
    //  Hashmap h = new Hashmap();
    //  Map <Integer, String> mapIntStr = toMap(hm, integer, string);
    //  o, in three collection. hashmap, treemap, linkedhashmap
    public static <K,V,T extends Map> Map toMap(T o, K array[], V array2[]) {
        Map<K, V> h = null;
        if (o instanceof HashMap) {
            h = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                h.put(array[i], array2[i]);
            }
            return h;
        }
        if (o instanceof TreeMap) {
            h = new TreeMap<>();
            for (int i = 0; i < array.length; i++) {
                h.put(array[i], array2[i]);
            }
            return h;
        }
        if (o instanceof LinkedHashMap) {
            h = new LinkedHashMap<>();
            for (int i = 0; i < array.length; i++) {
                h.put(array[i], array2[i]);
            }
            return h;

        }
        return o;
    }

    //IntFunctions playing the role of factories for the arrays are provided
    //keys and values arrays by streaming on the given map's keySet()
    //and values() collection
    public static <K, V, T extends Map<K, V>> Holder<K[], V[]> toArrays(T map,IntFunction<K[]> keysFactory,IntFunction<V[]> valuesFactory) {
        K[] keys = map.keySet().stream().toArray(keysFactory);
        V[] values = map.values().stream().toArray(valuesFactory);
        return new Holder<>(keys, values);
    }

     public static void main(String[] args) throws IllegalAccessException, InstantiationException{

         Convertor c = new Convertor();

         //String
         String[] s1 = {"a", "b", "c"};
         String[] s2 = {"c", "d", "e"};
         //int
         int[] i = {1, 2, 3};
         //double
         double[] d = {1.0, 2.0, 3.0};
         //long
         long[] l = {1L,2L,3L};
         //boolean
         boolean[] b = {true, false, true};
         //cars
         Car [] cars = new Car[3];
         cars[0] = new Car(1, "Volvo", "2612AXA");
         cars[1] = new Car(2, "Toyota", "1861AXA");
         cars[2] = new Car(3, "Volga", "2214AXA");

         //wrapped data types
         Integer[] integer = c.toObject(i);
         Double[] doubles = c.toObject(d);
         Long[] longs = c.toObject(l);
         Boolean[] booleans = c.toObject(b);

         //object
         HashMap hm = new HashMap();
         LinkedHashMap lhm = new LinkedHashMap();
         TreeMap tm = new TreeMap();

         //you can provide any collections of map
         //for do that, you may chane hm (hashmap) to lhm
         //(LinkedHashMap) or tm (TreeMap)
         Map <Integer, String> mapIntStr = toMap(hm, integer, s1);
         Map <String, String> mapStrStr = toMap(hm, s1, s2);
         Map <Integer, Long> mapIntLong = toMap(hm, integer, longs);
         Map <String, Boolean> mapStrBol = toMap(hm, s1, booleans);
         Map <String, Double> mapStrDoub = toMap(hm, s1, doubles);
         Map <Integer, Car> mapIntCar = toMap(hm, integer, cars);
         Map <String, Car> mapStrCar = toMap(hm, s1, cars);

         //print our map collections
         System.out.println("{int, String}:");
         System.out.println(mapIntStr);
         System.out.println("{String, String}:");
         System.out.println(mapStrStr);
         System.out.println("{int, long}:");
         System.out.println(mapIntLong);
         System.out.println("{String, boolean}:");
         System.out.println(mapStrBol);
         System.out.println("{String, double}:");
         System.out.println(mapStrDoub);
         System.out.println("{int, class Car}:");
         System.out.println(mapIntCar);
         System.out.println("{String, class Car}:");
         System.out.println(mapStrCar);

         //print our arrays from map collection
         System.out.println("\n");
         System.out.println("{int, String}:");
         Holder<Integer[], String[]> IntStr = toArrays(mapIntStr, Integer[]::new, String[]::new);
         int[] ii = c.fromObject(IntStr.a);
         System.out.println(Arrays.toString(ii));
         System.out.println(Arrays.toString(IntStr.b));
         System.out.println("{String, String}:");
         Holder<String[], String[]> StrStr = toArrays(mapStrStr, String[]::new, String[]::new);
         System.out.println(Arrays.toString(StrStr.a));
         System.out.println(Arrays.toString(StrStr.b));
         System.out.println("{int, long}:");
         Holder<Integer[], Long[]> IntLong = toArrays(mapIntLong, Integer[]::new, Long[]::new);
         int[] iii = c.fromObject(IntStr.a);
         long[] ll = c.fromObject(IntLong.b);
         System.out.println(Arrays.toString(iii));
         System.out.println(Arrays.toString(ll));
         System.out.println("{String, boolean}:");
         Holder<String[], Boolean[]> StrBol = toArrays(mapStrBol, String[]::new, Boolean[]::new);
         boolean[] bb = c.fromObject(StrBol.b);
         System.out.println(Arrays.toString(StrBol.a));
         System.out.println(Arrays.toString(bb));
         System.out.println("{String, double}:");
         Holder<String[], Double[]> StrDoub = toArrays(mapStrDoub, String[]::new, Double[]::new);
         double[] dd = c.fromObject(StrDoub.b);
         System.out.println(Arrays.toString(StrDoub.a));
         System.out.println(Arrays.toString(dd));
         System.out.println("{int, class Car}:");
         Holder<Integer[], Car[]> IntCar = toArrays(mapIntCar, Integer[]::new, Car[]::new);
         int[] iiii = c.fromObject(IntStr.a);
         System.out.println(Arrays.toString(iiii));
         System.out.println(Arrays.toString(IntCar.b));
         System.out.println("{String, class Car}:");
         Holder<String[], Car[]> StrCar = toArrays(mapStrCar, String[]::new, Car[]::new);
         System.out.println(Arrays.toString(StrCar.a));
         System.out.println(Arrays.toString(StrCar.b));

     }
}
