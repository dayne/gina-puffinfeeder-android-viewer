package edu.alaska.gina.feeder.puffinfeeder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Adapter that places thumbnails off the feed into the primary GridView.
 * Created by bobby on 6/19/13.
 */
public class PicassoImageAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<FeedImage> mFeedImages;

    public PicassoImageAdapter(Context c, ArrayList<FeedImage> feedImages) {
        this.mContext = c;
        this.mFeedImages = feedImages;
    }

    @Override
    public int getCount() {
        return mFeedImages.size();
    }

    @Override
    public Object getItem(int position) {
        return mFeedImages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setPadding(0,0,0,0);

        Picasso.with(mContext).load(mFeedImages.get(position).getThumbnail()).resize(250, 250).centerCrop().into(imageView);

        return imageView;
    }
}
