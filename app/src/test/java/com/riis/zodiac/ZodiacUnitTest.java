package com.riis.zodiac;

import android.widget.ListAdapter;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacUnitTest {
    private ListView listView;
    private String[] zodiacSigns;
    private int numSigns = 12;

    @Before
    public void setUp() {
        MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertNotNull("Main Activity not setup", mainActivity);
        listView=(ListView) mainActivity.findViewById(R.id.list_of_signs);
        zodiacSigns = RuntimeEnvironment.application.getResources().getStringArray(R.array.zodiac_array);
    }

    @Test
    public void listLoaded() throws Exception {
        assertThat("should be a dozen star signs", zodiacSigns.length, equalTo(numSigns));
    }

}
