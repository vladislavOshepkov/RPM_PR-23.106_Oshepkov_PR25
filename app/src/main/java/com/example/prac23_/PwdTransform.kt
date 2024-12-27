package com.example.prac23_

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class PwdTransform : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val transormedText = "*".repeat(text.length)
        return TransformedText(AnnotatedString(transormedText), OffsetMapping.Identity)
    }
}