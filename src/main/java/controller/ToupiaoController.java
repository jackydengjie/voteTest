package controller;

import entity.Toupiao;
import entity.employees;
import entity.professional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ToupiaoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ToupiaoController {

    @Resource
    private ToupiaoService toupiaoService;

    @RequestMapping(path = "/getUser",method = RequestMethod.POST)
    @ResponseBody
    public String savePs(Toupiao toupiao, HttpServletRequest request){
        System.out.println("savePs方法开始执行！！！！");
        System.out.println(toupiao);
        String[] shuigou=request.getParameterValues("type");
        System.out.println(shuigou);
        for (int i = 0; i < shuigou.length; i++) {
            String shuiguoname=shuigou[i];
            System.out.println(shuiguoname);
        }

        return toupiaoService.savePs(toupiao);
    }

}
