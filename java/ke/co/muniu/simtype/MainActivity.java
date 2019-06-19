package ke.co.muniu.simtype;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TelephonyManager tel;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tel = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        text2 = (TextView)findViewById(R.id.text);

        text2.setText("Operator Code : " + tel.getSimOperator().toString()
                +"\n Operator Name : " + tel.getSimOperatorName().toString()
                +"\n Country ISO : " + tel.getSimCountryIso().toString());
    }
}
