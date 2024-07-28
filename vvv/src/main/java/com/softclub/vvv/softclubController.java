package com.softclub.vvv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class softclubController {

    // @Autowired
    // private UserService userService;

    @RequestMapping(value="/",method = RequestMethod.GET)
    @ResponseBody
    public String example(Model model) {
        
        return "Hello2";
    }

}