package warlock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import warlock.echo.EchoService;

@Controller
@RequestMapping("/echo.html")
public class EchoController {

    @Autowired
    private EchoService service;
    
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String handleGet() {
        return service.echo("It workzzzzz!");
    }
}
