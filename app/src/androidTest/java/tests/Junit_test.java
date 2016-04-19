package tests;
import android.test.ActivityInstrumentationTestCase2;
//import com.example.justin.testproject.MyActivity;
import com.example.justin.testproject.MyActivity;
import com.example.justin.testproject.R;

import android.widget.TextView;
/**
 * Created by Justin on 4/13/2016.
 */
public class Junit_test extends ActivityInstrumentationTestCase2<MyActivity> {
    MyActivity myActivity;
    public Junit_test() {
        super(MyActivity.class);
    }

    public void test_first()
    {
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}
