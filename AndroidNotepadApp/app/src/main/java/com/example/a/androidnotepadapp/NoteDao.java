package com.example.a.androidnotepadapp;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * from note_table ORDER BY note ASC")
    LiveData<List<Note>> getAlphabetizedWords();

    @Insert
    void insert(Note note);

    @Query("DELETE FROM note_table")
    void deleteAll();
}
