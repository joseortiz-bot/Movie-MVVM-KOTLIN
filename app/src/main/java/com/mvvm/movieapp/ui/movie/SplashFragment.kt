package com.mvvm.movieapp.ui.movie

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.mvvm.movieapp.MainActivity
import com.mvvm.movieapp.R
import com.mvvm.movieapp.databinding.FragmentSplashBinding



class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using Data Binding
        binding = FragmentSplashBinding.inflate(inflater, container, false)

        // Set the root view of the fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            try {
                // Navegar al MovieFragment después del retraso
                val navController = findNavController()
                val action = SplashFragmentDirections.actionSplashFragmentToMovieFragment()
                navController.navigate(action)
            } catch (e: Exception) {
                Toast.makeText(requireContext(), "Algo salió mal", Toast.LENGTH_SHORT).show()
            }
        }, 3000) // Retardo de 3 segundos (3000 ms)
    }
}
