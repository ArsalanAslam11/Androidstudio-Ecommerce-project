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

class BlankFragment5 : Fragment() {
    private lateinit var button70: Button
    private lateinit var button71: Button
    private lateinit var button72: Button
    private lateinit var button73: Button
    private lateinit var button74: Button
    private lateinit var button75: Button
    private lateinit var button76: Button
    private lateinit var button77: Button
    private lateinit var button78: Button
    private lateinit var button79: Button
    private lateinit var button80: Button
    private lateinit var button81: Button
    private lateinit var button82: Button
    private lateinit var button83: Button
    private lateinit var button84: Button
    private lateinit var button85: Button
    private lateinit var button86: Button
    private lateinit var button87: Button
    private lateinit var button88: Button
    private lateinit var button89: Button
    private lateinit var button90: Button
    private lateinit var button91: Button
    private lateinit var button92: Button
    private lateinit var button93: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank5, container, false)


        button70 = view.findViewById(R.id.button70)
        button71 = view.findViewById(R.id.button71)
        button72 = view.findViewById(R.id.button72)
        button73 = view.findViewById(R.id.button73)
        button74 = view.findViewById(R.id.button74)
        button75 = view.findViewById(R.id.button75)
        button76 = view.findViewById(R.id.button76)
        button77 = view.findViewById(R.id.button77)
        button78 = view.findViewById(R.id.button78)
        button79 = view.findViewById(R.id.button79)
        button80 = view.findViewById(R.id.button80)
        button81 = view.findViewById(R.id.button81)
        button82 = view.findViewById(R.id.button82)
        button83 = view.findViewById(R.id.button83)
        button84 = view.findViewById(R.id.button84)
        button85 = view.findViewById(R.id.button85)
        button86 = view.findViewById(R.id.button86)
        button87 = view.findViewById(R.id.button87)
        button88 = view.findViewById(R.id.button88)
        button89 = view.findViewById(R.id.button89)
        button90 = view.findViewById(R.id.button90)
        button91 = view.findViewById(R.id.button91)
        button92 = view.findViewById(R.id.button92)
        button93 = view.findViewById(R.id.button93)



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
        button78.setOnClickListener {
            val intent = Intent(requireContext(), Shirt1Activity::class.java)
            startActivity(intent)
        }
        button79.setOnClickListener {
            val intent = Intent(requireContext(), Shirt2Activity::class.java)
            startActivity(intent)
        }
        button80.setOnClickListener {
            val intent = Intent(requireContext(), Shirt3Activity::class.java)
            startActivity(intent)
        }
        button81.setOnClickListener {
            val intent = Intent(requireContext(), Shirt4Activity::class.java)
            startActivity(intent)
        }
        button82.setOnClickListener {
            val intent = Intent(requireContext(), Shirt5Activity::class.java)
            startActivity(intent)
        }
        button83.setOnClickListener {
            val intent = Intent(requireContext(), Shirt6Activity::class.java)
            startActivity(intent)
        }
        button84.setOnClickListener {
            val intent = Intent(requireContext(), Shirt7Activity::class.java)
            startActivity(intent)
        }
        button85.setOnClickListener {
            val intent = Intent(requireContext(), Shirt8Activity::class.java)
            startActivity(intent)
        }
        button86.setOnClickListener {
            val intent = Intent(requireContext(), Shose1Activity::class.java)
            startActivity(intent)
        }
        button87.setOnClickListener {
            val intent = Intent(requireContext(), Shose2Activity::class.java)
            startActivity(intent)
        }
        button88.setOnClickListener {
            val intent = Intent(requireContext(), Shose3Activity::class.java)
            startActivity(intent)
        }
        button89.setOnClickListener {
            val intent = Intent(requireContext(), Shose4Activity::class.java)
            startActivity(intent)
        }
        button90.setOnClickListener {
            val intent = Intent(requireContext(), Shose5Activity::class.java)
            startActivity(intent)
        }
        button91.setOnClickListener {
            val intent = Intent(requireContext(), Shose6Activity::class.java)
            startActivity(intent)
        }
        button92.setOnClickListener {
            val intent = Intent(requireContext(), Shose7Activity::class.java)
            startActivity(intent)
        }
        button93.setOnClickListener {
            val intent = Intent(requireContext(), Shose8Activity::class.java)
            startActivity(intent)
        }


        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment5().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
