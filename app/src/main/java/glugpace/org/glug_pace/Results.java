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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Results extends Fragment {

    WebView resultsWV,revalWV;
    Button resbtn,revbtn;
    TextView clickhere;
    public Results() {
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

        View rootView = inflater.inflate(R.layout.results, container,
                false);
            resbtn =(Button)rootView.findViewById(R.id.resBtn);
            revbtn=(Button)rootView.findViewById(R.id.revBtn);
            clickhere=(TextView)rootView.findViewById(R.id.text1);
            resultsWV=(WebView)rootView.findViewById(R.id.results);
            resultsWV.setVisibility(View.INVISIBLE);

            resbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickhere.setVisibility(View.INVISIBLE);
                    resultsWV.setVisibility(View.VISIBLE);
                    resbtn.setVisibility(View.INVISIBLE);
                    revbtn.setVisibility(View.INVISIBLE);
                    resultsWV.getSettings().setJavaScriptEnabled(true);
                    resultsWV.loadUrl("http://results.vtu.ac.in");

                    resultsWV.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);
                            return false;
                        }
                    });
                    resultsWV.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_BACK && resultsWV.canGoBack())
                            {
                                resultsWV.goBack();
                                return true;
                            }
                            return false;
                        }
                    });

                }
            });

            revbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    resultsWV.setVisibility(View.VISIBLE);
                    resbtn.setVisibility(View.INVISIBLE);
                    revbtn.setVisibility(View.INVISIBLE);
                    resultsWV.getSettings().setJavaScriptEnabled(true);
                    resultsWV.loadUrl("http://results.vtu.ac.in/vitavireval.php");
                    clickhere.setVisibility(View.INVISIBLE);
                    resultsWV.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);
                            return false;
                        }
                    });
                    resultsWV.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_BACK && resultsWV.canGoBack()) {
                                resultsWV.goBack();
                                return true;
                            }
                            return false;
                        }
                    });
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
