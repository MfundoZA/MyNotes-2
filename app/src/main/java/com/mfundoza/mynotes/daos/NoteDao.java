package com.mfundoza.mynotes.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.mfundoza.mynotes.models.Note;

import java.util.List;

@Dao
public interface NoteDao {
    @Insert
    void insert(Note note);

    @Query("SELECT * FROM note")
    List<Note> getAllNotes();

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Delete
    void deleteAll(Note... notes);
}
