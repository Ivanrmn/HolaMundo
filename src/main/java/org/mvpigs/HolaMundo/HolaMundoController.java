package org.mvpigs.HolaMundo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HolaMundoController {

    @RequestMapping(path = "/")
    @ResponseBody
    public String Hola() {
        return "Hola mundo!";
    }
}
