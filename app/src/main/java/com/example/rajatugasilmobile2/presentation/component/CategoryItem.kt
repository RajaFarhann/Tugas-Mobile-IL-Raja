package com.example.rajatugasilmobile2.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rajatugasilmobile2.R
import com.example.rajatugasilmobile2.model.Category
import com.example.rajatugasilmobile2.ui.theme.RajaTugasILMobile2Theme

@Composable
fun CategoryItem(
    category: Category,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(category.id)
        }
    ) {
        Image(
            painter = painterResource(id = category.photo),
            contentDescription = category.name, modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = category.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 2
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemHorizontalPreview() {
    RajaTugasILMobile2Theme {
        CategoryItem(
            category = Category(1, "Bulu Tangkis", "Olahraga raket di mana pemain menggunakan raket untuk memukul kok di atas jaring.", R.drawable.bulu_tangkis)
        ) { categoryId ->
            println("Category Id : $categoryId")
        }
    }
}