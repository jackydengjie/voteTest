package mapper;

import org.apache.ibatis.annotations.Param;

public interface professionalMapper {

    //新增投票人
    public int savePs(String uname);
    //更新票数
    public int uppiaosu(@Param("ps") String ps, @Param("uname") String uname);
}
