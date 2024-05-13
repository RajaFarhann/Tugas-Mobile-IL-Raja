package com.example.rajatugasilmobile2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rajatugasilmobile2.data.Data
import com.example.rajatugasilmobile2.model.Gallery
import com.example.rajatugasilmobile2.ui.theme.RajaTugasILMobile2Theme

@Composable
fun GalleryScreen(
    modifier: Modifier.Companion = Modifier,
    galleries: List<Gallery> = Data.Galleries
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(160.dp),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(galleries, key = { it.id }) {
            Image(
                painter = painterResource(id = it.photo),
                contentDescription = it.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
//                    .clickable {
//                        onItemClicked(it.id)
//                    }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun GalleryScreenPreview() {
    RajaTugasILMobile2Theme {
        GalleryScreen(
            galleries = Data.Galleries
        )
    }
}