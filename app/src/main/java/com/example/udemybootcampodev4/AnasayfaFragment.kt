package com.example.udemybootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.udemybootcampodev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var binding : FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)


        binding.buttonGoToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaToAGecis)
        }

        binding.buttonGoToX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaToXGecis)
        }

        //Geri tuşuna basıldığı zaman uygulamayı kapatır.
        val callback = object : OnBackPressedCallback(true)  {
            override fun handleOnBackPressed() {
                requireActivity().finish()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this,callback)

        return binding.root
    }
}