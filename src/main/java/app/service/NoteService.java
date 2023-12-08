package app.service;

import app.crud.NoteRepository;
import app.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;


    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    public Note add(Note note) {
        return noteRepository.save(note);
    }

    public void deleteById(long id) {
        noteRepository.deleteById(id);
    }

    public Note update(Note updated) {
        return noteRepository.save(updated);
    }

    public Note getById(long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }
}
