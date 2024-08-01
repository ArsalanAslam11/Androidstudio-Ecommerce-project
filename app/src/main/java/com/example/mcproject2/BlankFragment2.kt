package com.example.mcproject2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BlankFragment2 : Fragment() {
    private lateinit var button70: Button
    private lateinit var button71: Button
    private lateinit var button72: Button
    private lateinit var button73: Button
    private lateinit var button74: Button
    private lateinit var button75: Button
    private lateinit var button76: Button
    private lateinit var button77: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)


        button70 = view.findViewById(R.id.button70)
        button71 = view.findViewById(R.id.button71)
        button72 = view.findViewById(R.id.button72)
        button73 = view.findViewById(R.id.button73)
        button74 = view.findViewById(R.id.button74)
        button75 = view.findViewById(R.id.button75)
        button76 = view.findViewById(R.id.button76)
        button77 = view.findViewById(R.id.button77)




        button70.setOnClickListener {
            val intent = Intent(requireContext(), Phone1Activity::class.java)
            startActivity(intent)
        }

        button71.setOnClickListener {
            val intent = Intent(requireContext(), Phone2Activity::class.java)
            startActivity(intent)
        }
        button72.setOnClickListener {
            val intent = Intent(requireContext(), Phone3Activity::class.java)
            startActivity(intent)
        }
        button73.setOnClickListener {
            val intent = Intent(requireContext(), Phone4Activity::class.java)
            startActivity(intent)
        }
        button74.setOnClickListener {
            val intent = Intent(requireContext(), Phone5Activity::class.java)
            startActivity(intent)
        }
        button75.setOnClickListener {
            val intent = Intent(requireContext(), Phone6Activity::class.java)
            startActivity(intent)
        }
        button76.setOnClickListener {
            val intent = Intent(requireContext(), Phone7Activity::class.java)
            startActivity(intent)
        }
        button77.setOnClickListener {
            val intent = Intent(requireContext(), Phone8Activity::class.java)
            startActivity(intent)
        }


        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
