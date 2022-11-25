package com.ufbacomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //TODO
        }
    }
}

data class Message(val author: String, val body: String)


@Composable
fun MessageCard(msg: Message) {
    Text(text = msg.author)
}


@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        messages.map { item { MessageCard(it) } }
    }
}

object MessageList {

    val listaExemplo = listOf(
        Message(
            "Exemplo1",
            "Teste...Teste...Teste..."
        ),
        Message(
            "Exemplo1",
            "Teste...Teste...Teste..."
        ),
    )
}
