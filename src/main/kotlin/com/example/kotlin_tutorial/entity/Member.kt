package com.example.kotlin_tutorial.entity

import com.example.kotlin_tutorial.dto.MemberDto
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Member(var id: String, var name: String, var pw: String) {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var seq:Long = 0


}