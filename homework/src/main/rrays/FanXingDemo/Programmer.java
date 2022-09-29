package main.rrays.FanXingDemo;

public class Programmer extends Employee{
    private Integer popularity;

    public Programmer(Integer id, String name, Integer age, String gender, Integer popularity) {
        super(id, name, age, gender);
        this.popularity = popularity;
    }

    public Programmer(Integer popularity) {
        this.popularity = popularity;
    }



    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
