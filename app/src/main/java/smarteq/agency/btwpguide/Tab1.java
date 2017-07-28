package smarteq.agency.btwpguide;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by ${Burhan} on 27.07.2017.
 * burhantoprakman@gmail.com
 */

public class Tab1 extends Fragment implements View.OnClickListener {
    private Button btn_tab1_1,btn_tab1_2,btn_tab1_3,btn_tab1_4,btn_tab1_5,
                   btn_tab1_6,btn_tab1_7,btn_tab1_8,btn_tab1_9,btn_tab1_10;
    private ScrollView tab1_sv;
    private ScrollView tab1_INVISsv;
    private TextView tab1_txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_tab1,container,false);

        btn_tab1_1=rootview.findViewById(R.id.btn_tab1_1);
        btn_tab1_2=rootview.findViewById(R.id.btn_tab1_2);
        btn_tab1_3=rootview.findViewById(R.id.btn_tab1_3);
        btn_tab1_4=rootview.findViewById(R.id.btn_tab1_4);
        btn_tab1_5=rootview.findViewById(R.id.btn_tab1_5);
        btn_tab1_6=rootview.findViewById(R.id.btn_tab1_6);
        btn_tab1_7=rootview.findViewById(R.id.btn_tab1_7);
        btn_tab1_8=rootview.findViewById(R.id.btn_tab1_8);
        btn_tab1_9=rootview.findViewById(R.id.btn_tab1_9);
        btn_tab1_10=rootview.findViewById(R.id.btn_tab1_10);
        tab1_sv=rootview.findViewById(R.id.tab1_sv);
        tab1_txt=rootview.findViewById(R.id.tab1_txt);
        tab1_INVISsv=rootview.findViewById(R.id.tab1_INVISsv);
        tab1_sv.setVisibility(View.VISIBLE);
        tab1_INVISsv.setVisibility(View.INVISIBLE);
        listeners();


        return rootview;
    }

    public void listeners(){
        btn_tab1_1.setOnClickListener(this);
        btn_tab1_2.setOnClickListener(this);
        btn_tab1_3.setOnClickListener(this);
        btn_tab1_4.setOnClickListener(this);
        btn_tab1_5.setOnClickListener(this);
        btn_tab1_6.setOnClickListener(this);
        btn_tab1_7.setOnClickListener(this);
        btn_tab1_8.setOnClickListener(this);
        btn_tab1_9.setOnClickListener(this);
        btn_tab1_10.setOnClickListener(this);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        // write logic here b'z it is called when fragment is visible to user
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        tab1_sv.setVisibility(View.VISIBLE);
        tab1_INVISsv.setVisibility(View.INVISIBLE);
        super.onPause();
    }


    @Override
    public void onClick(View view) {
        tab1_sv.setVisibility(View.INVISIBLE);
        tab1_INVISsv.setVisibility(View.VISIBLE);
        switch (view.getId()){

            case R.id.btn_tab1_1:
              tab1_txt.setText(R.string.tab1_1_txt);

                break;
            case R.id.btn_tab1_2:
                tab1_txt.setText(R.string.tab1_2_txt);
                break;
            case R.id.btn_tab1_3:
                tab1_txt.setText(R.string.tab1_3_txt);
                break;
            case R.id.btn_tab1_4:
                tab1_txt.setText(R.string.tab1_4_txt);
                break;
            case R.id.btn_tab1_5:
                tab1_txt.setText(R.string.tab1_5_txt);
                break;
            case R.id.btn_tab1_6:
                tab1_txt.setText(R.string.tab1_6_txt);
                break;
            case R.id.btn_tab1_7:
                tab1_txt.setText(R.string.tab1_7_txt);
                break;
            case R.id.btn_tab1_8:
                tab1_txt.setText(R.string.tab1_8_txt);
                break;
            case R.id.btn_tab1_9:
                tab1_txt.setText(R.string.tab1_9_txt);
                break;
            case R.id.btn_tab1_10:
                tab1_txt.setText(R.string.tab1_10_txt);
                break;
            default:
                break;

        }

    }
}

