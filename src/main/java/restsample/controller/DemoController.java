package restsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/v2")
    public String sendGreetings() {
        return "Hello, World! - v2 - Changed!!!";
    }
}
