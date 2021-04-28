package mapper;

import entity.professional;
import org.apache.ibatis.annotations.Param;

public interface professionalMapper {

    //新增投票人
    public int savePs(professional professional);

    //查找找是否同名
    public professional renmin(String uname);

    //更新票数
    public int uppiaosu(@Param("uname") String uname, @Param("ps") int ps);
}
