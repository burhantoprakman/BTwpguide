package smarteq.agency.btwpguide;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by ${Burhan} on 27.07.2017.
 * burhantoprakman@gmail.com
 */

public class Tab3 extends Fragment implements AdapterView.OnItemClickListener {
    private String[] title={"1.WhatsApp Son Güncelleme (Durum ve Güvenlik Özelliği)","2. 11 WhatsApp özelliklerini bilmeyebilirsiniz","3. WhatsApp En Son Özellikler ve Püf Noktaları 2017",
        "4.6 WhatsApp Hakkında Bilmeniz Gereken Yeni Özellikler","5.10 Denemeniz Gereken Yeni WhatsApp Hilelerini Serinleyin"," 6. Whatsapp Sesli Arama Özelliğini Etkinleştirme",
        "7. Gizli Whatsapp Özellikleri","8. Whatsapp Calling özelliğini Kök Olmadan Etkinleştir / Etkinleştir","9. Whatsapp Yeni Özellik - Son Görülme Zamanını, Profil Resmi ve Durumunu Gizle",
        "10. Whatsapp'ta mavi keneleri nasıl devre dışı bırakabilirim?","11. Silinmiş WhatsApp İletilerini Kurtarma",
        "12. Whatsapp Sohbeti Yedekleme ve Geri Yükleme","13. Birisinin WhatsApp'de Engellediğini Nasıl Kontrol Verebilirsiniz?"};
    private ListView lv;
    ArrayAdapter<String> arrayAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_tab3,container,false);
        lv=rootview.findViewById(R.id.listview);
        arrayAdapter=new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, title);

       lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(this);

        return rootview;
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
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent=new Intent(getActivity(),VideosActivity.class);
        intent.putExtra("position",i);
        startActivity(intent);
    }
}