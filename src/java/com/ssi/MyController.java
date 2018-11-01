/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SSI
 */
@Controller
public class MyController {
    
    @RequestMapping("calculate")
    public ModelAndView process(@RequestParam("t1") int amt){
        ModelAndView mv=new ModelAndView("result.jsp");
        int interest=amt*5/100;
        mv.addObject("amount", amt);
        mv.addObject("interest",interest);
        return mv;
    }
    @RequestMapping("dataentry")
    public String show(){
        return "entry.jsp";
    }
}
