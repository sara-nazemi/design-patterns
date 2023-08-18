import badPractice.BadExport;
import bestPractice.BestExport;
import bestPractice.ExcelExporter;
import bestPractice.PdfExporter;
import model.Student;

public class Main {
    public static void main(String[] args) {
        // bad practice sample
        Student mohsen = new Student("mohsen", "mahmoudi");
        BadExport bad = new BadExport(mohsen);
        bad.export("pdf");
        bad.export("excel");


        //best practice sample
        Student sara = new Student("mohsen", "mahmoudi");

        BestExport pdf = new PdfExporter(sara);
        pdf.export();

        BestExport excel = new ExcelExporter(sara);
        excel.export();
    }
}
