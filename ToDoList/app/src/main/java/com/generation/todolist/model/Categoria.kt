package com.generation.todolist.model

data class Categoria (
    var id : Long,
    var desricao : String,
    var tarefas : List<Tarefa>?
        ) {
    override fun toString(): String {
        return desricao!!
    }
}