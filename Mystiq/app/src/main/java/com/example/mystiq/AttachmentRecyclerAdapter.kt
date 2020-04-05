package com.example.mystiq

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_gallery_image.view.*

class AttachmentRecyclerAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Attachment> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AttachmentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_gallery_image, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is AttachmentViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }

    fun submitList(attachmentList: List<Attachment>){
        items = attachmentList
    }

    class AttachmentViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val attachment_image = itemView.attachment_image
        val attachment_title = itemView.attachment_title

        fun bind (attachment: Attachment){
            attachment_title.setText(attachment.title)

            val RequestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(RequestOptions)
                .load(attachment.image)
                .into(attachment_image)
        }
    }

}