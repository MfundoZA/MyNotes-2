package com.mfundoza.mynotes.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mfundoza.mynotes.models.Note;
import com.mfundoza.mynotes.repositories.NoteRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private NoteRepository noteRepository;
    private LiveData<List<Note>> savedNotes;

    public MainViewModel(@NonNull Application application) {
        super(application);

        noteRepository = new NoteRepository(application);
        savedNotes = noteRepository.getAllNotes();
    }

    public void insert(Note note) {
        noteRepository.insert(note);
    }

    public void update(Note note) {
        noteRepository.update(note);
    }

    public void delete(Note note) {
        noteRepository.delete(note);
    }

    public void deleteAllNotes() {
        noteRepository.deleteAllNotes();
    }
}
