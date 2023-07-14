package alex.springframework.controllers;

import alex.springframework.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    //imposto la richiesta o sulla root o su una pagina non contenete la /
    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }

}
