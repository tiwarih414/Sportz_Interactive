package com.example.himanshu_test.home.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.himanshu_test.R
import com.example.himanshu_test.home.adapter.RecyclerDataAdapter
import com.example.himanshu_test.home.viewModel.HeatViewModel
import kotlinx.android.synthetic.main.fragment_heat.*

/**
 * A simple [Fragment] subclass.
 */
class HeatFragment : Fragment() {

    lateinit var heatViewModel: HeatViewModel

    var recylerDataAdapter: RecyclerDataAdapter? = null
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var list: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_heat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        list = ArrayList()

        heatViewModel = ViewModelProviders.of(this).get(HeatViewModel::class.java)
        heatViewModel.showError.observe(this, Observer {
            Toast.makeText(activity, it, Toast.LENGTH_SHORT).show()
        })

        layoutManager = LinearLayoutManager(activity!!)
        recycler_heat.layoutManager = layoutManager

        getHeatData()
    }

    private fun getHeatData() {
        heatViewModel.getHeatRepository()?.observe(this, Observer {
            if (it != null) {
                list.add(it.teams?._4?.players?._3852?.nameFull.toString())
                list.add(it.teams?._4?.players?._3722?.nameFull.toString())
                list.add(it.teams?._4?.players?._66818?.nameFull.toString())
                list.add(it.teams?._4?.players?._4176?.nameFull.toString())
                list.add(it.teams?._4?.players?._3632?.nameFull.toString())
                list.add(it.teams?._4?.players?._63751?.nameFull.toString())
                list.add(it.teams?._4?.players?._63751?.nameFull.toString())
                list.add(it.teams?._4?.players?._63187?.nameFull.toString())
                list.add(it.teams?._4?.players?._9844?.nameFull.toString())
                list.add(it.teams?._4?.players?._5132?.nameFull.toString())
                list.add(it.teams?._4?.players?._65867?.nameFull.toString())
                setupRecylerView(list)
            }
        })

    }

    private fun setupRecylerView(list: ArrayList<String>) {
        recylerDataAdapter = RecyclerDataAdapter(activity!!, list)
        recycler_heat.adapter = recylerDataAdapter
        recylerDataAdapter?.notifyDataSetChanged()
    }
}
