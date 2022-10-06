package main.rrays.lambda.why2;

import main.rrays.lambda.why.Student;

public class AgeFiler implements StudentFiler{
    @Override
    public boolean compare(Student student) {
        return student.getAge()>26;
    }
}
