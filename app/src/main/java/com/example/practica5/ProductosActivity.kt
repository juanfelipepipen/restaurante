package com.example.practica5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ProductosActivity : AppCompatActivity() {

    var menu: ArrayList<Product> = ArrayList<Product>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType");
        agregarProductos(menuOption)

        var image: ImageView = findViewById(R.id.imageView)
        when (menuOption) {
            "Antojitos" -> {
                image.setImageResource(R.drawable.antojitos)
            }

            "Especialidades" -> {
                image.setImageResource(R.drawable.especialidades)
            }

            "Conbinations" -> {
                image.setImageResource(R.drawable.combinations)
            }

            "Tortas" -> {
                image.setImageResource(R.drawable.tortas)
            }

            "Sopas" -> {
                image.setImageResource(R.drawable.sopas)
            }

            "Drinks" -> {
                image.setImageResource(R.drawable.drinks)
            }
        }

        var listView: ListView = findViewById(R.id.litview) as ListView
        var adaptador: AdaptadorProductos = AdaptadorProductos(this, menu)
        listView.adapter = adaptador;
    }

    fun agregarProductos(option: String?) {
        when (option) {
            "Antojitos" -> {
                menu.add(
                    Product(
                        "Quesadillas",
                        R.drawable.quesadillas,
                        "Rellenas con su carne favorita, servidas con ensalada - Filled with your choice of meat, served with salad.",
                        5.99
                    )
                )
                menu.add(
                    Product(
                        "Huaraches",
                        R.drawable.huaraches,
                        "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.",
                        10.99
                    )
                )
                menu.add(
                    Product(
                        "Gringas",
                        R.drawable.gringas,
                        "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Sincronizada",
                        R.drawable.sincronizadas,
                        "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Sopes",
                        R.drawable.sopes,
                        "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.",
                        3.79
                    )
                )
                menu.add(
                    Product(
                        "Tostadas",
                        R.drawable.tostadas,
                        "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.",
                        4.59
                    )
                )
                menu.add(Product("Coctel Mixto", R.drawable.caldocamaron, "", 21.99))
                menu.add(Product("Coctel de Camaron", R.drawable.coctel, "Shrimp cocktail", 21.99))
            }

            "Especialidades" -> {
                menu.add(
                    Product(
                        "Mojarra Frita - Fried Fish",
                        R.drawable.mojarra,
                        "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.",
                        5.99
                    )
                )
                menu.add(
                    Product(
                        "Ceviche",
                        R.drawable.huaraches,
                        "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips",
                        10.99
                    )
                )
                menu.add(
                    Product(
                        "Botana de Camarones al Mojo de Ajo",
                        R.drawable.botanacamarones,
                        "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Botana de Camarones a la Diabla 19.99",
                        R.drawable.botanacamarones,
                        "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Torre de Camarón Negro",
                        R.drawable.smallmexican,
                        "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.",
                        3.79
                    )
                )
                menu.add(
                    Product(
                        "Botana de Pulpo a la Diabla",
                        R.drawable.botanacamarones,
                        "Servido totopos, cebolla frita, arroz, lechuga y pico de gallo - Served with chips, grill onions, rice, lettuce and pico de gallo.",
                        4.59
                    )
                )
                menu.add(
                    Product(
                        "Botana de Pulpo al Mojo de Ajo",
                        R.drawable.botanacamarones,
                        "Servido totopos, cebolla frita, arroz, lechuga y pico de gallo - Served with chips, grill onions, rice, lettuce and pico de gallo.",
                        21.99
                    )
                )
                //menu.add(Product("Coctel de Camaron",1,"",21.99))
            }

            "Conbinations" -> {
                menu.add(
                    Product(
                        "Traditional Taco Combo",
                        R.drawable.combinationtaco,
                        "Tortilla de Maíz y tu carne favorita. Servido con arroz y frijoles - Corn taco, your choice of meat, served with rice and beans.",
                        5.99
                    )
                )
                menu.add(
                    Product(
                        "Mexican Burritos",
                        R.drawable.huaraches,
                        "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.",
                        10.99
                    )
                )
                menu.add(
                    Product(
                        "Los Portales Burrito",
                        R.drawable.burritosportales,
                        "Los Portales Burrito",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Cinco",
                        R.drawable.cinco,
                        "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Dos Amigos",
                        R.drawable.dosamigos,
                        "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans",
                        3.79
                    )
                )
                menu.add(
                    Product(
                        "Burrito Pepe",
                        R.drawable.burritopepe,
                        "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice.",
                        4.59
                    )
                )
                menu.add(
                    Product(
                        "Fajita Burrito",
                        R.drawable.cominationburros,
                        "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole - Large burrito filled with your choice of meat, onions, chile, peppers, rice, beans and tomatoes. Served with lettuce guacamole and sour cream.",
                        21.99
                    )
                )
                menu.add(
                    Product(
                        "Fajita Quesadilla",
                        R.drawable.fajitaquesadilla,
                        "Quesadilla extra grande (10 inches), rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada - 10 inches quesadilla filled with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.",
                        21.99
                    )
                )
            }

            "Tortas" -> {
                menu.add(
                    Product(
                        "Torta Regular",
                        R.drawable.torta,
                        "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat.",
                        5.99
                    )
                )
                menu.add(
                    Product(
                        "Torta -Milanesa de Res o Pollo",
                        R.drawable.tortamilanesa,
                        "Breaded Steak or Chicken",
                        10.99
                    )
                )
                menu.add(
                    Product(
                        "Torta Cubana",
                        R.drawable.tortacubana,
                        "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Torta Mixta",
                        R.drawable.tortamixta,
                        "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Small Mexican Torta",
                        R.drawable.tortamixta,
                        "Bolillo bread sandwich with your of meat, shredded lettuce, avocado, tomato, onion and sour cream.",
                        3.79
                    )
                )

            }

            "Sopas" -> {
                menu.add(Product("Pozole", R.drawable.pozole, "Weekends only", 5.99))
                menu.add(Product("Menudo", R.drawable.menudo, "Wednesday to Sunday", 10.99))
                menu.add(Product("Caldo de Res", R.drawable.caldores, "", 7.99))
                menu.add(Product("Caldo de Camarón", R.drawable.caldocamaron, "Shrimp soup", 3.79))
                menu.add(Product("Sopa de Mariscos", R.drawable.sopamariscos, "Seafood soup", 3.79))

            }

            "Drinks" -> {
                menu.add(Product("Soft Drinks 20oz - Sodas 20oz.", R.drawable.sodas, "", 5.99))
                menu.add(Product("Jarritos", R.drawable.jarritos, "Wednesday to Sunday", 10.99))
                menu.add(
                    Product(
                        "Caguamas",
                        R.drawable.caguama,
                        "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese",
                        7.99
                    )
                )

            }
        }


    }

    private class AdaptadorProductos : BaseAdapter {
        var producto = ArrayList<Product>();
        var contexto: Context? = null;

        constructor(contexto: Context, producto: ArrayList<Product>) {
            this.producto = producto;
            this.contexto = contexto;

        }

        override fun getCount(): Int {
            return producto.size;
        }

        override fun getItem(position: Int): Any {
            return producto[position];
        }

        override fun getItemId(position: Int): Long {
            return position.toLong();
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val prod = producto[position]
            val inflador = LayoutInflater.from(contexto)
            val vista = inflador.inflate(R.layout.producto_view, null)

            val imagen = vista.findViewById(R.id.producto_img) as ImageView
            val nombre = vista.findViewById(R.id.producto_nombre) as TextView
            val desc = vista.findViewById(R.id.producto_desc) as TextView
            val precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")

            return vista

        }
    }
}