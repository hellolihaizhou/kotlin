// !DIAGNOSTICS: -UNUSED_EXPRESSION -UNUSED_PARAMETER -UNUSED_VARIABLE -EXPERIMENTAL_IS_NOT_ENABLED

@file:UseExperimental(ExperimentalTypeInference::class)

import kotlin.experimental.ExperimentalTypeInference

class Controller<T> {
    suspend fun yield(t: T) {}
}

fun <T, R> generate(@BuilderInference g: suspend Controller<T>.() -> R): Pair<T, R> = TODO()

val test1 = generate {
    yield("")
    3
}

class Pair<T, R>