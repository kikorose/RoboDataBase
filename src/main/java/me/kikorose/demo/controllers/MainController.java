package me.kikorose.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {


        @Autowired
        private PotObjectRepository potObjectRepository;

        @GetMapping("/")
        public String welcomePage()
        {
            return "welcome";
        }

        @GetMapping("/add")
        public String loadAddPage(Model model)
        {
            model.addAttribute("potObject", new PotObject());
            return "add";
        }

        @PostMapping("/add")
        public String processAddPage(@Valid PotObject potObject, BindingResult result) {
            if (result.hasErrors()) {
                return "add";
            }
            return "addconfirm";
        }

        @GetMapping("/listAll")
        public String loadListAllPage(Model model)
        {
            Iterable<PotObject> potObjectList = potObjectRepository.findAll();
            model.addAttribute("listOfPotObjects", potObjectList);
            return "listAll";
        }

        @PostMapping("/listAll")
        public String loadListAllPage(@ModelAttribute PotObject potObject)
        {
            return "confirmpotObject";
        }

        @GetMapping("/searchFood")
        public String loadSearchFoodPage()
        {
            return "searchFood";
        }


    }

}
