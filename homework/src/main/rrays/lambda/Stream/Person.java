package main.rrays.lambda.Stream;

public class Person {
    private String name;


    public Person() {
    }

    public static Person building(String name){
        Person p = new Person();
        p.setName(name);
        return p;

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
