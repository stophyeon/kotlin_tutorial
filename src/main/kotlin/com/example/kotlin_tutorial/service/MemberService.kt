package com.example.kotlin_tutorial.service

import com.example.kotlin_tutorial.dto.MemberDto
import com.example.kotlin_tutorial.entity.Member
import com.example.kotlin_tutorial.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService (
        private val memberRepository:MemberRepository ){
            public fun signup(memberDto: MemberDto):String{
                if (memberRepository.findById(memberDto.id).isEmpty ){
                    val member=Member(memberDto.id,memberDto.name,memberDto.pw)
                    memberRepository.save(member)
                    return "회원가입에 성공했습니다."
                }
                else{

                    return "이미 가입되어있는 아이디입니다."
                }
            }
        }



