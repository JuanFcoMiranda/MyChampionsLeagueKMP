package tabs

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable

@ExperimentalFoundationApi
@Composable
fun TabsContent(tabs: List<TabItem>, pagerState: PagerState, navigate: (String) -> Unit) {
    HorizontalPager(state = pagerState) { page ->
        tabs[page].screen(navigate)
    }
}

/*
@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun TabsContentPreview() {
    val tabs = listOf(TabItem.Menu, TabItem.History, TabItem.About)
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { tabs.size })
    TabsContent(tabs = tabs, pagerState = pagerState) {
    }
}*/
