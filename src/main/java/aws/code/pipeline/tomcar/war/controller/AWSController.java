package aws.code.pipeline.tomcar.war.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/build-status")
@RestController
public class AWSController {

    public String show()
    {
        return "So far so good "+ new Date();
    }
}