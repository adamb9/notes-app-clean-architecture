package com.example.notesappcleanarch.framework

import com.example.core.usecase.*

data class UseCases(
        val addNote: AddNote,
        val getAllNotes: GetAllNotes,
        val getNote: GetNote,
        val removeNote: RemoveNote,
        val getWordCount: GetWordCount
)