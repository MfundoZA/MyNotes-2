package com.mfundoza.mynotes.roomdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.mfundoza.mynotes.models.Note;

@Database(entities = {Note.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
}
