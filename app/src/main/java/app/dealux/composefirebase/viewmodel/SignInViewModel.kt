package app.dealux.composefirebase.viewmodel

import androidx.lifecycle.ViewModel
import app.dealux.composefirebase.model.User
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SignInViewModel : ViewModel() {
    private val mUser: MutableStateFlow<User?> = MutableStateFlow(null)
    val user: StateFlow<User?> = mUser

    suspend fun setSignInValue(email: String, displayName: String) {
        delay(2000)
        mUser.value = User(email, displayName)
    }

}