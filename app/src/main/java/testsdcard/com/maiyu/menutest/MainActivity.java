package testsdcard.com.maiyu.menutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int Menu_1 = Menu.FIRST;
    private final static int Menu_2 = Menu.FIRST + 1;
    private final static int Menu_3 = Menu.FIRST + 2;
    private final static int Menu_4 = Menu.FIRST + 3;
    private final static int Menu_5 = Menu.FIRST + 4;
    private final static int Menu_6 = Menu.FIRST + 5;
    private final static int Menu_7 = Menu.FIRST + 6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0 , Menu_1 , 0 , "编辑模式");
        menu.add(0 , Menu_2 , 0 , "修改壁纸");
        menu.add(0 , Menu_3 , 0 , "全局搜索");
        menu.add(0 , Menu_4 , 0 , "桌面缩略图");
        menu.add(0 , Menu_5 , 0 , "桌面效果");
        menu.add(0 , Menu_6 , 0 , "系统设置");
        menu.add(0 , Menu_7 , 0 , "用户信息");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case 1:
                Toast.makeText(this , "你单击了编辑模式选项" , Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this , "你单击了修改壁纸选项" , Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this , "你单击了全局搜索选项" , Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this , "你单击了桌面缩略图选项" , Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this , "你单击了桌面效果选项" , Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this , "你单击了系统设置选项" , Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(this , "你单击了用户信息选项" , Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        Log.e("onOptionsMenuClosed" , "用户菜单关闭了");
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e("onPrepareOptionsMenu" , "用户菜单准备好被显示了");
        //return super.onPrepareOptionsMenu(menu);
        return true;
    }
}
