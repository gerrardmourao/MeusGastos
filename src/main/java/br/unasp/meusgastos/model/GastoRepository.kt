package br.unasp.meusgastos.model

/**
 * Contrato de acesso aos gastos.
 * A implementação em memória mantém a estrutura simples para a atividade.
 */
interface GastoRepository {
    fun listar(): List<Gasto>
    fun adicionar(gasto: Gasto)
    fun remover(id: Long)
}

class GastoRepositoryMemoria : GastoRepository {
    private val gastos = mutableListOf<Gasto>()

    override fun listar(): List<Gasto> = gastos.toList()

    override fun adicionar(gasto: Gasto) {
        gastos.add(gasto)
    }

    override fun remover(id: Long) {
        gastos.removeAll { it.id == id }
    }
}
