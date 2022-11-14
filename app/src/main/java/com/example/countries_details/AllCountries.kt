package com.example.countries_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
private fun CountryIcon(
    icon: ImageVector, modifier:
    Modifier
) {
    Image(
        imageVector = icon,
        contentDescription = "Country icon",
        modifier = modifier.padding(8.dp)
    )
}

@Composable
fun myList(){
    LazyColumn(){
        items(30){
            CountryItem()
        }
    }
}

@Composable
fun CountryItem() {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                onItemClick()
            }
    ) {
        Row(
            verticalAlignment =
            Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            CountryIcon(
                Icons.Filled.Place,
                Modifier.weight(0.15f)
            )
            CountryDetails(Modifier.weight(0.85f))
        }
    }
}

fun onItemClick() {
    TODO("Not yet implemented")
}

@Composable
private fun CountryDetails(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Country",
            style = MaterialTheme.typography.h6
        )
        CompositionLocalProvider(
            LocalContentAlpha provides
                    ContentAlpha.medium
        ) {
            Text(
                text = "Capital  City",
                style = MaterialTheme.typography.body2
            )
        }
    }
}
