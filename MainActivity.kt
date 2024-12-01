// temp
// MainActivity.kt

package com.example.sneulcarena

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recommendationText: TextView = findViewById(R.id.recommendationText)
        val refreshButton: Button = findViewById(R.id.refreshButton)

        refreshButton.setOnClickListener {
            val recommendation = generateRecommendation()
            recommendationText.text = recommendation
        }
    }

    private fun generateRecommendation(): String {
        val topics = listOf(
            "친구와 함께하는 캠퍼스 탐방",
            "서울 최고의 맛집 찾기",
            "역사와 문화 체험",
            "스포츠 활동 참여하기",
            "도서관에서 조용한 공부 시간"
        )
        val selectedTopic = topics[Random.nextInt(topics.size)]
        return "오늘의 추천 활동: $selectedTopic"
    }
}
