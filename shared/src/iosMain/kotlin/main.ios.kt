import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.window.ComposeUIViewController

@ExperimentalMaterialApi
@ExperimentalFoundationApi
fun MainViewController() = ComposeUIViewController { App() }