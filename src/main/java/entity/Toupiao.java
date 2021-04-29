package entity;


import javax.validation.constraints.NotNull;

public class Toupiao {
    @NotNull
    private  String supervisor1;
    @NotNull
    private  String supervisor2;
    @NotNull
    private  String supervisor3;
    @NotNull
    private String employees1;
    @NotNull
    private String employees2;
    @NotNull
    private String employees3;
    @NotNull
    private String professional1;
    @NotNull
    private String professional2;
    @NotNull
    private String professional3;
    @NotNull
    private String professional4;
    @NotNull
    private String professional5;
    @NotNull
    private String professional6;

    public String getSupervisor1() {
        return supervisor1;
    }

    public void setSupervisor1(String supervisor1) {
        this.supervisor1 = supervisor1;
    }

    public String getSupervisor2() {
        return supervisor2;
    }

    public void setSupervisor2(String supervisor2) {
        this.supervisor2 = supervisor2;
    }

    public String getSupervisor3() {
        return supervisor3;
    }

    public void setSupervisor3(String supervisor3) {
        this.supervisor3 = supervisor3;
    }

    public String getEmployees1() {
        return employees1;
    }

    public void setEmployees1(String employees1) {
        this.employees1 = employees1;
    }

    public String getEmployees2() {
        return employees2;
    }

    public void setEmployees2(String employees2) {
        this.employees2 = employees2;
    }

    public String getEmployees3() {
        return employees3;
    }

    public void setEmployees3(String employees3) {
        this.employees3 = employees3;
    }

    public String getProfessional1() {
        return professional1;
    }

    public void setProfessional1(String professional1) {
        this.professional1 = professional1;
    }

    public String getProfessional2() {
        return professional2;
    }

    public void setProfessional2(String professional2) {
        this.professional2 = professional2;
    }

    public String getProfessional3() {
        return professional3;
    }

    public void setProfessional3(String professional3) {
        this.professional3 = professional3;
    }

    public String getProfessional4() {
        return professional4;
    }

    public void setProfessional4(String professional4) {
        this.professional4 = professional4;
    }

    public String getProfessional5() {
        return professional5;
    }

    public void setProfessional5(String professional5) {
        this.professional5 = professional5;
    }

    public String getProfessional6() {
        return professional6;
    }

    public void setProfessional6(String professional6) {
        this.professional6 = professional6;
    }

    @Override
    public String toString() {
        return "Toupiao{" +
                "supervisor1='" + supervisor1 + '\'' +
                ", supervisor2='" + supervisor2 + '\'' +
                ", supervisor3='" + supervisor3 + '\'' +
                ", employees1='" + employees1 + '\'' +
                ", employees2='" + employees2 + '\'' +
                ", employees3='" + employees3 + '\'' +
                ", professional1='" + professional1 + '\'' +
                ", professional2='" + professional2 + '\'' +
                ", professional3='" + professional3 + '\'' +
                ", professional4='" + professional4 + '\'' +
                ", professional5='" + professional5 + '\'' +
                ", professional6='" + professional6 + '\'' +
                '}';
    }
}
