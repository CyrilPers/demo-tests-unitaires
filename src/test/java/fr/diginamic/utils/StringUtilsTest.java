package fr.diginamic.utils;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void stringUtilsTest() {
        int result = StringUtils.levenshteinDistance("Hello", "Hello");
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void stringUtilsTest2() {
        int result = StringUtils.levenshteinDistance("chat", "chats");
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void stringUtilsTest3() {
        int result = StringUtils.levenshteinDistance("machins", "machine");
        Assertions.assertThat(result).isEqualTo(1);
    }


    @Test
    public void stringUtilsTest4() {
        int result = StringUtils.levenshteinDistance("aviron", "avion");
        Assertions.assertThat(result).isEqualTo(1);
    }


    @Test
    public void stringUtilsTest5() {
        int result = StringUtils.levenshteinDistance("distance", "instance");
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void stringUtilsTest6() {
        int result = StringUtils.levenshteinDistance("chien", "chine");
        Assertions.assertThat(result).isEqualTo(2);
    }


    @Test
    public void stringUtilsTest7() {
        int exception = StringUtils.levenshteinDistance("chien", null);


}