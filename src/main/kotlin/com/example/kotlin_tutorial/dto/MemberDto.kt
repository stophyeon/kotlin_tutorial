package com.example.kotlin_tutorial.dto

import com.example.kotlin_tutorial.entity.Member
import com.fasterxml.jackson.annotation.JsonIgnore
import org.intellij.lang.annotations.Pattern
import org.jetbrains.annotations.NotNull

data class MemberDto (

        @field:NotNull("id를 입력해야 합니다")
        val id:String,
        val name:String,
        val pw:String


){


}
