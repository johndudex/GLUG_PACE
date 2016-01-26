package glugpace.org.glug_pace;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.AppCompatButton;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;




/**
 * A simple {@link Fragment} subclass.
 */
public class Results extends Fragment {
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;

    EditText UserUsn;
    Button UsnBtn;
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

        final View rootView = inflater.inflate(R.layout.results, container,
                false);
        UserUsn=(EditText)rootView.findViewById(R.id.EnterUSN);

        UsnBtn=(Button)rootView.findViewById(R.id.UsnBtn);
        UsnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(v);
            }
        });

        UserUsn.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode==KeyEvent.KEYCODE_ENTER)
                {
                    validate(v);
                    return true;
                }
                return false;
            }
        });


        return rootView;
    }

    private void validate(View v) {

        String Qstring = UserUsn.getText().toString().trim();
        if (Qstring.length() != 10) {
            Snackbar.make(v, "Check Your USN and enter again !!!", Snackbar.LENGTH_LONG).show();
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("url", Qstring);

            fragmentManager = getFragmentManager();
            WebViews wb = new WebViews();
            wb.setArguments(bundle);
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentholder, wb).addToBackStack(null);
            fragmentTransaction.commit();
        }

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
