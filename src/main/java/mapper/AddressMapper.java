package mapper;

import entity.address;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    //保存已投票的网卡MAC地址(设置的返回值要以MYSQL的返回值来定，例如insert插入新行的返回值是数值是int所以返回值要用int型)
    public int saveMac(@Param("macaddress") String macaddress, @Param("ipaddress") String ipaddress, @Param("cname") String cname);


    //查找是否有相同的mac地址
    public address smac(String maca);
}
