package service.impl;

import entity.Toupiao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ToupiaoService;

@Service
public class ToupiaoServiceImpl implements ToupiaoService {


    @Override
    @ResponseBody
    public String savePs(Toupiao toupiao, String[] jiegou) {
        System.out.println("ToupiaoServiceImpl方法执行了！");
        System.out.println(toupiao);
        /*System.out.println(jiegou);
        for (int i = 0; i < jiegou.length; i++) {
            String shuiguoname=jiegou[i];
            System.out.println(shuiguoname);
        }*/



        return null;
    }
}
