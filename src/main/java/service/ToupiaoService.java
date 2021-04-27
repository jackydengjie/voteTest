package service;

import entity.employees;
import entity.professional;

public interface ToupiaoService {

    //新增投票人
    public int savePs(employees employees1, employees employees2, employees employees3, professional professional1,
                      professional professional2, professional professional3);
}
