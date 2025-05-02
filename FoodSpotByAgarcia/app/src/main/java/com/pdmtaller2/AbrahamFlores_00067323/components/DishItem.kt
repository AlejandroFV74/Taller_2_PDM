package com.pdmtaller2.AbrahamFlores_00067323.components

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pdmtaller2.AbrahamFlores_00067323.model.Dish
import com.pdmtaller2.AbrahamFlores_00067323.ui.theme.FoodSpotByAgarciaTheme

@Composable
fun DishItem(dish: Dish, onAddClick: () -> Unit) {
    val context = LocalContext.current

    Row(modifier = Modifier.padding(8.dp)) {
        AsyncImage(
            model = dish.imageUrl,
            contentDescription = null,
            modifier = Modifier.size(80.dp)
        )
        Column(modifier = Modifier.padding(start = 8.dp)) {
            Text(dish.name, style = MaterialTheme.typography.titleMedium)
            Text(dish.description)
            TextButton(onClick = {
                onAddClick()
                Toast.makeText(context, "${dish.name} agregado al carrito", Toast.LENGTH_SHORT).show()
            }) {
                Text("Agregar al carrito")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDishItem() {
    FoodSpotByAgarciaTheme {
        val sampleDish = Dish(
            name = "Pizza Margarita",
            description = "Con queso mozzarella y albahaca",
            imageUrl = "https://via.placeholder.com/100"
        )
        DishItem(dish = sampleDish) {}
    }
}
