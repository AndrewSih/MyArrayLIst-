package ArrayListTry;
public class Person implements Comparable<Person>{

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+ "\n ";
    }

    public static void main(String[] args) {
        MyArrayList<Person> person = new MyArrayList<Person>();
        person.add(new Person(1, "Andrew", 20));
        person.add(new Person(3, "Sergey", 21));
        person.add(new Person(2, "Roman", 19));
        person.sort(Person::compareTo);
        System.out.println(person);
            }
        @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }
}
