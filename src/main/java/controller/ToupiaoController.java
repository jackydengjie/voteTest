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



    @RequestMapping(value = "/toSavePs",method = RequestMethod.POST)
    public String savePs(Toupiao toupiao, HttpServletRequest request){
        System.out.println("savePs方法开始执行！！！！");
        System.out.println(toupiao.getEmployees1());
        System.out.println(toupiao.getEmployees2());
        System.out.println(toupiao.getEmployees3());
        System.out.println(toupiao.getProfessional1());
        System.out.println(toupiao.getProfessional2());
        System.out.println(toupiao.getProfessional3());



        return "toSavePs";
    }

}
