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
        public String processAddPage(@Valid PotObject potObject, BindingResult result) {
            if (result.hasErrors()) {
                return "index";
            }
            return "index";
        }

        @GetMapping("/person")
        public String person(Model model)
        {
            Iterable<Person> personList = personRepository.findAll();
            model.addAttribute("PersonList", personListList);
            return "personList";
        }

        @PostMapping("/personlist")
        public String loadListAllPage(@ModelAttribute PersonList personList)
        {

            return "personlist";
        }


        @GetMapping("/education")
        public String loadListAllPage(Model model)

       {
        Iterable<Education> educationList = educationRepository.findAll();
        model.addAttribute("EducationList", educationList);
        return "educationlist";

       }

       @PostMapping("/education")
       public String loadListAllPage(@ModelAttribute EducationList educationList)

       {
        return "educationlist";
       }


       @GetMapping("/experiencelist")
       public String experienceList(Model model)
        {
        Iterable<Experience> experienceList = experienceRepository.findAll();
        model.addAttribute("ExperienceList", experienceList);
        return "experiencelist";
        }

       @PostMapping("/experience")
       public String loadListAllPage(@ModelAttribute ExperienceList experiencelist)
        {
        return "experienceList";
        }

    @GetMapping("/skillslist")
    public String skillsList(Model model)
    {
        Iterable<Skills> SkillsList = SkillsRepository.findAll();
        model.addAttribute("SkillsList", skillList);
        return "skillsList";
    }

    @PostMapping("/skillslist")
    public String loadListAllPage(@ModelAttribute SkillsList skillsList)
    {
        return "skillsList";
    }



        }



        }
