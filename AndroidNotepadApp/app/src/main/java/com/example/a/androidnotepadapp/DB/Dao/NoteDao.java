package com.example.a.androidnotepadapp.DB.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.a.androidnotepadapp.DB.Entity.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * from note_table")
    LiveData<List<Note>> getNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Note note);

    @Query("DELETE FROM note_table")
    void deleteAll();
}