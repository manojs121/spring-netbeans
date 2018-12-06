package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaxController {
    
    @RequestMapping("CalculateTax")
    public ModelAndView process(@ModelAttribute("data") TaxInfo info){
        ModelAndView mv=new ModelAndView("taxinfo.jsp");
        return mv;
    }
    
    
    
    @RequestMapping("taxation")
    public String show(){
        return "userdata.jsp";
    }
    
}
