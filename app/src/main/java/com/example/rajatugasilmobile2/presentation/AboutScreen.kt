package com.example.rajatugasilmobile2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rajatugasilmobile2.R
import com.example.rajatugasilmobile2.ui.theme.RajaTugasILMobile2Theme

@Composable
fun AboutScreen() {
 Column {
     Image(
         painter = painterResource(R.drawable.nathan),
         contentDescription = "Aan",
         contentScale = ContentScale.Crop,
         modifier = Modifier
             .clip(CircleShape)
             .size(80.dp)
     )
     Text(
         text = "Nama : Raja Muhammad Farhan Zahputra"
     )
     Text(
         text = "Email : raja.farhan0503@gmail"
     )
     Text(
         text = "Perguruan Tinggi : Politeknik Negeri Batam"
     )
     Text(
         text = "Jurusan : D3 Teknik Informatika"
     )
     Text(
         text = "NIM : 3312201015"
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