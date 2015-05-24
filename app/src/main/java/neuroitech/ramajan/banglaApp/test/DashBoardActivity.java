package neuroitech.ramajan.banglaApp.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.CustomGridViewAdapter;
import Entity.DashBoardItem;

/**
 * Created by Tanvir on 5/22/2015.
 */
public class DashBoardActivity extends ActionBarActivity {

    GridView dashItem;
    CustomGridViewAdapter customGridViewAdapter;
    ArrayList<DashBoardItem> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        dashItem = (GridView) findViewById(R.id.gridView1);

        item.add(new DashBoardItem(R.drawable.ramajan_image, "সাওম/রমজান"));
        item.add(new DashBoardItem(R.drawable.ramajan_image, "নিয়াত ও দোয়া"));
        item.add(new DashBoardItem(R.drawable.ramajan_image, "সালাত"));
        item.add(new DashBoardItem(R.drawable.ramajan_image, "ঈদ"));
        item.add(new DashBoardItem(R.drawable.ramajan_image, "সেহেরী ও ইফতার"));
        item.add(new DashBoardItem(R.drawable.ramajan_image, "রমজান ক্যালেন্ডার"));
        item.add(new DashBoardItem(R.drawable.ramajan_image, "নামাযের সময়সূচী"));
        item.add(new DashBoardItem(R.drawable.ramajan_image, "কাবাশরীফ অভিমুখ "));

        customGridViewAdapter = new CustomGridViewAdapter(DashBoardActivity.this,
                R.layout.row_grid_dashboard, item);

        dashItem.setAdapter(customGridViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.action_bar_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_alarm:
                setToast("Alarm Clicked");
                break;

            case R.id.action_salat:
                setToast("Salat Clicked");
                break;

            case R.id.action_seheri_iftar:
                setToast("Seheri & Iftar Clicked");
                break;

            case R.id.action_setting:
                setToast("Setting Clicked");
                break;

            default:
                break;
        }
        return true;
    }

    private void setToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
