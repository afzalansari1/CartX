package com.afzal.cartx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val products = mutableListOf(
    Product(
        1, "Wooden Chair", "4,900", R.drawable.wooden_chair,
        "FREE delivery by Wed, 10 July",
        "Introducing the Acacia Wood and Natural Cane Weaving - a beautifully handcrafted masterpiece made from sustainable oakwood. Its timeless design offers comfort and lumbar support with a gently curved backrest and contoured seat. Versatile and elegant, this chair complements various interior styles, adding sophistication to any space. Elevate your living experience with the perfect blend of form and function.",
        4.5f, "1,210"
    ),
    Product(
        2, "Canteen Table", "4,500", R.drawable.table,
        "FREE delivery by Thu, 11 July",
        "Discover the Canteen Table – a sleek and practical addition for your dining space. Crafted of Oak wood legs, the sleek veneer top showcases a rick wood grain finish and easy-to-clean engineered wood tabletop, this table effortlessly combines modern style with durability. Its minimalist design complements various decor themes, fostering a sense of togetherness for convivial gatherings. Upgrade your dining area with this contemporary gem and embrace the joys of modern dining!",
        4f, "895"
    ),
    Product(
        3, "Pedestal Fan", "3,200", R.drawable.pedestal_fan,
        "FREE delivery by Mon, 8 July",
                "Introducing the \"Breezy Comfort Pedestal Fan\" – Your Ultimate Cooling Solution!\n Beat the heat with the \"Breezy Comfort Pedestal Fan,\" designed to provide refreshing airflow and a cool breeze on hot summer days. With adjustable height and oscillation, this fan ensures even distribution of air throughout your space. Experience unparalleled comfort and stay cool all summer long with this essential addition to your shopping cart!",
        3.5f, "4,752"
    ),
    Product(
        4, "Mobile Tripod", "500", R.drawable.tripod_image,
        "FREE delivery by Wed, 10 July",
        "Introducing the \"Mobile Masterpiece Tripod\" – Your Perfect Photography Companion!\n Capture stunning moments with ease using the \"Mobile Masterpiece Tripod,\" designed to securely hold your smartphone for steady and professional-quality shots. Its adjustable height and 360-degree rotation offer versatility in capturing the perfect angle. Whether for vlogging, photography, or video calls, this tripod is a must-have tool to unlock your creative potential. Add it to your shopping list today and take your mobile photography to the next level!",
        4f, "14,396"
    ),
    Product(
        5, "Office Chair", "11,880", R.drawable.office_chair,
        "FREE delivery by Tue, 9 July",
        "Introducing the \"Executive Comfort Office Chair\" - Elevate Your Workday!\n Experience unmatched comfort and support with our \"Executive Comfort Office Chair.\" Designed with ergonomic excellence, it offers optimal lumbar support and adjustable features to enhance your posture and reduce fatigue. The sleek and professional design makes it a perfect fit for any office setting. Upgrade your workspace with this premium office chair and redefine your productivity today!",
        4.5f, "257"
    ),
    Product(
        6, "Bar Chair", "5,500", R.drawable.bar_chair,
        "FREE delivery by Wed, 10 July",
        "Introducing the \"Swivel Heights Bar Chair\" - Elevate Your Bar Experience!\n Take a seat in style with our \"Swivel Heights Bar Chair,\" a perfect blend of comfort and modern design. Its swivel feature and adjustable height ensure convenience and versatility for any bar or counter setting. Crafted with premium materials, this bar chair guarantees durability and chic elegance. Add a touch of sophistication to your bar area with this must-have addition to your shopping list!",
        4f, "1,664"
    ),
    Product(
        7, "Park Bench", "12,500", R.drawable.park_bench_photo,
        "FREE delivery by Fri, 12 July",
        "Introducing the \"Serene Park Bench\" - Embrace Tranquility in Nature!\n Relish the beauty of outdoor spaces with our \"Serene Park Bench,\" a harmonious blend of comfort and elegance. Crafted from durable materials, this bench withstands various weather conditions, making it an ideal addition to parks, gardens, or patios. Enjoy peaceful moments amidst nature with this inviting park bench - a perfect spot to unwind and create lasting memories. Add it to your shopping cart and transform your outdoor space into a serene oasis!",
        3.5f, "578"
    ),
    Product(
        8, "Microwave Oven", "15,000", R.drawable.oven_photo,
        "FREE delivery by Thu, 11 July",
        "Introducing the \"QuickCook Microwave Oven\" - Your Culinary Time-Saver!\n Effortlessly prepare delicious meals with our \"QuickCook Microwave Oven,\" designed to streamline your cooking process. Featuring advanced technology and multiple cooking presets, it offers convenience and precision at your fingertips. Its spacious interior allows you to cook or reheat large dishes with ease, making it a must-have appliance for every modern kitchen. Add this time-saving gem to your shopping list and revolutionize the way you cook!",
        4.5f, "734")
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}