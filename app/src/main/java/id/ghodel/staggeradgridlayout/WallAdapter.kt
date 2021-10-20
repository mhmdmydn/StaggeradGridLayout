package id.ghodel.staggeradgridlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class WallAdapter(private val dataDummy: List<DataDummy>) : RecyclerView.Adapter<WallAdapter.WallHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wall_item, parent, false)
        return WallHolder(view)
    }

    override fun onBindViewHolder(holder: WallHolder, position: Int) {
        holder.bindWall(dataDummy[position])
    }

    override fun getItemCount(): Int = dataDummy.size


    inner class WallHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val imgWall = itemView.findViewById<AppCompatImageView>(R.id.imgWall)

        fun bindWall(dataDummy: DataDummy) = Picasso.get()
            .load(dataDummy.img)
            .into(imgWall)
    }

}