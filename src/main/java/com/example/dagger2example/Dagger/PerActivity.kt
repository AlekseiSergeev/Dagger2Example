package com.example.dagger2example.Dagger

import java.lang.annotation.Documented
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class PerActivity()
