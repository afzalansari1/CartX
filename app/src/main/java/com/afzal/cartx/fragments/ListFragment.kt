package com.afzal.cartx.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.afzal.cartx.R
import com.afzal.cartx.adapter.ProductAdapter
import com.afzal.cartx.products

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        val productList= view.findViewById<RecyclerView>(R.id.product_list).apply {
            layoutManager = LinearLayoutManager(activity)

            adapter = ProductAdapter {
                findNavController().navigate(ListFragmentDirections.actionHomeToDetail(it.id))
            }
            setHasFixedSize(true)
        }
        (productList.adapter as ProductAdapter).submitList(products)
    }

}