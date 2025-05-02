package com.pdmtaller2.AbrahamFlores_00067323.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pdmtaller2.AbrahamFlores_00067323.model.Restaurant

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .width(160.dp)
            .padding(end = 8.dp)
            .clickable { onClick() }
    ) {
        AsyncImage(
            model = restaurant.imageUrl,
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
        )
        Text(restaurant.name)
    }
}
