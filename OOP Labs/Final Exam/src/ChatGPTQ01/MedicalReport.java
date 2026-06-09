package ChatGPTQ01;

public class MedicalReport {

    private String diagnosis;
    private String reportDate;

    public MedicalReport(String diagnosis, String reportDate) {
        this.diagnosis = diagnosis;
        this.reportDate = reportDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getReportDate() {
        return reportDate;
    }
}
