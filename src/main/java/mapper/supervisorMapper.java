package mapper;


import entity.supervisor;
import org.apache.ibatis.annotations.Param;

public interface supervisorMapper {

    //新增投票人
    public int savePs(supervisor supervisor);

    //查找找是否同名
    public supervisor renmin(String uname);

    //更新票数
    public int uppiaosu(@Param("uname") String uname,@Param("ps") int ps);


}
