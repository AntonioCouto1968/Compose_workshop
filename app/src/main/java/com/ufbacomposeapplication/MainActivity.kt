package com.ufbacomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Conversation(messages = MessageList.listaEquipe)
        }
    }
}

data class Message(val nome: String, val e_mail: String, val img: Int)

@Composable
fun Titulo(tit: String){
    Row() {
        Text(
            text = tit,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp)
    }
}

@Composable
fun MessageCard(msg: Message) {

    var isExpanded by remember { mutableStateOf(false) }
    Row(modifier = Modifier.padding(all = 10.dp)) {
        Image(
            painter = painterResource(msg.img),
            contentDescription = "Foto do perfil",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondaryVariant, CircleShape)
        )
        
        Spacer(modifier = Modifier.width(10.dp))

        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(
                text = "Nome: " + msg.nome + "\n" + "e_mail: " + msg.e_mail,
                modifier = Modifier.padding(all = 2.dp),
                maxLines = if (isExpanded) Int.MAX_VALUE else 1 // Ao expandir, mostra tambémo e-mail
            )
        }
    }


}


@Composable
fun Conversation(messages: List<Message>) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Titulo("Equipe NativeScript")
        Spacer(modifier = Modifier.width(5.dp))
        LazyColumn {
            messages.map { item { MessageCard(it) } }
        }
    }

}

object MessageList {

    val listaEquipe = listOf(
        Message(
            "Antonio",
            "antonio.couto@ufba.br",
            R.drawable.antonio,
        ),
        Message(
            "Emilio",
            "emilio.estevam@ufba.br",
            R.drawable.emilio
        ),
        Message(
            "Luca",
            "luca.meireles@ufba.br",
            R.drawable.luca
        ),
        Message(
            "Mateus",
            "mateus.machado@ufba.br",
            R.drawable.mateus
        ),
        Message(
            "Tais",
            "taisfranca@ufba.br",
            R.drawable.tais
        ),
        Message(
            "Wesley",
            "wesley.jean@ufba.br",
            R.drawable.wesley
        ),
    )
}
