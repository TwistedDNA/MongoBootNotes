package net.twisteddna.base.services;

import net.twisteddna.base.Note;
import net.twisteddna.base.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotesService {
    @Autowired
    private NotesRepository notesRepository;

    public List<Note> getAllNotes(){
        return notesRepository.findAll();
    }
    public void addNote(String noteTextValue){
        notesRepository.save(Note.builder().text(noteTextValue).build());
    }
    public void deleteNote(String id){
        notesRepository.findById(id).ifPresent(note -> notesRepository.delete(note));
    }
}
