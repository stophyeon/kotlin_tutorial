package com.example.kotlin_tutorial.dto

import com.example.kotlin_tutorial.entity.Member
import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.intellij.lang.annotations.Pattern
import org.jetbrains.annotations.NotNull

data class MemberDto (

        @field:NotBlank(message = "id는 필수 입력값입니다.")
        val id:String,
        val name:String,
        @field:Pattern(value = "^(?=.*[A-Za-z])(?=.*\\\\d)(?=.*[~!@#\$%^&*()+|=])[A-Za-z\\\\d~!@#\$%^&*()+|=]{8,20}\$")
        val pw:String


){


}
