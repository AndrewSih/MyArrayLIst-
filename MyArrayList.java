package ArrayListTry;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class implements a non-thread-safe ArrayList
 *
 * @author Sigai Andrey
 * @param <T>
 */
public class MyArrayList<T> implements List<T> {
    public static void main(String[] args) {
        /*MyArrayList<Integer> list = new MyArrayList<Integer>();
//        list.add(2);
//        list.add(8);
//        list.add(3);
//        list.add(5);
//        list.add(1);
//        list.add(0);
//        list.get(1);
        System.out.println(list);
        MyArrayList<String> list2 = new MyArrayList<String>();
        list2.add("Dog");
        list2.add("Cat");
        list2.add("Duck");
        System.out.println(list2);*/

    }

    /**
     * The field in which we will save the data
     */
    private Object[] elements;

    /**
     * Field with default capacity
     */
    private static final int CAPACITY = 0;

    /**
     * Field for array size
     */
    private int size;

    /**
     * This constructor creates an instance of {@link MyArrayList} with a specific
     *  of an array inside
     *
     * @param initCapacity  the initial of the list
     * @throws IllegalArgumentException  if capacity is negative or 0
     */

    public MyArrayList(int initCapacity) {
        if(initCapacity <= 0 ){
            throw new IllegalArgumentException();
        }
        elements = new Object[initCapacity];
    }

    /**
     * This constructor creates an instance of {@link MyArrayList} with a default
     * capacity of an array inside
     *
     * A default size of inner array is 5
     */

    public MyArrayList()
    {
        elements = (Object[]) new Object[CAPACITY];
    }

    /**
     * Adds an element to the array
     *
     * @param element  element to add
     */
@Override
    public void add (T element){
        resizeArray(); //проверяем есть ли куда добавить
        elements [size] = element;
        size++;
    }

    /**
     * If the array is full, increase the array
     */
    private void resizeArray(){
        if ( elements.length == size){ // если длина массива равно заполненым ячейкам
            Object[] newArray = new Object[elements.length + 1]; // новый массив с увеличеной длиной на 1
            System.arraycopy(elements, 0, newArray, 0, size);// добавляем со старого в новый
            elements = newArray; // присваиваем новый массив
        }
    }

    /**
     *Adds an element to the specific position in the array
     *
     * @param index  index of position
     * @param element  element to add
     */
    @Override
    public void add(int index, T element){
        resizeArray();
        System.arraycopy(elements, index, elements, index +1, size - index);
        elements[index] = element;
        size++;
    }

    /**
     * Сhecking the index
     *
     * @param index index of element
     * @throws IllegalArgumentException if index less than 0 or index greater than or equal to size
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();}

    /**
     * Change the value of array at specific position
     *
     * @param index position of value
     * @param element a new value
     */
    @Override
    public void set(int index, T element){
        Objects.checkIndex(index, size);
        elements[index] = element;
    }

    /**
     * Returns an element by its position index
     *
     * @param index index of element
     * @return en element
     */
    @Override
    public T get (int index){
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }

    /**
     * Removes an element by its position index
     *
     * @param index element index
     * @return deleted element
     */
    @Override
    public T remove(int index){
        T removeElement =(T)elements[index];
        System.arraycopy(elements, index+1 , elements, index, size - index-1 );
        size--;
        return removeElement;
    }

    /**
     * Check for existing of a specific element in the list.
     *
     * @param element is element
     * @return if element exists returns true, else returns false
     */
    @Override
    public boolean index(T element)
    {
        for (int i = 0; i <size ; i++) {
            if (element.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return amount of saved elements
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks if a list is empty
     *
     * @return if list is empty returns  true, else returns false
     */
    @Override
    public boolean isEmpty(){
        if(size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Returns the first element of the list
     *
     * @return the first element of the list
     */
    @Override
    public T getFirstElement(){
        return get(0);
    }

    /**
     * Returns the last element of the list
     *
     * @return the last element of the list
     */
    @Override
    public T getLastElement(){
        return get(size-1);
    }

    @Override
    public String toString() {
        return "Значения в моем Arraylist " + Arrays.toString(elements) +  " \nВсех ячеек " + elements.length +
                " \nЗанятых ячеек " + size;
    }

}
