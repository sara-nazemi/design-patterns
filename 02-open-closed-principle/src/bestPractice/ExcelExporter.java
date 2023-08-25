package bestPractice;

import model.Student;

public class ExcelExporter extends BestExport {

    public ExcelExporter(Student data) {
        super(data);
    }

    @Override
    public Student export() {
        System.out.println("trying to export excel");
        return this.data;
    }

}
