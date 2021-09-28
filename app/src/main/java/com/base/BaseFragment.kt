package com.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding: ViewBinding> (
        private val inflate: (LayoutInflater, ViewGroup, Boolean)-> Binding
        ) : Fragment(){
    private var _binding: Binding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = container?.let { inflate.invoke(layoutInflater, it, false) }
        initVM()
        return _binding?.root
    }
    open fun initVM() {}
   open fun setupView () {}
}