package org.sourceit.piduna.homework_5_2;


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Valeriu on 30.08.2015.
 */
public class Convertor {

    //first we convert to wrapper
    //second we convert to all collections
    public Integer[] toObject(int[] array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = new Integer(array[i]);
        }
        return result;
    }

    public Double[] toObject(double[] array) {
        Double[] result = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = new Double(array[i]);
        }
        return result;
    }

    public Long[] toObject(long[] array) {
        Long[] result = new Long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = new Long(array[i]);
        }
        return result;
    }

    public Boolean[] toObject(boolean[] array) {
        Boolean[] result = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = new Boolean(array[i]);
        }
        return result;
    }

    //First method
    //Convert from wrapper
    public <T> List <T> toList(T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (T i : array){
            list.add(i);
        }
        return list;
    }

    public <T> Set <T> toSet(T[] array) {
        Set<T> list = new HashSet<>();
        for (T i : array){
            list.add(i);
        }
        return list;
    }

    public <T> Queue <T> toQueue(T[] array) {
        Queue<T> list = new PriorityQueue<>();
        for (T i : array){
            list.add(i);
        }
        return list;
    }

    public <T> Deque <T> toDequeue(T[] array) {
        Deque<T> list = new ArrayDeque<>();
        for (T i : array){
            list.add(i);
        }
        return list;
    }

    //Second method
    //Convert from wrapper
    public <T> List <T> toList2(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }

    public <T> Set <T> toSet2(T[] array) {
        return new HashSet<>(Arrays.asList(array));
    }

    public <T> Queue <T> toQueue2(T[] array) {
        return new PriorityQueue<>(Arrays.asList(array));
    }

    public <T> Deque <T> toDequeue2(T[] array) {
        return new ArrayDeque<>(Arrays.asList(array));
    }

    //Third method
    //Convert from wrapper
    public <T> List  <T>  toList3(T[]  array)  {
        return  IntStream.range(0, array.length)
                .mapToObj(index ->  array[index])
                .collect(Collectors.toList());
    }

    public <T> Set  <T>  toSet3(T[]  array)  {
        return  IntStream.range(0, array.length)
                .mapToObj(index ->  array[index])
                .collect(Collectors.toSet());
    }

    public <T> Queue  <T>  toQueue3(T[]  array)  {
        return  IntStream.range(0, array.length)
                .mapToObj(index ->  array[index])
                .collect(Collectors.toCollection(PriorityQueue::new));
    }

    public <T> Deque  <T>  toDeque3(T[]  array)  {
        return  IntStream.range(0, array.length)
                .mapToObj(index ->  array[index])
                .collect(Collectors.toCollection(ArrayDeque::new));
    }


    //Fourth method
    //use reflection
    //working to all primitive types too!!!
    //not my method
    //http://stackoverflow.com/questions/754294/convert-an-array-of-primitive-longs-into-a-list-of-longs?rq=1
    public <T> List<T> toList4(Object... items) {

        List<T> list = new ArrayList<T>();

        if (items.length == 1 && items[0].getClass().isArray()) {
            int length = Array.getLength(items[0]);
            for (int i = 0; i < length; i++) {
                Object element = Array.get(items[0], i);
                T item = (T)element;
                list.add(item);
            }
        } else {
            for (Object i : items) {
                T item = (T)i;
                list.add(item);
            }
        }
        return list;
    }

    public <T> Set<T> toSet4(Object... items) {

        Set<T> list = new HashSet<>();

        if (items.length == 1 && items[0].getClass().isArray()) {
            int length = Array.getLength(items[0]);
            for (int i = 0; i < length; i++) {
                Object element = Array.get(items[0], i);
                T item = (T)element;
                list.add(item);
            }
        } else {
            for (Object i : items) {
                T item = (T)i;
                list.add(item);
            }
        }
        return list;
    }

    public <T> Queue<T> toQueue4(Object... items) {

        Queue<T> list = new PriorityQueue<>();

        if (items.length == 1 && items[0].getClass().isArray()) {
            int length = Array.getLength(items[0]);
            for (int i = 0; i < length; i++) {
                Object element = Array.get(items[0], i);
                T item = (T)element;
                list.add(item);
            }
        } else {
            for (Object i : items) {
                T item = (T)i;
                list.add(item);
            }
        }
        return list;
    }

    public <T> Deque<T> toDeque4(Object... items) {

        Deque<T> list = new ArrayDeque<>();

        if (items.length == 1 && items[0].getClass().isArray()) {
            int length = Array.getLength(items[0]);
            for (int i = 0; i < length; i++) {
                Object element = Array.get(items[0], i);
                T item = (T)element;
                list.add(item);
            }
        } else {
            for (Object i : items) {
                T item = (T)i;
                list.add(item);
            }
        }
        return list;
    }

    //that method implement to wrapper!
    //all collections
    //https://docs.oracle.com/javase/tutorial/extra/generics/methods.html
    public <T> void fromArrayToCollection(T[] array, Collection<T> c) {
        for (T o : array) {
            c.add(o);
        }
    }

    //inverse method
    //work with all collections
    public int[] toInts(Collection<Integer> integers) {
        int[] ints = new int[integers.size()];
        int i = 0;
        for (Integer n : integers) {
            ints[i++] = n;
        }
        return ints;
    }

    public double[] toDoubles(Collection<Double> doubles) {
        double[] doub = new double[doubles.size()];
        int i = 0;
        for (Double n : doubles) {
            doub[i++] = n;
        }
        return doub;
    }

    public boolean[] toBooleans(Collection <Boolean> booleans) {
        boolean[] bool = new boolean[booleans.size()];
        int i = 0;
        for (Boolean n : booleans) {
            bool[i++] = n;
        }
        return bool;
    }

    public long[] toLongs(Collection<Long> longs) {
        long[] lon = new long[longs.size()];
        int i = 0;
        for (Long n : longs) {
            lon[i++] = n;
        }
        return lon;
    }

    public String[] toStrings(Collection<String> strings) {
        String[] str = new String[strings.size()];
        int i = 0;
        for (String n : strings) {
            str[i++] = n;
        }
        return str;
    }

    public Car[] toCars(Collection<Car> cars) {
        Car[] car = new Car[cars.size()];
        int i = 0;
        for (Car n : cars) {
            car[i++] = n;
        }
        return car;
    }

}
