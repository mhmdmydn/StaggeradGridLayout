package id.ghodel.staggeradgridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val dataDummy = ArrayList<DataDummy>()
//
//        for (data in 0..50){
//            dataDummy.add(DataDummy("https://images.unsplash.com/photo-1580414057403-c5f451f30e1c?ixlib=rb-1.2.1&w=1000&q=80"))
//        }


        val dataDummy = listOf(
            DataDummy(R.drawable.img_1),
            DataDummy(R.drawable.img_2),
            DataDummy(R.drawable.img_3),
            DataDummy(R.drawable.img_4),
            DataDummy(R.drawable.img_5),
            DataDummy(R.drawable.img_10),
            DataDummy(R.drawable.img_11),
            DataDummy(R.drawable.img_12),
            DataDummy(R.drawable.img_13),
            DataDummy(R.drawable.img_14),
            DataDummy(R.drawable.img_15),
            DataDummy(R.drawable.img_16),
        )

        val rvWall = findViewById<RecyclerView>(R.id.rvWall)
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        rvWall.layoutManager = staggeredGridLayoutManager
        rvWall.itemAnimator = DefaultItemAnimator()
        val dataWall = WallAdapter(dataDummy)
        rvWall.adapter = dataWall

    }
}