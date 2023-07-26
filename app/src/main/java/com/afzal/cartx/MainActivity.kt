package com.afzal.cartx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


val products = mutableListOf(
    Product(
        1, "Wooden Chair", "4,900", R.drawable.wooden_chair,
        "FREE delivery by Wed, 10 July",
        "Acacia Wood and Natural Cane Weaving",
        4.5f, "1,210"
    ),
    Product(
        2, "Canteen Table", "4,500", R.drawable.table,
        "FREE delivery by Thu, 11 July",
        "Crafted of Oak wood legs, the sleek veneer top showcases a rick woodgrain finish.",
        4f, "895"
    ),
    Product(
        3, "Pedestal Fan", "3,200", R.drawable.pedestal_fan,
        "FREE delivery by Mon, 8 July",
        "Pedestal Fan Wind Storm 18 inch features a powerful energy efficient heavy duty motor, telescopic height adjustment and three-speed control.",
        3.5f, "4,752"
    ),
    Product(
        4, "Mobile Tripod", "500", R.drawable.tripod_image,
        "FREE delivery by Wed, 10 July",
        "360 degree rotation, easy to carry, easy to use and Good Stability and has powerful absorption and deformation functions suitable for mobile phone up to 6 inches.",
        4f, "14,396"
    ),
    Product(
        5, "Office Chair", "11,880", R.drawable.office_chair,
        "FREE delivery by Tue, 9 July",
        "Chair with lumbar support and pneumatic gas lift for height adjustment and 360 degree swivel.",
        4.5f, "257"
    ),
    Product(
        6, "Bar Chair", "5,500", R.drawable.bar_chair,
        "FREE delivery by Wed, 10 July",
        "Stable And Sturdy Bar chair - With a built-in 360 degree swivel. High density foam upholstered in leatherette.",
        4f, "1,664"
    ),
    Product(
        7, "Park Bench", "12,500", R.drawable.park_bench_photo,
        "FREE delivery by Fri, 12 July",
        "The large garden bench seat pad offers the perfect mix of appearance and functionality",
        3.5f, "578"
    ),
    Product(
        8, "Microwave Oven", "15,000", R.drawable.oven_photo,
        "FREE delivery by Thu, 11 July",
        "GRILL, BAKE & TOAST - Use the oven for baking cakes, pizzas and pastas, grilling vegetables, roasting potatoes, chicken, paneer or simply toasting bread.",
        4.5f, "734")
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}