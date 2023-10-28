package moses.zal.SecurityMicroService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/edufy/security")
public class AdminRestController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello World!";
  }
}
