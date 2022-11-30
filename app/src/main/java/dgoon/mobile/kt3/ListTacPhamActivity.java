package dgoon.mobile.kt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListTacPhamActivity extends AppCompatActivity {

    ListView lvTacpham;
    ArrayList<TacPham> arrayTacpham;
    TacPhamAdapter adapter;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tac_pham);

        lvTacpham = (ListView) findViewById(R.id.tacphamlv);

        mapping();

        adapter = new TacPhamAdapter(this, R.layout.tacgia_item, arrayTacpham);
        lvTacpham.setAdapter(adapter);

        ArrayAdapter adapter = new ArrayAdapter(
                ListTacPhamActivity.this,
                android.R.layout.simple_list_item_1,
                arrayTacpham
        );

    }

    private void mapping() {
        lvTacpham = (ListView) findViewById(R.id.tacgiaRV);
        arrayTacpham = new ArrayList<>();

        arrayTacpham.add(new TacPham("Đoàn thuyền đánh cá","*****"));

    }
}