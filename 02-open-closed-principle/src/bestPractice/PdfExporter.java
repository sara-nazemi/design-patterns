package bestPractice;

import model.Student;

public class PdfExporter extends BestExport {

    public PdfExporter(Student data) {
        super(data);
    }

    @Override
    public Student export() {
        System.out.println("trying to export pdf");
        return this.data;
    }

}
