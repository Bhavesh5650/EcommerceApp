package com.example.ecommerceapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.databinding.ActivityMainBinding;
import com.example.ecommerceapp.model.ProductModel;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    ProductInterface productInterface;
    List<ProductModel> productModelList = new ArrayList<>();
    List<ProductModel> filterList = new ArrayList<>();
    List<CarouselItem> items =new ArrayList<>();
    String[] feature = {"• 48MP(OIS)+8MP+5MP Triple camera setup - 48MP (F1.8) Main Camera with OIS + 8MP (F2.2) Ultra wide camera + 5MP (F2.4) depth camera | 13MP (F2.2) front camera\n" +
            "• 16.65 centimeters (6.6-inch) FHD+ Super AMOLED display, FHD+ resolution with 1080 x 2340 pixels , 393 PPI with 16M colours\n" +
            "• Android 13, v13.0 operating system with MediaTek | MTK D1080 2.6GHz,2GHz Octa-Core processor\n" +
            "• A34 5G has an IP67 certification and Gorilla Glass 5 (front screen) for carefree usage\n" +
            "• Premium design experience with a metal camera deco\n" +
            "• 5000 mAh battery (Non-removable) with Super Fast Charging\n" +
            "• Flagship inspired camera features like Nightography, AI Remaster, Object Eraser etc.\n" +
            "• Enhanced 1000 nits(HBM) screen with Vision Booster",
    "• Rear Camera : 48 MP + 8 MP + 5 MP + 2 MP\n" +
            "• Front Camera : 13 MP\n" +
            "• Memory : 8 GB RAM and 128 GB internal memory\n" +
            "• Dimensions : 164.2 mmx76.1 mmx9.1 mm\n" +
            "• Color options : Sky Blue \n" +
            "• Battery Capacity : 5000 mAh Li-ion battery\n" +
            "• Warranty information : 1 Year Manufacturer Warranty is provided by the manufacturer from the date of purchase\n",
    "• DYNAMIC ISLAND COMES TO IPHONE 15 — Dynamic Island bubbles up alerts and Live Activities — so you don’t miss them while you’re doing something else. You can see who’s calling, track your next ride, check your flight status, and so much more.\n" +
            "• INNOVATIVE DESIGN — iPhone 15 Plus features a durable color-infused glass and aluminum design. It’s splash, water, and dust resistant. The Ceramic Shield front is tougher than any smartphone glass. And the 6.7\" Super Retina XDR display is up to 2x brighter in the sun compared to iPhone 14.\n" +
            "• 48MP MAIN CAMERA WITH 2X TELEPHOTO — The 48MP Main camera shoots in super-high resolution. So it’s easier than ever to take standout photos with amazing detail. The 2x optical-quality Telephoto lets you frame the perfect close-up.\n" +
            "• NEXT-GENERATION PORTRAITS — Capture portraits with dramatically more detail and color. Just tap to shift the focus between subjects — even after you take the shot.\n" +
            "• POWERHOUSE A16 BIONIC CHIP — The superfast chip powers advanced features like computational photography, fluid Dynamic Island transitions, and Voice Isolation for phone calls. And A16 Bionic is incredibly efficient to help deliver great all-day battery life.",
    "• 15 cm (6.1-inch) Super Retina XDR display\n" +
            "• Cinematic mode adds shallow depth of field and shifts focus automatically in your videos\n" +
            "• Advanced dual-camera system with 12MP Wide and Ultra Wide cameras; Photographic Styles, Smart HDR 4, Night mode, 4K Dolby Vision HDR recording\n" +
            "• 12MP TrueDepth front camera with Night mode, 4K Dolby Vision HDR recording\n" +
            "• A15 Bionic chip for lightning-fast performance",
    "• Processor : Intel Core i5-11400H Processor 2.7 GHz (12M Cache, up to 4.5 GHz, 6 Cores);Play over 100 high-quality PC games, plus new and upcoming blockbusters on day one like Halo Infinite, Forza Horizon 5, and Age of Empires IV and one month of Game Pass-including EA Play\n" +
            "• With new games added. Age of Empires IV, Back 4 Blood, Battlefield V, Forza Horizon 5, Halo Infinite*, Knockout City, Microsoft Flight Simulator, Minecraft PC Bundle, Need for Speed Heat, Psychonauts2, The Sims 4, Titanfall 2, 12 Minutes;Memory : 16GB SO-DIMM DDR4 3200MHz Support Up to 32GB 2x SO-DIMM slots | Storage : 512GB PCIe 3.0 NVMe M.2 SSD with additional 1x M.2 Slot for SSD Storage expansion\n" +
            "• Display : 15.6 inch (39.62 cms) FHD (1920 x 1080) 16:9 250nits, 144Hz Refresh Rate, vIPS-level Anti-glare display, Contrast Ratio: 1000:1 with Adaptive-Sync;Operating System: Windows 11 Homewith Lifetime Validity\n" +
            "• Keyboard : Backlit Chiclet Keyboard 1-Zone RGB;Design: 2.28 ~ 2.45 cm Thin | 48WHrs, 4S1P, 4-cell Li-ion | Up to 6 hours battery life; Note: Battery life depends on conditions of usage; I/O Port: 1x RJ45 LAN port, 1x Thunderbolt 4 support, DisplayPort, 3x USB 3.2 Gen 1 Type-A\n" +
            "• Battery Average Life : 6.0 Hours",
    "• Processor : Intel Core i3-1115G4 (up to 4.1 GHz with Intel Turbo Boost Technology(2g),6 MB L3 cache, 2 cores)|Memory: 8 GB DDR4-3200 MHz RAM (1 x 8 GB) Upto 16 GB DDR4-3200 MHz RAM (2 x 8 GB)|Storage: 512 GB PCIe NVMe TLC M.2 SSD\n" +
            "• Operating System & Preinstalled Software : Windows 11 Home 64 Single Language – HP recommends Windows 11 Pro for business |\n" +
            "• Display & Graphics : 39.6 cm (15.6'') diagonal, HD, micro-edge, BrightView,Brightness: 250 nits, 101 ppi Color Gamut: 45%NTSC Screen Resolution: 1366 x 768|Graphics: Intel UHD Graphics\n" +
            "• Ports : 1 USB Type-C 5Gbps signaling rate 2 USB Type-A 5Gbps signaling rate 1 headphone/microphone combo 1 AC Smart pin 1 HDMI 1.4b| Battery: 3-cell, 41 Wh Li-ion, Support battery fast charge\n" +
            "• Other Features : HP True Vision 720p HD camera with integrated dual array digital microphones |Networking: Realtek RTL8822CE 802.11a/b/g/n/ac (2x2) Wi-Fi and Bluetooth 5 combo MU-MIMO supported, Miracast compatible|Keyboard & Pointing Device: Full-size, Jet Black keyboard with numeric keypad HP Imagepad with multi-touch gesture support",
    "• Frost Free Refrigerator : Premium Auto Defrost Refrigerator with powerful cooling and long lasting freshness and performance with Convertible 5in1 & Curd Maestro\n" +
            "• Capacity 385 Liters : Suitable For Families With 5 Or More Members\n" +
            "• Energy Rating : 2 Star Energy Efficiency\n" +
            "• Manufacturer Warranty : The product comes with a 1 year comprehensive warranty and a 20 years warranty on the digital inverter compressor\n" +
            "• Digital Inverter Compressor : Enjoy greater energy efficiency, less noise and a long-lasting performance. Consumes 50% less power, backed up by 20 year warranty\n" +
            "• Interior Description : Fresh Food Capacity : 297L | Freezer Capacity : 88L | Total No Of Compartments : 2 | Drawers : 1 EA | Shelves : 2 EA | Shelf Type : Toughened Glass Shelves | Anti-Bacterial Gasket | Bottle Storage Capacity : 6\n" +
            "• Convertible 5in1 : Convert Freezer to fridge and more to optimize storage needs - Normal | Seasonal | Extra Fridge | Vacation | Home alone",
    "• The star rating changes are as per BEE guidelines on 1st Jan 2023ss Shelves\n" +
            "• Frost Free Double Door Refrigerator - Intellisense Inverter Technology\n" +
            "• Capacity: 411 liters suitable for medium or large sized family\n" +
            "• Energy Rating : 2 star\n" +
            "• Special Features: Stabilizer free operation even in high fluctuation voltage between (160V-220V)\n" +
            "• Brand Feature : 15 Days Of Garden Freshness, Freshonizer, Microblock Technology, Adaptive Intelligence, IntelliSense Inverter Technology\n" +
            "• Warranty : 1 year Comprehensive + 9 years on Compressor",
    "• Strong Blades : Equipped with a 750 watt motor, the mixer grinder easily grinds or pulverises the hardest of ingredients\n" +
            "• Robust Handles : Built to withstand the wear and tear of heavy use\n" +
            "• Sturdy Body : Sturdy body to withstand heavy grinding applications\n" +
            "• ISI certified with 2 years warranty on the product",
    "• High performance powerful motor\n" +
            "• Grinding Jar : 0.3L ,0.8L & 1.25L Stainless Steel.\n" +
            "• OLP provided safety of motor\n" +
            "• Sturdy ABS body\n" +
            "• ISI Certified Mixer Grinder\n" +
            "• Branded Sintered Bush for longer life\n" +
            "• Motor capacity : 500 Watts",
    "• Induction motor design\n" +
            "• Smooth osscilation\n" +
            "• Exotic rich looks with modern styling\n" +
            "• Sturdy base for more stability\n" +
            "• Elegantly designed switch box",
    "• Sweep : 400mm, Power : 100W, Air Delivery : 100CMM, RPM: 2100;High Air Delivery : Improves the feel of air with high air delivery\n" +
            "• High Speed : Provides high RPM;Full copper motor : Increases durability and provides robust performance\n" +
            "• Overload thermal protector : Acts as a fuse and protects the motor from damage;Warranty : 2 years on product\n" +
            "• Includes : 1 Fan Unit, Instruction Manual, Warranty Card\n" +
            "• Controller Type : Button Control; Mounting Type: Free Standing; Material Type: Acrylonitrile Butadiene Styrene; Finish Type: Painted"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        items.add(new CarouselItem(R.drawable.poster1));
        items.add(new CarouselItem(R.drawable.poster2));
        items.add(new CarouselItem(R.drawable.poster3));
        items.add(new CarouselItem(R.drawable.poster4));
        items.add(new CarouselItem(R.drawable.poster6));
        items.add(new CarouselItem(R.drawable.poster7));


        mainBinding.imageCarousel1.setData(items);
        mainBinding.imageCarousel1.setAutoPlay(true);
        mainBinding.imageCarousel1.setAutoPlayDelay(3000);

        productModelList.add(new ProductModel(R.drawable.samsung1,"Samsung Galaxy A54 5G (Awesome Violet, 8GB, 256GB Storage)","₹28,850",feature));
        productModelList.add(new ProductModel(R.drawable.samsung2,"Samsung Galaxy M32 (Light Blue, 6GB RAM, 128GB Storage)","₹13,499",feature));
        productModelList.add(new ProductModel(R.drawable.iphone1,"Apple Iphone 15 Plus (Blue, 128GB Storage)","₹80,590",feature));
        productModelList.add(new ProductModel(R.drawable.iphone13,"Apple Iphone 13 (Green, 256GB Storage)","₹60,499",feature));
        productModelList.add(new ProductModel(R.drawable.laptop_gaming,"ASUS TUF Gaming F15 Laptop (Black)","₹54,990",feature));
        productModelList.add(new ProductModel(R.drawable.hp_laptop1,"HP Laptop 15s  (Jet Black)","₹21,863",feature));
        productModelList.add(new ProductModel(R.drawable.lg_fridge,"LG 380L Double Door Refrigerator","₹42,599",feature));
        productModelList.add(new ProductModel(R.drawable.whirlpool,"Whirlpool 411 Convertible Fridge","₹46,950",feature));
        productModelList.add(new ProductModel(R.drawable.judge_mixer,"Judge Carnival Mixer Grinder","₹3,500",feature));
        productModelList.add(new ProductModel(R.drawable.premier_mixer,"Premier Carina Mixer Grinder","₹3,199",feature));
        productModelList.add(new ProductModel(R.drawable.table_fan1,"Havells V2 Pedestal Fan","₹5,950",feature));
        productModelList.add(new ProductModel(R.drawable.table_fan3,"Bajaj Neo-Spectrum Table Fan","₹3,990",feature));

        productInterface = new ProductInterface() {
            @Override
            public void OnClick(int position) {

                Intent intent = new Intent(MainActivity.this, ProductDetailActivity.class);
                intent.putExtra("image",productModelList.get(position).image);
                intent.putExtra("pro_name",productModelList.get(position).pro_name);
                intent.putExtra("pro_price",productModelList.get(position).price);
                intent.putExtra("feature",productModelList.get(position).feature[position]);
                startActivity(intent);
            }
        };


        ProductAdapter adapter = new ProductAdapter(this,productModelList,productInterface);
        mainBinding.recyclerView1.setAdapter(adapter);

        mainBinding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                filterList = productModelList.stream().filter(a->a.pro_name.toLowerCase().contains(newText.toLowerCase())).collect(Collectors.toList());
                adapter.searching(filterList);
                return false;
            }
        });




    }
}