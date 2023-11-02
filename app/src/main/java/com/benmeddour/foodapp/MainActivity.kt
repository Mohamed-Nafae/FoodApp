package com.benmeddour.foodapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MainActivity : AppCompatActivity() {
    var adapter:FoodAdapter?=null
    var listOfFoods = ArrayList<Food>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoadFood()
        adapter= FoodAdapter(listOfFoods,this)
        findViewById<GridView>(R.id.LvFoods).adapter=adapter
    }


    fun LoadFood(){
        //listOfFoods.add(Food("title","Dangarous viruse",R.drawable.image1))
        listOfFoods.add(Food("Corona virus","it a dangers virus it get a lot of human.\n" +
                "The virus that causes COVID-19 is in a family of viruses called Coronaviridae. Antibiotics do not work against viruses.\n" +
                "\n" +
                "Some people who become ill with COVID-19 can also develop a bacterial infection as a complication. In this case, antibiotics may be recommended by a health care provider.\n" +
                "\n" +
                "There is currently no licensed medication to cure COVID-19. If you have symptoms, call your health care provider or COVID-19 hotline for assistance.\n",R.drawable.image1))
        listOfFoods.add(Food("Corona virus","it a dangers virus it get a lot of human",R.drawable.image1))
        //listOfFoods.add(Food("title","Most popular viruss",R.drawable.image1))
        listOfFoods.add(Food("Corona virus","it a dangers virus it get a lot of human",R.drawable.image1))
        listOfFoods.add(Food("Corona virus","it a dangers virus it get a lot of human",R.drawable.image1))
        listOfFoods.add(Food("Corona virus","it a dangers virus it get a lot of human",R.drawable.image1))
        listOfFoods.add(Food("Corona virus","it a dangers virus it get a lot of human",R.drawable.image1))

    }
    inner class FoodAdapter: BaseAdapter {
        var context:Context?=null
        var listOfFoodsLocale = ArrayList<Food>()
        constructor(listOfFoods:ArrayList<Food>,context: Context){
            listOfFoodsLocale=listOfFoods
            this.context=context
        }
        override fun getCount(): Int {
            return listOfFoodsLocale.size
        }

        override fun getItem(position: Int): Any {
            return listOfFoodsLocale[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val food = listOfFoodsLocale[position]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            /*if(food.name == "title"){
    val foodVw=inflator.inflate(R.layout.title_ticket,null)
    foodView.findViewById<TextView>(R.id.textView3).text = food.desc!!
    return foodView
}
else{*/
            val foodView = inflator.inflate(R.layout.food_tecket, null)
            foodView.findViewById<TextView>(R.id.titl).text = food.name!!
            foodView.findViewById<ImageView>(R.id.img).setImageResource(food.image!!)
            foodView.setOnClickListener {
                val intent = Intent(context, Fooddetaits::class.java)
                intent.putExtra("title", food!!.name)
                intent.putExtra("desc", food!!.desc)
                intent.putExtra("img", food!!.image)
                context!!.startActivity(intent)


            }
            return foodView
        }

}
fun delate(i:Int){
listOfFoods.removeAt(i)
adapter!!.notifyDataSetChanged()
}
fun add(i:Int){
listOfFoods.add(i,listOfFoods[i])
adapter!!.notifyDataSetChanged()
}

}