package com.gy.allen.databasetest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.gy.allen.databasetest.bean.Books;

import org.litepal.LitePal;

/**
 * Created by allen on 17/2/17.
 */

public class LiteSqlActivity extends AppCompatActivity {
    private Button addData;
    private Button update;
    private Button query;
    private Button createDatabase;
    private Button delete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_lite);
        initView();
        initListener();
    }

    private void initView() {
        createDatabase = (Button) findViewById(R.id.createDatabaseLite);
        addData = (Button) findViewById(R.id.addDataLite);
        delete = (Button) findViewById(R.id.deleteLite);
        update = (Button) findViewById(R.id.updateLite);
        query = (Button) findViewById(R.id.queryLite);
    }

    private void initListener() {
        createDatabase.setOnClickListener(v -> {
            Toast.makeText(this,"haha",Toast.LENGTH_LONG).show();
            LitePal.getDatabase();
        });
        addData.setOnClickListener(v -> {

            for (int i = 0; i < 10; i++) {
                Books books = new Books();
                books.setAuthor("allen"+i);
                books.setName("我爱的人");
                books.setPages(300+i);
                books.setPrice(19.99);
                books.save();
            }

        });

        delete.setOnClickListener(v -> {

        });

        update.setOnClickListener(v -> {

        });

        query.setOnClickListener(v -> {

        });
    }

}
