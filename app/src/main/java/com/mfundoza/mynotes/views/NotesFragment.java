package com.mfundoza.mynotes.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.mfundoza.mynotes.R;
import com.mfundoza.mynotes.adapters.NotesAdapter;
import com.mfundoza.mynotes.databinding.FragmentNotesBinding;
import com.mfundoza.mynotes.models.Note;
import com.mfundoza.mynotes.viewmodels.NotesViewModel;

import java.util.List;

public class NotesFragment extends Fragment {
    private NotesAdapter notesAdapter;
    private FragmentNotesBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentNotesBinding.inflate(inflater, container, false);

        notesAdapter = new NotesAdapter();
        binding.rcyNotes.setAdapter(notesAdapter);

        return binding.getRoot();


    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NotesViewModel notesViewModel = new ViewModelProvider(requireActivity()).get(NotesViewModel.class);
        notesViewModel.getSavedNotes().observe(getViewLifecycleOwner(), new Observer<List<Note>>() {
            @Override
            public void onChanged(List<Note> notes) {
                notesAdapter.setSavedNotes(notes);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}