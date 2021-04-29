package controller;

import entity.Toupiao;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import service.ToupiaoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Enumeration;

@Controller
public class ToupiaoController {

    @Resource
    private ToupiaoService toupiaoService;

    @RequestMapping(value="/toSavePs",method = RequestMethod.POST)
    public String savePs(@Valid Toupiao toupiao, HttpServletRequest request){
        System.out.println("savePs方法开始执行！！！！");
        System.out.println(request);

        Enumeration pNames=request.getParameterNames();
        while(pNames.hasMoreElements()){
            String name=(String)pNames.nextElement();
            String value=request.getParameter(name);
            if (value!="" && !(name.equals("type"))){
                System.out.println(name + "=" + value);
            }else {
                System.out.println(value+"不正确");
            }

           /* if(value.equals(toupiao.getEmployees1())||value.equals(toupiao.getEmployees2())||value.equals(toupiao.getEmployees3())){
                System.out.println(name + "=" + value);
            }else {
                System.out.println(value+"不正确");
                break;
            }*/

        }
        /*String[] values = request.getParameterValues("type");
        for(String value : values){
            System.out.println(value);
        }*/

        System.out.println(toupiao);

        /*return toupiaoService.savePs(toupiao,jiegou);*/
        return "toSavePs";
    }


}
