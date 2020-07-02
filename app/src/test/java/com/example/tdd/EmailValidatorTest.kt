package com.example.tdd

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class EmailValidatorTest {

    var validEmail :String = "asiatech@gmail.com"
    var inValidEmail :String = "asiatech/gmail.com"

    var validator = EmailValidator()

    @Before
    fun setup(){

    }

    @Test
    fun checkValidEmail(){

        var isValid = validator.isValidEmail(validEmail)
        Assert.assertTrue(isValid)
    }

    @Test
    fun checkNullEmail(){

        var isValid = validator.isValidEmail(null)
        Assert.assertFalse(isValid)
    }

    @Test
    fun checkInValidEmail(){

        var isValid = validator.isValidEmail(inValidEmail)
        Assert.assertFalse(isValid)
    }

    @Test
    fun checkEmptyEmail(){

        var isValid = validator.isValidEmail("")
        Assert.assertEquals(false, isValid)
    }
}