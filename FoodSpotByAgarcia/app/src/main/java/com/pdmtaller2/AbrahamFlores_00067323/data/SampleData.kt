package com.pdmtaller2.AbrahamFlores_00067323.data

import com.pdmtaller2.AbrahamFlores_00067323.model.*

val sampleRestaurants = listOf(
    //COMIDA RAPIDA
    Restaurant(
        id = "1",
        name = "BurgerLand",
        description = "Hamburguesas deliciosas y jugosas",
        imageUrl = "https://crehana-blog.imgix.net/media/filer_public/6f/3e/6f3e8760-aeff-4b1c-baa3-85a05b95ea40/restaurantes-de-hamburguesas.png",
        category = "Comida Rápida",
        menu = listOf(
            Dish("Hamburguesa con queso", "Con doble carne y queso cheddar", "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/5b57547a8825f9fac531c7c39ab1e00e/Derivates/1536354e54be6f02ff4b3e9ede6e8e7ea487ab3d.jpg"),
            Dish("Papas fritas", "Crujientes y doradas", "https://images.ctfassets.net/trvmqu12jq2l/6yfNkvLk2YiTvUyFm4sbI1/f64c178195bddda063c241225fb33a34/blog-hero-1208x1080-v157.02.01.jpg?fm=jpg&q=90&w=1200") ,
            Dish("Hamburguesa extrema", "Una mezcla extrema de ingredientes", "https://resizer.glanacion.com/resizer/v2/una-de-las-hamburguesas-de-fuera-de-3RCPV6WAYJH6PAPBCKT6LDZVFE.jpg?auth=42e81aced8d3b112fa7ff6152e094b213d1b77c0145cb86ea78ef8b3371feec2&width=1920&height=1920&quality=70&smart=false&focal=613,472")

    )
    ),
    Restaurant(
        id = "2",
        name = "PizzaManía",
        description = "Las mejores pizzas artesanales al instante",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQKOcIunWQ1KQ0-1Emzz2NTl6uCT9P7FPylA&s",
        category = "Comida Rápida",
        menu = listOf(
            Dish("Pizza Pepperoni", "Clásica con abundante pepperoni", "https://media.istockphoto.com/id/1181651561/es/foto/pizza-pepperoni-al-horno.jpg?s=612x612&w=0&k=20&c=raw9OXyeA_tkkMdb6JY1XM9aK84PdkC-HVstiCRNK7w="),
            Dish("Pizza Hawaiana", "Con piña, jamón y queso mozzarella", "https://media.istockphoto.com/id/1349383878/es/foto/pizza-hawaiana-con-jam%C3%B3n-y-pi%C3%B1a.jpg?s=612x612&w=0&k=20&c=oc3y6BPWj4hdd7RDi-Sys-dVdXueaomNYOZX9qunLqY="),
            Dish("Pizza Cuatro Quesos", "Una mezcla irresistible de quesos", "https://www.hola.com/horizon/landscape/e8bb41b65869-pizzacuatroquesos-adob-t.jpg")
        )
    ),
    Restaurant(
        id = "3",
        name = "Taco Express",
        description = "Auténticos tacos mexicanos listos para ti",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_19GVkKoJ2kSwx8OGShB6PCHq89r02DMexw&s",
        category = "Comida Rápida",
        menu = listOf(
            Dish("Taco al pastor", "Carne marinada con piña y cebolla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXJ5uaQErh_4DterGOp0uvTOe0zcvhOlwT3w&s"),
            Dish("Taco de carnitas", "Cerdo cocinado lentamente al estilo Michoacán", "https://cdn-ilddihb.nitrocdn.com/MgqZCGPEMHvMRLsisMUCAIMWvgGMxqaj/assets/images/optimized/rev-6b9d936/www.goya.com/wp-content/uploads/2023/10/carne-asada-tacos1.jpg"),
            Dish("Taco vegetariano", "Con nopales, frijoles y aguacate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRr2TWaPxuRfxS8R7Dwsdecp9SF8IxfXdYv6w&s")
        )
    ),


            //COMIDA JAPONESA
    Restaurant(
        id = "4",
        name = "Japanese World",
        description = "Lo mejor de la cocina japonesa",
        imageUrl = "https://thumbs.dreamstime.com/b/logotipo-de-sushi-comida-japonesa-marisco-vector-cocina-marca-dise%C3%B1o-modelo-icono-281138080.jpg",
        category = "Comida Asiática",
        menu = listOf(
            Dish("Sushi roll", "Con salmón fresco y aguacate", "https://www.heinens.com/content/uploads/2023/06/Tuna-Sushi-Rolls-800x550-1.jpg"),
            Dish("Tempura", "Ingredientes fritos en una masa ligera", "https://www.theseasonedwok.com/wp-content/uploads/2023/03/ebi-tempura-f2.jpg"),
            Dish("Dim Sum", "Pequeños bocadillos de vapor", "https://cloudfront-us-east-1.images.arcpublishing.com/bostonglobe/HSWSIZV2Z6TC37GANXS2LJG7CE.jpg"),
            Dish("Ramen", "Fideos en caldo con cerdo y huevo", "https://images.getrecipekit.com/20230606152327-25_Instant_ramen.jpg?aspect_ratio=16:9&quality=90&"),
            Dish("Yakitori", "Brochetas de pollo a la parrilla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhrDapOUVNia3XK1qkgq8VBU5OcLSBlFTc4w&s"),
            Dish("Okonomiyaki", "Tortilla japonesa con repollo y toppings", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLzjjZlCaOwuvh4JW3_WZ-pG-Zmj90C2SDQg&s"),
            Dish("Udon", "Fideos gruesos en sopa caliente", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvcStC2tDD26h9SiZpL24RwfTEu4i6uVCtxQ&s"),
            Dish("Gyozas", "Empanadillas rellenas y doradas", "https://www.recetasdesbieta.com/wp-content/uploads/2019/08/gyozas_11.jpg")

    )
    ),
    //COMIDA ITALIANA
    Restaurant(
        id = "5",
        name = "Trattoria Bella",
        description = "Deliciosa comida italiana tradicional",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdZu7gXFzyVI6Oh8aSv5utCsyuqJCNbhAHc0F0qh77rXEftifMbzjWjG5j_CTmDmxJupU&usqp=CAU",
        category = "Comida Italiana",
        menu = listOf(
            Dish("Pizza Margherita", "Con mozzarella fresca y albahaca", "https://ooni.com/cdn/shop/articles/20220211142347-margherita-9920_ba86be55-674e-4f35-8094-2067ab41a671.jpg?v=1737104576&width=1080"),
            Dish("Spaghetti Bolognesa", "Con salsa de carne casera", "https://www.laespanolaaceites.com/wp-content/uploads/2019/05/espaguetis-a-la-bolonesa-1080x671.jpg"),
            Dish("Lasaña", "Con capas de pasta, carne y bechamel", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYVNzlCs4bbpneJekln3cOZOS6rLZg69Ipzw&s")
        )
    ),
    //POSTRES Y DULCES
    Restaurant(
        id = "6",
        name = "Dulce Tentación",
        description = "Repostería fina y artesanal",
        imageUrl = "https://www.800.cl/galeriasitios/Och/2015/5/29/Och_18332_Fl-9788-MamaKuna-Fg-1-15.jpg",
        category = "Postres y Dulces",
        menu = listOf(
            Dish("Cheesecake", "Con base de galleta y fresa", "https://peopleenespanol.com/thmb/8vzve3hmeCgC-SVqkvAmuXnMMBE=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/cheesecake-facil-con-leche-condensada-2000-4160526441114bf3ad8f3409586a2c8a.jpg"),
            Dish("Brownie", "De chocolate con nueces", "https://www.bettycrocker.lat/mx/wp-content/uploads/sites/2/2022/11/BrownieCocoaCaliente.jpg"),
            Dish("Cupcake de vainilla", "Con betún de crema y chispas", "https://i.pinimg.com/736x/12/47/14/124714a81c1998fdf374d1e071e8124c.jpg")
        )
    ),
    //BEBIDAS
    Restaurant(
        id = "7",
        name = "Refres-K",
        description = "Bebidas frías y naturales para todos los gustos",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfZ7_xFK-v2Hq0Gt1OCZUOS34jx1R936dApg&s",
        category = "Bebidas",
        menu = listOf(
            Dish("Limonada", "Natural con toque de menta", "https://cdn0.celebritax.com/sites/default/files/styles/watermark_100/public/recetas/limonada.jpg"),
            Dish("Smoothie de mango", "Batido tropical frío", "https://mx.boost.com/sites/g/files/lpfasj161/files/2024-05/SMOOTHIE_MANGO.jpg"),
            Dish("Té helado", "Clásico con rodajas de limón", "https://imag.bonviveur.com/te-helado.jpg")
        )
    )
)
