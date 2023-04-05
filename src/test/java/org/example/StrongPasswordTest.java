package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class StrongPasswordTest {

    @Test
    void minimum_length_is_six() {
        assertThat(StrongPassword.strongPassword("")).isFalse();
        assertThat(StrongPassword.strongPassword("passw")).isFalse();
    }
    @Test
    void must_contain_numbers() {
        assertThat(StrongPassword.strongPassword("password")).isFalse();
    }
    @Test
    void must_contain_uppercase() {
        assertThat(StrongPassword.strongPassword("password5")).isFalse();
    }
    @Test
    void must_contain_lowercase() {
        assertThat(StrongPassword.strongPassword("P123456")).isFalse();
    }
    @Test
    void must_contain_underscore() {
        assertThat(StrongPassword.strongPassword("Pass123456")).isFalse();
    }
    @Test
    void consider_a_password_to_be_strong_when_all_requirements_are_met() {
        assertThat(StrongPassword.strongPassword("1234abcdABCD_")).isTrue();
    }
}

/*
Casos de uso:
"" -> false *
"pass" -> false *
"password" -> false *
"123456" -> false *
"P123456" -> false *
"Pass123456" -> false *
"Pass_123456" -> true
*/