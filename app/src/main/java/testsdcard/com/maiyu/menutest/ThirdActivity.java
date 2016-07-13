package testsdcard.com.maiyu.menutest;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by maiyu on 2016/7/12.
 */
public class ThirdActivity extends Activity {
    final int Menu_1 = Menu.FIRST;
    final int Menu_2 = Menu.FIRST + 1;
    final int Menu_3 = Menu.FIRST + 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        EditText Et = (EditText)findViewById(R.id.Et);
        registerForContextMenu(Et);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0 , Menu_1 , 0 ,"复制文字");
        menu.add(0 , Menu_2 , 0 ,"粘贴文字");
        menu.add(0 , Menu_3 , 0 ,"全选文字");
    }



    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                Toast.makeText(this , "复制文字" , Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this , "粘贴文字" , Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this , "全选文字" , Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
