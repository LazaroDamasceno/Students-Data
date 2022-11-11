package com.studentdata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.ArrayList;

@Controller
public class StudentsDataController {

    List<StudentsData> studentsData = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("data", new StudentsData());
        return "form";
    }

    @GetMapping("/table")
    public String getTable(Model model) {
        model.addAttribute("data", studentsData);
        return "table";
    }

    @PostMapping("/submitData")
    public String submitData(StudentsData sd) {
        studentsData.add(sd);
        return "redirect:/table";
    }

}
