package testsdcard.com.maiyu.menutest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

/**
 * Created by maiyu on 2016/7/12.
 */
public class SecondActivity extends AppCompatActivity {
    final  static int  Menu_1 = Menu.FIRST;
    final  static int Menu_2 = Menu.FIRST + 1;
    final  static int Menu_3 = Menu.FIRST + 2;
    final  static int Menu_4 = Menu.FIRST + 3;
    final  static int Menu_5 = Menu.FIRST + 4;
    final  static int Menu_6 = Menu.FIRST + 5;
    final  static int Menu_7 = Menu.FIRST + 6;
    final  static int Menu_8 = Menu.FIRST + 7;
    final  static int Menu_9 = Menu.FIRST + 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        SubMenu fileMenu = menu.addSubMenu("新建");
        fileMenu.add(0 , Menu_1 , 0 , "文件1");
        fileMenu.add(0 , Menu_2 , 0 , "文件2");
        fileMenu.add(0 , Menu_3 , 0 , "文件3");

        SubMenu openMenu = menu.addSubMenu("打开");
        openMenu.add(0 , Menu_4 , 0 , "文件4");
        openMenu.add(0 , Menu_5 , 0 , "文件5");
        openMenu.add(0 , Menu_6 , 0 , "文件6");

        SubMenu saveMenu = menu.addSubMenu("保存");
        openMenu.add(0 , Menu_7 , 0 , "文件7");
        openMenu.add(0 , Menu_8 , 0 , "文件8");
        openMenu.add(0 , Menu_9 , 0 , "文件9");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                Toast.makeText(this ,"新建文件1" , Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this ,"新建文件2" , Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this ,"新建文件3" , Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this ,"打开文件4" , Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this ,"打开文件5" , Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this ,"打开文件6" , Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(this ,"保存文件7" , Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Toast.makeText(this ,"保存文件8" , Toast.LENGTH_SHORT).show();
                break;
            case 9:
                Toast.makeText(this ,"保存文件9" , Toast.LENGTH_SHORT).show();
                break;
            default:
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
