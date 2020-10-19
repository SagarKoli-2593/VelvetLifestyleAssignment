package com.example.velvetlifestyleassignment.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sample.R
import com.example.sample.databinding.ItemProductsHorizontalScrollBinding

class ThumbnailSliderAdapter(
    clickCallbacks: ClickCallbacks,
    context: Context,
    var images: Array<String>,
    var text: Array<String>
) : RecyclerView.Adapter<ThumbnailSliderAdapter.ThumbnailViewHolder>() {

    private var layoutInflater: LayoutInflater? = null
    private var context: Context? = context
    private var clickCallbackss = clickCallbacks

    class ThumbnailViewHolder(private val binding: ItemProductsHorizontalScrollBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setData(context: Context, imageUrl: String, text: String) {
            Glide.with(context)
                .load(imageUrl)
                .placeholder(R.drawable.placeholder)
                .into(binding.ivProduct)

            binding.tvProduct.text = text
            binding.executePendingBindings()
        }
    }

    interface ClickCallbacks {
        fun revokeSelected(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThumbnailViewHolder {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }

        return ThumbnailViewHolder(
            DataBindingUtil.inflate(
                layoutInflater!!,
                R.layout.item_products_horizontal_scroll,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ThumbnailViewHolder, position: Int) {
        holder.setData(context!!, images[position], text[position])
        holder.itemView.setOnClickListener {
            clickCallbackss.revokeSelected(position)
            Toast.makeText(context, "position : $position", Toast.LENGTH_SHORT).show()
        }

    }
}