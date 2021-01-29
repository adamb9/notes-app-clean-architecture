package com.example.notesappcleanarch.framework.di

import com.example.notesappcleanarch.framework.ListViewModel
import com.example.notesappcleanarch.framework.NoteViewModel
import dagger.Component


@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}