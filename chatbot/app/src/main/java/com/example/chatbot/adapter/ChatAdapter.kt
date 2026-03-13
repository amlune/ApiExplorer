package com.example.chatbot.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chatbot.databinding.ElementoMensajeBinding
import com.example.chatbot.model.Message

class ChatAdapter(private val messages: List<Message>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val binding = ElementoMensajeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val message = messages[position]
        holder.bind(message)
    }

    override fun getItemCount(): Int = messages.size

    class ChatViewHolder(private val binding: ElementoMensajeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(message: Message) {
            if (message.isUser) {
                binding.userMessage.text = message.text
                binding.userMessage.visibility = View.VISIBLE
                binding.botMessage.visibility = View.GONE
            } else {
                binding.botMessage.text = message.text
                binding.botMessage.visibility = View.VISIBLE
                binding.userMessage.visibility = View.GONE
            }
        }
    }
}
