package com.pratice.common

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
annotation class InternalSystemAdapter(
    @get: AliasFor(annotation = Component::class)
    val value: String = ""
)