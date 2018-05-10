package net.twisteddna.base.controllers;

import net.twisteddna.base.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotesController {

    @Autowired
    private NotesService notesService;

    @GetMapping("/notes")
    public String notes(Model model) {
        model.addAttribute("notes", notesService.getAllNotes());
        return "noteList";
    }
}
