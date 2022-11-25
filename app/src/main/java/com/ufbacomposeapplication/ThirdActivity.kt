//package com.ufbacomposeapplication
//
//import android.content.res.Configuration
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.border
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Surface
//import androidx.compose.material.Text
//import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.ufbacomposeapplication.ui.theme.ComposeApplicationTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MessageCard(Message("Android", "Jetpack Compose"))
//        }
//    }
//}
//
//data class Message(val author: String, val body: String)
//
//@Composable
//fun MessageCard(msg: Message) {
//    Text(text = msg.author)
//    Text("")
//}
//
//
//@Preview
//@Composable
//fun PreviewMessageCard() {
//    ComposeApplicationTheme {
//        Surface {
//            MessageCard(
//                msg = Message("Colega", "Venha dar uma olhada no Jetpack Compose!")
//            )
//        }
//    }
//}
//
