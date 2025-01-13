package com.thanapat.mybio

sealed class Screens (val screen: String) {
    data object Home: Screens("home")
    data object About: Screens("about")
    data object Skill: Screens("skill")
    data object Project: Screens("project")
    data object Contact: Screens("contact")
}