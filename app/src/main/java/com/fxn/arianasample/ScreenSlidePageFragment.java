package com.fxn.arianasample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fxn.ariana.ArianaTextListener;
import com.fxn.ariana.GradientAngle;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScreenSlidePageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScreenSlidePageFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    @BindView(R.id.textView)
    TextView textView;
    // TODO: Rename and change types of parameters
    private String mParam1;

    public ScreenSlidePageFragment() {
        // Required empty public constructor
    }

    public static ScreenSlidePageFragment newInstance(String param1) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container, false);
        ButterKnife.bind(this, rootView);
        textView.setText(mParam1);
        ((MainActivity) getActivity()).viewPager.addOnPageChangeListener(
                new ArianaTextListener(Utils.getColors(), textView,
                        ((MainActivity) getActivity()).viewPager,
                        GradientAngle.RIGHT_TOP_TO_LEFT_BOTTOM));

        return rootView;
    }

}
