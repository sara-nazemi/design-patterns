package badPractice;

import model.Student;

public class BadExport {

    private Student data;

    public BadExport(Student data) {
        this.data = data;
    }

    public Student export(String type) {
        if (type.equals("pdf")) {
            System.out.println("trying to export pdf");
            return this.data;
        } else if (type.equals("excel")) {
            System.out.println("trying to export excel");
            return this.data;
        }
        return null;
    }
}
