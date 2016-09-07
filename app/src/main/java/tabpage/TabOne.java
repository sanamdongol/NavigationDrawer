package tabpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.razio.FourActivity;
import com.razio.OneActivity;
import com.razio.R;
import com.razio.ThreeActivity;
import com.razio.TwoActivity;

/**
 * Created by sanam on 8/15/16.
 */
public class TabOne extends Fragment implements View.OnClickListener {
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        btnOne = (Button) rootView.findViewById(R.id.btnClickOne);
        btnTwo = (Button) rootView.findViewById(R.id.btnClickTwo);
        btnThree = (Button) rootView.findViewById(R.id.btnClickThree);
        btnFour = (Button) rootView.findViewById(R.id.btnClickFour);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnClickOne:
                Intent one = new Intent(getActivity(), OneActivity.class);
                startActivity(one);
                break;
            case R.id.btnClickTwo:
                Intent two = new Intent(getActivity(), TwoActivity.class);
                startActivity(two);
                break;
            case R.id.btnClickThree:
                Intent three = new Intent(getActivity(), ThreeActivity.class);
                startActivity(three);
                break;
            case R.id.btnClickFour:
                Intent four = new Intent(getActivity(), FourActivity.class);
                startActivity(four);
                break;
        }
    }
}
