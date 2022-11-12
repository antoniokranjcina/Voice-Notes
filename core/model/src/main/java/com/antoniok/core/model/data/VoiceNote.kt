package com.antoniok.core.model.data

data class VoiceNote(
    val id: String,
    val title: String,
    val description: String,
    val date: String,
    val color: NoteColor
)

val previewVoiceNotes = listOf(
    VoiceNote(
        id = "1",
        title = "Budget expenses",
        description = "I have bought this tea today. Because we actually need tee in order to stop",
        date = "11.2.2022.",
        color = NoteColor.Gray
    ),
    VoiceNote(
        id = "2",
        title = "Car fixes",
        description = "We need to buy oil for the car.",
        date = "13.10.2022.",
        color = NoteColor.DarkGray
    ),
    VoiceNote(
        id = "3",
        title = "Lecture notes",
        description = "Today we studied about electrical current.",
        date = "15.11.2021.",
        color = NoteColor.LightGray
    )
)
