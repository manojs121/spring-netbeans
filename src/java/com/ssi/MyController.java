/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SSI
 */
@Controller
public class MyController {
    
    @RequestMapping("CalculateInterest")
    public ModelAndView process(@ModelAttribute("info") InterestData data){
        ModelAndView mv=new ModelAndView("result.jsp");
        return mv;
    }
    @RequestMapping("dataentry")
    public String showInputForm(){
        return "entry.jsp";
    }
}
