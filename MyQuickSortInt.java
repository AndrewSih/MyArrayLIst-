package ArrayListTry;

public class MyQuickSortInt {
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<Integer>();
        list1.add(9);
        list1.add(8);
        list1.add(3);
        list1.add(5);
        list1.add(1);
        list1.add(0);
        list1.add(6);
        list1.add(6);
        list1.add(6);
        System.out.println(sort(list1));
    }

    /**
     * Quick array sorting
     * @param t
     * @return returns sorted list
     * @author Sigai Andrey
     */
    public static MyArrayList<Integer> sort (MyArrayList<Integer> t) {
        if (t.size() <= 1) {
            return t;
        }
        int middle = t.size() / 2; // находим середину листа
        int pivot = t.get(middle); // опорная точка - середина листа
        MyArrayList<Integer> low = new MyArrayList<Integer>(); //список значений до опорной точки
        MyArrayList<Integer> high = new MyArrayList<Integer>(); // список после опорной точки

        for (int i = 0; i < t.size(); i++) { // перебераем список
            if( t.get(i)<= pivot){ // если индекс меньше либо равно опорной точке
                if( i == middle){ // если индекс равен середине
                    continue;
                }
                low.add(t.get(i)); // добавляем в список слева
            }
            else{
                high.add((t.get(i))); // добавляем в список справа
            }
        }
        return join(sort(low), pivot, sort(high));
    }
    public static MyArrayList<Integer> join
            (MyArrayList<Integer> low, int pivot, MyArrayList<Integer> high){
        MyArrayList<Integer> list1 = new MyArrayList<Integer>();
        for (int i = 0; i <low.size() ; i++) {
            list1.add(low.get(i));

        }
        list1.add(pivot);
        for (int i = 0; i < high.size() ; i++) {
            list1.add(high.get(i));

        }
        return list1;
    }

}

