package com.nutrisport.home.domain

import com.nutrisport.shared.Resources
import com.nutrisport.shared.navigation.Screen
import org.jetbrains.compose.resources.DrawableResource

enum class BottomBarDestination(
    val icon: DrawableResource,
    val title: String,
    val screen: Screen
) {

    ProductsOverview(
        icon = Resources.Icon.home,
        title = "Nutri Sport",
        screen = Screen.ProductsOverview
    ),
    Cart(
        icon = Resources.Icon.shopping_cart,
        title = "Cart",
        screen = Screen.Cart
    ),
    Categories(
        icon = Resources.Icon.grid,
        title = "Categories",
        screen = Screen.Categories
    ),

}