package com.example.springbatchkotlin.dto

import java.time.LocalDateTime

data class Board (
    val boardId: Long,
    val title: String,
    val writer: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val commentList: List<Comment>?
) {

}