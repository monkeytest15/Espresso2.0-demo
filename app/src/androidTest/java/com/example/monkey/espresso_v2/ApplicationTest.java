package com.example.monkey.espresso_v2;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.ActivityInstrumentationTestCase2;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import android.widget.TextView;
import com.robotium.solo.Solo;
import android.support.test.runner.AndroidJUnitRunner;
import 	android.support.test.InstrumentationRegistry;
import  android.support.test.runner.AndroidJUnit4;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    TextView mtv;

    Solo solo;

    public MainActivity mActivity;


    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testHelloWorld() {
        String TextViewString = getActivity().getString(R.string.hello_world);

        onView(withText(TextViewString)).check(matches(isDisplayed()));
    }
}