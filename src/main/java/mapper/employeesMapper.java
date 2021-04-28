package mapper;

import entity.employees;
import org.apache.ibatis.annotations.Param;



/*
    优秀员工表

 */

public interface employeesMapper {

    //新增投票人
    public int savePs(employees employees);

    //查找找是否同名
    public employees renmin(String uname);

    //更新票数
    public int uppiaosu(@Param("uname") String uname, @Param("ps") int ps);
}
