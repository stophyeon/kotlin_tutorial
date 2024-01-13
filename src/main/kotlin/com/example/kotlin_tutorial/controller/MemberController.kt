package com.example.kotlin_tutorial.controller

import com.example.kotlin_tutorial.dto.MemberDto
import com.example.kotlin_tutorial.service.MemberService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class MemberController(val memberService: MemberService) {
    @PostMapping("/signup")
    public fun signupService(@Validated @RequestBody memberDto: MemberDto):String{
        return memberService.signup(memberDto)

    }
}