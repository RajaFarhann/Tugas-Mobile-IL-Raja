package com.example.rajatugasilmobile2.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rajatugasilmobile2.R
import com.example.rajatugasilmobile2.model.Place
import com.example.rajatugasilmobile2.ui.theme.RajaTugasILMobile2Theme

@Composable
fun PlaceItem(
    place: Place,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable {
            onItemClicked(place.id)
        }
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = place.photo),
            contentDescription = place.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(text = place.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = place.detail, color = MaterialTheme.colorScheme.primary)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    RajaTugasILMobile2Theme {
        PlaceItem(
            place = Place(
                1,
                "Lapangan Futsal Ikan Daun",
                "(0778) 461149",
                "Teluk Tering, Batam Kota, Batam City, Riau Islands 29444",
                R.drawable.futsal_ikan_daun)
        ) { placeId ->
            println("Mentor Id : $placeId")
        }
    }
}