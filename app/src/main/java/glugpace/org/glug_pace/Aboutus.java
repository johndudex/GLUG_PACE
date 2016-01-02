package glugpace.org.glug_pace;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Aboutus extends Fragment {


    ImageButton dev;
    int click=0;
    public Aboutus() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.about_us, container,
                false);
       final TextView credit2=(TextView)rootView.findViewById(R.id.credit2);
        final TextView credit3=(TextView)rootView.findViewById(R.id.credit3);
       final TextView developers=(TextView)rootView.findViewById(R.id.developers);
        credit2.setVisibility(View.VISIBLE);
        credit3.setVisibility(View.VISIBLE);
        developers.setVisibility(View.INVISIBLE);
        dev=(ImageButton)rootView.findViewById(R.id.credit1);
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click==0)
                {
                    credit2.setVisibility(View.INVISIBLE);
                    credit3.setVisibility(View.INVISIBLE);
                    developers.setVisibility(View.VISIBLE);
                    click=1;
                }
                else
                {
                    click=0;
                    credit2.setVisibility(View.VISIBLE);
                    credit3.setVisibility(View.VISIBLE);
                    developers.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    
    
}
