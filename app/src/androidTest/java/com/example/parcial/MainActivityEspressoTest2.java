package com.example.parcial;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityEspressoTest2 {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testCadaBoton() {
        // Ingresa un número en el campo de entrada de número 1
        Espresso.onView(ViewMatchers.withId(R.id.numero1)).perform(ViewActions.typeText("4"));
        // Ingresa un número en el campo de entrada de número 2
        Espresso.onView(ViewMatchers.withId(R.id.numero2)).perform(ViewActions.typeText("3"));
        Espresso.onView(ViewMatchers.withId(R.id.button_resta)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.resultado))
                .check(ViewAssertions.matches(ViewMatchers.withText("Resta: 1")));
        Espresso.onView(ViewMatchers.withId(R.id.button_suma)).perform(ViewActions.click());
                                  Espresso.onView(ViewMatchers.withId(R.id.resultado))
                .check(ViewAssertions.matches(ViewMatchers.withText("Suma: 7")));
        Espresso.onView(ViewMatchers.withId(R.id.button_multiplicar)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.resultado))
                .check(ViewAssertions.matches(ViewMatchers.withText("Multiplicación: 12")));
    }
}
