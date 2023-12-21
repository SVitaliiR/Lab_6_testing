package com.example.lab_2;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.*;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;


import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.lab_2", appContext.getPackageName());
    }

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testCharCount() {
        // Input text
        Espresso.onView(withId(R.id.textEditorUI))
                .perform(ViewActions.typeText("Hello World"));

        Espresso.onView(withId(R.id.itemsToCount))
                .perform(ViewActions.click());
        Espresso.onData(allOf(is(instanceOf(String.class)), is("Chars"))).perform(ViewActions.click());

        // Click on count button
        Espresso.onView(withId(R.id.countWordButton))
                .perform(ViewActions.click());

        Espresso.onView(withId(R.id.textEditorUI))
                        .check(matches(withText("Hello World")));

        // Check result
        Espresso.onView(withId(R.id.tVResult))
                .check(matches(withText("11")));
    }

    @Test
    public void testWordCount() {
        // Input text
        Espresso.onView(withId(R.id.textEditorUI))
                .perform(ViewActions.typeText("Hello World"));

        // Select "Words" from spinner
        Espresso.onView(withId(R.id.itemsToCount))
                .perform(ViewActions.click());
        Espresso.onData(allOf(is(instanceOf(String.class)), is("Words"))).perform(ViewActions.click());

        // Click on count button
        Espresso.onView(withId(R.id.countWordButton))
                .perform(ViewActions.click());

        // Check result
        Espresso.onView(withId(R.id.tVResult))
                .check(matches(withText("2")));
    }
}