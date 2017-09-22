package bd.subject;

public class Subject {
    private String subjectName, statusPass, statusFail;
    private int mark;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getStatusPass() {
        return statusPass;
    }

    public void setStatusPass(String statusPass) {
        this.statusPass = statusPass;
    }

    public String getStatusFail() {
        return statusFail;
    }

    public void setStatusFail(String statusFail) {
        this.statusFail = statusFail;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
}
