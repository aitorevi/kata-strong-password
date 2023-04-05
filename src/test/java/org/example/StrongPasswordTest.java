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
    void must_contain_capital_letter() {
        assertThat(StrongPassword.strongPassword("password5")).isFalse();
    }
}

/*
Casos de uso:
"" -> false *
"pass" -> false *
"password" -> false *
"123456" -> false
"P123456" -> false
"Pass123456" -> false
"Pass_123456" -> true
*/