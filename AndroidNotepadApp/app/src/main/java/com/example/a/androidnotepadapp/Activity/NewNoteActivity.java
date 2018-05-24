package com.example.a.androidnotepadapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.a.androidnotepadapp.R;

public class NewNoteActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";
    public static final String EXTRA_REPLY2 = "com.example.android.wordlistsql.REPLY2";
    private  EditText mEditTitleView;
    private  EditText mEditNoteView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        mEditTitleView = findViewById(R.id.edit_title);
        mEditNoteView = findViewById(R.id.edit_note);

        FloatingActionButton button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(mEditTitleView.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String title = mEditTitleView.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, title);
                    setResult(RESULT_OK, replyIntent);

                    String note = mEditNoteView.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY2,note);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}

