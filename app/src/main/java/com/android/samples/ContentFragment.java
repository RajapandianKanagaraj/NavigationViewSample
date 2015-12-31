package com.android.samples;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ContentFragment extends Fragment implements HomeActivity.OnDrawerMenuClickListener {


    private TextView contentTextView;
    private RelativeLayout contentLayout;

    public ContentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_content, container, false);
        contentTextView = (TextView) rootView.findViewById(R.id.content);
        contentLayout = (RelativeLayout) rootView.findViewById(R.id.content_layout);
        return rootView;
    }

    @Override
    public void onDrawerMenuClick(int menuId) {
        int contextString = R.string.blue;
        int bgColor = R.color.blue;
        switch (menuId) {
            case R.id.blue:
                contextString = R.string.blue;
                bgColor = R.color.blue;
                break;
            case R.id.light_green:
                contextString = R.string.light_green;
                bgColor = R.color.light_green;
                break;
            case R.id.indigo:
                contextString = R.string.indigo;
                bgColor = R.color.indigo;
                break;
            case R.id.pink:
                contextString = R.string.pink;
                bgColor = R.color.pink;
                break;
            case R.id.orange:
                contextString = R.string.orange;
                bgColor = R.color.orange;
                break;
            case R.id.purple:
                contextString = R.string.purple;
                bgColor = R.color.purple;
                break;
            case R.id.cyan:
                contextString = R.string.cyan;
                bgColor = R.color.cyan;
                break;
            case R.id.light_blue:
                contextString = R.string.light_blue;
                bgColor = R.color.light_blue;
                break;
            case R.id.green:
                contextString = R.string.green;
                bgColor = R.color.green;
                break;
            case R.id.lime:
                contextString = R.string.lime;
                bgColor = R.color.lime;
                break;
        }
        contentTextView.setText(getString(contextString));
        contentLayout.setBackgroundResource(bgColor);
    }
}
