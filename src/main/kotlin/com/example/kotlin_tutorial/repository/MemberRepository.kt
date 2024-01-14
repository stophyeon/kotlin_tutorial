package com.example.kotlin_tutorial.repository

import com.example.kotlin_tutorial.dto.MemberDto
import com.example.kotlin_tutorial.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MemberRepository : JpaRepository<Member,Long>{
    public fun save(member: Member)
    public fun findByIdAndPw(id: String, pw:String):Optional<Member>
    public fun findById(id: String): Optional<Member>

}