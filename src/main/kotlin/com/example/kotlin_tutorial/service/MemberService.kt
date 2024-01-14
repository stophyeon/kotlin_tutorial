package com.example.kotlin_tutorial.service

import com.example.kotlin_tutorial.dto.MemberDto
import com.example.kotlin_tutorial.entity.Member
import com.example.kotlin_tutorial.repository.MemberRepository
import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class MemberService (
        private val memberRepository:MemberRepository ) {
    public fun signup(memberDto: MemberDto): String {
        if (memberRepository.findById(memberDto.id).isEmpty) {
            val member = Member(memberDto.id, memberDto.name, memberDto.pw)
            memberRepository.save(member)
            return "회원가입에 성공했습니다."
        } else {

            return "이미 가입되어있는 아이디입니다."
        }
    }

    public fun login(memberDto: MemberDto): MemberDto {
        val res = memberRepository.findByIdAndPw(memberDto.id, memberDto.pw)
        val member = MemberDto(res.get().id, res.get().name, res.get().pw)
        return member
    }

    public fun delete(memberDto: MemberDto): String {
        val res = memberRepository.findById(memberDto.id)
        if (res.isEmpty) {
            return "존재하지않는 회원입니다"
        } else {
            memberRepository.delete(res.get())
            return res.get().id + "회원님의 정보가 삭제되었습니다"
        }
    }
    @Transactional
    public fun update(memberDto: MemberDto): String {

        val member = memberRepository.findById(memberDto.id)
        if (member.isEmpty) {
            return "존재하지 않는 회원입니다."
        } else {
            member.get().name = memberDto.name
            member.get().pw = memberDto.pw

            return member.get().name + "," + member.get().pw + "수정되었습니다."
        }
    }


}

