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
////            ComposeApplicationTheme {
////                Surface(modifier = Modifier.fillMaxSize()) {
////                    MessageCard(Message("Android", "Jetpack Compose"))
////                    Conversation(MessageList.listaExemplo)
////                }
////            }
////            MessageCard(Message("Android", "Jetpack Compose"))
//        }
//    }
//}
//
//data class Message(val author: String, val body: String)
//
//@Composable
//fun MessageCard(msg: Message) {
//    Row {
//        Image(
//            painter = painterResource(R.drawable.logo_dcc_1),
//            contentDescription = "Contact profile picture",
//        )
//        Column {
//            Text(text = msg.author)
//            Text(text = msg.body)
//        }
//    }
//
//}
//
////fun MessageCard(msg: Message) {
////    Row(modifier = Modifier.padding(all = 8.dp)) {
////        Image(
////            painter = painterResource(R.drawable.logo_dcc_1),
////            contentDescription = "Contact profile picture",
////            modifier = Modifier
////                .size(40.dp)
////                .clip(CircleShape)
////        )
////
////        Spacer(modifier = Modifier.width(8.dp))
////
////        Column {
////            Text(text = msg.author)
////            Spacer(modifier = Modifier.height(4.dp))
////            Text(text = msg.body)
////        }
////    }
////}
//
////@Composable
////fun MessageCard(msg: Message) {
////    Row(modifier = Modifier.padding(all = 8.dp)) {
////        Image(
////            painter = painterResource(R.drawable.logo_dcc_1),
////            contentDescription = null,
////            modifier = Modifier
////                .size(40.dp)
////                .clip(CircleShape)
////                .border(1.5.dp, MaterialTheme.colors.secondaryVariant, CircleShape)
////        )
////        Spacer(modifier = Modifier.width(8.dp))
////
////        var isExpanded by remember { mutableStateOf(false) }
////
////        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
////            Text(
////                text = msg.author,
////                color = MaterialTheme.colors.secondaryVariant,
////                style = MaterialTheme.typography.subtitle2
////            )
////
////            Spacer(modifier = Modifier.height(4.dp))
////
////            Surface(
////                shape = MaterialTheme.shapes.medium,
////                elevation = 1.dp,
////            ) {
////                Text(
////                    text = msg.body,
////                    modifier = Modifier.padding(all = 4.dp),
////                    maxLines = if (isExpanded) Int.MAX_VALUE else 1,
////                    style = MaterialTheme.typography.body2
////                )
////            }
////        }
////    }
////}
//
//@Preview(name = "Light Mode")
//@Preview(
//    uiMode = Configuration.UI_MODE_NIGHT_YES,
//    showBackground = true,
//    name = "Dark Mode"
//)
//
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
//@Composable
//fun Conversation(messages: List<Message>) {
//    LazyColumn {
//        messages.map { item { MessageCard(it) } }
//    }
//}
//
//@Preview
//@Composable
//fun PreviewConversation() {
//    ComposeApplicationTheme {
//        Conversation(MessageList.listaExemplo)
//    }
//}
//
//
//object MessageList {
//
//    val listaExemplo = listOf(
//        Message(
//            "Colega",
//            "Teste...Teste...Teste..."
//        ),
//        Message(
//            "Colega",
//            "Lista das versões do android:\n" +
//                    "Android KitKat (API 19)\n" +
//                    "Android Lollipop (API 21)\n" +
//                    "Android Marshmallow (API 23)\n" +
//                    "Android Nougat (API 24)\n" +
//                    "Android Oreo (API 26)\n" +
//                    "Android Pie (API 28)\n" +
//                    "Android 10 (API 29)\n" +
//                    "Android 11 (API 30)\n" +
//                    "Android 12 (API 31)\n"
//        ),
//        Message(
//            "Colega",
//            "Kotlin é minha linguagem de programação favorita.\n" +
//                    "É muito divertido!"
//        ),
//        Message(
//            "Colega",
//            "Procurando alternativas para layouts XML..."
//        ),
//    )
//}
