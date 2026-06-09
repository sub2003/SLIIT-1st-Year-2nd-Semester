package ChatGPTQ02;

public class CourseMaterial {

    private String materialTitle;
    private String fileType;

    public CourseMaterial(String materialTitle, String fileType) {
        this.materialTitle = materialTitle;
        this.fileType = fileType;
    }

    public String getMaterialTitle() {
        return materialTitle;
    }

    public String getFileType() {
        return fileType;
    }
}
