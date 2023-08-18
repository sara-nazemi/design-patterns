package bestPracticeInterface;

import model.Student;

public class ExcelExporterImpl implements BestExportInterface {

    @Override
    public Student export(Student student) {
        System.out.println("export student excel with interface base method");
        return student;
    }

}
