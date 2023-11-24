package tabs

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import screens.AboutScreen
import screens.HistoryScreen
import screens.HomeScreen

@ExperimentalFoundationApi
sealed class TabItem(var icon: String, var title: Int, var screen: @Composable ((String) -> Unit) -> Unit) {
    data object Menu : TabItem("ic_music.xml", 0, { nav -> HomeScreen(nav) })
    data object History : TabItem("ic_movie.xml", 1, { nav -> HistoryScreen(nav) })
    data object About : TabItem("ic_book.xml", 2, { nav -> AboutScreen(nav) })
}