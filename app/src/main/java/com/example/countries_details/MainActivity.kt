package com.example.countries_details

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.countries_details.ui.theme.Countries_detailsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Countries_detailsTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    CountryItem()
//                }
                CountryItem()

            }
        }
    }
}

@Composable
fun CountryItem() {
    Card(
        elevation = 4.dp,
        modifier = Modifier.padding(8.dp)
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Countries_detailsTheme {
//        Greeting("Android")
    }
}