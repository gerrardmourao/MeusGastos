package br.unasp.meusgastos.model

import java.util.concurrent.atomic.AtomicLong

private val ids = AtomicLong(System.currentTimeMillis())

data class Gasto(
    val id: Long = ids.incrementAndGet(),
    val descricao: String,
    val valor: Double,
    val categoria: Categoria
)
