package com.runkevich8.gmail.test;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.gmail.runkevich8.data.sharedprefs.AppSharedPrefs;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(AndroidJUnit4.class)
public class TestSP {

        @Test
        public void test() throws Exception {

            Context appContext = InstrumentationRegistry.getTargetContext();

            AppSharedPrefs appSharedPrefs = new AppSharedPrefs(appContext);
            appSharedPrefs.saveToken("OOOO");

            String actualToken = appSharedPrefs.getToken();

            assertEquals("TEST for SharedPrefs", actualToken);
        }

}
