import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import tabs.TabItem
import tabs.Tabs
import tabs.TabsContent

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun App() {
    val tabs = listOf(TabItem.Menu, TabItem.History, TabItem.About)
    val navigate: (String) -> Unit = { }
    val pagerState = rememberPagerState(
        pageCount = { tabs.size },
        initialPage = 0
    )

    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    //title = { Text(stringResource(MR.)) }
                    title = { Text("Hello") }
                )
            },
        ) { padding ->
            Column(modifier = Modifier.padding(padding)) {
                Tabs(tabs = tabs, pagerState = pagerState)
                TabsContent(tabs = tabs, pagerState = pagerState, navigate)
            }
        }
    }
}