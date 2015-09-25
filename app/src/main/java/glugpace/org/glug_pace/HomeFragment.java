package glugpace.org.glug_pace;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;

public class HomeFragment extends Fragment  {
    private WebView wv;
    private int click=0;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_home, container,
                false);
        final TextView tmain=(TextView)rootView.findViewById(R.id.textmain);
        final TextView thnku1=(TextView)rootView.findViewById(R.id.thnku1);
        final TextView thnku2=(TextView)rootView.findViewById(R.id.thnku2);
        thnku1.setVisibility(View.INVISIBLE);
        thnku2.setVisibility(View.INVISIBLE);
        ImageButton gbtn=(ImageButton)rootView.findViewById(R.id.glugbtn);
        gbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click==0) {
                    tmain.setVisibility(View.INVISIBLE);
                    thnku1.setVisibility(View.VISIBLE);
                    thnku2.setVisibility(View.VISIBLE);
                    click=1;
                }
                else
                {
                    tmain.setVisibility(View.VISIBLE);
                    thnku1.setVisibility(View.INVISIBLE);
                    thnku2.setVisibility(View.INVISIBLE);
                    click=0;
                }
            }
        });
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}

