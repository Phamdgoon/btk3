package dgoon.mobile.kt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTacgia;
    ArrayList<Tacgia> arrayTacgia;
    tacgiaAdapter adapter;
    int vitri = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTacgia = (ListView) findViewById(R.id.tacgiaRV);

        mapping();

        adapter = new tacgiaAdapter(this, R.layout.tacgia_item, arrayTacgia);
        lvTacgia.setAdapter(adapter);

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayTacgia
        );
        lvTacgia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Tacgia course = arrayTacgia.get(i);
                Intent intent = new Intent(MainActivity.this, ListTacPhamActivity.class);
                startActivity(intent);
            }
        });
    }
    private void mapping() {
        lvTacgia = (ListView) findViewById(R.id.tacgiaRV);
        arrayTacgia = new ArrayList<>();

        arrayTacgia.add(new Tacgia("Huy cận", "Cù Huy Cận (1919 – 2005), bút danh hoạt động nghệ thuật là Huy Cận " +
                "Sáng tác của Huy Cận trước Cách mạng tháng 8 mang nét sầu não, buồn thương. Còn sau Cách mạng tháng" +
                " 8 thơ Huy Cận đã lột xác hoàn toàn, trở nên mới mẻ và tràn đầy sức sống. Có thể thấy rằng các sáng tác của Huy Cận luôn bám sát hiện thực cuộc sống, thời đại" , "*****",R.drawable.huycan));
        arrayTacgia.add(new Tacgia("Mạc Ngôn", "Mạc Ngôn (sinh ngày 17 tháng 2 năm 1955) là một nhà văn người Trung Quốc xuất thân từ nông dân." +
                "Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ đã được đạo diễn nổi tiếng Trương Nghệ Mưu chuyển thể thành phim. Bộ phim đã được giải Gấu vàng tại Liên hoan phim quốc tế Berlin năm 1988." , "*****",R.drawable.macngon));
        arrayTacgia.add(new Tacgia("Shakespeare", "William Shakespeare là một nhà viết kịch, nhà thơ và diễn viên người Anh." +
                "Ông được nhiều người coi là nhà văn vĩ đại nhất viết bằng tiếng Anh và là nhà viết kịch nổi tiếng của thế giới" , "*****",R.drawable.shakespeare));
        arrayTacgia.add(new Tacgia("Ernest Miller Hemingway ", "là một tiểu thuyết gia , nhà văn viết truyện ngắn và nhà báo người Mỹ . " +
                "Phong cách tiết kiệm và tinh tế của ông - mà ông gọi là lý thuyết tảng băng trôi -" +
                " có ảnh hưởng mạnh mẽ đến tiểu thuyết thế kỷ 20" ,"*****",R.drawable.ernesthemingway));

    }
}