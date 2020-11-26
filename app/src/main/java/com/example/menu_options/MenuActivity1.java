package kz.jihc.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.menu_options.MenuActivity;

public class MenuActivity1 extends AppCompatActivity implements ViewOnClickListener {

    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent menu1 = new Intent(this, MenuActivity.class);
        startActivity(menu1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    MenuInflater menuInflater = getMenuInflater();
    menuInflater.inflate(R.menu.main, menu);

    return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){
            case R.id.menu_settings:
                Toast.makeText(context:this, text:"Settings menu clicked", Toast.LENGTH_SHORT).short
                break;
            case R.id.menu_refresh:
                Toast.makeText(context:this, text:"Refresh menu clicked", Toast.LENGTH_SHORT).short
                break;
            case R.id.menu_delete:
                Toast.makeText(context:this, text:"Delete menu clicked", Toast.LENGTH_SHORT).short
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
