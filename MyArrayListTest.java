package ArrayListTry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
MyArrayList<Integer> listTest = new MyArrayList<>();
MyArrayList<String> listTest1 = new MyArrayList<>();

@Test
    void add() {
    listTest.add(1);
    listTest.add(2);
    listTest.add(3);
    assertEquals(1,listTest.get(0));
    assertEquals(2,listTest.get(1));
    assertEquals(3,listTest.get(2));

    listTest1.add("Cat");
    listTest1.add("Dog");
    listTest1.add("Duck");

    assertEquals("Cat",listTest1.get(0));
    assertEquals("Dog",listTest1.get(1));
    assertEquals("Duck",listTest1.get(2));
    }

    @Test
    void testAdd() {
        listTest.add(0,34);
        listTest.add(1, 35);
        listTest.add(2,36);
        assertEquals(34,listTest.get(0));
        assertEquals(35,listTest.get(1));
        assertEquals(36,listTest.get(2));

        listTest1.add(0,"Dog");
        listTest1.add(1,"Cat");
        listTest1.add(2,"Duck");

        assertEquals("Dog",listTest1.get(0));
        assertEquals("Cat",listTest1.get(1));
        assertEquals("Duck",listTest1.get(2));

    }

    @Test
    void set() {
        listTest.add(0,1);
        listTest.add(1,2);
        listTest.add(2,3);
        listTest.set(0, 34);
        listTest.set(1, 35);
        listTest.set(2, 36);
        assertEquals(34,listTest.get(0));
        assertEquals(35,listTest.get(1));
        assertEquals(36,listTest.get(2));

        listTest1.add(0,"Dog");
        listTest1.add(1,"Cat");
        listTest1.add(2,"Duck");
        listTest1.set(0, "Elephant");
        listTest1.set(1, "Tiger");
        listTest1.set(2, "Panda");
        assertEquals("Elephant",listTest1.get(0));
        assertEquals("Tiger",listTest1.get(1));
        assertEquals("Panda",listTest1.get(2));
    }

    @Test
    void get() {
        listTest.add(0,1);
        listTest.add(1,2);
        listTest.add(2,3);
        assertEquals(1,listTest.get(0));
        assertEquals(2,listTest.get(1));
        assertEquals(3,listTest.get(2));

        listTest1.add(0,"Dog");
        listTest1.add(1,"Cat");
        listTest1.add(2,"Duck");
        assertEquals("Dog",listTest1.get(0));
        assertEquals("Cat",listTest1.get(1));
        assertEquals("Duck",listTest1.get(2));
    }

    @Test
    void remove() {
        listTest.add(0,1);
        listTest.add(1,2);
        listTest.add(2,3);

        listTest.remove(1);
        assertEquals(1,listTest.get(0));
        assertEquals(3,listTest.get(1));

        listTest1.add(0,"Dog");
        listTest1.add(1,"Cat");
        listTest1.add(2,"Duck");
        listTest1.remove(1);
        assertEquals("Dog",listTest1.get(0));
        assertEquals("Duck",listTest1.get(1));
    }

    @Test
    void index() {
        listTest.add(3);
        assertEquals(true,listTest.index(3));

        listTest1.add("Duck");
        assertEquals(true,listTest1.index("Duck"));
    }

    @Test
    void size() {
        listTest.add(1);
        listTest.add(2);
        listTest.add(2,3);
        listTest.add(3,4);
        assertEquals(4, listTest.size());
    }

    @Test
    void isEmpty() {
        assertEquals(true, listTest.isEmpty());

        listTest.add(1);
        assertEquals(false, listTest.isEmpty());
    }

    @Test
    void getFirstElement() {
        listTest.add(10);
        listTest.add(20);
        listTest.add(30);

        assertEquals(10, listTest.getFirstElement());
    }

    @Test
    void getLastElement() {
        listTest.add(10);
        listTest.add(20);
        listTest.add(30);

        assertEquals(30, listTest.getLastElement());
    }
}