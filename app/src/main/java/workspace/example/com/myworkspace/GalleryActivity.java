package workspace.example.com.myworkspace;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by ShiLiang on 2016/10/12.
 */
public class GalleryActivity extends AppCompatActivity{
    private static final String TAG = "GalleryActivity";
    @BindView(R.id.activity_gallery_listview)
    ListView mListView;
    private List<GalleryBean.TngouBean> mDataList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ButterKnife.bind(this);
        loadFromServer();
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int girlId = mDataList.get(position).getId();
                Intent intent = new Intent(GalleryActivity.this,DetailsActivity.class);
                intent.putExtra("girlId",girlId);
                startActivity(intent);
            }
        });
    }

    private void loadFromServer() {
        int id = getIntent().getIntExtra("id", 0);
        String url ="http://apis.baidu.com/tngou/gallery/list?id=" + id + "&page=1&rows=20";
        SexyGirkRequest<GalleryBean> request = new SexyGirkRequest<GalleryBean>(url,GalleryBean.class,mListener,mErrorListener);
        NetworkManager.sendRequest(request);
    }
    private Response.Listener<GalleryBean> mListener = new Response.Listener<GalleryBean>() {
        @Override
        public void onResponse(GalleryBean response) {
            mDataList = response.getTngou();
            mListView.setAdapter(mBaseAdapter);
        }
    };
    private Response.ErrorListener mErrorListener = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Toast.makeText(GalleryActivity.this, "网络连接错误！", Toast.LENGTH_SHORT).show();
        }
    };
    private BaseAdapter mBaseAdapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return mDataList==null?0:mDataList.size();
        }

        @Override
        public GalleryBean.TngouBean getItem(int position) {
            if (mDataList != null) {
                return  mDataList.get(position);
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
                convertView=LayoutInflater.from(GalleryActivity.this).inflate(R.layout.activity_gallery_list_item,null);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            }else{
                holder = (ViewHolder) convertView.getTag();
            }
            GalleryBean.TngouBean bean = mDataList.get(position);
            holder.mContent.setText(bean.getTitle());
            String url = "http://tnfs.tngou.net/image"+bean.getImg();
            Glide.with(GalleryActivity.this).load(url).
                    bitmapTransform(new CropCircleTransformation(GalleryActivity.this)).into(holder.mImage);
            return convertView;
        }
    };
    class ViewHolder{
//        ImageView mImage;
        TextView mContent;
        @BindView(R.id.activity_gallery_item_image)
        ImageView mImage;
        public ViewHolder(View root){
            ButterKnife.bind(this,root);
            mImage = (ImageView) root.findViewById(R.id.activity_gallery_item_image);
            mContent = (TextView) root.findViewById(R.id.activity_gallery_item_content);
        }

    }
}
