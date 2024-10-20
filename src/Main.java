//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // Беш объект туздук маанисин конструктор аркылуу бердик
        Person person1 = new Person("Aruke", 18, "The teacher", 10000, "10000");
        Person person2 = new Person("Gulzat", 25, "Cook", 11000, "11000");
        Person person3 = new Person("Melis", 28, "Programmer", 50000, "50000");
        Person person4 = new Person("Gulnaz", 26, "Designer", 20000, "20000");
        Person person5 = new Person("Sakina", 20, "Artist", 15000, "15000");

        Person[] people = {person1, person2, person3, person4, person5};
        for (Person person : people){
            System.out.println(person);
        }

        Person maxSalaryPerson = null;
        Person minSalaryPerson = null;
        Person mostExpensivePerson = null;

        for (Person person : people){
            if(maxSalaryPerson == null || person.getSalary() > maxSalaryPerson.getSalary()){
                maxSalaryPerson = person;
            }
            if(minSalaryPerson == null || person.getSalary() > minSalaryPerson.getSalary()){
                minSalaryPerson = person;
            }
            if(mostExpensivePerson == null || person.getPhone().compareTo(mostExpensivePerson.getPhone()) > 0){
                mostExpensivePerson = person;

                System.out.println();

                System.out.println("Эн айлык акысы жогору адам чыксын : " +maxSalaryPerson );
                System.out.println("Эн айлык акысы томон адам чыксын : "+ minSalaryPerson);
                System.out.println("Эн баасы жогору телефону бар адам чыксын : "+ mostExpensivePerson);
    }
}}}