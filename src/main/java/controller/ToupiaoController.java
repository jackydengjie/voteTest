package controller;

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
    private ToupiaoService  toupiaoService;

    @RequestMapping(value = "/toSavePs",method = RequestMethod.POST)
    public String savePs(@RequestBody employees employees, @RequestBody professional professional, HttpServletRequest request){
        System.out.println("employees的值是："+employees);
        System.out.println("professional的值是："+professional);
        return "toSavePs";
    }

}
