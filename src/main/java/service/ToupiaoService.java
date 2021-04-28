package service;

import entity.Toupiao;


public interface ToupiaoService {

    //新增投票人
    public String savePs(Toupiao toupiao,String[] jiegou);
}
