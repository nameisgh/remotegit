package com.cn.info.controller;
import com.cn.info.pojo.Login;
import com.cn.info.pojo.Ship;
import com.cn.info.service.LoginService;
import com.cn.info.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by gh on 2017/5/9.
 */
@Controller
public class ShipController {

    @Autowired
    private LoginService loginservice;
    @Autowired
    private ShipService shipservice;
    @RequestMapping(value="/Login.action")
    public ModelAndView Login(
            @RequestParam("username")  String username,
            @RequestParam("password") String  password,
            HttpSession session)
    {
        ModelAndView mv=new ModelAndView();
        Login login=loginservice.login(username,password);
      if(login !=null){
          session.setAttribute("login",login);
          mv.setViewName("/html/main.html");
        }
        else{
            mv.addObject("message","登录名或密码有误.");
            mv.setViewName("/login.html");
        }
        return mv;
    }

    @RequestMapping(value = "/saveshipmessage.action")
    public void save(){
        Ship ship=new Ship();
        shipservice.saveshipMessage(ship);
    }

    @RequestMapping(value = "/getshipmessage.action")
    @ResponseBody
    public Object get(){
        System.out.println("*********************");
        List<Ship> ship_list=shipservice.getAll();
        System.out.println(ship_list);
        return ship_list;
    }
//    @RequestMapping(value = "/save.action", method = RequestMethod.POST)
//    public void GetMessageFromHtml(@RequestParam Map user, HttpServletResponse response) {
//        System.out.println("*********************");
//        ObjectMapper mapper=new ObjectMapper();
//        response.setContentType("text/html;charset=UTF-8");
//        try {
//           // response.getWriter().println(mapper.writeValueAsString(user));
//            response.getWriter().println(user);
//        } catch (Exception ex) {
//        }
//    }

}
