public class Person {
//  Task4  Cоздайте класс Person c полями(name,
//                                   age, work, salary, phone). В main
//    создайте 5 объектов класса, дайте
//    значения через конструктор, положите
//    эти объекты в массив, сначала
//    выведите все эти объекты на консоль.
//    Теперь выведите человека у которого
//    самая высокая зарплата, выведите у
//    кого самая низкая зарплата, выведите у
//    кого самый дорогой телефо

    //  Класс туздук полелерин жаздык
    String name;
    int age;
    String work;
    int salary;//эмгек акы
    String phone;

    public Person(String name, int age, String work, int salary, String phone) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;

    }
    public int getSalary(){
        return salary;
    }
    public String getPhone(){
        return phone;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name : " + name + '\'' +
                ", age : " + age +
                ", work : " + work + '\'' +
                ", salary : " + salary +
                ", phone : " + phone + '\'' +
                '}';
}}
