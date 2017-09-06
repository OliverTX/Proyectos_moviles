package com.example.oliverrodriguez.a14menuderestaurant;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.oliverrodriguez.a14menuderestaurant.R.drawable.thumb;

public class Main2Activity extends AppCompatActivity {
    private String recetas[]= new String [10];
    private int indice;
    private int imagenes []= new int[10];
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        ImageView imageView;
        TextView txtReceta;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = (ImageView) findViewById(R.id.im_plato);
        txtReceta = (TextView) findViewById(R.id.txt_receta);
        recetas[0]="Capeado 1 cucharadita de sal ½ cucharadita de pimentón (páprika) 2 huevos, enteros 2 tazas de harina 4 cucharadas de aceite 2 tazas de cerveza 2 claras, batidas a punto de turrón Aderezo ½ taza de mayonesa 1 limón, su jugo ¼ taza de crema ¼ taza de leche Cebollín picado finamente, al gusto Sal y pimienta, al gusto Salsa de jitomate 5 jitomates 1 diente de ajo 1 cucharadita de mejorana 1 chorrito de vinagre de jalapeños 1 cucharadita de azúcar Sal, al gusto Tacos Aceite para freír 1 kilo de filetes de pescado Tortillas de maíz, calientes Col, finamente picada ";
        recetas[1]="Ingredientes \n" +
                "Porciones: 6 \n" +
                "1 kilo de pescado molido (corvina, tilapia, sierra u otro de tu preferencia)\n" +
                "Sal y pimienta, al gusto\n" +
                "15 o 20 limones, su jugo\n" +
                "1 cebolla grande\n" +
                "1 kilo de jitomate\n" +
                "15 ramas de cilantro\n" +
                "Chiles verdes serranos, al gusto\n" +
                "1 naranja dulceModo de preparación\n" +
                "Preparación: 15min  ›  Tiempo extra: 30min reposando  ›  Listo en:45min \n" +
                "Coloca el pescado en una ensaladera, sazona con sal y baña con el jugo de limón. Deja que se “cueza” dentro del refrigerador mientras picas la verdura.\n" +
                "Pica finamente la cebolla, el jitomate, el cilantro y los chiles verdes.\n" +
                "Incorpora primero la cebolla a la ensaladera con el pescado y deja reposar durante unos 10 minutos. Agrega el jitomate, cilantro y chile. Exprime sobre la mezcla el jugo de la naranja dulce. Mezcla con cuidado y rectifica la sazón.\n" +
                "Sirve en tostadas y agrega aguacate, salsa cátsup y salsa picante al gusto.";
        recetas[2]="Ingredientes \n" +
                "Porciones: 8 \n" +
                "1 kilo de maíz pozolero precocido\n" +
                "1 cabeza de ajo\n" +
                "Sal al gusto\n" +
                "1 kilo de carne de puerco, cortada en cubos\n" +
                "1 jitomate grande\n" +
                "100 gramos de chile mirasol (guajillo)\n" +
                "1/4 cucharadita de orégano\n" +
                "1 pizca de cominos\n" +
                "1 diente de ajo\n" +
                "Modo de preparación\n" +
                "Preparación: 30min  ›  Cocción: 3horas  ›  Listo en:3horas30min \n" +
                "Coloca el maíz en una olla grande, cubre con agua, agrega 1 cabeza de ajo y sal al gusto y cocina a fuego medio durante 2 horas.\n" +
                "Después de ese tiempo, agrega la carne a la olla y cocina durante 1 hora o hasta que la carne esté bien suave. Desecha la cabeza de ajo.\n" +
                "Mientras, hierve el jitomate hasta que se haya ablandado. Remoja los chiles en agua caliente hasta que estén suaves, quítales las semillas y el rabo y muélelos junto con el jitomate, sal, orégano, cominos y 1 diente de ajo. Cuela.\n" +
                "Cuando ya está suave la carne, sácala de la olla y deshébrala.\n" +
                "Vierte la salsa roja dentro de la olla con el maíz y deja que suelte el hervor. Regresa la carne deshebrada a la olla, rectifica la sazón y deja que hierva unos minutos más antes de servir.\n" +
                "Sirve con lechuga picada, cebolla picada y unas gotas de jugo de limón. Acompaña con tostadas.";
        recetas[3]="Ingredientes \n" +
                "Porciones: 15 \n" +
                "1 taza de agua tibia\n" +
                "¾ cucharadita de sal\n" +
                "2 cucharadas de aceite de oliva\n" +
                "345 g de harina\n" +
                "2 cucharaditas de azúcar refinada\n" +
                "2 cucharaditas de levadura seca activa\n" +
                "Modo de preparación\n" +
                "Preparación: 10min  ›  Cocción: 20min  ›  Listo en:30min \n" +
                "Agrega los ingredientes en el orden sugerido por el fabricante de la máquina. Programa la maquina para que haga la masa. Cuando termine el ciclo, retira la masa.\n" +
                "Extiende la masa y colócala sobre una charola redonda engrasada. Deja que repose 10 minutos. Precalienta el horno a 200°C. Distribuye muy bien la salsa para la pizza sobre la masa y luego agrega los ingredientes de tu pizza. Hornea de 15 a 20 minutos o hasta que el pan se haya dorado.";
        recetas[4]="Ingredientes \n" +
                "Porciones: 10 \n" +
                "1 kilo de lomo de cerdo, cortado en filetes delgados\n" +
                "3 chiles guajillo, desvenados y despepitados\n" +
                "2 chiles anchos, desvenados y despepitados\n" +
                "2 chiles chipotle en adobo\n" +
                "2 dientes de ajo machacados\n" +
                "1 cebolla en trozos\n" +
                "1/4 de taza de vinagre\n" +
                "1/2 taza de jugo de naranja\n" +
                "1 taza de piña picada\n" +
                "3 clavos de olor\n" +
                "1 cucharadita de comino\n" +
                "1 cucharadita de orégano\n" +
                "1 jitomate asado, pelado y sin semillas\n" +
                "1 cucharada de sal\n" +
                "Modo de preparación\n" +
                "Preparación: 25min  ›  Cocción: 40min  ›  Tiempo extra: 4horas marinando  ›  Listo en:5horas5min \n" +
                "Asa el jitomate en un sartén o comal chico a fuego medio-alto, volteando constantemente, hasta que su piel se haya quemado y empiece a desprenderse, aproximadamente 10 minutos. Pela, corta a la mitad y desecha las semillas.\n" +
                "Mientras, hierve suficiente agua en una olla mediana y agrega los chiles guajillo y ancho. Deja que hiervan hasta que se hayan suavizado, aproximadamente 5 minutos.\n" +
                "Coloca los chiles hervidos en el vaso de la licuadora. Agrega los chiles chipotle, ajo, cebolla, vinagre, jugo de naranja, piña picada, clavos de olor, comino, orégano y jitomate asado. Licua hasta tener una salsa homogénea.\n" +
                "Coloca la carne en un tazón de vidrio o bolsa con cierre y agrega la salsa asegurándote que cubrir toda la carne. Marina dentro del refrigerador durante por lo menos 4 horas o durante toda la noche.\n" +
                "Precalienta un comal o el asador a fuego medio-alto. Asa los filetes marinados, volteando una vez, hasta que se hayan cocido completamente, aproximadamente 2 minutos por lado.\n" +
                "Mientras, asa las rebanadas de piña que se hayan quemado ligeramente, alrededor de 5 minutos por lado. Si lo deseas, puedes barnizarlas con la salsa de la carne mientras se asan.\n" +
                "Pica la carne y la piña.\n" +
                "Sirve la carne sobre tortillas calientes, agrega piña asada. Añade cilantro y cebolla picada, salsa de tomate y unas gotas de jugo de limón.";
        recetas[5]="Ingredientes \n" +
                "Rinde: 3 docenas\n" +
                "1 manojo de hojas para tamal, suavizadas\n" +
                "1 kilo de piña fresca, picada\n" +
                "250 gramos de azúcar\n" +
                "1 ½ tazas de agua\n" +
                "1 kilo de masa de maíz (nixtamal)\n" +
                "Modo de preparación\n" +
                "Preparación: 25min  ›  Cocción: 45min  ›  Listo en:1hora10min \n" +
                "Cuece la piña junto con el agua y el azúcar hasta que esté bien suave. Escurre.\n" +
                "Mezcla en un tazón la masa con la mantequilla y el polvo de hornear. Incorpora la piña cocida, el coco y las pasitas.\n" +
                "Coloca aproximadamente una cucharada de la masa sobre la mitad superior de cada hoja de tamal, envuelve y acomoda dentro de la vaporera. Tapa y cuece a vapor durante aproximadamente 45 minutos o hasta que el tamal se despegue de la hoja.";
        imagenes[0]=R.drawable.thumb;
        imagenes[1]=R.drawable.ceviche;
        imagenes[2]=R.drawable.pozole;
        imagenes[3]=R.drawable.pizza;
        imagenes[4]=R.drawable.tacos;
        imagenes[5]=R.drawable.tamalesrosas;
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            indice = bundle.getInt("Indice");
        }
        txtReceta.setText(recetas[indice]);
       imageView.setImageResource(imagenes[indice]);

    }
}
