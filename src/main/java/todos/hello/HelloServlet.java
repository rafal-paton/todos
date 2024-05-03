package todos.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
class HelloServlet {
    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);

    private HelloService service;

    HelloServlet(HelloService service) {
        this.service = service;
    }

    @GetMapping(value = "/api")
    String welcome(@RequestParam(value = "lang", required = false) Integer langId, @RequestParam(required = false) String name) {
        logger.info("Got request");
        return service.prepareGreeting(name, langId);
    }
}
