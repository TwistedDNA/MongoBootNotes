package net.twisteddna.base.controllers;

import net.twisteddna.base.commands.NotesCommand;
import net.twisteddna.base.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NotesController {

    @Autowired
    private NotesService notesService;

    @GetMapping("/notes")
    public String notes(Model model) {
        model.addAttribute("notes", notesService.getAllNotes());
        model.addAttribute("command", new NotesCommand());
        return "noteList";
    }

    @PostMapping("/notes")
    public String addNote(@ModelAttribute NotesCommand command){
        notesService.addNote(command);
        return "redirect:/notes";
    }
    @PostMapping("/notes/delete")
    public String deleteNote(@ModelAttribute NotesCommand command){
            notesService.deleteNote(command.getNoteIdToDelete());
            return "redirect:/notes";
    }
}
