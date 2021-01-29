package com.example.notesappcleanarch.framework.di

import android.app.Application
import com.example.core.repository.NoteRepository
import com.example.notesappcleanarch.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun providesRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))

}