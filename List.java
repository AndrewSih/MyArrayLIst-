package ArrayListTry;

import java.util.Comparator;

public interface List <T> {
    void add (T element);
    void add(int index, T element);
    void set(int index, T element);
    T get (int index);
    T remove(int index);
    boolean index(T element);
    int size();
    boolean isEmpty();
    T getFirstElement();
    T getLastElement();

}
