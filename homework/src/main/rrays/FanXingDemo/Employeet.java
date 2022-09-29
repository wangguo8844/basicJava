package main.rrays.FanXingDemo;

public class Employeet extends Employee{

    public Employeet(Integer id, String name, Integer age, String gender) {
        super(id, name, age, gender);
    }

    public Employeet() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
