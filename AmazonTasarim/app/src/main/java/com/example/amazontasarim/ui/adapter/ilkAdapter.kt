package com.example.amazontasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazontasarim.data.entity.ilkData
import com.example.amazontasarim.databinding.CardTasarim1Binding

class ilkAdapter(var mContext: Context, var ilkList: List<ilkData>): RecyclerView.Adapter<ilkAdapter.CardTasarimTutucu>() {


    inner class CardTasarimTutucu(var tasarim: CardTasarim1Binding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val tasarim = CardTasarim1Binding.inflate(LayoutInflater.from(mContext),parent,false)

        return CardTasarimTutucu(tasarim)
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val gelenVeri = ilkList.get(position)
        var t = holder.tasarim

        t.imageView2.setImageResource(mContext.resources.getIdentifier(gelenVeri.resim,"drawable",mContext.packageName))


    }

    override fun getItemCount(): Int {

        return ilkList.size
    }
}