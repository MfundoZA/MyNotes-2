package com.mfundoza.mynotes.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.mfundoza.mynotes.models.Note;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {
    private List<Note> savedNotes;

    public void setSavedNotes(List<Note> savedNotes) {
        this.savedNotes = savedNotes;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NotesViewHolder extends RecyclerView.ViewHolder {

        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
