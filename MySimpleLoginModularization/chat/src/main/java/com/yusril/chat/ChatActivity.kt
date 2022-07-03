package com.yusril.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusril.chat.databinding.ActivityChatBinding
import com.yusril.core.SessionManager
import com.yusril.core.UserRepository

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sesi = SessionManager(this)
        val userRepository = UserRepository(sesi)

        binding.tvChat.text = "Hello ${userRepository.getUser()}! \nWelcome to Chat Feature"
    }
}