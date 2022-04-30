package com.makentoshe.habrachan.screen.me

object MeScreen {
    override fun toString() = "me"

    val Login = MeLoginScreen

    val User = MeUserScreen
}

object MeLoginScreen {
    override fun toString() = "$MeScreen.login"
}

object MeUserScreen {
    override fun toString() = "$MeScreen.user"
}
