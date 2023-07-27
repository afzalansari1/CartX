package com.afzal.cartx.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.afzal.cartx.Product
import com.afzal.cartx.R
import com.afzal.cartx.databinding.FragmentDetailBinding
import com.afzal.cartx.products

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var product: Product? = null

        arguments?.let {it->
            val args = DetailFragmentArgs.fromBundle(it)
            product = products.find{ args.id == it.id}
        }

        product?.let {
            with(it){
                binding.productName.text = name
                binding.productPrice.text = price
                binding.productFullDescription.text = longDescription
                binding.productImage.setImageResource(imageId)

                binding.addToCart.setOnClickListener {
                    Toast.makeText(context, "Product added to cart!", Toast.LENGTH_SHORT).show()
                }

                binding.buyNow.setOnClickListener {
                    Toast.makeText(
                        context,
                        "Thank-you for ordering this product!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

}