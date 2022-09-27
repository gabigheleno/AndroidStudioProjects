package com.generation.desenvolvmed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.desenvolvmed.adapter.PostagemAdapter
import com.generation.desenvolvmed.databinding.FragmentPostBinding
import com.generation.desenvolvmed.model.Postagem

class PostFragment : Fragment() {

    private lateinit var binding: FragmentPostBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentPostBinding.inflate(layoutInflater, container, false)

        //binding.dmToolbar.toolbarTitle.text = "DesenvolvMED"

        val listPostagens = listOf(
            Postagem (
                "Vacina",
                "Dr. Gabriel",
                "Bebam água todos os dias",
                "A água é muito importante para a sua saúde, pois faz parte de 98% do seu organismo",
                "https://imgur.com/vpVts7m"
            ),
            Postagem(
                "Vacina",
                "Dra. Gabriela",
                "Bebam suco todos os dias",
                "A suco é muito importante para a sua saude pois faz parte de 98% do seu organismo",
                "https://imgur.com/vpVts7m"
            ),
            Postagem(
                "Vacina",
                "Dra. Samira",
                "Bebam refrigerante todos os dias",
                "A refrigerante é muito importante para a sua saude pois faz parte de 98% do seu organismo",
                "https://imgur.com/vpVts7m"
            ),
            Postagem(
                "Vacina",
                "Dra. Natali",
                "Bebam cerveja todos os dias",
                "A cerveja é muito importante para a sua saude pois faz parte de 98% do seu organismo",
                "https://imgur.com/vpVts7m"
            ),
            Postagem(
                "Vacina",
                "Dr. Murillo",
                "Bebam sake todos os dias",
                "A sake é muito importante para a sua saude pois faz parte de 98% do seu organismo",
                "https://imgur.com/vpVts7m"
            ),
        )

        val postagemAdapter = PostagemAdapter()
        binding.recyclerPostagem.layoutManager = LinearLayoutManager(context)
        binding.recyclerPostagem.adapter = postagemAdapter
        binding.recyclerPostagem.setHasFixedSize(true)

        postagemAdapter.setList(listPostagens)

        binding.addPostButton.setOnClickListener{
            findNavController().navigate(R.id.action_postFragment_to_criarPostFragment)
        }

        return binding.root
    }


}