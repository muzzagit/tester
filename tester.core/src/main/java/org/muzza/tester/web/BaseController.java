package org.muzza.tester.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by muzzammil.ayyubi on 02 Nov, 15.
 */
@Controller
public class BaseController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Testing the spring web app";
    }

}
