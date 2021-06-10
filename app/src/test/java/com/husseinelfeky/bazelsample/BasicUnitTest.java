package com.husseinelfeky.bazelsample;

import androidx.test.filters.SmallTest;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SmallTest
public class BasicUnitTest {

    @Test
    public void givenTwoNumbers_whenAdded_thenCorrectResult() {
        assertThat(2 + 2, is(4));
    }

    @Test
    public void givenTwoNumbers_whenMultiplied_thenCorrectResult() {
        assertThat(7 * 7, is(49));
    }
}
