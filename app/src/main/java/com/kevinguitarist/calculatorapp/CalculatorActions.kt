package com.kevinguitarist.calculatorapp

sealed class CalculatorAction{
    data class Number (val number : Int) : CalculatorAction()    // Its Inheritance
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
    object Decimal : CalculatorAction()
    object Calculate : CalculatorAction()
    data class Operation(val operation : CalculatorOperation) : CalculatorAction()  // Its Inheritance


}