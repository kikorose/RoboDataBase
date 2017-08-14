package me.kikorose.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {


        @Autowired
        Person  person;
        @Autowired
        Education  education;
        @Autowired
        Experience  experience;
        @Autowired
        Skills  skills;


        @GetMapping("/index")
        public String welcomePage()
        {
            return "welcome";
        }

        @GetMapping("/person")
        public String person(Model model)
        {
            model.addAttribute("person", new Person());
            return "person";
        }

        @GetMapping("/education")
        public String education(Model model)

       {
           model.addAttribute("education", new Education());
           return "education";
       }

        @GetMapping("/experience")
        public String experience(Model model)

        {
           model.addAttribute("experience", new Experience());
           return "experience";
        }

        @GetMapping("/skills")
        public String skills(Model model)

       {
        model.addAttribute("skills", new Skills());
        return "skills";
       }


        @PostMapping("/index")
        public String index(@Valid @ModelAttribute, BindingResult bindingResult)
        {
            if (result.hasErrors()) {
                return "index";
            }
            return "index";
        }

        @GetMapping("/person")
        public String person(Model model)
        {
            Iterable<Person> personList = personRepository.save();
            model.addAttribute("PersonList", personListList);
            return "personList";
        }

        @PostMapping("/personlist")
        public String personListList(Model model)
         model.addAttriburte(@Valid @ModelAttribute BindingResults bindingResults, Model model)
        {
            if (result.hasErrors()) {
                return "personList";
            }

            return "personlist";
        }


        @GetMapping("/educationList")
        public String educationList(Model model)

       {
        Iterable<Education> educationList = educationRepository.save();
        model.addAttribute(@valid @ModelAttributer "EducationList", educationList BindingResult bindingResult);
        return "educationlist";

       }

       @PostMapping("/education")
       public String educationList(Model model)
        model.addAttribute(@Valid @ModelAttribute EducationList educationList BindingResult bindingResult)

        {

        }
        if (bindingResult.hasErrors()) {
            return "educationlist";
        }
        return "educationList";

        }

       @GetMapping("/experiencelist")
       public String experienceList(Model model)
        {
        Iterable<Experience> experienceList = experienceRepository.findAll();
        model.addAttribute("ExperienceList", experienceList);
        return "experiencelist";
        }

       @PostMapping("/experiencelist")
       public String experienceList(Model model)
        model.addAttributes(@Valid @ModelAttribute ExperienceList experiencelist BindingResult bindingResult)
        {
            if(bindingResult.hasErrors()) {
            return "experienceList";
        }

    @GetMapping("/skillslist")
    public String skillsList(Model model)
    {
        Iterable<Skills> SkillsList = SkillsRepository.save();
        model.addAttribute("SkillsList", skillList);
        return "skillsList";
    }

    @PostMapping("/skillslist")
    public String skillList(@valid @ModelAttribute ("SkillsList") SkillsList,
                BindingResult bindingResult, Model model) {
            System.out.println("");
    {
        if(bindingResult.hasErrors()) {
            model.addAttribute("educationList", educationListRepo.save());
        return "skillsList";
    }




    }



        }



        }
