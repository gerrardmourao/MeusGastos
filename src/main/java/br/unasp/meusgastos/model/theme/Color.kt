package br.unasp.meusgastos.model.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
val Fundo = Color(0xFFF2F6FA)
val Navy = Color(0xFF103A5E)
val Coral = Color(0xFFF3704E)
val Card = Color(0xFFE6F0F9)
val Muted = Color(0xFF5A7A96)
val Erro = Color(0xFFC0392B)
val AzulClaro = Color(0xFF9FC0DB)

fun formatarReal(valor: Double): String =
    "R$ " + String.format("%.2f", valor).replace(".", ",")