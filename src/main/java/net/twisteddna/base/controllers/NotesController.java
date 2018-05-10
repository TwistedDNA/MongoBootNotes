package net.twisteddna.base.controllers;

import net.twisteddna.base.Note;
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
        model.addAttribute("newNote", new Note());
        return "noteList";
    }

    @PostMapping("/notes")
    public String addNote(@ModelAttribute Note note){
        notesService.saveNote(note);
        return "noteAdded";
    }
    @PostMapping("/deleteNote")
    public String addNote(@ModelAttribute String noteId, Model model){
            notesService.deleteNote(noteId);
            return "redirect:/notes";
    }
}
