package main.rrays.FanXingDemo;


/**
 * 使用泛型集合解决实际问题
 * 声明员工类Employeet包含如下属性：id,name,age,gender(枚举类型)
 * 声明程序员类programmer,含有属性popularity.人气值
 * 声明项目经理类,含有属性workOfYear_工作年限
 * 程序员与项目前经理都继承自Employee
 * 需求说明：
 * 使用泛型集合ArrayList,LinkedList,HashSet,.TreeSet完成员工的添加
 * 删除，
 * 判断，集合中元素个数的判断
 *
 */
public abstract class Employee<A> {
    Integer id;
    String name;
    Integer age;
    String gender;

    public Employee(Integer id, String name, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
