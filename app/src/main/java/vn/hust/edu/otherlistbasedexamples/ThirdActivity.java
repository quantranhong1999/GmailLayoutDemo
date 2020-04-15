package vn.hust.edu.otherlistbasedexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;


import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThirdActivity extends AppCompatActivity {

    List<ContactModel> contacts;
    Faker faker = new Faker();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Random rnd = new Random();

        contacts = new ArrayList<>();
        contacts.add(new ContactModel(faker.name().name(), "1:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, true));
        contacts.add(new ContactModel(faker.name().name(), "11:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, false));
        contacts.add(new ContactModel(faker.name().name(), "12:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, false));
        contacts.add(new ContactModel(faker.name().name(), "13:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, true));
        contacts.add(new ContactModel(faker.name().name(), "14:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, true));
        contacts.add(new ContactModel(faker.name().name(), "15:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, false));
        contacts.add(new ContactModel(faker.name().name(), "16:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, true));
        contacts.add(new ContactModel(faker.name().name(), "17:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, false));
        contacts.add(new ContactModel(faker.name().name(), "18:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, true));
        contacts.add(new ContactModel(faker.name().name(), "19:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, true));
        contacts.add(new ContactModel(faker.name().name(), "20:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, false));
        contacts.add(new ContactModel(faker.name().name(), "21:00",faker.lorem().sentence(),faker.lorem().paragraph(),Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)), R.drawable.thumb1, true));


        ContactAdapter adapter = new ContactAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
