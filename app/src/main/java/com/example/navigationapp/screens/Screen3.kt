package com.example.navigationapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navigationapp.components.BottomNavBar
import kotlin.random.Random

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen3(navController: NavHostController) {
    val facts = listOf(
        "Солнце примерно в 109 раз больше Земли.",
        "Человеческое сердце бьётся около 100 000 раз в день.",
        "Ученые считают, что Вселенная около 13,8 миллиарда лет.",
        "Средняя скорость улитки — около 0,03 м/с.",
        "Самый высокий водопад в мире — Анхель в Венесуэле.",
        "Оксфордский университет старее многих стран. Он был открыт в 1096 году, тогда как Османская империя — только в 1299 году, Ацтекская империя — в 1325 году, а единое Русское государство — только в 1478-м.",
        "Бактерии занимают весомую часть биомассы Земли. Люди составляют лишь 1,3% биомассы всех животных и микроорганизмов — около 300 миллионов тонн",
        "Половина воды на Земле старше Солнца. Учёные считают, что часть воды образовалась из газовых облаков, из которых впоследствии сформировалось и Солнце.",
        "Спрайт — не только газировка. Так называют особый вид молний, которые бьют из облака не в Землю, а наоборот — вверх. Их открыли случайно лишь в 1989 году",
        "У томатов намного больше генов, чем у человека. Учёные выяснили, что томаты имеют примерно 31–35 тысяч генов",
        "В Австралии больше кроликов, чем людей в Китае",
        "Традиция подавать рыбу с ломтиком лимона восходит к Средним векам. Считалось, что если человек ненароком проглотит острую косточку, лимонный сок её растворит",
        "С четвёртой по восьмую неделю эмбрионального развития у всех людей есть хвост, который впоследствии исчезает.",
        "В Великобритании существует строгий закон, согласно которому запрещается свешивать кровать из окна. "
    )
    var currentFact by remember { mutableStateOf(facts.random()) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Случайный факт") },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
            )
        },
        bottomBar = { BottomNavBar(navController) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(25.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(currentFact, style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { currentFact = facts[Random.nextInt(facts.size)] },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Другой факт")
            }
        }
    }
}
