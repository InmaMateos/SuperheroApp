package com.example.superheroapp.ui.view.superheroList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.superheroapp.data.network.NetworkModule
import com.example.superheroapp.data.network.SuperheroApiService
import com.example.superheroapp.data.network.response.SuperheroResponse
import com.example.superheroapp.databinding.FragmentSuperheroListBinding
import com.example.superheroapp.ui.view.superheroList.adapter.SuperheroListAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit


class SuperheroListFragment : Fragment() {

    private var _binding: FragmentSuperheroListBinding? = null
    private val binding get() = _binding!!

    private lateinit var superheroAdapter: SuperheroListAdapter

    private lateinit var retrofit: Retrofit



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initRecyclerView()

    }

    private fun initRecyclerView() {
        retrofit = NetworkModule.getRetrofit()
        superheroAdapter = SuperheroListAdapter()
        lifecycleScope.launch {
            val superheroList = retrofit.create(SuperheroApiService::class.java).getSuperheroes("a")
            if (superheroList.isSuccessful) {
                //Log.i("Inma", "funciona")
                val response: SuperheroResponse? = superheroList.body()
                if (response != null) {
                    //Log.i("Inma", response.toString())
                    withContext(Dispatchers.Main) {
                       superheroAdapter.updateList(response.superheroes)
                    }
                }
            }
        }
        binding.rvSuperheroList.layoutManager = GridLayoutManager(context, 2)
        binding.rvSuperheroList.adapter = superheroAdapter

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSuperheroListBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}