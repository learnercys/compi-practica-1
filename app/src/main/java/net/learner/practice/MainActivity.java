package net.learner.practice;

import android.app.AlertDialog;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

import net.learner.practice.parser.Parser;
import net.learner.practice.scanner.Scanner;

import java.io.IOException;
import java.io.StringReader;

public class MainActivity extends FragmentActivity {

    PagerAdapter pagerAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

    public void onCompileButton( String toCompile) {

        // see if the current text is empty
        if( toCompile.trim().length() == 0 ) {
            new AlertDialog.Builder(this)
                    .setMessage("Ingresa una sentencia")
                    .show();

            return;
        }

        Scanner scanner = new Scanner( new StringReader(toCompile) );

        Parser parser = new Parser( scanner );

        try {
            parser.parse();

            if ( parser.hasUnRecoveredSyntaxError ) {
                new AlertDialog.Builder(this)
                        .setMessage("La sentencia ingresada contiene errores sintacticos")
                        .show();

                return;
            }

            if ( scanner.hasErrors() ) {
                // has errors
                new AlertDialog.Builder(this)
                        .setMessage("La sentecia ingresada contiene errores lexicos")
                        .show();

                // TODO show lexical errors

                return;
            }

            // TODO show shapes

        } catch ( IOException ioe) {
            // do nothing
            new AlertDialog.Builder(this)
                    .setMessage("IOException fired")
                    .show();

        } catch ( Exception e) {
            // do nothing to
            new AlertDialog.Builder(this)
                    .setMessage("Exception fired")
                    .show();
        }

        viewPager.setCurrentItem(1);
    }

    public void onBackButton() {
        Log.d("log", "back");
        viewPager.setCurrentItem(0);
    }
}
