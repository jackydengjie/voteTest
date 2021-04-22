package entity;
/*
    优秀主管表
 */

public class supervisor {
    public String uname;
    public int piaoshu;

    public supervisor() {
    }

    public supervisor(String uname, int piaoshu) {
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
