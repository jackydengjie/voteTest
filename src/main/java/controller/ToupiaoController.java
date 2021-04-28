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

    @RequestMapping(value="/toSavePs",method = RequestMethod.POST)
    public String savePs(Toupiao toupiao, HttpServletRequest request){
        System.out.println("savePs方法开始执行！！！！");
        System.out.println(toupiao);

        String[] jiegou=request.getParameterValues("type");//读取前台checkbox选中的选项用字符数组读取
        System.out.println(jiegou);
        toupiaoService.savePs(toupiao,jiegou);

        /*return toupiaoService.savePs(toupiao,jiegou);*/
        return "toSavePs";
    }


}
