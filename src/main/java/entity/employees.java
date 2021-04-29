package entity;

/*
    优秀员工表

 */

import java.io.Serializable;
  /*实现序列化接口*/
public class employees {
      private String uname;
      private int piaoshu;

    public employees() {
    }

    public employees(String uname, int piaoshu) {
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
