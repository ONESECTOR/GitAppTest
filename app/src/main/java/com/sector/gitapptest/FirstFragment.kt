package com.sector.gitapptest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sector.gitapptest.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    private var health = 100

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkHealth()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun checkHealth() {
        val fullHp = health == 100
        val killed = health == 0

        when {
            fullHp -> {
                alive()
            }
            killed -> {
                kill()
            }
            else -> {
                alive()
            }
        }
    }

    private fun kill() {
        Log.d("TAG!", "Killed!")
    }

    private fun alive() {
        Log.d("TAG", "Alive!")
    }
}