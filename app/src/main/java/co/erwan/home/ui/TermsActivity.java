package co.erwan.home.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.erwan.home.R;
import co.erwan.home.util.UserAccountUtils;
import co.erwan.home.util.UserSettingsUtils;

public class TermsActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!UserAccountUtils.getPlusProfileId(this).equals("")) {
            goToMainActivity();
        } else if (UserSettingsUtils.isTermsAccepted(this)) {
            goToLoginActivity();
        }

        setContentView(R.layout.activity_welcome);

        findViewById(R.id.button_accept).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            UserSettingsUtils.acceptTerms(TermsActivity.this);
            goToLoginActivity();
            }
        });

        findViewById(R.id.button_decline).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void goToLoginActivity() {
        Intent intent = new Intent(TermsActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private void goToMainActivity() {
        Intent intent = new Intent(TermsActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
