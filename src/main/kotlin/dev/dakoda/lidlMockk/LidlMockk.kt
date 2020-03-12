@file:Suppress("unused")

package dev.dakoda.lidlMockk

import io.mockk.mockk
import kotlin.reflect.KClass

inline fun <reified T : Any> relaxedMockk(
    name: String? = null,
    vararg moreInterfaces: KClass<*>,
    relaxUnitFun: Boolean = false,
    block: T.() -> Unit = {}
): T = mockk(
    name = name,
    moreInterfaces = *moreInterfaces,
    relaxUnitFun = relaxUnitFun,
    relaxed = true,
    block = block
)

inline fun <reified T : Any> multiMockk(
    instances: Int
): List<T> = (1..instances).map { mockk<T>() }