package bestPractice;

import model.Student;

public abstract class BestExport {

    protected Student data;

    public BestExport(Student data) {
        this.data = data;
    }

    public abstract Student export();


}
