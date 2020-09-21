package com.androiddevs.shoppinglisttestingyt

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid input returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillipp",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillipp",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrect confirm password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillip",
            "abc123",
            "acc123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Password contains less than two digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillip",
            "abc1",
            "abc1"
        )
        assertThat(result).isFalse()
    }
}