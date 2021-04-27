package service.impl;

import entity.Toupiao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ToupiaoService;

@Service
public class ToupiaoServiceImpl implements ToupiaoService {


    @Override
    @ResponseBody
    public String savePs(Toupiao toupiao) {
        System.out.println("ToupiaoServiceImpl方法执行了！");
        System.out.println(toupiao);


        return null;
    }
}
