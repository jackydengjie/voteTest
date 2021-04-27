package entity;

public class Toupiao {
    private String employees1;
    private String employees2;
    private String employees3;
    private String professional1;
    private String professional2;
    private String professional3;

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

    @Override
    public String toString() {
        return "Toupiao{" +
                "employees1='" + employees1 + '\'' +
                ", employees2='" + employees2 + '\'' +
                ", employees3='" + employees3 + '\'' +
                ", professional1='" + professional1 + '\'' +
                ", professional2='" + professional2 + '\'' +
                ", professional3='" + professional3 + '\'' +
                '}';
    }
}
