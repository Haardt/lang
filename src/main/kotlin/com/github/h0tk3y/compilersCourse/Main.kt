package com.github.h0tk3y.compilersCourse

import com.github.h0tk3y.compilersCourse.language.NaiveProgramInterpreter
import com.github.h0tk3y.compilersCourse.parsing.readProgram

fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    val program = readProgram("""
    fun multiplyInts(a, b)
    begin
        return a * b
    end

    fun addInts(a, b)
    begin
        return a + b
    end

    z := multiplyInts(12, 12);
    write (addInts(13, 13))
    """.trimIndent())
    val interpreter = NaiveProgramInterpreter()
    val outputs = interpreter.run(program, emptyList()).output
    println("Result: " + outputs.joinToString("\n") { it?.toString() ?: ">" })
}