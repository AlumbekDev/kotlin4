package com.ui

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.base.BaseFragment
import com.example.kotlin4.databinding.FragmentMovieBinding
import com.ui.adapter.MovieAdapter

class MovieFragment : BaseFragment<FragmentMovieBinding>(FragmentMovieBinding::inflate) {

    private val viewModel: MovieViewModel by viewModels()

    override fun initVM() {
        viewModel.getMovie()
        viewModel.moviesList.observe(this, {
            binding.movieRv.adapter = MovieAdapter(it)
            binding.movieRv.layoutManager = GridLayoutManager(requireContext(), 2)
        })
    }
}