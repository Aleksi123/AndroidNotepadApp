package com.example.a.androidnotepadapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "title")
    private String mTitle;

    @ColumnInfo(name = "note")
    private  String mNote;

    public Note(@NonNull String title, String note) {
        this.mTitle = title;
        this.mNote = note;
    }

    public String getTitle(){return this.mTitle;}

    public String getNote() { return this.mNote; }
}