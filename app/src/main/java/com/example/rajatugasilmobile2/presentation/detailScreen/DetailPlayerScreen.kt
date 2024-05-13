package com.example.rajatugasilmobile2.presentation.detailScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.rajatugasilmobile2.data.Data
import com.example.rajatugasilmobile2.model.Gallery

@Composable
fun DetailPlayerScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    galleryId: Int?
) {
    val newPlayersList = Data.Galleries.filter { gallery ->
        gallery.id == galleryId
    }
    Column(
        modifier = modifier
    ) {
        DetailPlayerContent(newPlayersList = newPlayersList)
    }
}

@Composable
private fun DetailPlayerContent(
    newPlayersList: List<Gallery>,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newPlayersList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Poster Movie"
        )
        Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = newPlayersList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "(${newPlayersList[0].position})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Role",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "${newPlayersList[0].about}",
                style = MaterialTheme.typography.titleSmall,
            )
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailPlayerContentPreview() {
    DetailPlayerContent(newPlayersList = Data.Galleries)
}