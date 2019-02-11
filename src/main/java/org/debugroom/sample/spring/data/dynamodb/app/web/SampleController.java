package org.debugroom.sample.spring.data.dynamodb.app.web;

import org.debugroom.sample.spring.data.dynamodb.domain.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(method = RequestMethod.GET, value = "sample")
    public String sample(Model model){
        model.addAttribute("samples", sampleService.getSampleTables());
        return "sample";
    }

}
