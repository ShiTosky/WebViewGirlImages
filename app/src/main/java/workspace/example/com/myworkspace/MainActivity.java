package workspace.example.com.myworkspace;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.list_view)
    public ListView mListView;
    private List<ClassifyBean.TngouBean> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loadFromServer();
        mListView.setOnItemClickListener(mOnItemClickListener);
    }
    private AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(MainActivity.this,GalleryActivity.class);
            int type = mDataList.get(position).getId();
            intent.putExtra("id",type);
            startActivity(intent);
        }
    };

    private void loadFromServer() {
        String url = "http://apis.baidu.com/tngou/gallery/classify";
        SexyGirkRequest<ClassifyBean> request = new SexyGirkRequest<>(url, ClassifyBean.class, mLisetenre, mErorListener);
        NetworkManager.sendRequest(request);
    }

    private Listener<ClassifyBean> mLisetenre = new Listener<ClassifyBean>() {
        public void onResponse(ClassifyBean response) {
            mDataList = response.getTngou();
            mListView.setAdapter(mBaseAdapter);
        }
    };
    private ErrorListener mErorListener = new ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Toast.makeText(MainActivity.this, "网络错误，请稍后重试！", Toast.LENGTH_SHORT).show();
        }
    };
    public BaseAdapter mBaseAdapter = new BaseAdapter() {
        @Override
        public int getCount() {


            return mDataList == null ? 0 : mDataList.size();
        }

        @Override
        public ClassifyBean.TngouBean getItem(int position) {
            if (mDataList != null) {
                return mDataList.get(position);
            }
            return null;
        }

        @Override
        public long getItemId(int position) {

            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder =null;
            if (convertView == null) {
                convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.view_list_item,null);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            }else {
                holder = (ViewHolder) convertView.getTag();
            }
            ClassifyBean.TngouBean bean = mDataList.get(position);
            holder.mTextView.setText(bean.getTitle());
            return convertView;
        }
    };
    class ViewHolder{
        TextView mTextView;
        public ViewHolder(View root){
            mTextView = (TextView) root.findViewById(R.id.list_view_title);
        }
    }
}
