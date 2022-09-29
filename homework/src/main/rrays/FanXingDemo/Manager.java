package main.rrays.FanXingDemo;

public class Manager extends Employee{
    private Integer workOfYear;

    public Manager(Integer id, String name, Integer age, String gender, Integer workOfYear) {
        super(id, name, age, gender);
        this.workOfYear = workOfYear;
    }

    public Manager(Integer workOfYear) {
        this.workOfYear = workOfYear;
    }

    public Integer getWorkOfYear() {
        return workOfYear;
    }

    public void setWorkOfYear(Integer workOfYear) {
        this.workOfYear = workOfYear;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", workOfYear=" + workOfYear +
                '}';
    }
}
