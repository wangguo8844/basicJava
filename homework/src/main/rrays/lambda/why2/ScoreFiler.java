package main.rrays.lambda.why2;

import main.rrays.lambda.why.Student;

public class ScoreFiler implements StudentFiler{
    @Override
    public boolean compare(Student student) {
        return student.getScore()>15;
    }
}
