package entity;
/*
    敬业之星表
 */

public class professional {
    private String uname;
    private int piaoshu;

    public professional() {
    }

    public professional(String uname, int piaoshu) {
        this.uname = uname;
        this.piaoshu = piaoshu;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getPiaoshu() {
        return piaoshu;
    }

    public void setPiaoshu(int piaoshu) {
        this.piaoshu = piaoshu;
    }

    @Override
    public String toString() {
        return "employees{" +
                "uname='" + uname + '\'' +
                ", piaoshu=" + piaoshu +
                '}';
    }
}
