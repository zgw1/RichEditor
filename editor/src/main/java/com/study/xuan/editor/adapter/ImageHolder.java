package com.study.xuan.editor.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.study.xuan.editor.R;
import com.study.xuan.editor.model.RichModel;

public class ImageHolder extends RecyclerView.ViewHolder implements RichContract.IVHolder {
    public ImageView mIv;
    public ImageView mIvDelete;
    public RichContract.IPresenter mPresenter;

    ImageHolder(View itemView) {
        super(itemView);
        mIv = (ImageView) itemView.findViewById(R.id.iv_rich_img);
        mIvDelete = (ImageView) itemView.findViewById(R.id.iv_rich_delete);
    }

    @Override
    public void setPresenter(RichContract.IPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onBind(Context context, RichModel model) {

    }

    @Override
    public void setImage(String url) {

    }
}