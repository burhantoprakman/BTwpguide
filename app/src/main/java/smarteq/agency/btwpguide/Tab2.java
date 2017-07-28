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

public class Tab2 extends Fragment implements View.OnClickListener {
    private Button btn_tab2_1,btn_tab2_2,btn_tab2_3,btn_tab2_4,btn_tab2_5,
            btn_tab2_6,btn_tab2_7,btn_tab2_8,btn_tab2_9,btn_tab2_10,
            btn_tab2_11,btn_tab2_12,btn_tab2_13;
    private ScrollView tab2_sv;
    private ScrollView tab2_INVISsv;
    private TextView tab2_txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_tab2,container,false);

        btn_tab2_1=rootview.findViewById(R.id.btn_tab2_1);
        btn_tab2_2=rootview.findViewById(R.id.btn_tab2_2);
        btn_tab2_3=rootview.findViewById(R.id.btn_tab2_3);
        btn_tab2_4=rootview.findViewById(R.id.btn_tab2_4);
        btn_tab2_5=rootview.findViewById(R.id.btn_tab2_5);
        btn_tab2_6=rootview.findViewById(R.id.btn_tab2_6);
        btn_tab2_7=rootview.findViewById(R.id.btn_tab2_7);
        btn_tab2_8=rootview.findViewById(R.id.btn_tab2_8);
        btn_tab2_9=rootview.findViewById(R.id.btn_tab2_9);
        btn_tab2_10=rootview.findViewById(R.id.btn_tab2_10);
        btn_tab2_11=rootview.findViewById(R.id.btn_tab2_11);
        btn_tab2_12=rootview.findViewById(R.id.btn_tab2_12);
        btn_tab2_13=rootview.findViewById(R.id.btn_tab2_13);
        tab2_sv=rootview.findViewById(R.id.tab2_sv);
        tab2_txt=rootview.findViewById(R.id.tab2_txt);
        tab2_INVISsv=rootview.findViewById(R.id.tab2_INVISsv);
        tab2_sv.setVisibility(View.VISIBLE);
        tab2_INVISsv.setVisibility(View.INVISIBLE);
        listeners();

        return rootview;
    }
    public void listeners(){
        btn_tab2_1.setOnClickListener(this);
        btn_tab2_2.setOnClickListener(this);
        btn_tab2_3.setOnClickListener(this);
        btn_tab2_4.setOnClickListener(this);
        btn_tab2_5.setOnClickListener(this);
        btn_tab2_6.setOnClickListener(this);
        btn_tab2_7.setOnClickListener(this);
        btn_tab2_8.setOnClickListener(this);
        btn_tab2_9.setOnClickListener(this);
        btn_tab2_10.setOnClickListener(this);
        btn_tab2_11.setOnClickListener(this);
        btn_tab2_12.setOnClickListener(this);
        btn_tab2_13.setOnClickListener(this);
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
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        tab2_sv.setVisibility(View.INVISIBLE);
        tab2_INVISsv.setVisibility(View.VISIBLE);
        switch (view.getId()){

            case R.id.btn_tab2_1:
                tab2_txt.setText(R.string.tab2_1_txt);

                break;
            case R.id.btn_tab2_2:
                tab2_txt.setText(R.string.tab2_2_txt);
                break;
            case R.id.btn_tab2_3:
                tab2_txt.setText(R.string.tab2_3_txt);
                break;
            case R.id.btn_tab2_4:
                tab2_txt.setText(R.string.tab2_4_txt);
                break;
            case R.id.btn_tab2_5:
                tab2_txt.setText(R.string.tab2_5_txt);
                break;
            case R.id.btn_tab2_6:
                tab2_txt.setText(R.string.tab2_6_txt);
                break;
            case R.id.btn_tab2_7:
                tab2_txt.setText(R.string.tab2_7_txt);
                break;
            case R.id.btn_tab2_8:
                tab2_txt.setText(R.string.tab2_8_txt);
                break;
            case R.id.btn_tab2_9:
                tab2_txt.setText(R.string.tab2_9_txt);
                break;
            case R.id.btn_tab2_10:
                tab2_txt.setText(R.string.tab2_10_txt);
                break;
            case R.id.btn_tab2_11:
                tab2_txt.setText(R.string.tab2_11_txt);
                break;
            case R.id.btn_tab2_12:
                tab2_txt.setText(R.string.tab2_12_txt);
                break;
            case R.id.btn_tab2_13:
                tab2_txt.setText(R.string.tab2_13_txt);
                break;
            default:
                break;

        }

    }
}
