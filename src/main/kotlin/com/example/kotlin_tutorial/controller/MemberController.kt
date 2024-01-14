package com.example.kotlin_tutorial.controller

import com.example.kotlin_tutorial.dto.MemberDto
import com.example.kotlin_tutorial.service.MemberService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.validation.FieldError
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class MemberController(val memberService: MemberService) {
    @PostMapping("/signup")
    public fun signup(@Valid @RequestBody memberDto: MemberDto, bindingResult: BindingResult):Any{
        if(bindingResult.hasErrors()){
            val msg = StringBuilder()
            bindingResult.allErrors.forEach{
                val field = it as FieldError
                val message = it.defaultMessage
                msg.append(field.field+" : "+message+"\n")
            }
            return ResponseEntity.badRequest().body(msg.toString())
        }
        return memberService.signup(memberDto)

    }
    @GetMapping("/login")
    public fun login(@Valid @RequestBody memberDto: MemberDto): MemberDto{
        return memberService.login(memberDto)
    }
    @DeleteMapping("/delete")
    public fun delete(@RequestBody memberDto: MemberDto): String{
        return memberService.delete(memberDto)
    }
    @GetMapping("/update")
    public fun update(@RequestBody memberDto: MemberDto): String{
        return memberService.update(memberDto)
    }
}