package bestPracticeInterface;

import model.Student;

public class PdfExporterImpl implements BestExportInterface, AdditionalInterface {

    @Override
    public Student export(Student student) {
        System.out.println("export student pdf with interface base method");
        return student;
    }

    @Override
    public void additional() {
        // ...
    }
}
