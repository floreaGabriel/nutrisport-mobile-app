package com.nutrisport.home.domain

import com.nutrisport.shared.Resources
import org.jetbrains.compose.resources.DrawableResource

enum class DrawerItem(
    val title: String,
    val icon: DrawableResource
) {
    Profile(
        title = "Profile",
        icon = Resources.Icon.user
    ),
    Settings(
        title = "Blog",
        icon = Resources.Icon.book
    ),
    Logout(
        title = "Locations",
        icon = Resources.Icon.map_pin
    ),
    Contact(
        title = "Contact Us",
        icon = Resources.Icon.edit
    ),
    SignOut(
        title = "Sign Out",
        icon = Resources.Icon.log_out
    ),
    Admin(
        title = "AdminPanel",
        icon = Resources.Icon.unlock
    )
}