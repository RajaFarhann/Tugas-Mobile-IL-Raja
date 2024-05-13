package com.example.rajatugasilmobile2.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.rajatugasilmobile2.ui.theme.RajaTugasILMobile2Theme

@Composable
fun AboutScreen() {
 Column {
     Text(
         text = "Nama : Raja Muhammad Farhan Zahputra"
     )
     Text(
         text = "Email : raja.farhan0503@gmail"
     )
 }
}

@Preview(showSystemUi = true)
@Composable
private fun GalleryScreenPreview() {
    RajaTugasILMobile2Theme {
        AboutScreen()
    }
}