package com.mfundoza.mynotes.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.mfundoza.mynotes.models.Note;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {
    private List<Note> savedNotes = new List<>();

    public void setSavedNotes(List<Note> savedNotes) {
        this.savedNotes = savedNotes;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflator.from(parent.getContext())
        .inflate(R.layout.note_item, parent, false);

        return new NotesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        // Todo implement method
    }

    @Override
    public int getItemCount() {
        return savedNotes.size();
    }

    // Todo finish NotesViewHolder
    class NotesViewHolder extends RecyclerView.ViewHolder {

        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
